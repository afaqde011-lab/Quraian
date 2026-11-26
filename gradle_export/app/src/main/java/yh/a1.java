package yh;

import com.google.protobuf.RuntimeVersion;

public final class a1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final a1 DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = RuntimeVersion.SUFFIX;
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.B;

    static {
        a1 a1Var = new a1();
        DEFAULT_INSTANCE = a1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(a1.class, a1Var);
    }

    public static z0 C() {
        return (z0) DEFAULT_INSTANCE.g();
    }

    public static void v(a1 a1Var, String str) {
        a1Var.getClass();
        str.getClass();
        a1Var.typeUrl_ = str;
    }

    public static void w(a1 a1Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        a1Var.getClass();
        a1Var.value_ = hVar;
    }

    public static void x(a1 a1Var, q1 q1Var) {
        a1Var.getClass();
        a1Var.outputPrefixType_ = q1Var.getNumber();
    }

    public static a1 y() {
        return DEFAULT_INSTANCE;
    }

    public final String A() {
        return this.typeUrl_;
    }

    public final com.google.crypto.tink.shaded.protobuf.i B() {
        return this.value_;
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new a1();
            case 4:
                return new z0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (a1.class) {
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

    public final q1 z() {
        q1 q1VarA = q1.a(this.outputPrefixType_);
        return q1VarA == null ? q1.UNRECOGNIZED : q1VarA;
    }
}
