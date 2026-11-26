package rn;

import b6.g;
import g00.b0;
import l1.g0;
import l1.i;
import l1.j;
import l1.q;
import sn.k;
import u00.n;

public final class a implements n {
    public final int A;
    public final qn.b B;
    public final in.c C;

    public a(qn.b bVar, in.c cVar, int i) {
        this.A = i;
        this.B = bVar;
        this.C = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        g0 g0Var = (j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i2 = 2;
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t5.d dVar = k.a;
                    g0Var2.d0(1333953144);
                    g0Var2.d0(-534706435);
                    Object objK = g0Var2.k(g.c);
                    if (objK == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.datastore.preferences.core.Preferences");
                    }
                    g0Var2.r(false);
                    Object objC = ((t5.b) objK).c(dVar);
                    g0Var2.r(false);
                    Long l = (Long) objC;
                    Long lValueOf = Long.valueOf(l != null ? l.longValue() : 0L);
                    Object objN = g0Var2.N();
                    if (objN == i.a) {
                        objN = new rm.c(i2, (k00.c) null);
                        g0Var2.n0(objN);
                    }
                    pn.a.c((qn.b) q.B(this.B, lValueOf, (n) objN, g0Var).getValue(), this.C.b, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            default:
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    pn.a.c(this.B, this.C.b, g0Var, 0);
                } else {
                    g0Var3.V();
                }
                return b0.a;
        }
    }
}
