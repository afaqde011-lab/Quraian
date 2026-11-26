package g1;

import com.google.android.gms.cast.Cast;

public abstract class h8 {

    public static final float f5837a;

    public static final float f5838b = 24;

    public static final float f5839c = 40;

    public static final h0.p1 f5840d;

    static {
        float f3 = 4;
        f5837a = f3;
        float f10 = 8;
        f5840d = new h0.p1(f10, f3, f10, f3);
    }

    public static final void a(final j8 j8Var, b2.r rVar, float f3, i2.t0 t0Var, long j9, long j10, float f10, float f11, final v1.c cVar, l1.j jVar, final int i10) {
        int i11;
        l1.g0 g0Var;
        final b2.r rVar2;
        final float f12;
        final i2.t0 t0Var2;
        final long j11;
        final long j12;
        final float f13;
        final float f14;
        long jE;
        int i12;
        float f15;
        long jE2;
        float f16;
        b2.r rVar3;
        i2.t0 t0Var3;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-343758958);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? g0Var2.g(j8Var) : g0Var2.i(j8Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        int i13 = i11 | 3504;
        if ((i10 & 24576) == 0) {
            i13 = i11 | 11696;
        }
        if ((196608 & i10) == 0) {
            i13 |= Cast.MAX_MESSAGE_LENGTH;
        }
        if ((1572864 & i10) == 0) {
            i13 |= 524288;
        }
        int i14 = 113246208 | i13;
        if ((805306368 & i10) == 0) {
            i14 |= g0Var2.i(cVar) ? 536870912 : 268435456;
        }
        if (g0Var2.S(i14 & 1, (306783379 & i14) != 306783378)) {
            g0Var2.X();
            if ((i10 & 1) == 0 || g0Var2.A()) {
                f12 = e8.f5784a;
                i2.t0 t0VarA = g6.a(k1.u.f8894b, g0Var2);
                jE = r0.e(k1.u.f8895c, g0Var2);
                i12 = i14 & (-4186113);
                f15 = 0;
                jE2 = r0.e(k1.u.f8893a, g0Var2);
                f16 = 0;
                rVar3 = b2.o.A;
                t0Var3 = t0VarA;
            } else {
                g0Var2.V();
                i12 = i14 & (-4186113);
                rVar3 = rVar;
                f12 = f3;
                t0Var3 = t0Var;
                jE = j9;
                jE2 = j10;
                f15 = f10;
                f16 = f11;
            }
            g0Var2.s();
            g0Var2.c0(-1719831991);
            g0Var2.r(false);
            int i15 = i12 >> 9;
            g0Var = g0Var2;
            s6.a(rVar3, t0Var3, jE2, 0L, f15, f16, null, v1.d.d(-1573998995, new g8(f12, jE, cVar), g0Var2), g0Var, (57344 & i15) | 12582912 | (i15 & 458752), 72);
            j11 = jE;
            rVar2 = rVar3;
            t0Var2 = t0Var3;
            j12 = jE2;
            f13 = f15;
            f14 = f16;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
            f12 = f3;
            t0Var2 = t0Var;
            j11 = j9;
            j12 = j10;
            f13 = f10;
            f14 = f11;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n() {
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h8.a(j8Var, rVar2, f12, t0Var2, j11, j12, f13, f14, cVar, (l1.j) obj, l1.q.K(i10 | 1));
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(c4.b0 b0Var, v1.c cVar, k8 k8Var, b2.r rVar, boolean z10, v1.c cVar2, l1.j jVar, int i10) {
        int i11;
        c4.b0 b0Var2;
        k8 k8Var2;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-293753984);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.g(b0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.i(cVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= (i10 & 512) == 0 ? g0Var.g(k8Var) : g0Var.i(k8Var) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        int i12 = i11 | 14380032;
        if ((100663296 & i10) == 0) {
            i12 |= g0Var.i(cVar2) ? 67108864 : 33554432;
        }
        if (g0Var.S(i12 & 1, (38347923 & i12) != 38347922)) {
            x.n1 n1VarT = x.c.t(k8Var.f5850b, "tooltip transition", g0Var, 48, 0);
            Object objN = g0Var.N();
            l1.c cVar3 = l1.i.f9868a;
            if (objN == cVar3) {
                objN = l1.q.z(null);
                g0Var.n0(objN);
            }
            l1.z0 z0Var = (l1.z0) objN;
            Object objN2 = g0Var.N();
            if (objN2 == cVar3) {
                new ct.k(z0Var, 5);
                objN2 = new j8();
                g0Var.n0(objN2);
            }
            b0Var2 = b0Var;
            k8Var2 = k8Var;
            h1.f.a(b0Var2, v1.d.d(-527401546, new o1(n1VarT, cVar, (j8) objN2), g0Var), k8Var2, v1.d.d(-23901870, new w(z0Var, cVar2, 8), g0Var), g0Var, (i12 & 14) | 100663344 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (3670016 & i12) | (29360128 & i12));
            rVar = b2.o.A;
            z11 = true;
        } else {
            b0Var2 = b0Var;
            k8Var2 = k8Var;
            g0Var.V();
            z11 = z10;
        }
        b2.r rVar2 = rVar;
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new c0.h(b0Var2, cVar, k8Var2, rVar2, z11, cVar2, i10);
        }
    }

    public static final k8 c(l1.j jVar) {
        z.e1 e1Var = h1.n.f6523a;
        boolean zH = ((l1.g0) jVar).h(false) | ((l1.g0) jVar).g(e1Var);
        l1.g0 g0Var = (l1.g0) jVar;
        Object objN = g0Var.N();
        if (zH || objN == l1.i.f9868a) {
            objN = new k8(e1Var);
            g0Var.n0(objN);
        }
        return (k8) objN;
    }
}
