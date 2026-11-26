package tf;

import java.util.Objects;

public final class s2 implements Runnable {
    public final int A;
    public final t2 B;

    public s2(t2 t2Var, int i10) {
        this.A = i10;
        switch (i10) {
            case 1:
                Objects.requireNonNull(t2Var);
                this.B = t2Var;
                break;
            default:
                Objects.requireNonNull(t2Var);
                this.B = t2Var;
                break;
        }
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                t2 t2Var = this.B;
                t2Var.F = t2Var.K;
                break;
            default:
                this.B.K = null;
                break;
        }
    }
}
