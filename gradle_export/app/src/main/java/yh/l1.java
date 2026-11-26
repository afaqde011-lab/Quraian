package yh;

public final class l1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final l1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private m1 params_;
    private int version_;

    static {
        l1 l1Var = new l1();
        DEFAULT_INSTANCE = l1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(l1.class, l1Var);
    }

    public static l1 A(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (l1) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(l1 l1Var) {
        l1Var.version_ = 0;
    }

    public static void w(l1 l1Var, m1 m1Var) {
        l1Var.getClass();
        m1Var.getClass();
        l1Var.params_ = m1Var;
    }

    public static k1 z() {
        return (k1) DEFAULT_INSTANCE.g();
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new l1();
            case 4:
                return new k1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (l1.class) {
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

    public final m1 x() {
        m1 m1Var = this.params_;
        return m1Var == null ? m1.v() : m1Var;
    }

    public final int y() {
        return this.version_;
    }
}
