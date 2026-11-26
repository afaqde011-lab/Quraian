package pp;

import b2.o;
import b2.r;
import h0.i;
import h0.u;
import h0.v;
import h0.z1;
import i2.b0;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import u00.k;
import u00.n;

public final class g implements n {
    public final int A;
    public final boolean B;
    public final k C;

    public g(int i, k kVar, boolean z) {
        this.A = 1;
        this.B = z;
        this.C = kVar;
    }

    public g(boolean z, k kVar, int i, byte b) {
        this.A = i;
        this.B = z;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                int iIntValue = num.intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean z = this.B;
                    o oVar = o.A;
                    r rVarQ = z ? z1.q(oVar, h.a) : z1.d(oVar, 1.0f);
                    float f = 16;
                    r rVarD = h0.c.D(z.n.f(f2.h.c(rVarQ, p0.f.a(f)), dl.a.w, b0.b), 32, f);
                    v vVarA = u.a(i.g(12), b2.b.M, g0Var, 6);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarD, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(vVarA, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    g0Var2.c0(89127269);
                    for (ep.f fVar : ep.f.E) {
                        String strD = h.d(fVar, g0Var);
                        k kVar = this.C;
                        boolean zG = g0Var2.g(kVar) | g0Var2.e(fVar.ordinal());
                        Object objN = g0Var2.N();
                        if (zG || objN == l1.i.a) {
                            objN = new l6.c(kVar, fVar, 11);
                            g0Var2.n0(objN);
                        }
                        h.a(strD, (u00.a) objN, g0Var, 0);
                    }
                    g0Var2.r(false);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                num.getClass();
                st.g.c(this.B, this.C, g0Var, q.K(1));
                break;
            default:
                int iIntValue2 = num.intValue();
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    st.g.c(this.B, this.C, g0Var, 0);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
