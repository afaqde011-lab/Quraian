package yh;

public final class n extends com.google.crypto.tink.shaded.protobuf.x {
    private static final n DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private int keySize_;
    private p params_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        com.google.crypto.tink.shaded.protobuf.x.s(n.class, nVar);
    }

    public static m A() {
        return (m) DEFAULT_INSTANCE.g();
    }

    public static void v(n nVar, p pVar) {
        nVar.getClass();
        nVar.params_ = pVar;
    }

    public static void w(n nVar, int i10) {
        nVar.keySize_ = i10;
    }

    public static n x() {
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new n();
            case 4:
                return new m(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (n.class) {
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

    public final p z() {
        p pVar = this.params_;
        return pVar == null ? p.w() : pVar;
    }
}
