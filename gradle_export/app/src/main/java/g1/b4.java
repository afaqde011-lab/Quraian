package g1;

public final class b4 implements u00.k {
    public final int A;
    public final z2.l1 B;
    public final int C;
    public final int D;

    public b4(int i10, int i11, z2.l1 l1Var) {
        this.A = 0;
        this.C = i10;
        this.B = l1Var;
        this.D = i11;
    }

    public b4(z2.l1 l1Var, int i10, int i11, int i12) {
        this.A = i12;
        this.B = l1Var;
        this.C = i10;
        this.D = i11;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                z2.l1 l1Var = this.B;
                ((z2.k1) obj).h(l1Var, w00.a.F((this.C - l1Var.A) / 2.0f), w00.a.F((this.D - l1Var.B) / 2.0f), 0.0f);
                break;
            case 1:
                ((z2.k1) obj).h(this.B, this.C, this.D, 0.0f);
                break;
            default:
                ((z2.k1) obj).h(this.B, this.C, this.D, 0.0f);
                break;
        }
        return g00.b0.a;
    }
}
