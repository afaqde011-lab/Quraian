package z;

public final class x0 implements u00.a {
    public final int A;
    public final z0 B;

    public x0(z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    public final Object invoke() {
        int i10 = this.A;
        z0 z0Var = this.B;
        switch (i10) {
            case 0:
                z0Var.D1();
                return g00.b0.a;
            case 1:
                return new h2.b(z0Var.f16990c0);
            default:
                z2.a0 a0Var = (z2.a0) z0Var.f16988a0.getValue();
                return new h2.b(a0Var != null ? a0Var.d0(0L) : 9205357640488583168L);
        }
    }
}
