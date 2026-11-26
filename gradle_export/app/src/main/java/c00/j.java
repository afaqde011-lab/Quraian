package c00;

import com.google.android.gms.internal.measurement.z3;
import g00.b0;
import g1.z6;
import l1.g0;
import m3.r0;

public final class j implements u00.n {
    public final int A;
    public final int B;

    public j(int i, int i2) {
        this.A = i2;
        this.B = i;
    }

    public j(int i, int i2, int i3) {
        this.A = i3;
        this.B = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.e(this.B, (l1.j) obj, l1.q.K(7));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ct.i.e(this.B, (l1.j) obj, l1.q.K(1));
                break;
            case 2:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6.b(z3.U(g0Var, this.B), (b2.r) null, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var, 0, 0, 262142);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 3:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(z3.U(g0Var3, this.B), (b2.r) null, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 0, 0, 262142);
                } else {
                    g0Var4.V();
                }
                return b0.a;
            default:
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z6.b(z3.U(g0Var5, this.B), (b2.r) null, 0L, 0L, (q3.u) null, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 0, 0, 262142);
                } else {
                    g0Var6.V();
                }
                return b0.a;
        }
        return b0.a;
    }
}
