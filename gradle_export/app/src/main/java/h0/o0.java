package h0;

public final class o0 implements u00.k {
    public final int A;
    public final p0 B;

    public o0(p0 p0Var, int i10) {
        this.A = i10;
        this.B = p0Var;
    }

    public final Object invoke(Object obj) {
        b3.o2 o2Var = (b3.o2) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                p0 p0Var = (p0) o2Var;
                l2 l2Var = this.B.P;
                if (!kotlin.jvm.internal.m.a(p0Var.O, l2Var)) {
                    p0Var.O = l2Var;
                    p0Var.C1();
                }
                return b3.n2.B;
            default:
                kotlin.jvm.internal.m.c(o2Var, "null cannot be cast to non-null type androidx.compose.foundation.layout.InsetsConsumingModifierNode");
                this.B.O = ((p0) o2Var).P;
                return Boolean.FALSE;
        }
    }
}
