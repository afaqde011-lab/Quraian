package d10;

public final class j0 implements u00.a {
    public final int A;
    public final l0 B;

    public j0(l0 l0Var, int i) {
        this.A = i;
        this.B = l0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return new k0(this.B);
            default:
                return this.B.z();
        }
    }
}
