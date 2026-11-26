package g1;

import com.google.android.gms.cast.Cast;
import kotlin.NoWhenBranchMatchedException;

public abstract class z3 {

    public static final float f6036a;

    public static final float f6037b;

    public static final float f6038c = 12;

    public static final float f6039d = 8;

    public static final float f6040e = 112;

    public static final float f6041f = 280;

    static {
        float f3 = 48;
        f6036a = f3;
        f6037b = f3;
    }

    public static final void a(final b2.r rVar, final x.k0 k0Var, final l1.z0 z0Var, final z.p1 p1Var, final i2.t0 t0Var, final long j9, final float f3, final float f10, final v1.c cVar, l1.j jVar, final int i10) throws NoWhenBranchMatchedException {
        l1.g0 g0Var;
        z.u uVar;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(848986741);
        int i11 = i10 | (g0Var2.g(rVar) ? 4 : 2) | (g0Var2.g(k0Var) ? 32 : 16) | (g0Var2.g(p1Var) ? 2048 : 1024) | (g0Var2.g(t0Var) ? 16384 : 8192) | (g0Var2.f(j9) ? 131072 : Cast.MAX_MESSAGE_LENGTH) | (g0Var2.d(f3) ? 1048576 : 524288) | (g0Var2.d(f10) ? 8388608 : 4194304) | (g0Var2.g(null) ? 67108864 : 33554432) | (g0Var2.i(cVar) ? 536870912 : 268435456);
        if (g0Var2.S(i11 & 1, (i11 & 306783379) != 306783378)) {
            x.n1 n1VarT = x.c.t(k0Var, "DropDownMenu", g0Var2, (((i11 >> 3) & 14) | 48) & 126, 0);
            x.b1 b1VarP = x5.p(k1.q.B, g0Var2);
            x.b1 b1VarP2 = x5.p(k1.q.D, g0Var2);
            x.r1 r1Var = x.c.f16258k;
            f5.c cVar2 = n1VarT.f16323a;
            l1.i1 i1Var = n1VarT.f16326d;
            boolean zBooleanValue = ((Boolean) cVar2.J0()).booleanValue();
            g0Var2.c0(143964305);
            float f11 = zBooleanValue ? 1.0f : 0.8f;
            g0Var2.r(false);
            Float fValueOf = Float.valueOf(f11);
            boolean zBooleanValue2 = ((Boolean) i1Var.getValue()).booleanValue();
            g0Var2.c0(143964305);
            float f12 = zBooleanValue2 ? 1.0f : 0.8f;
            g0Var2.r(false);
            Float fValueOf2 = Float.valueOf(f12);
            n1VarT.f();
            g0Var2.c0(-745957716);
            g0Var2.r(false);
            x.m1 m1VarO = x.c.o(n1VarT, fValueOf, fValueOf2, b1VarP, r1Var, g0Var2, 0);
            boolean zBooleanValue3 = ((Boolean) n1VarT.f16323a.J0()).booleanValue();
            g0Var2.c0(892761509);
            float f13 = zBooleanValue3 ? 1.0f : 0.0f;
            g0Var2.r(false);
            Float fValueOf3 = Float.valueOf(f13);
            boolean zBooleanValue4 = ((Boolean) i1Var.getValue()).booleanValue();
            g0Var2.c0(892761509);
            float f14 = zBooleanValue4 ? 1.0f : 0.0f;
            g0Var2.r(false);
            Float fValueOf4 = Float.valueOf(f14);
            n1VarT.f();
            g0Var2.c0(2839488);
            g0Var2.r(false);
            x.m1 m1VarO2 = x.c.o(n1VarT, fValueOf3, fValueOf4, b1VarP2, r1Var, g0Var2, 0);
            boolean zBooleanValue5 = ((Boolean) g0Var2.k(c3.c2.f2637a)).booleanValue();
            boolean zH = g0Var2.h(zBooleanValue5) | g0Var2.g(m1VarO) | ((i11 & 112) == 32) | g0Var2.g(m1VarO2);
            Object objN = g0Var2.N();
            if (zH || objN == l1.i.f9868a) {
                uVar = null;
                b1.o oVar = new b1.o(zBooleanValue5, k0Var, z0Var, m1VarO, m1VarO2);
                g0Var2.n0(oVar);
                objN = oVar;
            } else {
                uVar = null;
            }
            int i12 = i11 >> 9;
            int i13 = i11 >> 6;
            s6.a(i2.b0.p(b2.o.A, (u00.k) objN), t0Var, j9, 0L, f3, f10, uVar, v1.d.d(-1463404422, new o1(rVar, p1Var, cVar), g0Var2), g0Var2, (i12 & 896) | (i12 & 112) | 12582912 | (57344 & i13) | (458752 & i13) | (i13 & 3670016), 8);
            g0Var = g0Var2;
        } else {
            g0Var = g0Var2;
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(k0Var, z0Var, p1Var, t0Var, j9, f3, f10, cVar, i10) {
                public final x.k0 B;
                public final l1.z0 C;
                public final z.p1 D;
                public final i2.t0 E;
                public final long F;
                public final float G;
                public final float H;
                public final v1.c I;

                public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(385);
                    z3.a(this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(v1.c cVar, u00.a aVar, b2.r rVar, u00.n nVar, boolean z10, w3 w3Var, h0.n1 n1Var, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-1325192924);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(aVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(rVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(null) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= g0Var.i(nVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= g0Var.h(z10) ? 131072 : Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i11 |= g0Var.g(w3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= g0Var.g(n1Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= g0Var.g(null) ? 67108864 : 33554432;
        }
        if (g0Var.S(i11 & 1, (38347923 & i11) != 38347922)) {
            b2.r rVarB = h0.c.B(h0.z1.p(h0.z1.d(androidx.compose.foundation.b.b(rVar, null, y5.a(0.0f, 6, true), z10, null, aVar, 24), 1.0f), f6040e, f6037b, f6041f, 8), n1Var);
            h0.v1 v1VarA = h0.t1.a(h0.i.f6406a, b2.b.K, g0Var, 48);
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
            l1.q.I(v1VarA, g0Var, b3.h.f2039f);
            l1.q.I(m1VarM, g0Var, b3.h.f2038e);
            b3.f fVar = b3.h.f2040g;
            if (g0Var.S || !kotlin.jvm.internal.m.a(g0Var.N(), Integer.valueOf(iHashCode))) {
                com.google.android.gms.internal.measurement.x5.v(iHashCode, g0Var, iHashCode, fVar);
            }
            l1.q.I(rVarC, g0Var, b3.h.f2037d);
            z6.a(((l8) g0Var.k(m8.f5890a)).m, v1.d.d(865999929, new y3(w3Var, z10, nVar, cVar), g0Var), g0Var, 48);
            g0Var.r(true);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new eu.m(cVar, aVar, rVar, nVar, z10, w3Var, n1Var, i10);
        }
    }
}
