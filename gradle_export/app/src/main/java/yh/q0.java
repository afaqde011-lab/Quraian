package yh;

public final class q0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final q0 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.B;
    private u0 params_;
    private int version_;

    static {
        q0 q0Var = new q0();
        DEFAULT_INSTANCE = q0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(q0.class, q0Var);
    }

    public static p0 C() {
        return (p0) DEFAULT_INSTANCE.g();
    }

    public static q0 D(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (q0) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(q0 q0Var) {
        q0Var.version_ = 0;
    }

    public static void w(q0 q0Var, u0 u0Var) {
        q0Var.getClass();
        u0Var.getClass();
        q0Var.params_ = u0Var;
    }

    public static void x(q0 q0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        q0Var.getClass();
        q0Var.keyValue_ = hVar;
    }

    public static q0 y() {
        return DEFAULT_INSTANCE;
    }

    public final u0 A() {
        u0 u0Var = this.params_;
        return u0Var == null ? u0.x() : u0Var;
    }

    public final int B() {
        return this.version_;
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new q0();
            case 4:
                return new p0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (q0.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.i z() {
        return this.keyValue_;
    }
}
