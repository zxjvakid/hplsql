package org.apache.hive.hplsql.service.operation;

import org.apache.hive.hplsql.service.common.*;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.hplsql.service.session.HplsqlSession;
import org.apache.hive.service.cli.FetchOrientation;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.RowSetFactory;
import org.apache.hive.service.cli.TableSchema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class OperationManager {
    private final Logger LOG = LoggerFactory.getLogger(OperationManager.class.getName());
    private final ConcurrentHashMap<OperationHandle, Operation> handleToOperation =
            new ConcurrentHashMap<OperationHandle, Operation>();
    private final ConcurrentHashMap<String, Operation> queryIdOperation =
            new ConcurrentHashMap<String, Operation>();
    private ExecutorService backgroundOperationPool = Executors.newFixedThreadPool(5);

    public ExecuteStatementOperation newExecuteStatementOperation(HplsqlSession parentSession,
                                                                  String statement, Map<String, String> confOverlay, boolean runAsync)
            throws HplsqlException {
        ExecuteStatementOperation operation =
                ExecuteStatementOperation.newExecuteStatementOperation(parentSession, statement, confOverlay, runAsync);
        addOperation(operation);
        return operation;
    }

    public GetTypeInfoOperation newDatabaseMetaDataOperation(HplsqlSession parentSession) {
        GetTypeInfoOperation operation = new GetTypeInfoOperation(parentSession);
        addOperation(operation);
        return operation;
    }

    private void addOperation(Operation operation) {
        LOG.info("Adding operation: " + operation.getHandle());
        queryIdOperation.put(getQueryId(operation), operation);
        handleToOperation.put(operation.getHandle(), operation);
    }
    private String getQueryId(Operation operation) {
        //return operation.getParentSession().getHplsqlConf().getVar(ConfVars.HIVEQUERYID);
        // TODO
        return "queryId";
    }

    public TableSchema getOperationResultSetSchema(OperationHandle opHandle)
            throws HplsqlException {
        return getOperation(opHandle).getResultSetSchema();
    }

    public Operation getOperation(OperationHandle operationHandle) throws HplsqlException {
        Operation operation = handleToOperation.get(operationHandle);
        if (operation == null) {
            throw new HplsqlException("Invalid OperationHandle: " + operationHandle);
        }
        return operation;
    }

    public RowSet getOperationOutputRowSet(OperationHandle opHandle, FetchOrientation orientation,
                                        long maxRows) throws HplsqlException {
        TableSchema tableSchema = getLogSchema();
        RowSet rowSet = RowSetFactory.create(tableSchema, getOperation(opHandle).getProtocolVersion(),false);

        // get the OperationOutPut object from the operation
        OperationOutPut operationOutPut = getOperation(opHandle).getOperationOutPut();
        if (operationOutPut == null) {
            throw new HplsqlException("Couldn't find log associated with operation handle: " + opHandle);
        }
        // read execute output Strings;
        List<String> outputStrings = null;
        outputStrings = operationOutPut.readOperationOutput(isFetchFirst(orientation), maxRows);

        // convert logs to RowSet
        for (String outputString : outputStrings) {
            rowSet.addRow(new String[] { outputString });
        }
        return rowSet;
    }

    private TableSchema getLogSchema() {
        TableSchema schema = new TableSchema();
        schema.addStringColumn("string","hpl execute log");
        return schema;
    }

    private boolean isFetchFirst(FetchOrientation fetchOrientation) {
        //TODO: Since OperationLog is moved to package o.a.h.h.ql.session,
        // we may add a Enum there and map FetchOrientation to it.
        if (fetchOrientation.equals(FetchOrientation.FETCH_FIRST)) {
            return true;
        }
        return false;
    }

    public Future<?> submitBackgroundOperation(Runnable r) {
        return backgroundOperationPool.submit(r);
    }


    public void closeOperation(OperationHandle opHandle) throws HplsqlException {
        LOG.info("Closing operation: " + opHandle);
        Operation operation = removeOperation(opHandle);
        if (operation == null) {
            throw new HplsqlException("Operation does not exist: " + opHandle);
        }
        operation.close();
    }

    private Operation removeOperation(OperationHandle opHandle) {
        Operation operation = handleToOperation.remove(opHandle);
        String queryId = getQueryId(operation);
        queryIdOperation.remove(queryId);
        LOG.info("Removed queryId: {} corresponding to operation: {}", queryId, opHandle);
        return operation;
    }
}
