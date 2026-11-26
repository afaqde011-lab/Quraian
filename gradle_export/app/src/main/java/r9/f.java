package r9;

import kotlin.jvm.internal.m;
import x.n1;

public final class f implements u00.a {
    public final int A;
    public final n1 B;

    public f(n1 n1Var, int i10) {
        this.A = i10;
        this.B = n1Var;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Boolean.valueOf(this.B.f16329g.h() != Long.MIN_VALUE);
            case 1:
                n1 n1Var = this.B;
                return Boolean.valueOf((m.a(n1Var.f16326d.getValue(), n1Var.f16323a.J0()) && n1Var.f16329g.h() == Long.MIN_VALUE && !((Boolean) n1Var.f16330h.getValue()).booleanValue()) ? false : true);
            default:
                return Long.valueOf(this.B.b());
        }
    }
}
