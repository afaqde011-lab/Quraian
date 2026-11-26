package b1;

import c3.k1;

public final class s implements u00.k {
    public final int A;
    public final e0 B;

    public s(e0 e0Var, int i10) {
        this.A = i10;
        this.B = e0Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                e0 e0Var = this.B;
                k0 k0Var = (k0) e0Var.f1957t.getValue();
                k0 k0Var2 = k0.B;
                if (k0Var == k0Var2) {
                    k0Var2 = k0.A;
                }
                e0Var.x(k0Var2);
                break;
            case 1:
                this.B.d();
                break;
            default:
                return new k1(this.B, 16);
        }
        return g00.b0.a;
    }
}
