package h00;

public final class h0 extends c {
    public int C;
    public int D;
    public final i0 E;

    public h0(i0 i0Var) {
        this.E = i0Var;
        this.C = i0Var.D;
        this.D = i0Var.C;
    }

    @Override
    public final void a() {
        int i = this.C;
        if (i == 0) {
            this.A = 2;
            return;
        }
        i0 i0Var = this.E;
        Object[] objArr = i0Var.A;
        int i2 = this.D;
        this.B = objArr[i2];
        this.A = 1;
        this.D = (i2 + 1) % i0Var.B;
        this.C = i - 1;
    }
}
