package lv;

import b2.o;
import c7.i;
import g00.b0;
import k00.f;
import l1.g0;
import l1.j;
import l1.q;
import u00.n;
import wr.k;
import wr.t;

public final class a implements n {
    public final int A;
    public final jk.a B;
    public final u00.a C;

    public a(jk.a aVar, u00.a aVar2, int i, int i2) {
        this.A = i2;
        this.B = aVar;
        this.C = aVar2;
    }

    public a(u00.a aVar, jk.a aVar2, int i) {
        this.A = i;
        this.C = aVar;
        this.B = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                f.h(this.B, this.C, (j) obj, q.K(385));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i.a(this.B, this.C, o.A, (j) obj, q.K(1));
                break;
            case 2:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    w50.c.f(this.C, this.B, null, false, false, t.a, null, 0L, i2.t.b(0.5f, dl.a.P), 48, null, 0.0f, k.b, g0Var, 805502976, 384, 3292);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            default:
                g0 g0Var3 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    long jB = i2.t.b(0.5f, dl.a.P);
                    w50.c.f(this.C, this.B, null, false, false, 0.0f, new y3.f(44), 0L, jB, 48, p0.f.a, 0, k.c, g0Var3, 806879232, 432, 188);
                } else {
                    g0Var4.V();
                }
                return b0.a;
        }
        return b0.a;
    }
}
