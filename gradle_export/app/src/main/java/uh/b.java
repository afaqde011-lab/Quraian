package uh;

import a30.x;
import java.security.GeneralSecurityException;
import yh.o0;
import yh.q0;
import yh.r0;
import yh.s0;
import yh.t0;
import yh.u0;
import yh.w0;
import zh.u;

public final class b extends x {
    public static final th.l F = new th.l(a.class, new oj.l(27));
    public static final th.l G = new th.l(i.class, new oj.l(29));
    public final int E = 1;

    public b() {
        super(q0.class, new nh.f[]{new nh.f(11, mh.i.class)});
    }

    public b(Class cls, nh.f[] fVarArr) {
        super(cls, fVarArr);
    }

    public static th.d u(int i10, int i11, o0 o0Var, int i12) {
        r0 r0VarA = s0.A();
        t0 t0VarA = u0.A();
        t0VarA.d();
        u0.v((u0) t0VarA.B, o0Var);
        t0VarA.d();
        u0.w((u0) t0VarA.B, i11);
        u0 u0Var = (u0) t0VarA.a();
        r0VarA.d();
        s0.v((s0) r0VarA.B, u0Var);
        r0VarA.d();
        s0.w((s0) r0VarA.B, i10);
        return new th.d((s0) r0VarA.a(), i12);
    }

    public static void v(yh.f fVar) {
        if (fVar.x() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (fVar.x() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void w(u0 u0Var) {
        if (u0Var.z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int iOrdinal = u0Var.y().ordinal();
        if (iOrdinal == 1) {
            if (u0Var.z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 2) {
            if (u0Var.z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (iOrdinal == 3) {
            if (u0Var.z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 4) {
            if (u0Var.z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (u0Var.z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    public int c() {
        switch (this.E) {
            case 1:
                return 2;
            default:
                return super.c();
        }
    }

    public final String i() {
        switch (this.E) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    public final f5.c m() {
        switch (this.E) {
            case 0:
                return new nh.g(yh.d.class);
            default:
                return new nh.g(this);
        }
    }

    public final w0 q() {
        switch (this.E) {
            case 0:
                break;
        }
        return w0.SYMMETRIC;
    }

    public final com.google.crypto.tink.shaded.protobuf.a s(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.E) {
            case 0:
                return yh.b.C(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            default:
                return q0.D(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
        }
    }

    public final void t(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.E) {
            case 0:
                yh.b bVar = (yh.b) aVar;
                u.c(bVar.A());
                if (bVar.y().size() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                v(bVar.z());
                return;
            default:
                q0 q0Var = (q0) aVar;
                u.c(q0Var.B());
                if (q0Var.z().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                w(q0Var.A());
                return;
        }
    }
}
