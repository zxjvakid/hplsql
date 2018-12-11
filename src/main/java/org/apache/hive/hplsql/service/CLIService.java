package org.apache.hive.hplsql.service;


import org.apache.hive.hplsql.service.common.conf.ServerConf;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.hplsql.service.operation.Operation;
import org.apache.hive.hplsql.service.operation.OperationHandle;
import org.apache.hive.hplsql.service.operation.OperationStatus;
import org.apache.hive.hplsql.service.session.HplsqlSession;
import org.apache.hive.hplsql.service.session.SessionHandle;
import org.apache.hive.hplsql.service.session.SessionManager;
import org.apache.hive.service.cli.FetchOrientation;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.TableSchema;
import org.apache.hive.service.rpc.thrift.TGetInfoType;
import org.apache.hive.service.rpc.thrift.TProtocolVersion;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class CLIService {
    private final Logger LOG = LoggerFactory.getLogger(CLIService.class.getName());
    public static final TProtocolVersion SERVER_VERSION;
    private SessionManager sessionManager = new SessionManager();
    private ServerConf serverConf = new ServerConf();
    static {
        TProtocolVersion[] protocols = TProtocolVersion.values();
        SERVER_VERSION = protocols[protocols.length - 1];
    }

    public void init() {
        serverConf.init();
    }

    public SessionHandle openSession(TProtocolVersion protocol, String username, String password, String ipAddress) throws HplsqlException {
        SessionHandle sessionHandle = sessionManager.openSession(protocol, username, password, ipAddress, serverConf);
        LOG.debug(sessionHandle + ": openSession()");
        return sessionHandle;
    }


    /**
     * Execute statement asynchronously on the server with a timeout. This is a non-blocking call
     */
    public OperationHandle executeStatementAsync(SessionHandle sessionHandle, String statement,
                                                 Map<String, String> confOverlay) throws HplsqlException {
        HplsqlSession session = sessionManager.getSession(sessionHandle);
        // need to reset the monitor, as operation handle is not available down stream, Ideally the
        // monitor should be associated with the operation handle.
        //session.getSessionState().updateProgressMonitor(null);
        OperationHandle opHandle = session.executeStatementAsync(statement, confOverlay);
        LOG.debug(sessionHandle + ": executeStatementAsync()");
        return opHandle;
    }

    /**
     * Execute statement on the server with a timeout. This is a blocking call.
     */
    public OperationHandle executeStatement(SessionHandle sessionHandle, String statement,
                                            Map<String, String> confOverlay) throws HplsqlException {
        HplsqlSession session = sessionManager.getSession(sessionHandle);
        // need to reset the monitor, as operation handle is not available down stream, Ideally the
        // monitor should be associated with the operation handle.
        //session.getSessionState().updateProgressMonitor(null);
        OperationHandle opHandle = session.executeStatement(statement, confOverlay);
        LOG.debug(sessionHandle + ": executeStatement()");
        return opHandle;
    }

    public OperationHandle getTypeInfo(SessionHandle sessionHandle)
            throws HplsqlException {
        OperationHandle opHandle = sessionManager.getSession(sessionHandle)
                .getTypeInfo();
        LOG.debug(sessionHandle + ": getTypeInfo()");
        return opHandle;
    }

    public OperationStatus getOperationStatus(OperationHandle opHandle)
            throws HplsqlException {
        Operation operation = sessionManager.getOperationManager().getOperation(opHandle);
        /**
         * If this is a background operation run asynchronously,
         * we block for a duration determined by a step function, before we return
         * However, if the background operation is complete, we return immediately.
         */
        if (operation.shouldRunAsync()) {
            try {
                long timeout = ServerConf.OPERATION_STATUS_POLLING_TIMEOUT;
                operation.getBackgroundHandle().get(timeout, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
                // No Op, return to the caller since long polling timeout has expired
                LOG.trace(opHandle + ": Long polling timed out");
            } catch (CancellationException e) {
                // The background operation thread was cancelled
                LOG.trace(opHandle + ": The background operation was cancelled", e);
            } catch (ExecutionException e) {
                // The background operation thread was aborted
                LOG.warn(opHandle + ": The background operation was aborted", e);
            } catch (InterruptedException e) {
                // No op, this thread was interrupted
                // In this case, the call might return sooner than long polling timeout
            }
        }
        OperationStatus opStatus = operation.getStatus();
        LOG.debug(opHandle + ": getOperationStatus()");
        return opStatus;
    }

    public TableSchema getResultSetMetadata(OperationHandle opHandle)
            throws HplsqlException {
        TableSchema tableSchema = sessionManager.getOperationManager()
                .getOperation(opHandle).getParentSession().getResultSetMetadata(opHandle);
        LOG.debug(opHandle + ": getResultSetMetadata()");
        return tableSchema;
    }

    public RowSet fetchResults(OperationHandle opHandle, FetchOrientation orientation,
                               long maxRows) throws HplsqlException {
        RowSet rowSet = sessionManager.getOperationManager().getOperation(opHandle)
                .getParentSession().fetchResults(opHandle, orientation, maxRows);
        LOG.debug(opHandle + ": fetchResults()");
        return rowSet;
    }

    public String getInfo(SessionHandle sessionHandle, TGetInfoType getInfoType) throws HplsqlException {
        String infoValue = sessionManager.getSession(sessionHandle)
                .getInfo(getInfoType);
        LOG.debug(sessionHandle + ": getInfo()");
        return infoValue;
    }
}
