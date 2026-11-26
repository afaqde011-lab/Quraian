package yh;

public final class o1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final o1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p1 params_;
    private int version_;

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(o1.class, o1Var);
    }

    public static o1 A(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (o1) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(o1 o1Var) {
        o1Var.version_ = 0;
    }

    public static void w(o1 o1Var, p1 p1Var) {
        o1Var.getClass();
        p1Var.getClass();
        o1Var.params_ = p1Var;
    }

    public static n1 z() {
        return (n1) DEFAULT_INSTANCE.g();
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
                return new o1();
            case 4:
                return new n1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (o1.class) {
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

    public final p1 x() {
        p1 p1Var = this.params_;
        return p1Var == null ? p1.v() : p1Var;
    }

    public final int y() {
        return this.version_;
    }
}
