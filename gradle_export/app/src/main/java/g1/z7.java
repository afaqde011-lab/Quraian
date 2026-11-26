package g1;

import android.content.Context;
import android.content.res.Configuration;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.cast.MediaError;
import com.google.protobuf.RuntimeVersion;
import java.util.Arrays;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

public abstract class z7 {

    public static final float f6046a;

    public static final float f6047b;

    public static final float f6048c;

    public static final float f6049d;

    public static final float f6050e;

    public static final float f6051f;

    public static final float f6052g;

    public static final float f6053h;

    public static final float f6054i;

    public static final u.v f6055j;

    public static final u.v f6056k;
    public static final u.v l;
    public static final float m;

    public static final float f6057n;

    public static final float f6058o;

    public static final float f6059p;

    public static final float f6060q;

    static {
        float f3 = k1.d0.f8590b;
        f6046a = 101 / f3;
        f6047b = 69 / f3;
        f6048c = 36;
        float f10 = 24;
        f6049d = f10;
        f6050e = f10;
        f6051f = 7;
        f6052g = f10;
        f6053h = 74;
        f6054i = 48;
        f6055j = u.k.a(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        u.v vVarA = u.k.a(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        f6056k = vVarA;
        u.v vVar = new u.v(vVarA.f14904b);
        int[] iArr = vVarA.f14903a;
        int i10 = vVarA.f14904b;
        for (int i11 = 0; i11 < i10; i11++) {
            vVar.a((iArr[i11] % 12) + 12);
        }
        l = vVar;
        m = 12;
        f6057n = 384;
        f6058o = 330;
        f6059p = 238;
        f6060q = MediaError.DetailedErrorCode.MEDIAKEYS_UNKNOWN;
    }

    public static final void a(b2.r rVar, float f3, v1.c cVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1041042571);
        int i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new n7(f3);
                g0Var.n0(objN);
            }
            z2.w0 w0Var = (z2.w0) objN;
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            cVar.invoke(g0Var, 6);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c00.k(rVar, f3, cVar, i10, 1);
        }
    }

    public static final void b(b8 b8Var, a7 a7Var, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-934561141);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(a7Var) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            l1.q.b(new l1.q1[]{z6.f6045a.a(m8.a(k1.d0.f8610x, g0Var)), c3.o1.f2738n.a(y3.m.A)}, v1.d.d(-477913269, new w(b8Var, a7Var, 6), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b7(b8Var, a7Var, i10, 0);
        }
    }

    public static final void c(int i10, b2.r rVar, h hVar, a7 a7Var, l1.j jVar, boolean z10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-478841003);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(hVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(z10) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            w.c0.f(hVar.f5807a.e() == 1 ? f6055j : f6056k, f2.h.g(z.n.f(rVar, a7Var.f5715a, p0.f.f12243a).V(new k0(hVar, z10, hVar.f5807a.e(), x5.p(k1.q.A, g0Var))), new al.l(hVar, a7Var, 17)), x5.p(k1.q.C, g0Var), null, v1.d.d(747010833, new q7(a7Var, hVar, z10), g0Var), g0Var, 24576, 8);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k7(rVar, hVar, a7Var, z10, i10);
        }
    }

    public static final void d(b2.r rVar, final h hVar, int i10, final boolean z10, l1.j jVar, int i11) throws NoWhenBranchMatchedException {
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-206784607);
        int i12 = i11 | (g0Var2.g(rVar) ? 4 : 2) | (g0Var2.i(hVar) ? 32 : 16) | (g0Var2.e(i10) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.h(z10) ? 2048 : 1024);
        if (g0Var2.S(i12 & 1, (i12 & 1171) != 1170)) {
            m3.r0 r0VarA = m8.a(k1.d0.f8591c, g0Var2);
            y3.c cVar = (y3.c) g0Var2.k(c3.o1.f2734h);
            final float fA0 = cVar.A0(f6053h);
            Object objN = g0Var2.N();
            l1.c cVar2 = l1.i.f9868a;
            if (objN == cVar2) {
                objN = l1.q.z(new h2.b(0L));
                g0Var2.n0(objN);
            }
            final l1.z0 z0Var = (l1.z0) objN;
            Object objN2 = g0Var2.N();
            if (objN2 == cVar2) {
                objN2 = l1.q.z(new y3.j(0L));
                g0Var2.n0(objN2);
            }
            final l1.z0 z0Var2 = (l1.z0) objN2;
            Object objN3 = g0Var2.N();
            if (objN3 == cVar2) {
                objN3 = l1.q.z(h2.c.f6545e);
                g0Var2.n0(objN3);
            }
            l1.z0 z0Var3 = (l1.z0) objN3;
            Object objN4 = g0Var2.N();
            if (objN4 == cVar2) {
                objN4 = l1.q.o(g0Var2);
                g0Var2.n0(objN4);
            }
            final a40.z zVar = (a40.z) objN4;
            String strY = y(hVar.f5807a.e(), hVar.f5807a.f(), i10, g0Var2);
            String strA = y.a(i10, null, 15);
            boolean zG = g0Var2.g(hVar);
            Object objN5 = g0Var2.N();
            if (zG || objN5 == cVar2) {
                objN5 = l1.q.r(new d0.g(hVar, cVar, z0Var3, 2));
                g0Var2.n0(objN5);
            }
            final l1.p2 p2Var = (l1.p2) objN5;
            b2.i iVar = b2.b.E;
            Object objN6 = g0Var2.N();
            if (objN6 == cVar2) {
                objN6 = new b1.l(z0Var2, z0Var3, z0Var, 12);
                g0Var2.n0(objN6);
            }
            b2.r rVarN = z2.d0.n(rVar, (u00.k) objN6);
            z2.r rVar2 = r3.f5951a;
            b2.r rVarI = z.n.i(h0.z1.m(rVarN.V(a4.B), f6054i), true, null);
            boolean zI = ((i12 & 7168) == 2048) | g0Var2.i(zVar) | g0Var2.i(hVar) | g0Var2.d(fA0) | g0Var2.g(p2Var);
            Object objN7 = g0Var2.N();
            if (zI || objN7 == cVar2) {
                u00.k kVar = new u00.k() {
                    public final Object invoke(Object obj) {
                        j3.a0 a0Var = (j3.a0) obj;
                        final a40.z zVar2 = zVar;
                        final h hVar2 = hVar;
                        final float f3 = fA0;
                        final boolean z11 = z10;
                        final l1.z0 z0Var4 = z0Var;
                        final l1.z0 z0Var5 = z0Var2;
                        u00.a aVar = new u00.a() {
                            public final Object invoke() {
                                a40.c0.y(zVar2, (k00.i) null, (a40.a0) null, new t(hVar2, f3, z11, z0Var4, z0Var5, null, 1), 3);
                                return Boolean.TRUE;
                            }
                        };
                        a10.w[] wVarArr = j3.y.f8004a;
                        a0Var.a(j3.n.f7941b, new j3.a(null, aVar));
                        j3.y.l(a0Var, ((Boolean) p2Var.getValue()).booleanValue());
                        return g00.b0.a;
                    }
                };
                g0Var2.n0(kVar);
                objN7 = kVar;
            }
            b2.r rVarC = j3.q.c(rVarI, true, (u00.k) objN7);
            z2.w0 w0VarD = h0.o.d(iVar, false);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            l1.q.I(w0VarD, g0Var2, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var2, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var2, iHashCode, fVar);
            }
            l1.q.I(rVarC2, g0Var2, b3.h.f2037d);
            boolean zG2 = g0Var2.g(strY);
            Object objN8 = g0Var2.N();
            if (zG2 || objN8 == cVar2) {
                objN8 = new b6.o(strY, 13);
                g0Var2.n0(objN8);
            }
            z6.b(strA, j3.q.b(b2.o.A, (u00.k) objN8), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0VarA, g0Var2, 0, 0, 131068);
            g0Var = g0Var2;
            g0Var.r(true);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.h(rVar, hVar, i10, z10, i11);
        }
    }

    public static final void e(b2.r rVar, l1.j jVar, int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2100674302);
        if (g0Var.S(i10 & 1, (i10 & 3) != 2)) {
            m3.r0 r0VarA = m3.r0.a((m3.r0) g0Var.k(z6.f6045a), 0L, 0L, null, null, 0L, null, 0, 0L, null, new x3.i(x3.f.f16406b, 17, 0), 15695871);
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new j7(0);
                g0Var.n0(objN);
            }
            b2.r rVarB = j3.q.b(rVar, (u00.k) objN);
            z2.w0 w0VarD = h0.o.d(b2.b.E, false);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarB, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            z6.b(":", null, r0.e(k1.c0.f8583g, g0Var), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0VarA, g0Var, 6, 0, 131066);
            g0Var = g0Var;
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new bs.b(rVar, i10, 9);
        }
    }

    public static final void f(b8 b8Var, a7 a7Var, l1.j jVar, int i10) {
        int i11;
        boolean z10;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(755539561);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(a7Var) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            h0.v vVarA = h0.u.a(h0.i.f6410e, b2.b.M, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(vVarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
            }
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar4);
            b(b8Var, a7Var, g0Var, i11 & 126);
            if (b8Var.f()) {
                z10 = true;
                g0Var.c0(999020143);
                g0Var.r(false);
            } else {
                g0Var.c0(998576161);
                b2.r rVarG = h0.c.G(oVar, 0.0f, m, 0.0f, 0.0f, 13);
                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarG, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
                }
                l1.q.I(rVarC2, g0Var, fVar4);
                int i12 = i11 << 3;
                g((i12 & 896) | (i12 & 112) | 6, h0.z1.n(oVar, k1.d0.m, k1.d0.l), a7Var, b8Var, g0Var);
                z10 = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z10);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b7(b8Var, a7Var, i10, 2);
        }
    }

    public static final void g(int i10, b2.r rVar, a7 a7Var, b8 b8Var, l1.j jVar) {
        int i11;
        a7 a7Var2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1261215927);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            a7Var2 = a7Var;
            i11 |= g0Var.g(a7Var2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            a7Var2 = a7Var;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = s7.f5962b;
                g0Var.n0(objN);
            }
            z2.w0 w0Var = (z2.w0) objN;
            i2.t0 t0VarA = g6.a(k1.d0.f8599k, g0Var);
            kotlin.jvm.internal.m.c(t0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p0.a aVar = (p0.a) t0VarA;
            p0.c cVar = e6.f5783i;
            i(rVar, b8Var, a7Var2, w0Var, p0.a.c(aVar, null, cVar, cVar, null, 9), p0.a.c(aVar, cVar, null, null, cVar, 6), g0Var, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g7(rVar, b8Var, a7Var, i10, 3);
        }
    }

    public static final void h(int i10, b2.r rVar, h hVar, a7 a7Var, l1.j jVar, boolean z10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1432307537);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(z10) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new j7(1);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(rVar, false, (u00.k) objN);
            h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.K, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            f(hVar, a7Var, g0Var, (i11 & 14) | ((i11 >> 3) & 112));
            h0.c.h(h0.z1.q(b2.o.A, f6048c), g0Var);
            c((i11 & 7168) | ((i11 << 3) & 112) | (i11 & 896), new p0(), hVar, a7Var, g0Var, z10);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k7(hVar, rVar, a7Var, z10, i10, 1);
        }
    }

    public static final void i(b2.r rVar, b8 b8Var, a7 a7Var, z2.w0 w0Var, i2.t0 t0Var, i2.t0 t0Var2, l1.j jVar, int i10) {
        int i11;
        long j9 = a7Var.f5718d;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1374241901);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(w0Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.g(t0Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.g(t0Var2) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        int i12 = i11;
        if (g0Var.S(i12 & 1, (74899 & i12) != 74898)) {
            z.u uVarA = z.n.a(k1.d0.f8601o, j9);
            i2.t0 t0VarA = g6.a(k1.d0.f8599k, g0Var);
            kotlin.jvm.internal.m.c(t0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p0.a aVar = (p0.a) t0VarA;
            String strL = h1.f.l(g0Var, 2131886708);
            boolean zG = g0Var.g(strL);
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = new b6.o(strL, 14);
                g0Var.n0(objN);
            }
            b2.r rVarV = j3.q.c(j3.q.c(rVar, false, (u00.k) objN), false, new m3.c0(17)).V(new z.t(uVarA.f16965a, uVarA.f16966b, aVar));
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarV, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0Var, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            boolean z10 = !w(b8Var);
            int i13 = i12 & 112;
            boolean z11 = i13 == 32 || ((i12 & 64) != 0 && g0Var.i(b8Var));
            Object objN2 = g0Var.N();
            if (z11 || objN2 == cVar) {
                objN2 = new i7(b8Var, 2);
                g0Var.n0(objN2);
            }
            int i14 = (i12 << 3) & 7168;
            o(z10, t0Var, (u00.a) objN2, a7Var, w0.f6008a, g0Var, ((i12 >> 9) & 112) | 24576 | i14);
            h0.c.h(z.n.f(z2.d0.m(b2.o.A, "Spacer").V(new b2.u(2.0f)).V(h0.z1.f6478c), j9, i2.b0.f7111b), g0Var);
            boolean zW = w(b8Var);
            boolean z12 = i13 == 32 || ((i12 & 64) != 0 && g0Var.i(b8Var));
            Object objN3 = g0Var.N();
            if (z12 || objN3 == cVar) {
                objN3 = new i7(b8Var, 3);
                g0Var.n0(objN3);
            }
            o(zW, t0Var2, (u00.a) objN3, a7Var, w0.f6009b, g0Var, ((i12 >> 12) & 112) | 24576 | i14);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c7(rVar, b8Var, a7Var, w0Var, t0Var, t0Var2, i10);
        }
    }

    public static final void j(int i10, b2.r rVar, a7 a7Var, b8 b8Var, l1.j jVar) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-760850373);
        int i11 = (g0Var.g(b8Var) ? 4 : 2) | i10 | 48 | (g0Var.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            g0Var.X();
            if ((i10 & 1) == 0 || g0Var.A()) {
                rVar = b2.o.A;
            } else {
                g0Var.V();
            }
            g0Var.s();
            k(((i11 << 6) & 896) | ((i11 >> 3) & 126), rVar, a7Var, b8Var, g0Var);
        } else {
            g0Var.V();
        }
        b2.r rVar2 = rVar;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b1.n(i10, 6, b8Var, rVar2, a7Var);
        }
    }

    public static final void k(int i10, b2.r rVar, a7 a7Var, b8 b8Var, l1.j jVar) {
        int i11;
        a7 a7Var2;
        Object pVar;
        Integer num;
        l1.z0 z0Var;
        b3.f2 f2Var;
        boolean z10;
        b8 b8Var2 = b8Var;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-475657989);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(a7Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? g0Var.g(b8Var2) : g0Var.i(b8Var2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object[] objArr = new Object[0];
            int i12 = i11 & 896;
            boolean z11 = i12 == 256 || ((i11 & 512) != 0 && g0Var.i(b8Var2));
            Object objN = g0Var.N();
            l1.c cVar = l1.i.f9868a;
            if (z11 || objN == cVar) {
                objN = new i7(b8Var2, 0);
                g0Var.n0(objN);
            }
            l1.z0 z0VarE = y1.k.e(objArr, (u00.a) objN, g0Var, 0);
            Object[] objArr2 = new Object[0];
            boolean z12 = i12 == 256 || ((i11 & 512) != 0 && g0Var.i(b8Var2));
            Object objN2 = g0Var.N();
            if (z12 || objN2 == cVar) {
                objN2 = new i7(b8Var2, 1);
                g0Var.n0(objN2);
            }
            l1.z0 z0VarE2 = y1.k.e(objArr2, (u00.a) objN2, g0Var, 0);
            Object objN3 = g0Var.N();
            if (objN3 == cVar) {
                objN3 = new b3.f2();
                g0Var.n0(objN3);
            }
            b3.f2 f2Var2 = (b3.f2) objN3;
            Integer numValueOf = Integer.valueOf(b8Var2.g());
            Integer numValueOf2 = Integer.valueOf(b8Var2.c());
            boolean zI = g0Var.i(f2Var2) | g0Var.g(z0VarE) | (i12 == 256 || ((i11 & 512) != 0 && g0Var.i(b8Var2))) | g0Var.g(z0VarE2);
            Object objN4 = g0Var.N();
            if (zI || objN4 == cVar) {
                num = numValueOf2;
                z0Var = z0VarE2;
                f2Var = f2Var2;
                pVar = new az.p(f2Var, b8Var2, z0VarE, z0Var, (k00.c) null, 2);
                g0Var.n0(pVar);
            } else {
                z0Var = z0VarE2;
                f2Var = f2Var2;
                num = numValueOf2;
                pVar = objN4;
            }
            l1.q.h(numValueOf, num, (u00.n) pVar, g0Var);
            int i13 = i11;
            b2.r rVarG = h0.c.G(rVar, 0.0f, 0.0f, 0.0f, f6052g, 7);
            h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.J, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarG, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
            }
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar4);
            b8Var2 = b8Var;
            a7Var2 = a7Var;
            l1.q.b(new l1.q1[]{z6.f6045a.a(m3.r0.a(m8.a(k1.c0.f8582f, g0Var), a7Var.m, 0L, null, null, 0L, null, 0, 0L, null, null, 16744446)), c3.o1.f2738n.a(y3.m.A)}, v1.d.d(1306700887, new k2(z0VarE, b8Var2, f2Var, a7Var2, z0Var, 1), g0Var), g0Var, 56);
            if (b8Var2.f()) {
                z10 = true;
                g0Var.c0(-1381607893);
                g0Var.r(false);
            } else {
                g0Var.c0(-1381942321);
                b2.o oVar = b2.o.A;
                b2.r rVarG2 = h0.c.G(oVar, m, 0.0f, 0.0f, 0.0f, 14);
                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarG2, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
                }
                l1.q.I(rVarC2, g0Var, fVar4);
                q(((i13 >> 3) & 112) | 6 | ((i13 << 3) & 896), h0.z1.n(oVar, k1.c0.f8578b, k1.c0.f8577a), a7Var2, b8Var2, g0Var);
                z10 = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z10);
        } else {
            a7Var2 = a7Var;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g7(rVar, a7Var2, b8Var2, i10);
        }
    }

    public static final void l(b8 b8Var, b2.r rVar, a7 a7Var, int i10, l1.j jVar, int i11) {
        b2.r rVar2;
        l1.g0 g0Var;
        int i12;
        int i13;
        int i14;
        b2.r rVar3;
        h hVar;
        l1.g0 g0Var2;
        b2.r rVar4;
        l1.g0 g0Var3 = (l1.g0) jVar;
        g0Var3.e0(-619286452);
        int i15 = i11 | (g0Var3.g(b8Var) ? 4 : 2) | 48 | (g0Var3.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | 1024;
        if (g0Var3.S(i15 & 1, (i15 & 1171) != 1170)) {
            g0Var3.X();
            if ((i11 & 1) == 0 || g0Var3.A()) {
                Configuration configuration = (Configuration) g0Var3.k(c3.o0.f2721a);
                i13 = i15 & (-7169);
                i14 = configuration.screenHeightDp < configuration.screenWidthDp ? 0 : 1;
                rVar3 = b2.o.A;
            } else {
                g0Var3.V();
                i13 = i15 & (-7169);
                rVar3 = rVar;
                i14 = i10;
            }
            int i16 = i13;
            g0Var3.s();
            boolean z10 = (7 & 4) != 0;
            Object systemService = ((Context) g0Var3.k(c3.o0.f2722b)).getSystemService("accessibility");
            kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            boolean z11 = ((((0 & 14) ^ 6) > 4 && g0Var3.h(true)) || (0 & 6) == 4) | ((((0 & 112) ^ 48) > 32 && g0Var3.h(true)) || (0 & 48) == 32) | ((((0 & 896) ^ 384) > 256 && g0Var3.h(z10)) || (0 & 384) == 256);
            Object objN = g0Var3.N();
            l1.c cVar = l1.i.f9868a;
            if (z11 || objN == cVar) {
                objN = new h1.m0(true, true, z10);
                g0Var3.n0(objN);
            }
            h1.m0 m0Var = (h1.m0) objN;
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) g0Var3.k(r6.d.f13126a);
            boolean zG = g0Var3.g(m0Var) | g0Var3.i(accessibilityManager);
            Object objN2 = g0Var3.N();
            if (zG || objN2 == cVar) {
                objN2 = new al.l(m0Var, accessibilityManager, 26);
                g0Var3.n0(objN2);
            }
            u00.k kVar = (u00.k) objN2;
            boolean zG2 = g0Var3.g(m0Var) | g0Var3.i(accessibilityManager);
            Object objN3 = g0Var3.N();
            if (zG2 || objN3 == cVar) {
                objN3 = new a1.o1(m0Var, accessibilityManager, 14);
                g0Var3.n0(objN3);
            }
            h1.f.b(wVar, kVar, (u00.a) objN3, g0Var3, 0);
            Object objN4 = g0Var3.N();
            l1.c cVar2 = l1.i.f9868a;
            if (objN4 == cVar2) {
                objN4 = new b3.f2();
                g0Var3.n0(objN4);
            }
            b3.f2 f2Var = (b3.f2) objN4;
            int i17 = i16 & 14;
            boolean z12 = i17 == 4;
            Object objN5 = g0Var3.N();
            if (z12 || objN5 == cVar2) {
                objN5 = new h(b8Var, f2Var);
                g0Var3.n0(objN5);
            }
            h hVar2 = (h) objN5;
            Integer numValueOf = Integer.valueOf(b8Var.g());
            Integer numValueOf2 = Integer.valueOf(b8Var.c());
            boolean zI = (i17 == 4) | g0Var3.i(f2Var) | g0Var3.i(hVar2);
            Object objN6 = g0Var3.N();
            if (zI || objN6 == cVar2) {
                hVar = hVar2;
                a1.f2 f2Var2 = new a1.f2(f2Var, hVar, b8Var, null, 8);
                g0Var3.n0(f2Var2);
                objN6 = f2Var2;
            } else {
                hVar = hVar2;
            }
            l1.q.h(numValueOf, numValueOf2, (u00.n) objN6, g0Var3);
            if (i14 == 1) {
                g0Var3.c0(2017551219);
                g0Var2 = g0Var3;
                rVar4 = rVar3;
                r(i16 & 1008, rVar4, hVar, a7Var, g0Var2, !((Boolean) m0Var.getValue()).booleanValue());
                g0Var2.r(false);
            } else {
                g0Var2 = g0Var3;
                rVar4 = rVar3;
                g0Var2.c0(2017750673);
                h(i16 & 1008, rVar4, hVar, a7Var, g0Var2, !((Boolean) m0Var.getValue()).booleanValue());
                g0Var2.r(false);
            }
            rVar2 = rVar4;
            g0Var = g0Var2;
            i12 = i14;
        } else {
            g0Var3.V();
            rVar2 = rVar;
            g0Var = g0Var3;
            i12 = i10;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g7(b8Var, rVar2, a7Var, i12, i11);
        }
    }

    public static final void m(b2.r rVar, r3.w wVar, u00.k kVar, b8 b8Var, int i10, q0.i1 i1Var, q0.h1 h1Var, a7 a7Var, l1.j jVar, int i11) {
        b3.f fVar;
        int i12;
        l1.g0 g0Var;
        boolean z10;
        l1.c cVar;
        l1.c cVar2;
        Object objN;
        boolean z11;
        int i13;
        boolean z12;
        Object objN2;
        b8 b8Var2 = b8Var;
        int i14 = i10;
        Float fValueOf = Float.valueOf(0.9f);
        Float fValueOf2 = Float.valueOf(0.1f);
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(1299172990);
        int i15 = i11 | (g0Var2.g(rVar) ? 4 : 2) | (g0Var2.g(wVar) ? 32 : 16) | (g0Var2.i(kVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH) | (g0Var2.g(b8Var2) ? 2048 : 1024) | (g0Var2.g(i1Var) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var2.g(h1Var) ? 1048576 : 524288) | (g0Var2.g(a7Var) ? 8388608 : 4194304);
        if (g0Var2.S(i15 & 1, (4793491 & i15) != 4793490)) {
            Object objN3 = g0Var2.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN3 == cVar3) {
                objN3 = w.c.g(g0Var2);
            }
            f0.i iVar = (f0.i) objN3;
            Object objN4 = g0Var2.N();
            if (objN4 == cVar3) {
                objN4 = new g2.t();
                g0Var2.n0(objN4);
            }
            g2.t tVar = (g2.t) objN4;
            c5 c5Var = c5.f5746a;
            long j9 = a7Var.f5725k;
            t6 t6VarC = c5.c(a7Var.m, 0L, 0L, 0L, j9, j9, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, g0Var2, 2147483598);
            boolean z13 = i14 == b8Var.e();
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.M, g0Var2, 0);
            int iHashCode = Long.hashCode(g0Var2.T);
            l1.m1 m1VarM = g0Var2.m();
            b2.r rVarC = b2.a.c(rVar, g0Var2);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var2.g0();
            if (g0Var2.S) {
                g0Var2.l(gVar);
            } else {
                g0Var2.q0();
            }
            b3.f fVar2 = b3.h.f2039f;
            l1.q.I(vVarA, g0Var2, fVar2);
            b3.f fVar3 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var2, fVar3);
            b3.f fVar4 = b3.h.f2040g;
            if (g0Var2.S || !kotlin.jvm.internal.m.a(g0Var2.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var2, iHashCode, fVar4);
            }
            b3.f fVar5 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var2, fVar5);
            b2.o oVar = b2.o.A;
            if (z13) {
                fVar = fVar5;
                i12 = i10;
                g0Var = g0Var2;
                z10 = false;
                g0Var.c0(2023879982);
                g0Var.r(false);
            } else {
                g0Var2.c0(2023424468);
                fVar = fVar5;
                g0Var = g0Var2;
                z10 = false;
                n(h0.z1.n(oVar, k1.c0.f8581e, k1.c0.f8579c), i10 == 0 ? u(b8Var) : b8Var.c(), b8Var, i10, a7Var, g0Var, ((i15 >> 3) & 896) | 3078 | ((i15 >> 9) & 57344));
                i12 = i10;
                g0Var.r(false);
            }
            String strL = h1.f.l(g0Var, i12 == 1 ? 2131886707 : 2131886703);
            n8 n8Var = new n8(z13);
            z2.w0 w0VarD = h0.o.d(b2.b.A, z10);
            int iHashCode2 = Long.hashCode(g0Var.T);
            l1.m1 m1VarM2 = g0Var.m();
            b2.r rVarC2 = b2.a.c(n8Var, g0Var);
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(w0VarD, g0Var, fVar2);
            l1.q.I(m1VarM2, g0Var, fVar3);
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar4);
            }
            l1.q.I(rVarC2, g0Var, fVar);
            b2.r rVarN = h0.z1.n(g2.d.j(oVar, r17), k1.c0.f8581e, k1.c0.f8579c);
            boolean zG = g0Var.g(strL);
            Object objN5 = g0Var.N();
            if (zG) {
                cVar = cVar3;
            } else {
                cVar = cVar3;
                if (objN5 == cVar) {
                }
                b2.r rVarC3 = j3.q.c(rVarN, z10, (u00.k) objN5);
                m3.r0 r0Var = (m3.r0) g0Var.k(z6.f6045a);
                Float fValueOf3 = Float.valueOf(0.0f);
                long j10 = i2.t.f7166f;
                g00.k kVar2 = new g00.k(fValueOf3, new i2.t(j10));
                g00.k kVar3 = new g00.k(fValueOf2, new i2.t(j10));
                l1.q2 q2Var = r0.f5948a;
                cVar2 = cVar;
                int i16 = i15 >> 3;
                int i17 = i15 << 3;
                l1.g0 g0Var3 = g0Var;
                q0.c0.b(wVar, kVar, rVarC3, true, r0Var, i1Var, h1Var, true, 0, 0, null, null, iVar, sg.f.Q(new g00.k[]{kVar2, kVar3, new g00.k(fValueOf2, new i2.t(((q0) g0Var.k(q2Var)).f5907a)), new g00.k(fValueOf, new i2.t(((q0) g0Var.k(q2Var)).f5907a)), new g00.k(fValueOf, new i2.t(j10)), new g00.k(Float.valueOf(1.0f), new i2.t(j10))}), v1.d.d(1007938103, new w7(wVar, iVar, t6VarC), g0Var), g0Var3, (i16 & 112) | (i16 & 14) | 100666368 | (3670016 & i17) | (i17 & 29360128), 199680, 7696);
                g0Var2 = g0Var3;
                g0Var2.r(true);
                b2.r rVarA = h0.c.A(oVar, 0.0f, f6051f, 1);
                objN = g0Var2.N();
                if (objN == cVar2) {
                    z11 = false;
                    objN = new j7(0);
                    g0Var2.n0(objN);
                } else {
                    z11 = false;
                }
                b2.r rVarB = j3.q.b(rVarA, (u00.k) objN);
                if (i10 == 0) {
                    i13 = 2131886699;
                } else {
                    i13 = 2131886704;
                }
                z6.b(h1.f.l(g0Var2, i13), rVarB, r0.e(k1.c0.f8584h, g0Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m8.a(k1.c0.f8585i, g0Var2), g0Var2, 0, 0, 131064);
                g0Var2.r(true);
                a8 a8Var = new a8(b8Var.e());
                if ((i15 & 7168) != 2048) {
                    z12 = z11;
                } else {
                    z12 = true;
                }
                objN2 = g0Var2.N();
                if (!z12 || objN2 == cVar2) {
                    b8Var2 = b8Var;
                    i14 = i10;
                    objN2 = new d0.i2(b8Var2, i14, tVar, (k00.c) null);
                    g0Var2.n0(objN2);
                } else {
                    b8Var2 = b8Var;
                    i14 = i10;
                }
                l1.q.i(a8Var, g0Var2, (u00.n) objN2);
            }
            objN5 = new b6.o(strL, 12);
            g0Var.n0(objN5);
            b2.r rVarC4 = j3.q.c(rVarN, z10, (u00.k) objN5);
            m3.r0 r0Var2 = (m3.r0) g0Var.k(z6.f6045a);
            Float fValueOf4 = Float.valueOf(0.0f);
            long j11 = i2.t.f7166f;
            g00.k kVar4 = new g00.k(fValueOf4, new i2.t(j11));
            g00.k kVar5 = new g00.k(fValueOf2, new i2.t(j11));
            l1.q2 q2Var2 = r0.f5948a;
            cVar2 = cVar;
            int i18 = i15 >> 3;
            int i19 = i15 << 3;
            l1.g0 g0Var4 = g0Var;
            q0.c0.b(wVar, kVar, rVarC4, true, r0Var2, i1Var, h1Var, true, 0, 0, null, null, iVar, sg.f.Q(new g00.k[]{kVar4, kVar5, new g00.k(fValueOf2, new i2.t(((q0) g0Var.k(q2Var2)).f5907a)), new g00.k(fValueOf, new i2.t(((q0) g0Var.k(q2Var2)).f5907a)), new g00.k(fValueOf, new i2.t(j11)), new g00.k(Float.valueOf(1.0f), new i2.t(j11))}), v1.d.d(1007938103, new w7(wVar, iVar, t6VarC), g0Var), g0Var4, (i18 & 112) | (i18 & 14) | 100666368 | (3670016 & i19) | (i19 & 29360128), 199680, 7696);
            g0Var2 = g0Var4;
            g0Var2.r(true);
            b2.r rVarA2 = h0.c.A(oVar, 0.0f, f6051f, 1);
            objN = g0Var2.N();
            if (objN == cVar2) {
                z11 = false;
                objN = new j7(0);
                g0Var2.n0(objN);
            } else {
                z11 = false;
            }
            b2.r rVarB2 = j3.q.b(rVarA2, (u00.k) objN);
            if (i10 == 0) {
                i13 = 2131886699;
            } else {
                i13 = 2131886704;
            }
            z6.b(h1.f.l(g0Var2, i13), rVarB2, r0.e(k1.c0.f8584h, g0Var2), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, m8.a(k1.c0.f8585i, g0Var2), g0Var2, 0, 0, 131064);
            g0Var2.r(true);
            a8 a8Var2 = new a8(b8Var.e());
            if ((i15 & 7168) != 2048) {
                z12 = z11;
            } else {
                z12 = true;
            }
            objN2 = g0Var2.N();
            if (z12) {
                b8Var2 = b8Var;
                i14 = i10;
                objN2 = new d0.i2(b8Var2, i14, tVar, (k00.c) null);
                g0Var2.n0(objN2);
            } else {
                b8Var2 = b8Var;
                i14 = i10;
                objN2 = new d0.i2(b8Var2, i14, tVar, (k00.c) null);
                g0Var2.n0(objN2);
            }
            l1.q.i(a8Var2, g0Var2, (u00.n) objN2);
        } else {
            g0Var2.V();
        }
        l1.r1 r1VarT = g0Var2.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l7(rVar, wVar, kVar, b8Var2, i14, i1Var, h1Var, a7Var, i11);
        }
    }

    public static final void n(b2.r rVar, int i10, b8 b8Var, int i11, a7 a7Var, l1.j jVar, int i12) {
        int i13;
        int i14;
        l1.g0 g0Var;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1148055889);
        if ((i12 & 6) == 0) {
            i13 = (g0Var2.g(rVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i14 = i10;
            i13 |= g0Var2.e(i14) ? 32 : 16;
        } else {
            i14 = i10;
        }
        if ((i12 & 384) == 0) {
            i13 |= (i12 & 512) == 0 ? g0Var2.g(b8Var) : g0Var2.i(b8Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i12 & 3072) == 0) {
            i13 |= g0Var2.e(i11) ? 2048 : 1024;
        }
        if ((i12 & 24576) == 0) {
            i13 |= g0Var2.g(a7Var) ? 16384 : 8192;
        }
        if (g0Var2.S(i13 & 1, (i13 & 9363) != 9362)) {
            boolean z10 = b8Var.e() == i11;
            String strL = h1.f.l(g0Var2, i11 == 0 ? 2131886701 : 2131886705);
            long j9 = z10 ? a7Var.f5725k : a7Var.l;
            long j10 = z10 ? a7Var.m : a7Var.f5726n;
            boolean zG = g0Var2.g(strL);
            Object objN = g0Var2.N();
            l1.c cVar = l1.i.f9868a;
            if (zG || objN == cVar) {
                objN = new b6.o(strL, 11);
                g0Var2.n0(objN);
            }
            b2.r rVarC = j3.q.c(rVar, true, (u00.k) objN);
            i2.t0 t0VarA = g6.a(k1.d0.f8608v, g0Var2);
            boolean z11 = ((i13 & 7168) == 2048) | ((i13 & 896) == 256 || ((i13 & 512) != 0 && g0Var2.i(b8Var)));
            Object objN2 = g0Var2.N();
            if (z11 || objN2 == cVar) {
                objN2 = new e1.w(i11, b8Var, 1);
                g0Var2.n0(objN2);
            }
            g0Var = g0Var2;
            s6.b(z10, (u00.a) objN2, rVarC, false, t0VarA, j9, null, v1.d.d(-1477282471, new x7(i11, b8Var, i14, j10), g0Var2), g0Var, 0, 1992);
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new d7(rVar, i10, b8Var, i11, a7Var, i12);
        }
    }

    public static final void o(boolean z10, i2.t0 t0Var, u00.a aVar, a7 a7Var, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        i2.t0 t0Var2;
        u00.a aVar2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1523811083);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.h(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            t0Var2 = t0Var;
            i11 |= g0Var.g(t0Var2) ? 32 : 16;
        } else {
            t0Var2 = t0Var;
        }
        if ((i10 & 384) == 0) {
            aVar2 = aVar;
            i11 |= g0Var.i(aVar2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            aVar2 = aVar;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.g(a7Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(cVar) ? 16384 : 8192;
        }
        if (g0Var.S(i11 & 1, (i11 & 9363) != 9362)) {
            long j9 = z10 ? a7Var.f5723i : a7Var.f5724j;
            long j10 = z10 ? a7Var.f5721g : a7Var.f5722h;
            b2.r rVarV = new b2.u(z10 ? 0.0f : 1.0f).V(h0.z1.f6478c);
            boolean z11 = (i11 & 14) == 4;
            Object objN = g0Var.N();
            if (z11 || objN == l1.i.f9868a) {
                objN = new d6.t1(2, z10);
                g0Var.n0(objN);
            }
            float f3 = 0;
            x5.h(aVar2, j3.q.c(rVarV, false, (u00.k) objN), false, t0Var2, s.b(j10, j9, 0L, g0Var, 12), new h0.p1(f3, f3, f3, f3), cVar, g0Var, ((i11 << 15) & 1879048192) | ((i11 >> 6) & 14) | 12582912 | ((i11 << 6) & 7168), 356);
            g0Var = g0Var;
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new ct.r(z10, t0Var, aVar, a7Var, cVar, i10);
        }
    }

    public static final void p(b8 b8Var, a7 a7Var, l1.j jVar, int i10) {
        int i11;
        boolean z10;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(2054675515);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(a7Var) ? 32 : 16;
        }
        if (g0Var.S(i11 & 1, (i11 & 19) != 18)) {
            h0.v1 v1VarA = h0.t1.a(h0.i.f6410e, b2.b.J, g0Var, 6);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.o oVar = b2.o.A;
            b2.r rVarC = b2.a.c(oVar, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            b3.f fVar = b3.h.f2039f;
            l1.q.I(v1VarA, g0Var, fVar);
            b3.f fVar2 = b3.h.f2038e;
            l1.q.I(m1VarM, g0Var, fVar2);
            b3.f fVar3 = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar3);
            }
            b3.f fVar4 = b3.h.f2037d;
            l1.q.I(rVarC, g0Var, fVar4);
            b(b8Var, a7Var, g0Var, i11 & 126);
            if (b8Var.f()) {
                z10 = true;
                g0Var.c0(1364727499);
                g0Var.r(false);
            } else {
                g0Var.c0(1364287361);
                b2.r rVarG = h0.c.G(oVar, m, 0.0f, 0.0f, 0.0f, 14);
                z2.w0 w0VarD = h0.o.d(b2.b.A, false);
                int iHashCode2 = Long.hashCode(g0Var.T);
                l1.m1 m1VarM2 = g0Var.m();
                b2.r rVarC2 = b2.a.c(rVarG, g0Var);
                g0Var.g0();
                if (g0Var.S) {
                    g0Var.l(gVar);
                } else {
                    g0Var.q0();
                }
                l1.q.I(w0VarD, g0Var, fVar);
                l1.q.I(m1VarM2, g0Var, fVar2);
                if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode2))) {
                    com.google.android.gms.internal.measurement.x5.v(iHashCode2, g0Var, iHashCode2, fVar3);
                }
                l1.q.I(rVarC2, g0Var, fVar4);
                int i12 = i11 << 3;
                q((i12 & 896) | (i12 & 112) | 6, h0.z1.n(oVar, k1.d0.f8606t, k1.d0.f8605s), a7Var, b8Var, g0Var);
                z10 = true;
                g0Var.r(true);
                g0Var.r(false);
            }
            g0Var.r(z10);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new b7(b8Var, a7Var, i10, 1);
        }
    }

    public static final void q(int i10, b2.r rVar, a7 a7Var, b8 b8Var, l1.j jVar) {
        int i11;
        a7 a7Var2;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1898918107);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(rVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? g0Var.g(b8Var) : g0Var.i(b8Var) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            a7Var2 = a7Var;
            i11 |= g0Var.g(a7Var2) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        } else {
            a7Var2 = a7Var;
        }
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = s7.f5963c;
                g0Var.n0(objN);
            }
            z2.w0 w0Var = (z2.w0) objN;
            i2.t0 t0VarA = g6.a(k1.d0.f8599k, g0Var);
            kotlin.jvm.internal.m.c(t0VarA, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            p0.a aVar = (p0.a) t0VarA;
            p0.a aVarB = g6.b(aVar);
            p0.c cVar = e6.f5783i;
            i(rVar, b8Var, a7Var2, w0Var, aVarB, p0.a.c(aVar, cVar, cVar, null, null, 12), g0Var, (i11 & 14) | 3072 | (i11 & 112) | (i11 & 896));
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new g7(rVar, b8Var, a7Var, i10, 2);
        }
    }

    public static final void r(int i10, b2.r rVar, h hVar, a7 a7Var, l1.j jVar, boolean z10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1249591487);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(hVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(a7Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.h(z10) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            g0Var.X();
            if ((i10 & 1) != 0 && !g0Var.A()) {
                g0Var.V();
            }
            g0Var.s();
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new e6.c(29);
                g0Var.n0(objN);
            }
            b2.r rVarC = j3.q.c(rVar, false, (u00.k) objN);
            h0.v vVarA = h0.u.a(h0.i.f6408c, b2.b.N, g0Var, 48);
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC2 = b2.a.c(rVarC, g0Var);
            b3.i.f2042c.getClass();
            b3.g gVar = b3.h.f2035b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC2, g0Var, b3.h.f2037d);
            p(hVar, a7Var, g0Var, (i11 & 14) | ((i11 >> 3) & 112));
            float f3 = f6048c;
            b2.o oVar = b2.o.A;
            h0.c.h(h0.z1.e(oVar, f3), g0Var);
            c((i11 & 7168) | ((i11 << 3) & 112) | 6 | (i11 & 896), h0.z1.m(oVar, k1.d0.f8590b), hVar, a7Var, g0Var, z10);
            h0.c.h(h0.z1.e(oVar, f6049d), g0Var);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new k7(hVar, rVar, a7Var, z10, i10, 0);
        }
    }

    public static final Object s(h hVar, float f3, float f10, float f11, boolean z10, long j9, x.y yVar, m00.c cVar) {
        y7 y7Var;
        float f12;
        float fRint;
        boolean z11;
        int i10;
        h hVar2;
        boolean z12;
        if (cVar instanceof y7) {
            y7Var = (y7) cVar;
            int i11 = y7Var.D;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                y7Var.D = i11 - Integer.MIN_VALUE;
            } else {
                y7Var = new y7(cVar);
            }
        } else {
            y7Var = new y7(cVar);
        }
        y7 y7Var2 = y7Var;
        Object obj = y7Var2.C;
        l00.a aVar = l00.a.A;
        int i12 = y7Var2.D;
        g00.b0 b0Var = g00.b0.a;
        if (i12 != 0) {
            if (i12 == 1) {
                boolean z13 = y7Var2.B;
                hVar2 = y7Var2.A;
                ri.t1.O(obj);
                z11 = z13;
                i10 = 1;
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z12 = y7Var2.B;
                hVar2 = y7Var2.A;
                ri.t1.O(obj);
                i10 = 1;
            }
            z11 = z12;
            if (z11) {
                hVar2.d(i10);
            }
            return b0Var;
        }
        ri.t1.O(obj);
        float fAtan2 = ((float) Math.atan2(f10 - ((int) (j9 & 4294967295L)), f3 - ((int) (j9 >> 32)))) - 1.5707964f;
        if (fAtan2 < 0.0f) {
            fAtan2 += 6.2831855f;
        }
        if (hVar.f5807a.e() == 1) {
            f12 = 0.10471976f;
            fRint = ((float) Math.rint((fAtan2 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f12 = 0.5235988f;
            fRint = (float) Math.rint(fAtan2 / 0.5235988f);
        }
        float f13 = fRint * f12;
        x(hVar, f3, f10, f11, j9);
        y7Var2.A = hVar;
        z11 = z10;
        y7Var2.B = z11;
        y7Var2.D = 1;
        hVar.f5808b.f2025a = Boolean.FALSE;
        z.e1 e1Var = hVar.f5813g;
        z.b1 b1Var = z.b1.B;
        i10 = 1;
        g gVar = new g(hVar, f13, true, yVar, null);
        e1Var.getClass();
        Object objK = a40.c0.k(new c3.o3(b1Var, e1Var, gVar, (k00.c) null), y7Var2);
        if (objK != aVar) {
            objK = b0Var;
        }
        if (objK != aVar) {
            hVar2 = hVar;
        }
        return aVar;
        if (hVar2.f5807a.e() == 0 && z11) {
            y7Var2.A = hVar2;
            y7Var2.B = z11;
            y7Var2.D = 2;
            if (a40.c0.l(100L, y7Var2) != aVar) {
                z12 = z11;
                z11 = z12;
            }
            return aVar;
        }
        if (z11) {
            hVar2.d(i10);
        }
        return b0Var;
    }

    public static final void t(int i10, b8 b8Var, r3.w wVar, r3.w wVar2, int i11, b3.f2 f2Var, u00.k kVar) {
        int iU;
        f2Var.f2025a = Boolean.FALSE;
        m3.h hVar = wVar.f13099a;
        if (kotlin.jvm.internal.m.a(hVar.B, wVar2.f13099a.B)) {
            kVar.invoke(wVar);
            return;
        }
        String str = hVar.B;
        int i12 = 12;
        if (str.length() == 0) {
            if (i10 == 0) {
                b8Var.a((!w(b8Var) || b8Var.f()) ? 0 : 12);
            } else {
                b8Var.b(0);
            }
            kVar.invoke(r3.w.a(wVar, RuntimeVersion.SUFFIX));
            return;
        }
        try {
            if (str.length() == 3) {
                long j9 = wVar.f13100b;
                int i13 = m3.q0.f10519c;
                if (((int) (j9 >> 32)) == 1) {
                    iU = com.google.android.gms.internal.measurement.z3.u(str.charAt(0));
                } else {
                    iU = Integer.parseInt(str);
                }
            } else {
                iU = Integer.parseInt(str);
            }
            if (iU <= i11) {
                if (i10 == 0) {
                    if (iU != 12 || !w(b8Var)) {
                        if (iU != 12 || w(b8Var) || b8Var.f()) {
                            if (!w(b8Var) || b8Var.f()) {
                                i12 = 0;
                            }
                            i12 += iU;
                        } else {
                            i12 = 0;
                        }
                    }
                    b8Var.a(i12);
                    if (iU > 1 && !b8Var.f()) {
                        b8Var.d(1);
                    }
                } else {
                    b8Var.b(iU);
                }
                if (str.length() > 2) {
                    wVar = r3.w.a(wVar, String.valueOf(str.charAt(0)));
                }
                kVar.invoke(wVar);
            }
        } catch (NumberFormatException | IllegalArgumentException unused) {
        }
    }

    public static final int u(b8 b8Var) {
        if (b8Var.f()) {
            return b8Var.g() % 24;
        }
        if (b8Var.g() % 12 == 0) {
            return 12;
        }
        return w(b8Var) ? b8Var.g() - 12 : b8Var.g();
    }

    public static final long v(h hVar) {
        float fI;
        float f3;
        float fI2 = (k1.d0.f8595g / 2.0f) * (hVar.i() / k1.d0.f8590b);
        b8 b8Var = hVar.f5807a;
        if (b8Var.f() && w(hVar) && b8Var.e() == 0) {
            fI = hVar.i();
            f3 = f6047b;
        } else {
            fI = hVar.i();
            f3 = f6046a;
        }
        float f10 = ((y3.f) ab.a0.v(new y3.f((fI * f3) - fI2), new y3.f(0))).A + fI2;
        float f11 = 2;
        return (((long) Float.floatToRawIntBits((hVar.i() / f11) + (((float) Math.cos(((Number) hVar.f5812f.d()).floatValue())) * f10))) << 32) | (((long) Float.floatToRawIntBits((hVar.i() / f11) + (f10 * ((float) Math.sin(((Number) hVar.f5812f.d()).floatValue()))))) & 4294967295L);
    }

    public static final boolean w(b8 b8Var) {
        return b8Var.g() >= 12;
    }

    public static final void x(b8 b8Var, float f3, float f10, float f11, long j9) {
        if (b8Var.e() == 0 && b8Var.f()) {
            float fHypot = (float) Math.hypot(((int) (j9 >> 32)) - f3, ((int) (j9 & 4294967295L)) - f10);
            if (w(b8Var)) {
                b8Var.a(b8Var.g() - (fHypot >= f11 ? 12 : 0));
            } else {
                b8Var.a(b8Var.g() + (fHypot < f11 ? 12 : 0));
            }
        }
    }

    public static final String y(int i10, boolean z10, int i11, l1.j jVar) {
        int i12;
        if (i10 == 1) {
            i12 = 2131886706;
        } else {
            i12 = z10 ? 2131886700 : 2131886702;
        }
        Object[] objArr = {Integer.valueOf(i11)};
        String strL = h1.f.l(jVar, i12);
        Locale locale = ((Configuration) ((l1.g0) jVar).k(c3.o0.f2721a)).getLocales().get(0);
        if (locale == null) {
            locale = Locale.getDefault();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, 1);
        return String.format(locale, strL, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }
}
