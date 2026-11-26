package tf;

public final class f2 implements Runnable {
    public final int A;
    public final t1 B;
    public final long C;
    public final boolean D;
    public final i2 E;

    public f2(i2 i2Var, t1 t1Var, long j9, boolean z10, int i10) {
        this.A = i10;
        this.B = t1Var;
        this.C = j9;
        this.D = z10;
        this.E = i2Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                i2 i2Var = this.E;
                t1 t1Var = this.B;
                i2Var.Z0(t1Var);
                i2Var.l1(t1Var, this.C, this.D);
                break;
            default:
                i2 i2Var2 = this.E;
                t1 t1Var2 = this.B;
                i2Var2.Z0(t1Var2);
                i2Var2.l1(t1Var2, this.C, this.D);
                break;
        }
    }
}
