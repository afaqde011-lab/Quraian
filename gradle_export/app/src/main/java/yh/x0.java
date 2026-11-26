package yh;

import com.google.protobuf.RuntimeVersion;

public final class x0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final x0 DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = RuntimeVersion.SUFFIX;
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.B;

    static {
        x0 x0Var = new x0();
        DEFAULT_INSTANCE = x0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(x0.class, x0Var);
    }

    public static v0 C() {
        return (v0) DEFAULT_INSTANCE.g();
    }

    public static void v(x0 x0Var, String str) {
        x0Var.getClass();
        str.getClass();
        x0Var.typeUrl_ = str;
    }

    public static void w(x0 x0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        x0Var.getClass();
        x0Var.value_ = hVar;
    }

    public static void x(x0 x0Var, w0 w0Var) {
        x0Var.getClass();
        if (w0Var != w0.UNRECOGNIZED) {
            x0Var.keyMaterialType_ = w0Var.A;
        } else {
            w0Var.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static x0 y() {
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new x0();
            case 4:
                return new v0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (x0.class) {
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

    public final w0 z() {
        w0 w0Var;
        int i10 = this.keyMaterialType_;
        if (i10 == 0) {
            w0Var = w0.UNKNOWN_KEYMATERIAL;
        } else if (i10 == 1) {
            w0Var = w0.SYMMETRIC;
        } else if (i10 == 2) {
            w0Var = w0.ASYMMETRIC_PRIVATE;
        } else if (i10 != 3) {
            w0Var = i10 != 4 ? null : w0.REMOTE;
        } else {
            w0Var = w0.ASYMMETRIC_PUBLIC;
        }
        return w0Var == null ? w0.UNRECOGNIZED : w0Var;
    }
}
