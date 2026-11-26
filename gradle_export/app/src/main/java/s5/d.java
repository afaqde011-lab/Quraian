package s5;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import androidx.datastore.preferences.protobuf.UninitializedMessageException;
import androidx.datastore.preferences.protobuf.g0;
import androidx.datastore.preferences.protobuf.k;
import androidx.datastore.preferences.protobuf.n;
import androidx.datastore.preferences.protobuf.p0;
import androidx.datastore.preferences.protobuf.r0;
import androidx.datastore.preferences.protobuf.t;
import androidx.datastore.preferences.protobuf.t0;
import androidx.datastore.preferences.protobuf.u;
import androidx.datastore.preferences.protobuf.u0;
import androidx.datastore.preferences.protobuf.v;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

public final class d extends v {
    private static final d DEFAULT_INSTANCE;
    private static volatile p0 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private g0 preferences_ = g0.B;

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        v.j(d.class, dVar);
    }

    public static g0 l(d dVar) {
        g0 g0Var = dVar.preferences_;
        if (!g0Var.A) {
            dVar.preferences_ = g0Var.c();
        }
        return dVar.preferences_;
    }

    public static b n() {
        return (b) ((t) DEFAULT_INSTANCE.c(5));
    }

    public static d o(InputStream inputStream) {
        d dVar = DEFAULT_INSTANCE;
        androidx.datastore.preferences.protobuf.i iVar = new androidx.datastore.preferences.protobuf.i(inputStream);
        n nVarA = n.a();
        v vVarI = dVar.i();
        try {
            r0 r0Var = r0.f672c;
            r0Var.getClass();
            u0 u0VarA = r0Var.a(vVarI.getClass());
            k kVar = (k) iVar.f632b;
            if (kVar == null) {
                kVar = new k(iVar);
            }
            u0VarA.e(vVarI, kVar, nVarA);
            u0VarA.makeImmutable(vVarI);
            if (v.f(vVarI, true)) {
                return (d) vVarI;
            }
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
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
        } catch (RuntimeException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw e12;
        }
    }

    @Override
    public final Object c(int i10) {
        p0 uVar;
        switch (e4.f.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new t0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", c.f13635a});
            case 3:
                return new d();
            case 4:
                return new b(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                p0 p0Var = PARSER;
                if (p0Var != null) {
                    return p0Var;
                }
                synchronized (d.class) {
                    try {
                        uVar = PARSER;
                        if (uVar == null) {
                            uVar = new u();
                            PARSER = uVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return uVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final Map m() {
        return Collections.unmodifiableMap(this.preferences_);
    }
}
