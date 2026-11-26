package s7;

public final class l0 implements Runnable {
    public final int A;
    public final s0 B;

    public l0(s0 s0Var, int i10) {
        this.A = i10;
        this.B = s0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                this.B.f13749k0 = true;
                break;
            case 1:
                this.B.y();
                break;
            default:
                s0 s0Var = this.B;
                if (!s0Var.f13755q0) {
                    x xVar = s0Var.S;
                    xVar.getClass();
                    xVar.d(s0Var);
                }
                break;
        }
    }
}
