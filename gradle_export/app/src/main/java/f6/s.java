package f6;

import androidx.glance.appwidget.protobuf.InvalidProtocolBufferException;
import androidx.glance.appwidget.protobuf.UninitializedMessageException;
import androidx.glance.appwidget.protobuf.d0;
import androidx.glance.appwidget.protobuf.e0;
import androidx.glance.appwidget.protobuf.u0;
import androidx.glance.appwidget.protobuf.w0;
import androidx.glance.appwidget.protobuf.x0;
import androidx.glance.appwidget.protobuf.y0;
import androidx.glance.appwidget.protobuf.z0;
import java.io.IOException;
import java.io.InputStream;

public final class s extends androidx.glance.appwidget.protobuf.z {
    private static final s DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile u0 PARSER;
    private d0 layout_ = x0.D;
    private int nextIndex_;

    static {
        s sVar = new s();
        DEFAULT_INSTANCE = sVar;
        androidx.glance.appwidget.protobuf.z.k(s.class, sVar);
    }

    public static void n(s sVar, u uVar) {
        sVar.getClass();
        d0 d0Var = sVar.layout_;
        if (!((androidx.glance.appwidget.protobuf.b) d0Var).A) {
            int size = d0Var.size();
            sVar.layout_ = d0Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
        }
        sVar.layout_.add(uVar);
    }

    public static void o(s sVar) {
        sVar.getClass();
        sVar.layout_ = x0.D;
    }

    public static void p(s sVar, int i10) {
        sVar.nextIndex_ = i10;
    }

    public static s q() {
        return DEFAULT_INSTANCE;
    }

    public static s t(InputStream inputStream) throws InvalidProtocolBufferException {
        androidx.datastore.preferences.protobuf.j kVar;
        s sVar = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = e0.f886b;
            int length = bArr.length;
            kVar = new androidx.glance.appwidget.protobuf.j(bArr, 0, length, false);
            try {
                kVar.n(length);
            } catch (InvalidProtocolBufferException e3) {
                throw new IllegalArgumentException(e3);
            }
        } else {
            kVar = new androidx.glance.appwidget.protobuf.k(inputStream);
        }
        androidx.glance.appwidget.protobuf.r rVarA = androidx.glance.appwidget.protobuf.r.a();
        androidx.glance.appwidget.protobuf.z zVarJ = sVar.j();
        try {
            w0 w0Var = w0.f961c;
            w0Var.getClass();
            z0 z0VarA = w0Var.a(zVarJ.getClass());
            androidx.glance.appwidget.protobuf.l lVar = (androidx.glance.appwidget.protobuf.l) kVar.f632b;
            if (lVar == null) {
                lVar = new androidx.glance.appwidget.protobuf.l(kVar);
            }
            z0VarA.b(zVarJ, lVar, rVarA);
            z0VarA.makeImmutable(zVarJ);
            if (androidx.glance.appwidget.protobuf.z.g(zVarJ, true)) {
                return (s) zVarJ;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        } catch (InvalidProtocolBufferException e10) {
            if (e10.A) {
                throw new InvalidProtocolBufferException(e10.getMessage(), e10);
            }
            throw e10;
        } catch (UninitializedMessageException e11) {
            throw new InvalidProtocolBufferException(e11.getMessage());
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12.getMessage(), e12);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
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
                return new y0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", u.class, "nextIndex_"});
            case 3:
                return new s();
            case 4:
                return new r(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                u0 u0Var = PARSER;
                if (u0Var != null) {
                    return u0Var;
                }
                synchronized (s.class) {
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

    public final d0 r() {
        return this.layout_;
    }

    public final int s() {
        return this.nextIndex_;
    }
}
