package org.apache.hive.hplsql.service.operation;

import org.apache.hive.hplsql.service.session.HplsqlSession;

import java.util.Map;

public abstract class ExecuteStatementOperation extends Operation {
    protected String statement;

    public ExecuteStatementOperation(HplsqlSession parentSession, String statement,
                                     Map<String, String> confOverlay) {
        super(parentSession, confOverlay, OperationType.EXECUTE_STATEMENT);
        this.statement = statement;
    }

    public static ExecuteStatementOperation newExecuteStatementOperation(
            HplsqlSession parentSession, String statement, Map<String, String> confOverlay, boolean runAsync) {
        return new SQLOperation(parentSession, statement, confOverlay, runAsync);
    }

    public String getStatement() {
        return statement;
    }
}
