package mu;

import g00.b0;
import l1.g0;

public final class y implements u00.o {
    public final int A;
    public final ju.f B;

    public y(ju.f fVar, int i) {
        this.A = i;
        this.B = fVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.A;
        h0.t BoxWithConstraints = (h0.t) obj;
        g0 g0Var = (l1.j) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                }
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d.b(this.B, BoxWithConstraints.c(), BoxWithConstraints.b(), g0Var, 0);
                    d.v(null, g0Var, 0);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                kotlin.jvm.internal.m.e(BoxWithConstraints, "$this$BoxWithConstraints");
                if ((iIntValue & 6) == 0) {
                    iIntValue |= g0Var.g(BoxWithConstraints) ? 4 : 2;
                }
                g0 g0Var3 = g0Var;
                if (g0Var3.S(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d.c(this.B, BoxWithConstraints.c(), BoxWithConstraints.b(), g0Var, 0);
                    d.y(null, g0Var, 0);
                } else {
                    g0Var3.V();
                }
                break;
        }
        return b0.a;
    }
}
