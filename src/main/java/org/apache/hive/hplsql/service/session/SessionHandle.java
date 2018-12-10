package org.apache.hive.hplsql.service.session;

import org.apache.hive.hplsql.service.common.Handle;
import org.apache.hive.hplsql.service.common.HandleIdentifier;
import org.apache.hive.service.rpc.thrift.TProtocolVersion;
import org.apache.hive.service.rpc.thrift.TSessionHandle;

import java.util.UUID;

public class SessionHandle extends Handle {

    private final TProtocolVersion protocol;

    public SessionHandle(TProtocolVersion protocol) {
        this.protocol = protocol;
    }

    // dummy handle for ThriftCLIService
    public SessionHandle(TSessionHandle tSessionHandle) {
        this(tSessionHandle, TProtocolVersion.HIVE_CLI_SERVICE_PROTOCOL_V1);
    }

    public SessionHandle(TSessionHandle tSessionHandle, TProtocolVersion protocol) {
        super(tSessionHandle.getSessionId());
        this.protocol = protocol;
    }
    public SessionHandle(HandleIdentifier handleId, TProtocolVersion protocol) {
        super(handleId);
        this.protocol = protocol;
    }
    public UUID getSessionId() {
        return getHandleIdentifier().getPublicId();
    }

    public TSessionHandle toTSessionHandle() {
        TSessionHandle tSessionHandle = new TSessionHandle();
        tSessionHandle.setSessionId(getHandleIdentifier().toTHandleIdentifier());
        return tSessionHandle;
    }

    public TProtocolVersion getProtocolVersion() {
        return protocol;
    }

    @Override
    public String toString() {
        return "SessionHandle [" + getHandleIdentifier() + "]";
    }
}
