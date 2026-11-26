package p;

public final class e0 extends m1 {
    public final k0 J;
    public final n0 K;

    public e0(n0 n0Var, n0 n0Var2, k0 k0Var) {
        super(n0Var2);
        this.K = n0Var;
        this.J = k0Var;
    }

    @Override
    public final o.b0 b() {
        return this.J;
    }

    @Override
    public final boolean c() {
        n0 n0Var = this.K;
        if (n0Var.getInternalPopup().a()) {
            return true;
        }
        n0Var.F.m(n0Var.getTextDirection(), n0Var.getTextAlignment());
        return true;
    }
}
