package org.apache.hive.hplsql.service.operation;

import org.apache.hive.hplsql.Executor;
import org.apache.hive.hplsql.service.common.HplsqlResponse;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.hplsql.service.session.HplsqlSession;
import org.apache.hive.service.cli.FetchOrientation;
import org.apache.hive.service.cli.RowSet;
import org.apache.hive.service.cli.RowSetFactory;
import org.apache.hive.service.cli.TableSchema;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;

public class SQLOperation extends ExecuteStatementOperation {
    private ScheduledExecutorService timeoutExecutor;
    private HplsqlResponse response;
    private TableSchema resultSchema;
    private Executor executor;
    private final boolean runAsync;

    public SQLOperation(HplsqlSession parentSession, String statement, Map<String, String> confOverlay,
                        boolean runInBackground) {
        super(parentSession, statement, confOverlay);
        this.runAsync = runInBackground;
        this.executor = parentSession.getExcutor();
    }

    @Override
    public boolean shouldRunAsync() {
        return runAsync;
    }

    @Override
    public void runInternal() throws HplsqlException {
        setState(OperationState.PENDING);
        setHasResultSet(true);
        if (!runAsync) {
            runHplsql();
        } else {
            Runnable work = () -> {
                try {
                    runHplsql();
                } catch (HplsqlException e) {
                    setOperationException(e);
                    LOG.error("Error running hplsql : ", e);
                }
            };
            Future<?> backgroundHandle = getParentSession().getOperationManager().submitBackgroundOperation(work);
            setBackgroundHandle(backgroundHandle);
        }
    }

    private void runHplsql() throws HplsqlException {
        try {
            OperationState opState = getStatus().getState();
            // Operation may have been cancelled by another thread
            if (opState.isTerminal()) {
                LOG.info("Not running the query. Operation is already in terminal state: " + opState
                        + ", perhaps cancelled due to query timeout or by another thread.");
                return;
            }

            LOG.info(executor + " start execute " + statement);
            response = executor.runHpl(statement);
            LOG.info(executor + " execute {} finished", statement);
            operationResult = new OperationResult(response.getResultBytes());
            if (0 != response.getResponseCode()) {
                throw new HplsqlException("Error while processing statement");
            }
        } catch (Throwable e) {
            /**
             * If the operation was cancelled by another thread, or the execution timed out, Driver#run
             * may return a non-zero response code. We will simply return if the operation state is
             * CANCELED, CLOSED or FINISHED, otherwise throw an exception
             */
            if ((getStatus().getState() == OperationState.CANCELED) || (getStatus().getState() == OperationState.CLOSED) || (
                    getStatus().getState() == OperationState.FINISHED)) {
                LOG.warn("Ignore exception in terminal state", e);
                return;
            }
            setState(OperationState.ERROR);
            if (e instanceof HplsqlException) {
                throw (HplsqlException) e;
            } else {
                throw new HplsqlException("Error running query: " + e.toString(), e);
            }
        }
        setState(OperationState.FINISHED);
    }


    @Override
    public TableSchema getResultSetSchema() throws HplsqlException {
        if (resultSchema == null) {
            resultSchema = new TableSchema().addStringColumn("output","hpl execute output");
        }
        return resultSchema;
    }

    @Override
    public RowSet getNextRowSet(FetchOrientation orientation, long maxRows) throws HplsqlException {
        assertState(new ArrayList<>(Arrays.asList(OperationState.FINISHED)));
        TableSchema tableSchema = getTableSchema();
        RowSet rowSet = RowSetFactory.create(tableSchema, getProtocolVersion(),false);

        // get the OperationResult object from the operation
        OperationResult operationResult = getOperationResult();
        if (operationResult == null) {
            throw new HplsqlException("Couldn't find operation result: " + getHandle());
        }
        // read execute output Strings;
        List<String> resultStrings  = operationResult.read(isFetchFirst(orientation), maxRows);

        // convert logs to RowSet
        for (String resultString : resultStrings) {
            rowSet.addRow(new String[] { resultString });
        }
        return rowSet;
    }


    private TableSchema getTableSchema() {
        TableSchema schema = new TableSchema();
        schema.addStringColumn("string","hpl execute result");
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
    @Override
    public void cancel() throws HplsqlException {
        OperationState opState = getStatus().getState();
        if (opState.isTerminal()) {
            LOG.info("Not cancel the query. Operation is already aborted in state -" + opState);
            return;
        }
        cancelExecuteTask();
        setState(OperationState.CANCELED);
    }

    @Override
    public void close() throws HplsqlException {
        cancelExecuteTask();
        setState(OperationState.CLOSED);
        //TODO 清除执行结果
    }

    private void cancelExecuteTask(){
        if (!shouldRunAsync()) {
            return;
        }
        Future<?> backgroundHandle = getBackgroundHandle();
        if (backgroundHandle != null) {
            boolean success = backgroundHandle.cancel(true);
            if (success) {
                LOG.info(getHandle() + ":The running operation has been successfully interrupted");
            } else {
                LOG.info(getHandle() + "The running operation could not be cancelled, typically because it has already completed normally");
            }
        }
    }

}
