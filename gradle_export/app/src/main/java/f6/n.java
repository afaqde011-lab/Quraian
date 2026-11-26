package f6;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.w0;
import androidx.glance.appwidget.protobuf.y0;
import androidx.glance.appwidget.protobuf.z0;
import java.io.IOException;

public final class n extends androidx.glance.appwidget.protobuf.z {
    private static final n DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile u0 PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        n nVar = new n();
        DEFAULT_INSTANCE = nVar;
        androidx.glance.appwidget.protobuf.z.k(n.class, nVar);
    }

    public static a E() {
        return (a) DEFAULT_INSTANCE.c();
    }

    public static n F(byte[] bArr) throws InvalidProtocolBufferException {
        androidx.glance.appwidget.protobuf.z zVar = DEFAULT_INSTANCE;
        int length = bArr.length;
        androidx.glance.appwidget.protobuf.r rVarA = androidx.glance.appwidget.protobuf.r.a();
        if (length != 0) {
            androidx.glance.appwidget.protobuf.z zVarJ = zVar.j();
            try {
                w0 w0Var = w0.f961c;
                w0Var.getClass();
                z0 z0VarA = w0Var.a(zVarJ.getClass());
                androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d();
                rVarA.getClass();
                z0VarA.e(zVarJ, bArr, 0, length, dVar);
                z0VarA.makeImmutable(zVarJ);
                zVar = zVarJ;
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
        if (zVar == null || androidx.glance.appwidget.protobuf.z.g(zVar, true)) {
            return (n) zVar;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public static void n(n nVar, m mVar) {
        nVar.getClass();
        nVar.request_ = mVar;
        nVar.requestCase_ = 1;
    }

    public static void o(n nVar, i iVar) {
        nVar.getClass();
        nVar.request_ = iVar;
        nVar.requestCase_ = 2;
    }

    public static void p(n nVar, c cVar) {
        nVar.getClass();
        nVar.request_ = cVar;
        nVar.requestCase_ = 3;
    }

    public static void q(n nVar, e eVar) {
        nVar.getClass();
        nVar.request_ = eVar;
        nVar.requestCase_ = 4;
    }

    public static void r(n nVar, k kVar) {
        nVar.getClass();
        nVar.request_ = kVar;
        nVar.requestCase_ = 5;
    }

    public static void s(n nVar, g gVar) {
        nVar.getClass();
        nVar.request_ = gVar;
        nVar.requestCase_ = 6;
    }

    public final boolean A() {
        return this.requestCase_ == 6;
    }

    public final boolean B() {
        return this.requestCase_ == 2;
    }

    public final boolean C() {
        return this.requestCase_ == 5;
    }

    public final boolean D() {
        return this.requestCase_ == 1;
    }

    @Override
    public final Object d(int i10) {
        u0 yVar;
        switch (e4.f.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new y0(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", m.class, i.class, c.class, e.class, k.class, g.class});
            case 3:
                return new n();
            case 4:
                return new a(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (n.class) {
                    try {
                        yVar = PARSER;
                        if (yVar == null) {
                            yVar = new androidx.glance.appwidget.protobuf.y();
                            PARSER = yVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return yVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final c t() {
        return this.requestCase_ == 3 ? (c) this.request_ : c.q();
    }

    public final e u() {
        return this.requestCase_ == 4 ? (e) this.request_ : e.s();
    }

    public final i v() {
        return this.requestCase_ == 2 ? (i) this.request_ : i.s();
    }

    public final k w() {
        return this.requestCase_ == 5 ? (k) this.request_ : k.s();
    }

    public final m x() {
        return this.requestCase_ == 1 ? (m) this.request_ : m.q();
    }

    public final boolean y() {
        return this.requestCase_ == 3;
    }

    public final boolean z() {
        return this.requestCase_ == 4;
    }
}
