package k9;

public final class z implements Runnable {
    public final int A;
    public final t0 B;

    public z(t0 t0Var, int i10) {
        this.A = i10;
        this.B = t0Var;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                t0 t0Var = this.B;
                q0 q0Var = t0Var.f9450o;
                if (q0Var != null) {
                    t0Var.f9441d.unbindService(q0Var);
                    t0Var.f9450o = null;
                }
                t0Var.f9440c.f9263e.clear();
                break;
            default:
                t0 t0Var2 = this.B;
                t3 t3Var = t0Var2.I;
                if (t3Var != null) {
                    t0Var2.w(t3Var, r3.f9408c);
                }
                break;
        }
    }
}
