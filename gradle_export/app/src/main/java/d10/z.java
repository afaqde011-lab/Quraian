package d10;

public final class z implements u00.a {
    public final int A;
    public final a0 B;

    public z(a0 a0Var, int i) {
        this.A = i;
        this.B = a0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                a0 a0Var = this.B;
                m10.j0 j0VarB = a0Var.A().w().b();
                return j0VarB == null ? q20.k.f(a0Var.A().w(), k10.g.a) : j0VarB;
            default:
                return kh.o.i(this.B, true);
        }
    }
}
