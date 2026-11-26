package g1;

import com.google.android.gms.cast.Cast;

public abstract class e {

    public static final float f5760a = 280;

    public static final float f5761b = 560;

    public static final l1.t f5762c;

    static {
        float f3 = 24;
        h0.c.d(f3);
        float f10 = 16;
        h0.c.g(0.0f, 0.0f, 0.0f, f10, 7);
        h0.c.g(0.0f, 0.0f, 0.0f, f10, 7);
        h0.c.g(0.0f, 0.0f, 0.0f, f3, 7);
        f5762c = new l1.t((u00.a) new e00.g(12));
    }

    public static final void a(final float f3, final float f10, final v1.c cVar, l1.j jVar, final int i10) {
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-917637668);
        if (g0Var.S(i10 & 1, (i10 & 147) != 146)) {
            Object objN = g0Var.N();
            if (objN == l1.i.f9868a) {
                objN = new d(f3, f10);
                g0Var.n0(objN);
            }
            z2.w0 w0Var = (z2.w0) objN;
            int iHashCode = Long.hashCode(g0Var.T);
            l1.m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(b2.o.A, g0Var);
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
            final int i11 = 0;
            r1VarT.f9921d = new u00.n(f3, f10, i10, i11, cVar) {
                public final int A;
                public final float B;
                public final float C;
                public final Object D;

                {
                    this.A = i11;
                    this.D = cVar;
                }

                public final Object invoke(Object obj, Object obj2) {
                    switch (this.A) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iK = l1.q.K(439);
                            e.a(this.B, this.C, (v1.c) this.D, (l1.j) obj, iK);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iK2 = l1.q.K(1);
                            f50.c.f(this.B, this.C, (b6.m) this.D, (l1.j) obj, iK2);
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }

    public static final void b(u00.a aVar, b2.r rVar, c4.v vVar, v1.c cVar, l1.j jVar, int i10) {
        int i11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(24925658);
        if ((i10 & 6) == 0) {
            i11 = (g0Var.i(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= g0Var.g(rVar) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= g0Var.g(vVar) ? 256 : Cast.MAX_NAMESPACE_LENGTH;
        }
        if ((i10 & 3072) == 0) {
            i11 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        if (g0Var.S(i11 & 1, (i11 & 1171) != 1170)) {
            ((e3) g0Var.k(f5762c)).a(new oj.q(aVar, rVar, vVar, cVar, 14), g0Var, 0);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new a(aVar, rVar, vVar, cVar, i10, 0);
        }
    }
}
