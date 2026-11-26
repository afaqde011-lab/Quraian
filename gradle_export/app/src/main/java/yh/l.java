package yh;

public final class l extends com.google.crypto.tink.shaded.protobuf.x {
    private static final l DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.i keyValue_ = com.google.crypto.tink.shaded.protobuf.i.B;
    private p params_;
    private int version_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        com.google.crypto.tink.shaded.protobuf.x.s(l.class, lVar);
    }

    public static k C() {
        return (k) DEFAULT_INSTANCE.g();
    }

    public static void v(l lVar) {
        lVar.version_ = 0;
    }

    public static void w(l lVar, p pVar) {
        lVar.getClass();
        pVar.getClass();
        lVar.params_ = pVar;
    }

    public static void x(l lVar, com.google.crypto.tink.shaded.protobuf.h hVar) {
        lVar.getClass();
        lVar.keyValue_ = hVar;
    }

    public static l y() {
        return DEFAULT_INSTANCE;
    }

    public final p A() {
        p pVar = this.params_;
        return pVar == null ? p.w() : pVar;
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
                return new l();
            case 4:
                return new k(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (l.class) {
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
