package k9;

public final class q1 implements Runnable {
    public final int A;
    public final s1 B;
    public final kh.b0 C;
    public final a2 D;

    public q1(s1 s1Var, kh.b0 b0Var, a2 a2Var, int i10) {
        this.A = i10;
        this.B = s1Var;
        this.C = b0Var;
        this.D = a2Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                s1 s1Var = this.B;
                s1Var.getClass();
                q qVar = (q) s1.I(this.C);
                if (qVar != null) {
                    s1Var.q(this.D, qVar);
                }
                break;
            default:
                s1 s1Var2 = this.B;
                s1Var2.getClass();
                q qVar2 = (q) s1.I(this.C);
                if (qVar2 != null) {
                    s1Var2.q(this.D, qVar2);
                }
                break;
        }
    }
}
