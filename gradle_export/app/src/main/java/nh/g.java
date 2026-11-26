package nh;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import yh.a0;
import yh.b0;
import yh.d0;
import yh.e0;
import yh.f0;
import yh.g0;
import yh.h0;
import yh.i0;
import yh.j0;
import yh.k1;
import yh.l0;
import yh.l1;
import yh.m1;
import yh.n1;
import yh.o0;
import yh.o1;
import yh.p0;
import yh.p1;
import yh.q0;
import yh.s0;
import yh.s1;
import yh.t1;
import yh.u0;
import yh.u1;
import yh.z;

public final class g extends f5.c {
    public final int C = 9;

    public g(Class cls) {
        super(cls, 10);
    }

    public g(h hVar) {
        super(yh.j.class, 10);
    }

    public g(h hVar, byte b7) {
        super(yh.t.class, 10);
    }

    public g(h hVar, byte b7, byte b10) {
        super(p1.class, 10);
    }

    public g(h hVar, byte b7, char c10) {
        super(u1.class, 10);
    }

    public g(h hVar, byte b7, int i10) {
        super(h0.class, 10);
    }

    public g(h hVar, byte b7, boolean z10) {
        super(m1.class, 10);
    }

    public g(h hVar, char c10) {
        super(z.class, 10);
    }

    public g(h hVar, int i10) {
        super(d0.class, 10);
    }

    public g(h hVar, short s6) {
        super(l0.class, 10);
    }

    public g(uh.b bVar) {
        super(s0.class, 10);
    }

    @Override
    public final com.google.crypto.tink.shaded.protobuf.a D0(com.google.crypto.tink.shaded.protobuf.a aVar) {
        switch (this.C) {
            case 0:
                yh.j jVar = (yh.j) aVar;
                f[] fVarArr = {new f(1, zh.q.class)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f11318a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f11318a;
                }
                Collections.unmodifiableMap(map);
                yh.n nVarX = jVar.x();
                yh.k kVarC = yh.l.C();
                yh.p pVarZ = nVarX.z();
                kVarC.d();
                yh.l.w((yh.l) kVarC.B, pVarZ);
                byte[] bArrA = zh.t.a(nVarX.y());
                com.google.crypto.tink.shaded.protobuf.h hVarC = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA.length, bArrA);
                kVarC.d();
                yh.l.x((yh.l) kVarC.B, hVarC);
                kVarC.d();
                yh.l.v((yh.l) kVarC.B);
                yh.l lVar = (yh.l) kVarC.a();
                f[] fVarArr2 = {new f(11, mh.i.class)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f11318a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.b.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f11318a;
                }
                Collections.unmodifiableMap(map2);
                s0 s0VarY = jVar.y();
                p0 p0VarC = q0.C();
                p0VarC.d();
                q0.v((q0) p0VarC.B);
                u0 u0VarZ = s0VarY.z();
                p0VarC.d();
                q0.w((q0) p0VarC.B, u0VarZ);
                byte[] bArrA2 = zh.t.a(s0VarY.y());
                com.google.crypto.tink.shaded.protobuf.h hVarC2 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA2.length, bArrA2);
                p0VarC.d();
                q0.x((q0) p0VarC.B, hVarC2);
                q0 q0Var = (q0) p0VarC.a();
                yh.g gVarB = yh.h.B();
                gVarB.d();
                yh.h.w((yh.h) gVarB.B, lVar);
                gVarB.d();
                yh.h.x((yh.h) gVarB.B, q0Var);
                gVarB.d();
                yh.h.v((yh.h) gVarB.B);
                return (yh.h) gVarB.a();
            case 1:
                yh.t tVar = (yh.t) aVar;
                yh.q qVarB = yh.r.B();
                byte[] bArrA3 = zh.t.a(tVar.x());
                com.google.crypto.tink.shaded.protobuf.h hVarC3 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA3.length, bArrA3);
                qVarB.d();
                yh.r.x((yh.r) qVarB.B, hVarC3);
                yh.v vVarY = tVar.y();
                qVarB.d();
                yh.r.w((yh.r) qVarB.B, vVarY);
                qVarB.d();
                yh.r.v((yh.r) qVarB.B);
                return (yh.r) qVarB.a();
            case 2:
                yh.w wVarZ = yh.x.z();
                byte[] bArrA4 = zh.t.a(((z) aVar).w());
                com.google.crypto.tink.shaded.protobuf.h hVarC4 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA4.length, bArrA4);
                wVarZ.d();
                yh.x.w((yh.x) wVarZ.B, hVarC4);
                wVarZ.d();
                yh.x.v((yh.x) wVarZ.B);
                return (yh.x) wVarZ.a();
            case 3:
                a0 a0VarZ = b0.z();
                byte[] bArrA5 = zh.t.a(((d0) aVar).w());
                com.google.crypto.tink.shaded.protobuf.h hVarC5 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA5.length, bArrA5);
                a0VarZ.d();
                b0.w((b0) a0VarZ.B, hVarC5);
                a0VarZ.d();
                b0.v((b0) a0VarZ.B);
                return (b0) a0VarZ.a();
            case 4:
                i0 i0VarZ = j0.z();
                i0VarZ.d();
                j0.v((j0) i0VarZ.B);
                byte[] bArrA6 = zh.t.a(32);
                com.google.crypto.tink.shaded.protobuf.h hVarC6 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA6.length, bArrA6);
                i0VarZ.d();
                j0.w((j0) i0VarZ.B, hVarC6);
                return (j0) i0VarZ.a();
            case 5:
                k1 k1VarZ = l1.z();
                k1VarZ.d();
                l1.w((l1) k1VarZ.B, (m1) aVar);
                k1VarZ.d();
                l1.v((l1) k1VarZ.B);
                return (l1) k1VarZ.a();
            case 6:
                n1 n1VarZ = o1.z();
                n1VarZ.d();
                o1.w((o1) n1VarZ.B, (p1) aVar);
                n1VarZ.d();
                o1.v((o1) n1VarZ.B);
                return (o1) n1VarZ.a();
            case 7:
                s1 s1VarZ = t1.z();
                s1VarZ.d();
                t1.v((t1) s1VarZ.B);
                byte[] bArrA7 = zh.t.a(32);
                com.google.crypto.tink.shaded.protobuf.h hVarC7 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA7.length, bArrA7);
                s1VarZ.d();
                t1.w((t1) s1VarZ.B, hVarC7);
                return (t1) s1VarZ.a();
            case 8:
                e0 e0VarZ = f0.z();
                byte[] bArrA8 = zh.t.a(((h0) aVar).w());
                com.google.crypto.tink.shaded.protobuf.h hVarC8 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA8.length, bArrA8);
                e0VarZ.d();
                f0.w((f0) e0VarZ.B, hVarC8);
                e0VarZ.d();
                f0.v((f0) e0VarZ.B);
                return (f0) e0VarZ.a();
            case 9:
                yh.d dVar = (yh.d) aVar;
                yh.a aVarB = yh.b.B();
                aVarB.d();
                yh.b.v((yh.b) aVarB.B);
                byte[] bArrA9 = zh.t.a(dVar.x());
                com.google.crypto.tink.shaded.protobuf.h hVarC9 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA9.length, bArrA9);
                aVarB.d();
                yh.b.w((yh.b) aVarB.B, hVarC9);
                yh.f fVarY = dVar.y();
                aVarB.d();
                yh.b.x((yh.b) aVarB.B, fVarY);
                return (yh.b) aVarB.a();
            default:
                s0 s0Var = (s0) aVar;
                p0 p0VarC2 = q0.C();
                p0VarC2.d();
                q0.v((q0) p0VarC2.B);
                u0 u0VarZ2 = s0Var.z();
                p0VarC2.d();
                q0.w((q0) p0VarC2.B, u0VarZ2);
                byte[] bArrA10 = zh.t.a(s0Var.y());
                com.google.crypto.tink.shaded.protobuf.h hVarC10 = com.google.crypto.tink.shaded.protobuf.i.c(0, bArrA10.length, bArrA10);
                p0VarC2.d();
                q0.x((q0) p0VarC2.B, hVarC10);
                return (q0) p0VarC2.a();
        }
    }

    @Override
    public Map M0() {
        switch (this.C) {
            case 0:
                HashMap map = new HashMap();
                map.put("AES128_CTR_HMAC_SHA256", h.v(16, 16, 1));
                map.put("AES128_CTR_HMAC_SHA256_RAW", h.v(16, 16, 3));
                map.put("AES256_CTR_HMAC_SHA256", h.v(32, 32, 1));
                map.put("AES256_CTR_HMAC_SHA256_RAW", h.v(32, 32, 3));
                return Collections.unmodifiableMap(map);
            case 1:
                HashMap map2 = new HashMap();
                map2.put("AES128_EAX", h.u(16, 1));
                map2.put("AES128_EAX_RAW", h.u(16, 3));
                map2.put("AES256_EAX", h.u(32, 1));
                map2.put("AES256_EAX_RAW", h.u(32, 3));
                return Collections.unmodifiableMap(map2);
            case 2:
                HashMap map3 = new HashMap();
                map3.put("AES128_GCM", h.w(16, 1));
                map3.put("AES128_GCM_RAW", h.w(16, 3));
                map3.put("AES256_GCM", h.w(32, 1));
                map3.put("AES256_GCM_RAW", h.w(32, 3));
                return Collections.unmodifiableMap(map3);
            case 3:
                HashMap map4 = new HashMap();
                map4.put("AES128_GCM_SIV", h.x(16, 1));
                map4.put("AES128_GCM_SIV_RAW", h.x(16, 3));
                map4.put("AES256_GCM_SIV", h.x(32, 1));
                map4.put("AES256_GCM_SIV_RAW", h.x(32, 3));
                return Collections.unmodifiableMap(map4);
            case 4:
                HashMap map5 = new HashMap();
                map5.put("CHACHA20_POLY1305", new th.d(l0.v(), 1));
                map5.put("CHACHA20_POLY1305_RAW", new th.d(l0.v(), 3));
                return Collections.unmodifiableMap(map5);
            case 5:
            case 6:
            default:
                return super.M0();
            case 7:
                HashMap map6 = new HashMap();
                map6.put("XCHACHA20_POLY1305", new th.d(u1.v(), 1));
                map6.put("XCHACHA20_POLY1305_RAW", new th.d(u1.v(), 3));
                return Collections.unmodifiableMap(map6);
            case 8:
                HashMap map7 = new HashMap();
                g0 g0VarX = h0.x();
                g0VarX.d();
                h0.v((h0) g0VarX.B);
                map7.put("AES256_SIV", new th.d((h0) g0VarX.a(), 1));
                g0 g0VarX2 = h0.x();
                g0VarX2.d();
                h0.v((h0) g0VarX2.B);
                map7.put("AES256_SIV_RAW", new th.d((h0) g0VarX2.a(), 3));
                return Collections.unmodifiableMap(map7);
            case 9:
                HashMap map8 = new HashMap();
                yh.c cVarZ = yh.d.z();
                cVarZ.d();
                yh.d.v((yh.d) cVarZ.B);
                yh.e eVarY = yh.f.y();
                eVarY.d();
                yh.f.v((yh.f) eVarY.B);
                yh.f fVar = (yh.f) eVarY.a();
                cVarZ.d();
                yh.d.w((yh.d) cVarZ.B, fVar);
                map8.put("AES_CMAC", new th.d((yh.d) cVarZ.a(), 1));
                yh.c cVarZ2 = yh.d.z();
                cVarZ2.d();
                yh.d.v((yh.d) cVarZ2.B);
                yh.e eVarY2 = yh.f.y();
                eVarY2.d();
                yh.f.v((yh.f) eVarY2.B);
                yh.f fVar2 = (yh.f) eVarY2.a();
                cVarZ2.d();
                yh.d.w((yh.d) cVarZ2.B, fVar2);
                map8.put("AES256_CMAC", new th.d((yh.d) cVarZ2.a(), 1));
                yh.c cVarZ3 = yh.d.z();
                cVarZ3.d();
                yh.d.v((yh.d) cVarZ3.B);
                yh.e eVarY3 = yh.f.y();
                eVarY3.d();
                yh.f.v((yh.f) eVarY3.B);
                yh.f fVar3 = (yh.f) eVarY3.a();
                cVarZ3.d();
                yh.d.w((yh.d) cVarZ3.B, fVar3);
                map8.put("AES256_CMAC_RAW", new th.d((yh.d) cVarZ3.a(), 3));
                return Collections.unmodifiableMap(map8);
            case 10:
                HashMap map9 = new HashMap();
                o0 o0Var = o0.SHA256;
                map9.put("HMAC_SHA256_128BITTAG", uh.b.u(32, 16, o0Var, 1));
                map9.put("HMAC_SHA256_128BITTAG_RAW", uh.b.u(32, 16, o0Var, 3));
                map9.put("HMAC_SHA256_256BITTAG", uh.b.u(32, 32, o0Var, 1));
                map9.put("HMAC_SHA256_256BITTAG_RAW", uh.b.u(32, 32, o0Var, 3));
                o0 o0Var2 = o0.SHA512;
                map9.put("HMAC_SHA512_128BITTAG", uh.b.u(64, 16, o0Var2, 1));
                map9.put("HMAC_SHA512_128BITTAG_RAW", uh.b.u(64, 16, o0Var2, 3));
                map9.put("HMAC_SHA512_256BITTAG", uh.b.u(64, 32, o0Var2, 1));
                map9.put("HMAC_SHA512_256BITTAG_RAW", uh.b.u(64, 32, o0Var2, 3));
                map9.put("HMAC_SHA512_512BITTAG", uh.b.u(64, 64, o0Var2, 1));
                map9.put("HMAC_SHA512_512BITTAG_RAW", uh.b.u(64, 64, o0Var2, 3));
                return Collections.unmodifiableMap(map9);
        }
    }

    @Override
    public final com.google.crypto.tink.shaded.protobuf.a O0(com.google.crypto.tink.shaded.protobuf.i iVar) {
        switch (this.C) {
            case 0:
                return yh.j.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 1:
                return yh.t.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 2:
                return z.y(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 3:
                return d0.y(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 4:
                return l0.w(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 5:
                return m1.x(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 6:
                return p1.z(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 7:
                return u1.w(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 8:
                return h0.y(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            case 9:
                return yh.d.A(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
            default:
                return s0.B(iVar, com.google.crypto.tink.shaded.protobuf.p.a());
        }
    }

    @Override
    public final void U0(com.google.crypto.tink.shaded.protobuf.a aVar) throws GeneralSecurityException {
        switch (this.C) {
            case 0:
                yh.j jVar = (yh.j) aVar;
                f[] fVarArr = {new f(1, zh.q.class)};
                HashMap map = new HashMap();
                for (f fVar : fVarArr) {
                    Class cls = fVar.f11318a;
                    if (map.containsKey(cls)) {
                        throw new IllegalArgumentException(a1.b.m(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map.put(cls, fVar);
                }
                if (fVarArr.length > 0) {
                    Class cls2 = fVarArr[0].f11318a;
                }
                Collections.unmodifiableMap(map);
                yh.n nVarX = jVar.x();
                zh.u.a(nVarX.y());
                yh.p pVarZ = nVarX.z();
                if (pVarZ.x() < 12 || pVarZ.x() > 16) {
                    throw new GeneralSecurityException("invalid IV size");
                }
                f[] fVarArr2 = {new f(11, mh.i.class)};
                HashMap map2 = new HashMap();
                for (f fVar2 : fVarArr2) {
                    Class cls3 = fVar2.f11318a;
                    if (map2.containsKey(cls3)) {
                        throw new IllegalArgumentException(a1.b.m(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                    map2.put(cls3, fVar2);
                }
                if (fVarArr2.length > 0) {
                    Class cls4 = fVarArr2[0].f11318a;
                }
                Collections.unmodifiableMap(map2);
                s0 s0VarY = jVar.y();
                if (s0VarY.y() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                uh.b.w(s0VarY.z());
                zh.u.a(jVar.x().y());
                return;
            case 1:
                yh.t tVar = (yh.t) aVar;
                zh.u.a(tVar.x());
                if (tVar.y().x() != 12 && tVar.y().x() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                zh.u.a(((z) aVar).w());
                return;
            case 3:
                zh.u.a(((d0) aVar).w());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                p1 p1Var = (p1) aVar;
                if (p1Var.x().isEmpty() || !p1Var.y()) {
                    throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
                }
                return;
            case 7:
                return;
            case 8:
                h0 h0Var = (h0) aVar;
                if (h0Var.w() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + h0Var.w() + ". Valid keys must have 64 bytes.");
            case 9:
                yh.d dVar = (yh.d) aVar;
                uh.b.v(dVar.y());
                if (dVar.x() != 32) {
                    throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
                }
                return;
            default:
                s0 s0Var = (s0) aVar;
                if (s0Var.y() < 16) {
                    throw new GeneralSecurityException("key too short");
                }
                uh.b.w(s0Var.z());
                return;
        }
    }
}
