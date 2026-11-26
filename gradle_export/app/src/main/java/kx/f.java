package kx;

import g00.b0;
import l1.g0;
import u00.p;

public final class f implements p {
    public final int A;
    public final float B;

    public f(float f, int i) {
        this.A = i;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                k0.k items = (k0.k) obj;
                ((Integer) obj2).getClass();
                g0 g0Var = (l1.j) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.e(items, "$this$items");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 129) != 128)) {
                    a.b(this.B, 0, null, g0Var);
                } else {
                    g0Var2.V();
                }
                break;
            case 1:
                k0.k items2 = (k0.k) obj;
                ((Integer) obj2).getClass();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.e(items2, "$this$items");
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 129) != 128)) {
                    rx.a.e(this.B, 0, null, g0Var3);
                } else {
                    g0Var4.V();
                }
                break;
            default:
                j0.b items3 = (j0.b) obj;
                ((Integer) obj2).getClass();
                g0 g0Var5 = (l1.j) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                kotlin.jvm.internal.m.e(items3, "$this$items");
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var5.g(items3) ? 4 : 2;
                }
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    wr.k.z(this.B, 0, j0.b.a(items3), g0Var5);
                } else {
                    g0Var6.V();
                }
                break;
        }
        return b0.a;
    }
}
