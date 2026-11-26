package d10;

public final class b0 implements u00.a {
    public final int A;
    public final c0 B;

    public b0(c0 c0Var, int i) {
        this.A = i;
        this.B = c0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                c0 c0Var = this.B;
                m10.k0 k0VarC = c0Var.A().w().c();
                return k0VarC == null ? q20.k.g(c0Var.A().w(), k10.g.a) : k0VarC;
            default:
                return kh.o.i(this.B, false);
        }
    }
}
