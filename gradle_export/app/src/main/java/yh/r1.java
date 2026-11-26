package yh;

import com.google.protobuf.RuntimeVersion;

public final class r1 extends com.google.crypto.tink.shaded.protobuf.x {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final r1 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private String configName_ = RuntimeVersion.SUFFIX;
    private com.google.crypto.tink.shaded.protobuf.a0 entry_ = com.google.crypto.tink.shaded.protobuf.y0.D;

    static {
        r1 r1Var = new r1();
        DEFAULT_INSTANCE = r1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(r1.class, r1Var);
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", b1.class});
            case 3:
                return new r1();
            case 4:
                return new k0(DEFAULT_INSTANCE, 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (r1.class) {
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
