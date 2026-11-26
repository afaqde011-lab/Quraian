package d10;

public final class m1 implements u00.a {
    public final int A;
    public final p1 B;

    public m1(p1 p1Var, int i) {
        this.A = i;
        this.B = p1Var;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return new o1(this.B);
            default:
                return k00.f.u(this.B.B);
        }
    }
}
