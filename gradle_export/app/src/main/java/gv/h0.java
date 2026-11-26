package gv;

public final class h0 implements u00.o {
    public final int A;
    public final bv.o1 B;
    public final u00.k C;

    public h0(bv.o1 o1Var, u00.k kVar, int i) {
        this.A = i;
        this.B = o1Var;
        this.C = kVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.A) {
            case 0:
                h0.w PlayerLiquidGlassContainer = (h0.w) obj;
                l1.g0 g0Var = (l1.j) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PlayerLiquidGlassContainer, "$this$PlayerLiquidGlassContainer");
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c0.b(this.B, this.C, false, g0Var, 0, 4);
                } else {
                    g0Var2.V();
                }
                break;
            default:
                w.d0 PlayerScreenAnimatedVisibility = (w.d0) obj;
                ((Integer) obj3).intValue();
                kotlin.jvm.internal.m.e(PlayerScreenAnimatedVisibility, "$this$PlayerScreenAnimatedVisibility");
                jv.a.d(this.B, this.C, (l1.j) obj2, 0);
                break;
        }
        return g00.b0.a;
    }
}
