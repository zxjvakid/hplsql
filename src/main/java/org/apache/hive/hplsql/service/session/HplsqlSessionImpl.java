package org.apache.hive.hplsql.service.session;

import org.apache.hive.hplsql.Executor;
import org.apache.hive.hplsql.service.common.conf.ServerConf;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.hplsql.service.operation.ExecuteStatementOperation;
import org.apache.hive.hplsql.service.operation.GetTypeInfoOperation;
import org.apache.hive.hplsql.service.operation.OperationHandle;
import org.apache.hive.hplsql.service.operation.OperationManager;
import org.apache.hive.service.cli.FetchOrientation;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.TableSchema;
import org.apache.hive.service.rpc.thrift.TGetInfoType;
import org.apache.hive.service.rpc.thrift.TProtocolVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.Semaphore;

public class HplsqlSessionImpl implements HplsqlSession {
    private static final Logger LOG = LoggerFactory.getLogger(HplsqlSessionImpl.class);
    // Shared between threads (including SessionState!)
    private final SessionHandle sessionHandle;
    private String username;
    private final String password;
    private final long creationTime;
    private Executor executor;
    private String ipAddress;

    private SessionManager sessionManager;
    private OperationManager operationManager;
    // Synchronized by locking on itself. 目前同一个session对象不会被多个线程同时使用。
    private final Set<OperationHandle> opHandleSet = new HashSet<>();

    private volatile long lastAccessTime = System.currentTimeMillis();
    private final Semaphore operationLock;

    public HplsqlSessionImpl(SessionHandle sessionHandle, TProtocolVersion protocol,
                             String username, String password, String ipAddress) {
        this.username = username;
        this.password = password;
        creationTime = System.currentTimeMillis();
        this.sessionHandle = sessionHandle != null ? sessionHandle : new SessionHandle(protocol);
        this.ipAddress = ipAddress;
        this.operationLock = new Semaphore(1);
    }


    /**
     * Opens a new HplsqlServer session for the client connection.
     * Creates a new SessionState object that will be associated with this HplsqlServer session.
     * When the server executes multiple queries in the same session,
     * this SessionState object is reused across multiple queries.
     * Note that if doAs is true, this call goes through a proxy object,
     * which wraps the method logic in a UserGroupInformation#doAs.
     * That's why it is important to create SessionState here rather than in the constructor.
     */
    @Override
    public void open(ServerConf serverConf) throws Exception {
        //sessionState = new SessionState();
        //sessionState.setUserIpAddress(ipAddress);
        lastAccessTime = System.currentTimeMillis();
        executor = new Executor(serverConf);
        executor.init();
    }

    @Override
    public void close() throws HplsqlException {
        List<OperationHandle> ops;
        synchronized (opHandleSet) {
            ops = new ArrayList<>(opHandleSet);
            opHandleSet.clear();
        }
        for (OperationHandle opHandle : ops) {
            operationManager.closeOperation(opHandle);
        }
        executor.close();
    }

    @Override
    public String getInfo(TGetInfoType infoType) throws HplsqlException {
        return executor.getInfo(infoType);
    }

    @Override
    public OperationHandle executeStatement(String statement, Map<String, String> confOverlay) throws HplsqlException {
        return executeStatementInternal(statement, confOverlay, false);
    }

    @Override
    public OperationHandle executeStatementAsync(String statement, Map<String, String> confOverlay) throws HplsqlException {
        return executeStatementInternal(statement, confOverlay, true);
    }

    @Override
    public TableSchema getResultSetMetadata(OperationHandle opHandle) throws HplsqlException {
        return sessionManager.getOperationManager().getOperationResultSetSchema(opHandle);
    }

    private OperationHandle executeStatementInternal(String statement,
                                                     Map<String, String> confOverlay, boolean runAsync) throws HplsqlException {
        ExecuteStatementOperation operation;
        OperationHandle opHandle = null;
        try {
            operation = getOperationManager().newExecuteStatementOperation(getSession(), statement,
                    confOverlay, runAsync);
            opHandle = operation.getHandle();
            addOpHandle(opHandle);
            operation.run();
            return opHandle;
        } catch (HplsqlException e) {
            // Refering to SQLOperation.java, there is no chance that a HplsqlException throws and the
            // async background operation submits to thread pool successfully at the same time. So, Cleanup
            // opHandle directly when got HplsqlException
            if (opHandle != null) {
                removeOpHandle(opHandle);
                getOperationManager().closeOperation(opHandle);
            }
            throw e;
        }
    }

    private void addOpHandle(OperationHandle opHandle) {
        synchronized (opHandleSet) {
            opHandleSet.add(opHandle);
        }
    }

    @Override
    public OperationHandle getTypeInfo() throws HplsqlException {
        OperationManager operationManager = getOperationManager();
        GetTypeInfoOperation operation = operationManager.newDatabaseMetaDataOperation(getSession());
        OperationHandle opHandle = operation.getHandle();
        try {
            addOpHandle(opHandle);
            operation.run();
            return opHandle;
        } catch (HplsqlException e) {
            removeOpHandle(opHandle);
            operationManager.closeOperation(opHandle);
            throw e;
        }
    }

    private void removeOpHandle(OperationHandle opHandle) {
        synchronized (opHandleSet) {
            opHandleSet.remove(opHandle);
        }
    }

    @Override
    public RowSet fetchResults(OperationHandle opHandle, FetchOrientation orientation,
                               long maxRows) throws HplsqlException {

//        if (fetchType == FetchType.QUERY_OUTPUT) {
//            return operationManager.getOperationNextRowSet(opHandle, orientation, maxRows);
//        }
        return operationManager.getOperationOutputRowSet(opHandle, orientation, maxRows);
    }

    @Override
    public void closeOperation(OperationHandle operationHandle) throws HplsqlException{
        operationManager.closeOperation(operationHandle);
        synchronized (opHandleSet) {
            opHandleSet.remove(operationHandle);
        }
    }

    @Override
    public void cancelOperation(OperationHandle operationHandle) throws HplsqlException{
        operationManager.cancelOperation(operationHandle);
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public String getIpAddress() {
        return ipAddress;
    }

    @Override
    public Executor getExcutor() {
        return executor;
    }

    @Override
    public TProtocolVersion getProtocolVersion() {
        return sessionHandle.getProtocolVersion();
    }

    @Override
    public void setSessionManager(SessionManager sessionManager) {
        this.sessionManager = sessionManager;
    }

    @Override
    public SessionManager getSessionManager() {
        return sessionManager;
    }

    @Override
    public void setOperationManager(OperationManager operationManager) {
        this.operationManager = operationManager;
    }

    @Override
    public SessionHandle getSessionHandle() {
        return sessionHandle;
    }

    @Override
    public OperationManager getOperationManager() {
        return operationManager;
    }

    protected HplsqlSession getSession() {
        return this;
    }
}
