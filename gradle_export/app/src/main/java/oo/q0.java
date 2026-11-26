package oo;

import z2.k1;
import z2.l1;

public final class q0 implements u00.k {
    public final int A;
    public final l1 B;
    public final int C;

    public q0(int i, int i2, l1 l1Var) {
        this.A = i2;
        this.B = l1Var;
        this.C = i;
    }

    @Override
    public final Object invoke(Object obj) {
        k1 layout = (k1) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                layout.h(this.B, 0, this.C, 0.0f);
                break;
            case 1:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                layout.h(this.B, -this.C, 0, 0.0f);
                break;
            case 2:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                layout.h(this.B, -this.C, 0, 0.0f);
                break;
            case 3:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                int i = -this.C;
                k1.k(layout, this.B, i, i);
                break;
            default:
                kotlin.jvm.internal.m.e(layout, "$this$layout");
                int i2 = -this.C;
                layout.h(this.B, i2, i2, 0.0f);
                break;
        }
        return g00.b0.a;
    }
}
