package iv;

import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import h0.t1;
import h0.v1;
import h0.z1;
import l1.g0;
import l1.m1;
import m3.r0;
import q3.u;

public final class p implements u00.n {
    public final int A = 0;
    public final boolean B;

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.j(l1.q.K(1), (l1.j) obj, this.B);
                break;
            default:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 12;
                    b2.o oVar = b2.o.A;
                    b2.r rVarD = h0.c.D(oVar, f, 8);
                    v1 v1VarA = t1.a(h0.i.g(f), b2.b.K, g0Var, 54);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarD, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(v1VarA, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    if (this.B) {
                        g0Var2.c0(1276381423);
                        z3.j(y3.R(2131231389, g0Var, 0), (String) null, z1.m(oVar, 20), dl.a.k, g0Var, 440, 0);
                        g0Var2.r(false);
                    } else {
                        g0Var2.c0(1276771124);
                        z3.j(y3.R(2131231388, g0Var, 0), (String) null, z1.m(oVar, 20), dl.a.k, g0Var, 440, 0);
                        g0Var2.r(false);
                    }
                    z6.b(z3.U(g0Var, 2131886508), (b2.r) null, dl.a.k, kh.o.z(18), (u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, kh.o.z(18), 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 24576, 48, 260074);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
        }
        return b0.a;
    }
}
