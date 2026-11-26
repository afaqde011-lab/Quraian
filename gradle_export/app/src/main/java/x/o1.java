package x;

public final class o1 implements u00.k {
    public final int A;
    public final n1 B;

    public o1(n1 n1Var, int i10) {
        this.A = i10;
        this.B = n1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                return new p1(this.B, 1);
            default:
                return new p1(this.B, 0);
        }
    }
}
