package sm;

import h0.w1;
import h0.z1;
import l1.m1;
import l1.q2;
import l1.r1;
import z.v0;

public abstract class k0 {
    public static final q2 a = new q2(new q50.b(26));

    public static final void a(final w1 w1Var, final u00.a onClick, b2.r rVar, final v1.c cVar, l1.j jVar, final int i) {
        int i2;
        final b2.r rVar2;
        kotlin.jvm.internal.m.e(w1Var, "<this>");
        kotlin.jvm.internal.m.e(onClick, "onClick");
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(1947543357);
        if ((i & 6) == 0) {
            i2 = (g0Var.g(w1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= g0Var.i(onClick) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= g0Var.i(cVar) ? 2048 : 1024;
        }
        int i4 = i3;
        if (g0Var.S(i4 & 1, (i4 & 1171) != 1170)) {
            u00.a aVar = (u00.a) g0Var.k(a);
            p0.e eVarA = p0.f.a(32);
            b2.r rVar3 = b2.o.A;
            b2.r rVarA = w1Var.a(z1.c(androidx.compose.foundation.b.b(f2.h.c(rVar3, eVarA), (f0.i) null, (v0) null, false, new j3.k(4), onClick, 12), 1.0f));
            boolean zG = g0Var.g(aVar);
            Object objN = g0Var.N();
            if (zG || objN == l1.i.a) {
                objN = new ca.q(15, aVar);
                g0Var.n0(objN);
            }
            b2.r rVarP = i2.b0.p(rVarA, (u00.k) objN);
            h0.b bVar = h0.i.a;
            int i5 = (i4 & 7168) | 432;
            h0.v vVarA = h0.u.a(new h0.f(2.0f, false, new du.w(11)), b2.b.N, g0Var, 54);
            int iHashCode = Long.hashCode(g0Var.T);
            m1 m1VarM = g0Var.m();
            b2.r rVarC = b2.a.c(rVarP, g0Var);
            b3.i.c.getClass();
            b3.g gVar = b3.h.b;
            g0Var.g0();
            if (g0Var.S) {
                g0Var.l(gVar);
            } else {
                g0Var.q0();
            }
            l1.q.I(vVarA, g0Var, b3.h.f);
            l1.q.I(m1VarM, g0Var, b3.h.e);
            l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
            l1.q.E(g0Var, b3.h.h);
            l1.q.I(rVarC, g0Var, b3.h.d);
            cVar.invoke(h0.w.a, g0Var, Integer.valueOf(((i5 >> 6) & 112) | 6));
            g0Var.r(true);
            rVar2 = rVar3;
        } else {
            g0Var.V();
            rVar2 = rVar;
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            final int i6 = 1;
            r1VarT.d = new u00.n() {
                @Override
                public final Object invoke(Object obj, Object obj2) {
                    switch (i6) {
                        case 0:
                            ((Integer) obj2).getClass();
                            ab.a0.e(w1Var, onClick, rVar2, cVar, (l1.j) obj, l1.q.K(i | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            k0.a(w1Var, onClick, rVar2, cVar, (l1.j) obj, l1.q.K(i | 1));
                            break;
                    }
                    return g00.b0.a;
                }
            };
        }
    }
}
