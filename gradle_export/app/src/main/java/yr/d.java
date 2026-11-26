package yr;

import b2.r;
import g00.b0;
import g1.z6;
import kh.o;
import l1.g0;
import l1.j;
import l1.q;
import m3.r0;
import q3.i;
import q3.u;
import u00.n;
import x3.k;
import x3.l;

public final class d implements n {
    public final int A;
    public final bx.c B;

    public d(bx.c cVar, int i) {
        this.A = i;
        this.B = cVar;
    }

    public d(bx.c cVar, int i, int i2) {
        this.A = i2;
        this.B = cVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    a.i(this.B, 214, o.z(48), g0Var, 440);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 1:
                g0 g0Var3 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(this.B.b, (r) null, dl.a.k, o.z(22), u.M, (i) null, 0L, (l) null, new k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597440, 0, 261034);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            case 2:
                g0 g0Var5 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    a.c(this.B, g0Var5, 8);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 3:
                ((Integer) obj2).getClass();
                a.c(this.B, (j) obj, q.K(9));
                break;
            default:
                ((Integer) obj2).getClass();
                a.c(this.B, (j) obj, q.K(9));
                break;
        }
        return b0.a;
    }
}
