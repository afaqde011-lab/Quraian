package yh;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.UninitializedMessageException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

public final class f1 extends com.google.crypto.tink.shaded.protobuf.x {
    private static final f1 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.v0 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private com.google.crypto.tink.shaded.protobuf.a0 key_ = com.google.crypto.tink.shaded.protobuf.y0.D;
    private int primaryKeyId_;

    static {
        f1 f1Var = new f1();
        DEFAULT_INSTANCE = f1Var;
        com.google.crypto.tink.shaded.protobuf.x.s(f1.class, f1Var);
    }

    public static c1 B() {
        return (c1) DEFAULT_INSTANCE.g();
    }

    public static f1 C(ByteArrayInputStream byteArrayInputStream, com.google.crypto.tink.shaded.protobuf.p pVar) throws InvalidProtocolBufferException {
        com.google.crypto.tink.shaded.protobuf.x xVarR = com.google.crypto.tink.shaded.protobuf.x.r(DEFAULT_INSTANCE, new com.google.crypto.tink.shaded.protobuf.k(byteArrayInputStream), pVar);
        com.google.crypto.tink.shaded.protobuf.x.f(xVarR);
        return (f1) xVarR;
    }

    public static f1 D(byte[] bArr, com.google.crypto.tink.shaded.protobuf.p pVar) {
        f1 f1Var = DEFAULT_INSTANCE;
        int length = bArr.length;
        com.google.crypto.tink.shaded.protobuf.x xVarP = f1Var.p();
        try {
            com.google.crypto.tink.shaded.protobuf.x0 x0Var = com.google.crypto.tink.shaded.protobuf.x0.f4333c;
            x0Var.getClass();
            com.google.crypto.tink.shaded.protobuf.a1 a1VarA = x0Var.a(xVarP.getClass());
            com.google.crypto.tink.shaded.protobuf.d dVar = new com.google.crypto.tink.shaded.protobuf.d();
            pVar.getClass();
            a1VarA.d(xVarP, bArr, 0, length, dVar);
            a1VarA.makeImmutable(xVarP);
            com.google.crypto.tink.shaded.protobuf.x.f(xVarP);
            return (f1) xVarP;
        } catch (InvalidProtocolBufferException e3) {
            if (e3.A) {
                throw new InvalidProtocolBufferException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (UninitializedMessageException e10) {
            throw new InvalidProtocolBufferException(e10.getMessage());
        } catch (IOException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw new InvalidProtocolBufferException(e11.getMessage(), e11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.g();
        }
    }

    public static void v(f1 f1Var, int i10) {
        f1Var.primaryKeyId_ = i10;
    }

    public static void w(f1 f1Var, e1 e1Var) {
        f1Var.getClass();
        com.google.crypto.tink.shaded.protobuf.a0 a0Var = f1Var.key_;
        if (!((com.google.crypto.tink.shaded.protobuf.b) a0Var).A) {
            int size = a0Var.size();
            f1Var.key_ = a0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        f1Var.key_.add(e1Var);
    }

    public final int A() {
        return this.primaryKeyId_;
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
                return new com.google.crypto.tink.shaded.protobuf.z0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", e1.class});
            case 3:
                return new f1();
            case 4:
                return new c1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.v0 v0Var = PARSER;
                if (v0Var != null) {
                    return v0Var;
                }
                synchronized (f1.class) {
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

    public final e1 x(int i10) {
        return (e1) this.key_.get(i10);
    }

    public final int y() {
        return this.key_.size();
    }

    public final List z() {
        return this.key_;
    }
}
