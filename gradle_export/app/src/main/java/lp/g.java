package lp;

import jp.x;

public final class g implements u00.a {
    public final int A;
    public final x B;

    public g(x xVar, int i) {
        this.A = i;
        this.B = xVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                x xVar = this.B;
                return Boolean.valueOf(xVar.d == null && !r30.k.L0(xVar.c));
            case 1:
                x xVar2 = this.B;
                return Boolean.valueOf((r30.k.L0(xVar2.u) || xVar2.v != null || xVar2.y == null || xVar2.z == null || xVar2.a) ? false : true);
            default:
                x xVar3 = this.B;
                return Boolean.valueOf((r30.k.L0(xVar3.f) || xVar3.a) ? false : true);
        }
    }
}
