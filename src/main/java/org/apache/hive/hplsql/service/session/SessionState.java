package org.apache.hive.hplsql.service.session;

public class SessionState {

    /**
     * The flag to indicate if the session already started so we can skip the init
     */
    private boolean isStarted = false;

    private String userIpAddress;

    /**
     * set the ip address for user running the query
     *
     * @param userIpAddress
     */
    public void setUserIpAddress(String userIpAddress) {
        this.userIpAddress = userIpAddress;
    }
}
