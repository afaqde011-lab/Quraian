package yh;

public final class j1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final j1 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0 keyInfo_ = com.google.crypto.tink.shaded.protobuf.y0.D;
    private int primaryKeyId_;

    static {
        j1 j1Var = new j1();
        DEFAULT_INSTANCE = j1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(j1.class, j1Var);
    }

    public static void v(j1 j1Var, int i10) {
        j1Var.primaryKeyId_ = i10;
    }

    public static void w(j1 j1Var, i1 i1Var) {
        j1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = j1Var.keyInfo_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) a0Var).A) {
            int size = a0Var.size();
            j1Var.keyInfo_ = a0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        j1Var.keyInfo_.add(i1Var);
    }

    public static g1 y() {
        return (g1) DEFAULT_INSTANCE.g();
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", i1.class});
            case 3:
                return new j1();
            case 4:
                return new g1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (j1.class) {
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

    public final i1 x() {
        return (i1) this.keyInfo_.get(0);
    }
}
