package k9;

public final class l2 implements Runnable {
    public final int A;
    public final t2 B;
    public final v3 C;

    public l2(t2 t2Var, v3 v3Var, int i10) {
        this.A = i10;
        this.B = t2Var;
        this.C = v3Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                t2 t2Var = this.B;
                l9.f0 f0Var = t2Var.f9467j;
                v3 v3Var = this.C;
                f0Var.s(t2Var.G(v3Var));
                t2Var.f9465h.y(v3Var.getAvailableCommands().a(17) ? v3Var.getCurrentTimeline() : androidx.media3.common.k2.EMPTY);
                break;
            default:
                t2 t2Var2 = this.B;
                t2Var2.f9467j.s(t2Var2.G(this.C));
                break;
        }
    }
}
