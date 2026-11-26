package e7;

public final class g0 implements Runnable {
    public final int A;
    public final kh.b0 B;
    public final kh.v C;

    public g0(kh.b0 b0Var, kh.v vVar, int i10) {
        this.A = i10;
        this.B = b0Var;
        this.C = vVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                kh.b0 b0Var = this.B;
                kh.v vVar = this.C;
                if (b0Var.A instanceof kh.a) {
                    vVar.cancel(false);
                }
                break;
            default:
                kh.b0 b0Var2 = this.B;
                kh.v vVar2 = this.C;
                if (b0Var2.A instanceof kh.a) {
                    vVar2.cancel(false);
                }
                break;
        }
    }
}
