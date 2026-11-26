package yh;

public final class s0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final s0 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private u0 params_;
    private int version_;

    static {
        s0 s0Var = new s0();
        DEFAULT_INSTANCE = s0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(s0.class, s0Var);
    }

    public static r0 A() {
        return (r0) DEFAULT_INSTANCE.g();
    }

    public static s0 B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (s0) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(s0 s0Var, u0 u0Var) {
        s0Var.getClass();
        s0Var.params_ = u0Var;
    }

    public static void w(s0 s0Var, int i10) {
        s0Var.keySize_ = i10;
    }

    public static s0 x() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new s0();
            case 4:
                return new r0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (s0.class) {
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

    public final int y() {
        return this.keySize_;
    }

    public final u0 z() {
        u0 u0Var = this.params_;
        return u0Var == null ? u0.x() : u0Var;
    }
}
