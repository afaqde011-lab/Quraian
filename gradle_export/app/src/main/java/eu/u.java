package eu;

import com.google.android.gms.internal.measurement.z3;
import h0.z1;
import java.util.List;
import l1.g0;

public final class u implements u00.p {
    public final int A;
    public final List B;

    public u(int i, List list) {
        this.A = i;
        this.B = list;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.A) {
            case 0:
                j0.b bVar = (j0.b) obj;
                int iIntValue = ((Number) obj2).intValue();
                g0 g0Var = (l1.j) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (g0Var.g(bVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= g0Var.e(iIntValue) ? 32 : 16;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(i & 1, (i & 147) != 146)) {
                    bu.c cVar = (bu.c) this.B.get(iIntValue);
                    g0Var2.c0(-395817378);
                    a.n(cVar, null, g0Var, 0);
                    h0.c.h(z1.e(b2.o.A, 16), g0Var);
                    g0Var2.r(false);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                j0.b bVar2 = (j0.b) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (g0Var3.g(bVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= g0Var3.e(iIntValue3) ? 32 : 16;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(i2 & 1, (i2 & 147) != 146)) {
                    ry.b bVar3 = (ry.b) this.B.get(iIntValue3);
                    g0Var4.c0(-1671449607);
                    vy.a.a(z3.U(g0Var3, bVar3.b), z3.U(g0Var3, bVar3.c), z3.U(g0Var3, bVar3.d), null, g0Var3, 0);
                    g0Var4.r(false);
                } else {
                    g0Var4.V();
                }
                break;
        }
        return g00.b0.a;
    }
}
