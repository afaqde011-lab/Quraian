package yh;

public final class l0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final l0 DEFAULT_INSTANCE;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;

    static {
        l0 l0Var = new l0();
        DEFAULT_INSTANCE = l0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(l0.class, l0Var);
    }

    public static l0 v() {
        return DEFAULT_INSTANCE;
    }

    public static l0 w(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (l0) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new l0();
            case 4:
                return new k0(DEFAULT_INSTANCE, 0);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (l0.class) {
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
}
