package org.apache.hive.hplsql;

import org.apache.hive.hplsql.service.CLIService;
import org.apache.hive.hplsql.service.thrift.ThriftBinaryCLIService;
import org.apache.hive.hplsql.service.thrift.ThriftCLIService;

public class Test {
    public static void main(String[] args) {
        CLIService cliService = new CLIService();
        ThriftCLIService service = new ThriftBinaryCLIService(cliService);
        service.init();
        service.run();
    }

}
