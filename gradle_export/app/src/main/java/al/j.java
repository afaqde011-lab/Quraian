package al;

import g00.b0;
import g1.j6;
import h0.l0;
import l1.g0;
import l1.q;

public final class j implements u00.n {
    public final int A;
    public final v1.c B;

    public j(v1.c cVar) {
        this.A = 2;
        this.B = cVar;
    }

    public j(v1.c cVar, int i, int i2) {
        this.A = i2;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.getClass();
                m.a(this.B, g0Var, q.K(7));
                break;
            case 1:
                num.getClass();
                j6.a(this.B, g0Var, q.K(55));
                break;
            case 2:
                int iIntValue = num.intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    this.B.invoke(l0.a, g0Var, 6);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 3:
                num.getClass();
                l0.q.c(this.B, g0Var, q.K(7));
                break;
            default:
                num.getClass();
                q0.q.k(this.B, g0Var, q.K(7));
                break;
        }
        return b0.a;
    }
}
