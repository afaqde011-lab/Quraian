package l5;

import cf.n;
import g00.k;
import h00.d0;
import java.util.LinkedHashMap;

public abstract class a {

    public static final LinkedHashMap f10032a;

    static {
        k[] kVarArr = {new k(n.UNKNOWN_ERR, new g5.a(26)), new k(n.ABORT_ERR, new g5.a(0)), new k(n.ATTESTATION_NOT_PRIVATE_ERR, new g5.a(16)), new k(n.CONSTRAINT_ERR, new g5.a(1)), new k(n.DATA_ERR, new g5.a(3)), new k(n.INVALID_STATE_ERR, new g5.a(10)), new k(n.ENCODING_ERR, new g5.a(4)), new k(n.NETWORK_ERR, new g5.a(12)), new k(n.NOT_ALLOWED_ERR, new g5.a(14)), new k(n.NOT_SUPPORTED_ERR, new g5.a(17)), new k(n.SECURITY_ERR, new g5.a(22)), new k(n.TIMEOUT_ERR, new g5.a(24))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(d0.P(12));
        d0.W(linkedHashMap, kVarArr);
        f10032a = linkedHashMap;
    }
}
