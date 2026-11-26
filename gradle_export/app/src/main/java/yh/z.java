package yh;

public final class z extends com.google.crypto.tink.shaded.protobuf.x {
    private static final z DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        z zVar = new z();
        DEFAULT_INSTANCE = zVar;
        com.google.crypto.tink.shaded.protobuf.x.s(z.class, zVar);
    }

    public static void v(z zVar, int i10) {
        zVar.keySize_ = i10;
    }

    public static y x() {
        return (y) DEFAULT_INSTANCE.g();
    }

    public static z y(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (z) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new z();
            case 4:
                return new y(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (z.class) {
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
