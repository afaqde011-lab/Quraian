package e1;

import com.google.android.gms.internal.measurement.y3;
import g1.o3;
import g1.y5;
import h0.z1;
import l1.m1;

public final class f implements u00.o {
    public final int A;
    public final boolean B;
    public final u00.a C;

    public f(u00.a aVar, boolean z10) {
        this.A = 0;
        this.C = aVar;
        this.B = z10;
    }

    public f(boolean z10, u00.a aVar, int i10) {
        this.A = i10;
        this.B = z10;
        this.C = aVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                b2.r rVar = (b2.r) obj;
                ((Integer) obj3).getClass();
                l1.g0 g0Var = (l1.g0) ((l1.j) obj2);
                g0Var.c0(-196777734);
                final long j9 = ((a1) g0Var.k(b1.f4956a)).f4954a;
                boolean zF = g0Var.f(j9);
                final u00.a aVar = this.C;
                boolean zG = zF | g0Var.g(aVar);
                final boolean z10 = this.B;
                boolean zH = zG | g0Var.h(z10);
                Object objN = g0Var.N();
                if (zH || objN == l1.i.f9868a) {
                    objN = new u00.k() {
                        public final Object invoke(Object obj4) {
                            f2.d dVar = (f2.d) obj4;
                            return dVar.a(new ab.d0(aVar, z10, a.a.r(dVar, Float.intBitsToFloat((int) (dVar.A.b() >> 32)) / 2.0f), new i2.m(j9, 5), 1));
                        }
                    };
                    g0Var.n0(objN);
                }
                b2.r rVarF = f2.h.f(rVar, (u00.k) objN);
                g0Var.r(false);
                return rVarF;
            case 1:
                l1.j jVar = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((w.d0) obj, "$this$AnimatedVisibility");
                o3.a(y3.R(2131231121, jVar, 0), null, h0.c.C(w50.c.o(z1.m(b2.o.A, 28), this.B, (j3.k) null, this.C, 6), 4), i2.t.b(0.4f, dl.a.k), jVar, 56, 0);
                return g00.b0.a;
            case 2:
                l1.j jVar2 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((w.d0) obj, "$this$AnimatedVisibility");
                o3.a(y3.R(2131231106, jVar2, 0), null, w50.c.o(z1.m(h0.c.E(b2.o.A, 9, 0.0f, 2), 20), this.B, (j3.k) null, this.C, 6), dl.a.i, jVar2, 56, 0);
                return g00.b0.a;
            case 3:
                l1.j jVar3 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((w.d0) obj, "$this$AnimatedVisibility");
                o3.a(y3.R(2131231106, jVar3, 0), null, w50.c.o(z1.m(h0.c.E(b2.o.A, 9, 0.0f, 2), 20), this.B, (j3.k) null, this.C, 6), dl.a.i, jVar3, 56, 0);
                return g00.b0.a;
            case 4:
                l1.j jVar4 = (l1.j) obj2;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e((w.d0) obj, "$this$AnimatedVisibility");
                b2.o oVar = b2.o.A;
                b2.r rVarD = z1.d(oVar, 1.0f);
                z2.w0 w0VarD = h0.o.d(b2.b.E, false);
                l1.g0 g0Var2 = (l1.g0) jVar4;
                int iHashCode = Long.hashCode(g0Var2.T);
                m1 m1VarM = g0Var2.m();
                b2.r rVarC = b2.a.c(rVarD, jVar4);
                b3.i.f2042c.getClass();
                b3.g gVar = b3.h.f2035b;
                g0Var2.g0();
                if (g0Var2.S) {
                    g0Var2.l(gVar);
                } else {
                    g0Var2.q0();
                }
                l1.q.I(w0VarD, jVar4, b3.h.f2039f);
                l1.q.I(m1VarM, jVar4, b3.h.f2038e);
                l1.q.I(Integer.valueOf(iHashCode), jVar4, b3.h.f2040g);
                l1.q.E(jVar4, b3.h.f2041h);
                l1.q.I(rVarC, jVar4, b3.h.f2037d);
                yr.a.e(384, h0.c.G(oVar, 0.0f, 22, 0.0f, 0.0f, 13), jVar4, this.C, this.B);
                g0Var2.r(true);
                return g00.b0.a;
            default:
                b2.r rVar2 = (b2.r) obj;
                ((Integer) obj3).getClass();
                kotlin.jvm.internal.m.e(rVar2, "$this$composed");
                l1.g0 g0Var3 = (l1.g0) ((l1.j) obj2);
                g0Var3.c0(-940231159);
                Object objN2 = g0Var3.N();
                if (objN2 == l1.i.f9868a) {
                    objN2 = w.c.g(g0Var3);
                }
                b2.r rVarV = rVar2.V(androidx.compose.foundation.b.b(b2.o.A, (f0.i) objN2, y5.a(0.0f, 7, false), this.B, new j3.k(0), this.C, 8));
                g0Var3.r(false);
                return rVarV;
        }
    }
}
