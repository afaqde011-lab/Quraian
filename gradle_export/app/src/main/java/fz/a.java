package fz;

import b2.o;
import b2.r;
import b3.g;
import b3.h;
import g00.b0;
import h0.i;
import h0.u;
import h0.v;
import h0.z1;
import l1.g0;
import l1.j;
import l1.m1;
import l1.q;
import p30.f;
import u00.n;

public final class a implements n {
    public final int A = 0;
    public final boolean B;
    public final u00.a C;
    public final u00.a D;
    public final u00.a E;

    public a(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3) {
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
        this.E = aVar3;
    }

    public a(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3, int i) {
        this.B = z;
        this.C = aVar;
        this.D = aVar2;
        this.E = aVar3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 24;
                    r rVarG = h0.c.G(h0.c.E(z1.d(o.A, 1.0f), f, 0.0f, 2), 0.0f, f, 0.0f, f, 5);
                    v vVarA = u.a(i.c, b2.b.N, g0Var, 48);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    g gVar = h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(vVarA, g0Var, h.f);
                    q.I(m1VarM, g0Var, h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, h.g);
                    q.E(g0Var, h.h);
                    q.I(rVarC, g0Var, h.d);
                    f.G(this.B, this.C, this.D, this.E, g0Var, 6);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                f.G(this.B, this.C, this.D, this.E, (j) obj, q.K(7));
                break;
        }
        return b0.a;
    }
}
