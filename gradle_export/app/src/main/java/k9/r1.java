package k9;

public final class r1 implements i2, n3 {
    public final String A;
    public final int B;
    public final e1 C;

    public r1(int i10, int i11, String str, e1 e1Var) {
        this.A = str;
        this.B = i11;
        this.C = e1Var;
    }

    public r1(int i10, String str, e1 e1Var) {
        this.A = str;
        this.B = i10;
        this.C = e1Var;
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z1Var.t(i10, this.B, this.A, this.C);
    }

    @Override
    public Object d(s1 s1Var, a2 a2Var, int i10) {
        return s1Var.t(a2Var, this.A, this.B, this.C);
    }
}
