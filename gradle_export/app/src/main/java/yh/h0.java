package yh;

public final class h0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final h0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        h0 h0Var = new h0();
        DEFAULT_INSTANCE = h0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(h0.class, h0Var);
    }

    public static void v(h0 h0Var) {
        h0Var.keySize_ = 64;
    }

    public static g0 x() {
        return (g0) DEFAULT_INSTANCE.g();
    }

    public static h0 y(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (h0) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new h0();
            case 4:
                return new g0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (h0.class) {
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

    public final int w() {
        return this.keySize_;
    }
}
