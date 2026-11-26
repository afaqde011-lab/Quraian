package yh;

public final class j extends com.google.crypto.tink.shaded.protobuf.x {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final j DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private n aesCtrKeyFormat_;
    private s0 hmacKeyFormat_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        com.google.crypto.tink.shaded.protobuf.x.s(j.class, jVar);
    }

    public static j A(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (j) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(j jVar, n nVar) {
        jVar.getClass();
        jVar.aesCtrKeyFormat_ = nVar;
    }

    public static void w(j jVar, s0 s0Var) {
        jVar.getClass();
        jVar.hmacKeyFormat_ = s0Var;
    }

    public static i z() {
        return (i) DEFAULT_INSTANCE.g();
    }

    @Override
    public final Object h(int i10) {
        com.google.crypto.tink.shaded.protobuf.v0 wVar;
        switch (e4.f.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new j();
            case 4:
                return new i(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (j.class) {
                    try {
                        wVar = PARSER;
                        if (wVar == null) {
                            wVar = new com.google.crypto.tink.shaded.protobuf.w();
                            PARSER = wVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return wVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final n x() {
        n nVar = this.aesCtrKeyFormat_;
        return nVar == null ? n.x() : nVar;
    }

    public final s0 y() {
        s0 s0Var = this.hmacKeyFormat_;
        return s0Var == null ? s0.x() : s0Var;
    }
}
