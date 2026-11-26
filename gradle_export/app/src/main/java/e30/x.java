package e30;

import java.util.List;

public final class x implements u00.k {
    public final int A = 1;
    public final m0 B;
    public final List C;

    public x(h0 h0Var, m0 m0Var, List list, x20.n nVar, boolean z) {
        this.B = m0Var;
        this.C = list;
    }

    public x(h0 h0Var, m0 m0Var, List list, boolean z) {
        this.B = m0Var;
        this.C = list;
    }

    @Override
    public final Object invoke(Object obj) {
        f30.f refiner = (f30.f) obj;
        switch (this.A) {
            case 0:
                kotlin.jvm.internal.m.e(refiner, "refiner");
                this.B.g();
                break;
            default:
                kotlin.jvm.internal.m.e(refiner, "kotlinTypeRefiner");
                this.B.g();
                break;
        }
        return null;
    }
}
