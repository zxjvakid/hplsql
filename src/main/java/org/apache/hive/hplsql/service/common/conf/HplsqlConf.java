package org.apache.hive.hplsql.service.common.conf;

public class HplsqlConf{
    /**
     * 异步sql执行操作获取结果的轮询时间(ms)
     * 时间过长会阻碍其他请求获取执行结果
     */
    public static final Long LONG_POLLING_TIMEOUT = 1000L;
    public static final String DEFAULT_CONN = "hive2conn";
    public static final String DEFAULT_CONN_DRIVER = "org.apache.hive.jdbc.HiveDriver";
    public static final String DEFAULT_CONN_URL = "jdbc:hive2://10.10.10.104:10000/zxj;";
    public static final String DEFAULT_CONN_USER = "xiujuan";
    public static final String DEFAULT_CONN_PASSWORD = "xiujuan";
}
