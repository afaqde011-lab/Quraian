package nh;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import yh.b0;
import yh.c0;
import yh.d0;
import yh.f0;
import yh.j0;
import yh.l1;
import yh.o0;
import yh.o1;
import yh.q0;
import yh.r0;
import yh.s0;
import yh.t0;
import yh.t1;
import yh.u0;
import yh.w0;
import yh.z;

public final class h extends a30.x {
    public final int E;

    public h(Class cls, f[] fVarArr, int i10) {
        super(cls, fVarArr);
        this.E = i10;
    }

    public static th.d u(int i10, int i11) {
        yh.s sVarZ = yh.t.z();
        sVarZ.d();
        yh.t.w((yh.t) sVarZ.B, i10);
        yh.u uVarY = yh.v.y();
        uVarY.d();
        yh.v.v((yh.v) uVarY.B);
        yh.v vVar = (yh.v) uVarY.a();
        sVarZ.d();
        yh.t.v((yh.t) sVarZ.B, vVar);
        return new th.d((yh.t) sVarZ.a(), i11);
    }

    public static th.d v(int i10, int i11, int i12) {
        yh.m mVarA = yh.n.A();
        yh.o oVarY = yh.p.y();
        oVarY.d();
        yh.p.v((yh.p) oVarY.B);
        yh.p pVar = (yh.p) oVarY.a();
        mVarA.d();
        yh.n.v((yh.n) mVarA.B, pVar);
        mVarA.d();
        yh.n.w((yh.n) mVarA.B, i10);
        yh.n nVar = (yh.n) mVarA.a();
        r0 r0VarA = s0.A();
        t0 t0VarA = u0.A();
        t0VarA.d();
        u0.v((u0) t0VarA.B, o0.SHA256);
        t0VarA.d();
        u0.w((u0) t0VarA.B, i11);
        u0 u0Var = (u0) t0VarA.a();
        r0VarA.d();
        s0.v((s0) r0VarA.B, u0Var);
        r0VarA.d();
        s0.w((s0) r0VarA.B, 32);
        s0 s0Var = (s0) r0VarA.a();
        yh.i iVarZ = yh.j.z();
        iVarZ.d();
        yh.j.v((yh.j) iVarZ.B, nVar);
        iVarZ.d();
        yh.j.w((yh.j) iVarZ.B, s0Var);
        return new th.d((yh.j) iVarZ.a(), i12);
    }

    public static th.d w(int i10, int i11) {
        yh.y yVarX = z.x();
        yVarX.d();
        z.v((z) yVarX.B, i10);
        return new th.d((z) yVarX.a(), i11);
    }

    public static th.d x(int i10, int i11) {
        c0 c0VarX = d0.x();
        c0VarX.d();
        d0.v((d0) c0VarX.B, i10);
        return new th.d((d0) c0VarX.a(), i11);
    }

    public int c() {
        switch (this.E) {
            case 0:
                return 2;
            case 1:
            default:
                return super.c();
            case 2:
                return 2;
        }
    }

    public final String i() {
        switch (this.E) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            default:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
        }
    }

    public final f5.c m() {
        switch (this.E) {
            case 0:
                return new g(this);
            case 1:
                return new g(this, (byte) 0);
            case 2:
                return new g(this, (char) 0);
            case 3:
                return new g(this, 0);
            case 4:
                return new g(this, (short) 0);
            case 5:
                return new g(this, (byte) 0, false);
            case 6:
                return new g(this, (byte) 0, (byte) 0);
            case 7:
                return new g(this, (byte) 0, (char) 0);
            default:
                return new g(this, (byte) 0, 0);
        }
    }

    public final w0 q() {
        switch (this.E) {
            case 0:
                return w0.SYMMETRIC;
            case 1:
                return w0.SYMMETRIC;
            case 2:
                return w0.SYMMETRIC;
            case 3:
                return w0.SYMMETRIC;
            case 4:
                return w0.SYMMETRIC;
            case 5:
                return w0.REMOTE;
            case 6:
                return w0.REMOTE;
            case 7:
                return w0.SYMMETRIC;
            default:
                return w0.SYMMETRIC;
        }
    }

    public final com.google.crypto.tink.shaded.protobuf.a s(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.E) {
            case 0:
                return yh.h.C(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 1:
                return yh.r.C(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 2:
                return yh.x.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 3:
                return b0.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 4:
                return j0.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 5:
                return l1.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 6:
                return o1.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 7:
                return t1.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            default:
                return f0.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
        }
    }

    public final void t(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.E) {
            case 0:
                yh.h hVar = (yh.h) aVar;
                zh.u.c(hVar.A());
                f[] fVarArr = {new f(1, zh.q.class)};
                HashMap map = new HashMap();
                f fVar = fVarArr[0];
                Class cls = fVar.f11318a;
                if (map.containsKey(cls)) {
                    throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map.put(cls, fVar);
                Class cls2 = fVarArr[0].f11318a;
                Collections.unmodifiableMap(map);
                yh.l lVarY = hVar.y();
                zh.u.c(lVarY.B());
                zh.u.a(lVarY.z().size());
                yh.p pVarA = lVarY.A();
                if (pVarA.x() < 12 || pVarA.x() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(11, mh.i.class)};
                HashMap map2 = new HashMap();
                f fVar2 = fVarArr2[0];
                Class cls3 = fVar2.f11318a;
                if (map2.containsKey(cls3)) {
                    throw new IllegalArgumentException(a1.b.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                map2.put(cls3, fVar2);
                Class cls4 = fVarArr2[0].f11318a;
                Collections.unmodifiableMap(map2);
                q0 q0VarZ = hVar.z();
                zh.u.c(q0VarZ.B());
                if (q0VarZ.z().size() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                uh.b.w(q0VarZ.A());
                return;
            case 1:
                yh.r rVar = (yh.r) aVar;
                zh.u.c(rVar.A());
                zh.u.a(rVar.y().size());
                if (rVar.z().x() != 12 && rVar.z().x() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                yh.x xVar = (yh.x) aVar;
                zh.u.c(xVar.y());
                zh.u.a(xVar.x().size());
                return;
            case 3:
                b0 b0Var = (b0) aVar;
                zh.u.c(b0Var.y());
                zh.u.a(b0Var.x().size());
                return;
            case 4:
                j0 j0Var = (j0) aVar;
                zh.u.c(j0Var.y());
                if (j0Var.x().size() != 32) {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
                return;
            case 5:
                zh.u.c(((l1) aVar).y());
                return;
            case 6:
                zh.u.c(((o1) aVar).y());
                return;
            case 7:
                t1 t1Var = (t1) aVar;
                zh.u.c(t1Var.y());
                if (t1Var.x().size() != 32) {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
                return;
            default:
                f0 f0Var = (f0) aVar;
                zh.u.c(f0Var.y());
                if (f0Var.x().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + f0Var.x().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
