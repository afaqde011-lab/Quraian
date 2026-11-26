package tf;

public final class r2 implements Runnable {
    public final q2 A;
    public final q2 B;
    public final long C;
    public final boolean D;
    public final t2 E;

    public r2(t2 t2Var, q2 q2Var, q2 q2Var2, long j9, boolean z10) {
        this.A = q2Var;
        this.B = q2Var2;
        this.C = j9;
        this.D = z10;
        this.E = t2Var;
    }

    @Override
    public final void run() {
        this.E.f1(this.A, this.B, this.C, this.D, null);
    }
}
