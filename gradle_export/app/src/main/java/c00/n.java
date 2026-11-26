package c00;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import gv.c0;
import h0.z1;
import i2.b0;
import i2.o0;
import l1.g0;
import l1.m1;
import z2.w0;

public final class n implements u00.n {
    public final int A;
    public final boolean B;
    public final u00.a C;

    public n(u00.a aVar, boolean z) {
        this.A = 4;
        this.B = z;
        this.C = aVar;
    }

    public n(boolean z, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        b2.r rVarG;
        g0 g0Var = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.getClass();
                a.f(this.B, this.C, g0Var, l1.q.K(1));
                break;
            case 1:
                num.getClass();
                ev.s.d(this.B, this.C, g0Var, l1.q.K(1));
                break;
            case 2:
                num.getClass();
                c0.a(this.B, this.C, g0Var, l1.q.K(1));
                break;
            case 3:
                num.getClass();
                iz.d.g(this.B, this.C, g0Var, l1.q.K(1));
                break;
            case 4:
                int iIntValue = num.intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o0 o0Var = b0.b;
                    if (this.B) {
                        rVarG = z.n.f(z1.c, dl.a.L, o0Var);
                    } else {
                        rVarG = z.n.g(z.n.f(f2.h.c(z1.r(h0.c.E(b2.o.A, 0.0f, 44, 1), 380, RCHTTPStatusCodes.BAD_REQUEST), p0.f.a(32.0f)), dl.a.L, o0Var), 1.0f, dl.a.Y, p0.f.a(32.0f));
                    }
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC = b2.a.c(rVarG, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC, g0Var, b3.h.d);
                    lz.a.a(this.C, g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 5:
                num.getClass();
                up.i.c(this.B, this.C, g0Var, l1.q.K(49));
                break;
            case 6:
                num.getClass();
                wr.k.d(this.B, this.C, g0Var, l1.q.K(1));
                break;
            default:
                num.getClass();
                wr.k.S(this.B, this.C, g0Var, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
