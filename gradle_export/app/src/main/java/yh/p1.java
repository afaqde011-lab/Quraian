package yh;

import com.google.protobuf.RuntimeVersion;

public final class p1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final p1 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private a1 dekTemplate_;
    private String kekUri_ = RuntimeVersion.SUFFIX;

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(p1.class, p1Var);
    }

    public static p1 v() {
        return DEFAULT_INSTANCE;
    }

    public static p1 z(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.p pVar) {
        return (p1) com.google.crypto.tink.shaded.protobuf.x.q(DEFAULT_INSTANCE, iVar, pVar);
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new p1();
            case 4:
                return new k0(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (p1.class) {
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

    public final a1 w() {
        a1 a1Var = this.dekTemplate_;
        return a1Var == null ? a1.y() : a1Var;
    }

    public final String x() {
        return this.kekUri_;
    }

    public final boolean y() {
        return this.dekTemplate_ != null;
    }
}
