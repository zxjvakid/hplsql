package org.apache.hive.hplsql.service.common;

import java.util.ArrayList;
import java.util.List;

public class OperationOutPut {
    private List<String> execOutputs;

    public OperationOutPut() {
    }

    public OperationOutPut(List<String> execOutputs) {
        this.execOutputs = execOutputs;
    }

    public List<String> getExecOutputs() {
        return execOutputs;
    }

    public void setExecOutputs(List<String> execOutputs) {
        this.execOutputs = execOutputs;
    }

    public List<String> readOperationOutput(boolean fetchFirst, long maxRows) {
        List<String> results = new ArrayList<>();
        if(execOutputs != null && execOutputs.size() < maxRows){
            results.addAll(execOutputs);
            execOutputs = new ArrayList<>();;
            return results;
        }else{
            return  null; //TODO
        }
    }
}
