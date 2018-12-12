package org.apache.hive.hplsql;

import org.apache.hive.hplsql.service.common.HplsqlResponse;
import org.apache.hive.hplsql.service.common.conf.ServerConf;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.service.rpc.thrift.TGetInfoType;
import org.mortbay.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Executor {
    private static final Logger LOG = LoggerFactory.getLogger(Executor.class);

    //为了保证一个hplsql会话对应一个hive会话。同一个hplsql session中使用同一个connection连接hive。
    //注：多个线程同时使用同一个connection会报错。
    private Connection reuseConnection;
    private ServerConf serverConf;

    public Executor(ServerConf serverConf) {
        this.serverConf = serverConf;
    }

    public void init() throws HplsqlException {
        reuseConnection = openConnection();
    }

    public HplsqlResponse runHpl(String statement) throws Exception {
        synchronized (Executor.class) {
            //TODO 应修改hplsql代码，将不同执行操作的hplsql执行结果输出到不同的地方，防止不同线程执行时都将结果打印到标准输出，造成结果数据交叉
            String formatStmt = formatStatement(statement);
            checkConnection();
            // 将标准输出设置为out
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            String[] args = {"-e",  formatStmt};
            int responseCode = runHplCmd(args);

            LOG.info("~~~~~out~~~~~:" + out.toString());
            List<String> execOutputs = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new StringReader(out.toString()));
            String line;
            while ((line = reader.readLine()) != null) {
                execOutputs.add(line);
            }
            HplsqlResponse response = new HplsqlResponse(responseCode);
            response.setOutputStrings(execOutputs);
            return response;
        }
    }

    /**
     * 格式化sql语句，hplsql不识别语句中使用双引号引用字符串，需修改为使用单引号引用
     * @param statement
     * @return
     */
    private String formatStatement(String statement){
        if(statement == null || statement.trim().equals("")){
            return "";
        }
        int doubleQuotesFirstIndex = statement.trim().indexOf("\"");
        int singleQuotesFirstIndex = statement.trim().indexOf("'");
        if(doubleQuotesFirstIndex == -1){ //如果不存在双引号则不处理
            return statement;
        }
        if(singleQuotesFirstIndex == -1){ //如果不存在单引号则将双引号变为单引号
            return statement.trim().replaceAll("\"","'");
        }
        if(doubleQuotesFirstIndex < singleQuotesFirstIndex){
            //如果都存在,且双引号在单引号的外部，则将双引号转换为单引号，单引号转换为双引号
            //只处理了一层嵌套情况：如将"abc'de'ef" 转换为 'abc"de"ef'
            int doubleQuotesLastIndex = statement.trim().lastIndexOf("\"");
            String formatStmt = statement.trim().replaceAll("\'","\"");
            formatStmt = replaceIndexChar(formatStmt,doubleQuotesFirstIndex, "\'");
            formatStmt = replaceIndexChar(formatStmt,doubleQuotesLastIndex, "\'");
            return formatStmt;
        }
        return statement;
    }

    /**
     * 替换指定位置的字符
     * @param str 源字符串
     * @param index 需要被替换的字符的位置
     * @param replaceStr 替换的字符串
     * @return
     */
    private static String replaceIndexChar(String str, int index, String replaceStr){
        return str.substring(0, index)+ replaceStr +str.substring(index + 1);
    }

    private int runHplCmd(String[] args) throws Exception {
        //hplsql 不一定使用默认连接conf.defaultConnection
        Exec exec = new Exec(reuseConnection);
        return exec.run(args);
    }

    //目前不会并发执行该方法，synchronized是保证只有一个线程使用connection对象
    public synchronized String getInfo(TGetInfoType type) throws HplsqlException {
        try {
            checkConnection();
            switch (type) {
                case CLI_DBMS_VER:
                    return reuseConnection.getMetaData().getDatabaseProductVersion();
                case CLI_DBMS_NAME:
                    return reuseConnection.getMetaData().getDatabaseProductName();
                default:
                    throw new HplsqlException("Unrecognized GetInfoType value: " + type.toString());
            }
        } catch (Exception e) {
            throw new HplsqlException("fail to getInfo:" + e.getMessage());
        }
    }

    public synchronized ResultSet getTypeInfo() throws HplsqlException {
        try {
            checkConnection();
            return reuseConnection.getMetaData().getTypeInfo();
        } catch (Exception e) {
            throw new HplsqlException("fail to getTypeInfo:" + e.getMessage());
        }
    }

    private Connection openConnection() throws HplsqlException {
        try {
            Connection conn = getConnection();
            executeInitSql(conn);
            return conn;
        } catch (Exception e) {
            throw new HplsqlException("open connection fail :" + e.getMessage());
        }
    }

    private Connection getConnection() throws HplsqlException {
        try {
            String driver = ServerConf.DEFAULT_CONN_DRIVER;
            String connStr = serverConf.getConnStrByName(serverConf.getDefaultConn());
            StringBuilder url = new StringBuilder();
            String usr = "";
            String pwd = "";
            if (connStr != null) {
                String[] c = connStr.split(";");
                if (c.length >= 1) {
                    driver = c[0];
                }
                if (c.length >= 2) {
                    url.append(c[1]);
                } else {
                    url.append("jdbc:hive://");
                }
                for (int i = 2; i < c.length; i++) {
                    if (c[i].contains("=")) {
                        url.append(";");
                        url.append(c[i]);
                    } else if (usr.isEmpty()) {
                        usr = c[i];
                    } else if (pwd.isEmpty()) {
                        pwd = c[i];
                    }
                }
            }
            Class.forName(driver);
            return DriverManager.getConnection(url.toString().trim(), usr, pwd);
        } catch (Exception e) {
            throw new HplsqlException("get connection fail :" + e.getMessage());
        }
    }

    private void executeInitSql(Connection conn) throws SQLException {
        ArrayList<String> sqls = serverConf.getConnInits(serverConf.getDefaultConn());     // Run initialization statements on the connection
        if (sqls != null) {
            Statement stm = conn.createStatement();
            for (String sql : sqls) {
                LOG.debug(conn + " execute Init sql :" + sql);
                stm.execute(sql);
            }
            stm.close();
        }
    }

    private void checkConnection() throws SQLException {
        if (reuseConnection.isClosed()) {
            Log.info("{} is closed", reuseConnection);
            reuseConnection = openConnection();
        }
    }

    public void close() throws HplsqlException {
        try {
            reuseConnection.close();
        } catch (Exception e) {
            throw new HplsqlException("close connection fail :" + e.getMessage());
        }
    }
}
