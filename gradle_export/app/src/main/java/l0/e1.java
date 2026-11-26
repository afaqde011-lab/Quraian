package l0;

public final class e1 implements u00.a {
    public final int A;
    public final f1 B;

    public e1(f1 f1Var, int i10) {
        this.A = i10;
        this.B = f1Var;
    }

    public final Object invoke() {
        switch (this.A) {
            case 0:
                return Float.valueOf(this.B.P.b());
            case 1:
                return Float.valueOf(this.B.P.d());
            default:
                f1 f1Var = this.B;
                return Float.valueOf(f1Var.P.a() - f1Var.P.c());
        }
    }
}
