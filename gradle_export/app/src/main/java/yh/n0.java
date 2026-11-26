package yh;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import java.io.ByteArrayInputStream;

public final class n0 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final n0 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER;
    private com.google.crypto.tink.shaded.protobuf.i encryptedKeyset_ = com.google.crypto.tink.shaded.protobuf.i.B;
    private j1 keysetInfo_;

    static {
        n0 n0Var = new n0();
        DEFAULT_INSTANCE = n0Var;
        com.google.crypto.tink.shaded.protobuf.x.s(n0.class, n0Var);
    }

    public static void v(n0 n0Var, com.google.crypto.tink.shaded.protobuf.h hVar) {
        n0Var.getClass();
        n0Var.encryptedKeyset_ = hVar;
    }

    public static void w(n0 n0Var, j1 j1Var) {
        n0Var.getClass();
        n0Var.keysetInfo_ = j1Var;
    }

    public static m0 y() {
        return (m0) DEFAULT_INSTANCE.g();
    }

    public static n0 z(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p pVar) throws InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.x xVarR = com.google.crypto.tink.shaded.protobuf.x.r(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.k(byteArrayInputStream), pVar);
        com.google.crypto.tink.shaded.protobuf.x.f(xVarR);
        return (n0) xVarR;
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new n0();
            case 4:
                return new m0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (n0.class) {
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
        return this.encryptedKeyset_;
    }
}
