package org.apache.hive.hplsql;

import org.apache.hive.hplsql.service.common.HplsqlResponse;
import org.apache.hive.hplsql.service.common.conf.ServerConf;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.service.rpc.thrift.TGetInfoType;
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

    public void init() throws HplsqlException{
        reuseConnection = openConnection();
    }

    public HplsqlResponse runHpl(String statement) throws Exception{
        synchronized(Executor.class) { //TODO 与其他方法锁对象不是同一个
            // 将标准输出设置为out，并发执行会导致结果输出不准确，且connection同时被多个线程使用，所以需同步执行
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            System.setOut(new PrintStream(out));
            String[] args = {"-e", statement};
            int responseCode = runHplCmd(args);

            LOG.info("~~~~~out~~~~~:" + out.toString());
            List<String> execOutputs = new ArrayList<>();
            BufferedReader reader = new BufferedReader(new StringReader(out.toString()));
            String line = null;
            while ((line = reader.readLine()) != null) {
                execOutputs.add(line);
            }
            HplsqlResponse response = new HplsqlResponse(responseCode);
            response.setOutputStrings(execOutputs);
            return response;
        }
    }

    private int runHplCmd(String[] args) throws Exception{
        //hplsql 不一定使用默认连接conf.defaultConnection
        Exec exec = new Exec(reuseConnection);
        return exec.run(args);
    }

    //目前不会并发执行该方法，synchronized是保证只有一个线程使用connection对象
    public synchronized String getInfo(TGetInfoType type) throws HplsqlException {
        try{
            switch (type){
                case CLI_DBMS_VER:
                    return reuseConnection.getMetaData().getDatabaseProductVersion();
                case CLI_DBMS_NAME:
                    return reuseConnection.getMetaData().getDatabaseProductName();
                default:
                    throw new HplsqlException("Unrecognized GetInfoType value: " + type.toString());
            }
        }catch (Exception e){
            throw new HplsqlException("fail to getInfo:" + e.getMessage());
        }
    }


    public synchronized ResultSet getTypeInfo() throws HplsqlException {
        try{
            return reuseConnection.getMetaData().getTypeInfo();
        }catch (Exception e){
            throw new HplsqlException("fail to getTypeInfo:" + e.getMessage());
        }
    }



    public Connection openConnection() throws HplsqlException{
        try {
            Connection conn = getConnection();
            executeInitSql(conn);
            return conn;
        } catch (Exception e){
            throw new HplsqlException("open connection fail :" + e.getMessage() );
        }
    }

    public Connection getConnection() throws HplsqlException{
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
                }
                else {
                    url.append("jdbc:hive://");
                }
                for (int i = 2; i < c.length; i++) {
                    if (c[i].contains("=")) {
                        url.append(";");
                        url.append(c[i]);
                    }
                    else if (usr.isEmpty()) {
                        usr = c[i];
                    }
                    else if (pwd.isEmpty()) {
                        pwd = c[i];
                    }
                }
            }
            Class.forName(driver);
            return DriverManager.getConnection(url.toString().trim(), usr, pwd);
        } catch (Exception e){
            throw new HplsqlException("get connection fail :" + e.getMessage() );
        }
    }

    public void executeInitSql(Connection conn) throws SQLException{
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


    public void closeConnection(){
        // TODO
    }


}
