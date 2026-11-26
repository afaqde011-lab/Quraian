package d10;

public final class g0 implements u00.a {
    public final int A;
    public final i0 B;

    public g0(i0 i0Var, int i) {
        this.A = i;
        this.B = i0Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return new h0(this.B);
            default:
                return this.B.z();
        }
    }
}
