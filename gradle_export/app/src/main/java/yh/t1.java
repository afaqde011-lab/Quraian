package yh;

public final class t1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final t1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.B;
    private int version_;

    static {
        t1 t1Var = new t1();
        DEFAULT_INSTANCE = t1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(t1.class, t1Var);
    }

    public static t1 A(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (t1) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
    }

    public static void v(t1 t1Var) {
        t1Var.version_ = 0;
    }

    public static void w(t1 t1Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        t1Var.getClass();
        t1Var.keyValue_ = hVar;
    }

    public static s1 z() {
        return (s1) DEFAULT_INSTANCE.g();
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new t1();
            case 4:
                return new s1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (t1.class) {
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

    public final com.google.crypto.tink.shaded.protobuf.i x() {
        return this.keyValue_;
    }

    public final int y() {
        return this.version_;
    }
}
