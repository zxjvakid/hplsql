package org.apache.hive.hplsql;


import org.apache.hive.hplsql.service.common.HplsqlResponse;
import org.apache.hive.hplsql.service.common.conf.HplsqlConf;
import org.apache.hive.hplsql.service.common.exception.HplsqlException;
import org.apache.hive.service.cli.TableSchema;
import org.apache.hive.service.rpc.thrift.TGetInfoType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.StringReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.*;


public class Executor {
    private static final Logger LOG = LoggerFactory.getLogger(Executor.class);

    //为了保证一个hplsql会话对应一个hive会话。同一个hplsql session中使用同一个connection连接hive。
    private Connection reuseConnection;

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
        //TODO 先建立一个连接，再复用该连接对象
        int responseCode;
        Exec exec;
        if(reuseConnection == null){
            exec = new Exec(true);
            responseCode = exec.run(args);
            Conf conf = exec.getConf();
            Conn conn = exec.getConn();
            if(conf != null & conn != null){
                //hplsql 不一定使用默认连接conf.defaultConnection
                Stack<Connection> connections = conn.getConnections().get(conf.defaultConnection);
                reuseConnection = connections.size() > 0 ? connections.get(0) : null;
            }
        }else{
            exec = new Exec(reuseConnection);
            responseCode = exec.run(args);
        }
        return responseCode;
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
        Connection connection;
        try {
            Class.forName(HplsqlConf.DEFAULT_CONN_DRIVER);
            connection = DriverManager.getConnection(HplsqlConf.DEFAULT_CONN_URL ,HplsqlConf.DEFAULT_CONN_USER,HplsqlConf.DEFAULT_CONN_PASSWORD);
            return connection;
        } catch (Exception e){
            throw new HplsqlException("get connection fail :" + e.getMessage() );
        }
    }


    public void closeConnection(){
        // TODO
    }


    /***
     * 多线程并发情况下使用同一个connection会报错，待处理
     */
//    public HplsqlResponse run(String statement) throws Exception{
//        int responseCode = 0;
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        System.setOut(new PrintStream(out));
//        String[] args = {"-e", statement};
//        if(reuseConnection == null){
//            synchronized (this) {
//                if (reuseConnection == null) {
//                    Exec exec = new Exec();
//                    responseCode = exec.run(args);
//                    Conf conf = exec.getConf();
//                    //hplsql 不一定使用默认连接conf.defaultConnection
//                    Stack<Connection> connections = exec.getConn().getConnections().get(conf.defaultConnection);
//                    reuseConnection = connections.size() > 0 ? connections.get(0) : null;
//
//                    LOG.info(exec + "~~~~~out~~~~~:"+ out.toString());
//                    List<String> execOutputs = new ArrayList<>();
//                    BufferedReader reader = new BufferedReader(new StringReader(out.toString()));
//                    String line = null;
//                    while((line = reader.readLine()) != null){
//                        execOutputs.add(line);
//                    }
//                    HplsqlResponse response =  new HplsqlResponse(responseCode);
//                    response.setOutputStrings(execOutputs);
//                    return response;
//                }
//            }
//        }
//
//        Exec exec = new Exec(reuseConnection);
//        responseCode = exec.run(args);
//        LOG.info(exec + "~~~~~out~~~~~:"+ out.toString());
//        List<String> execOutputs = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new StringReader(out.toString()));
//        String line = null;
//        while((line = reader.readLine()) != null){
//            execOutputs.add(line);
//        }
//        HplsqlResponse response =  new HplsqlResponse(responseCode);
//        response.setOutputStrings(execOutputs);
//        return response;
//    }

    public TableSchema getSchema() {
        return new TableSchema().addStringColumn("output","hpl execute output");
    }

}
