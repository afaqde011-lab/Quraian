package g1;

public final class p {

    public static final p f5897a = new p();

    public static final float f5898b;

    public static final float f5899c;

    public static final float f5900d;

    static {
        k1.w wVar = k1.y.f8907a;
        float f3 = k1.y.f8911e;
        f5898b = 640;
        f5899c = 56;
        f5900d = 125;
    }

    public final void a(b2.r rVar, float f3, float f10, i2.t0 t0Var, long j9, l1.j jVar, final int i10) {
        l1.g0 g0Var;
        final b2.r rVar2;
        final float f11;
        final float f12;
        final i2.t0 t0Var2;
        final long j10;
        i2.t0 t0Var3;
        long jE;
        float f13;
        float f14;
        b2.r rVar3;
        l1.g0 g0Var2 = (l1.g0) jVar;
        g0Var2.e0(-1364277227);
        int i11 = i10 | 9654;
        if (g0Var2.S(i11 & 1, (i11 & 9363) != 9362)) {
            g0Var2.X();
            if ((i10 & 1) == 0 || g0Var2.A()) {
                float f15 = k1.y.f8910d;
                float f16 = k1.y.f8909c;
                t0Var3 = ((f6) g0Var2.k(g6.f5806a)).f5795e;
                jE = r0.e(k1.y.f8908b, g0Var2);
                f13 = f16;
                f14 = f15;
                rVar3 = b2.o.A;
            } else {
                g0Var2.V();
                rVar3 = rVar;
                f14 = f3;
                f13 = f10;
                t0Var3 = t0Var;
                jE = j9;
            }
            g0Var2.s();
            String strL = h1.f.l(g0Var2, 2131886652);
            b2.r rVarE = h0.c.E(rVar3, 0.0f, j6.f5846a, 1);
            boolean zG = g0Var2.g(strL);
            Object objN = g0Var2.N();
            if (zG || objN == l1.i.f9868a) {
                objN = new b6.o(strL, 2);
                g0Var2.n0(objN);
            }
            g0Var = g0Var2;
            s6.a(j3.q.c(rVarE, false, (u00.k) objN), t0Var3, jE, 0L, 0.0f, 0.0f, null, v1.d.d(-1039573072, new o(f14, f13), g0Var2), g0Var, 12582912, 120);
            f12 = f13;
            t0Var2 = t0Var3;
            j10 = jE;
            f11 = f14;
            rVar2 = rVar3;
        } else {
            g0Var = g0Var2;
            g0Var.V();
            rVar2 = rVar;
            f11 = f3;
            f12 = f10;
            t0Var2 = t0Var;
            j10 = j9;
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new u00.n(rVar2, f11, f12, t0Var2, j10, i10) {
                public final b2.r B;
                public final float C;
                public final float D;
                public final i2.t0 E;
                public final long F;

                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iK = l1.q.K(196609);
                    this.A.a(this.B, this.C, this.D, this.E, this.F, (l1.j) obj, iK);
                    return g00.b0.a;
                }
            };
        }
    }
}
