package k9;

public final class o1 implements Runnable {
    public final int A;
    public final s1 B;
    public final kh.v C;
    public final a2 D;
    public final int E;

    public o1(s1 s1Var, kh.v vVar, a2 a2Var, int i10, int i11) {
        this.A = i11;
        this.B = s1Var;
        this.C = vVar;
        this.D = a2Var;
        this.E = i10;
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
                    s1.K(this.E, qVar);
                }
                break;
            default:
                s1 s1Var2 = this.B;
                s1Var2.getClass();
                q qVar2 = (q) s1.I(this.C);
                if (qVar2 != null) {
                    s1Var2.q(this.D, qVar2);
                    s1.K(this.E, qVar2);
                }
                break;
        }
    }
}
