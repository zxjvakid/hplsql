package org.apache.hive.hplsql.service.common;

import java.util.List;

public class HplsqlResponse {
    private final int responseCode;
    private List<String> outputStrings;
    public HplsqlResponse(int responseCode) {
        this.responseCode = responseCode;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public List<String> getOutputStrings() {
        return outputStrings;
    }

    public void setOutputStrings(List<String> outputStrings) {
        this.outputStrings = outputStrings;
    }
}
