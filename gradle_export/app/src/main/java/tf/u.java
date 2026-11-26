package tf;

import java.util.Objects;

public final class u implements Runnable {
    public final int A = 1;
    public final long B;
    public final z C;

    public u(t2 t2Var, long j9) {
        this.B = j9;
        Objects.requireNonNull(t2Var);
        this.C = t2Var;
    }

    public u(v vVar, long j9) {
        this.B = j9;
        Objects.requireNonNull(vVar);
        this.C = vVar;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                ((v) this.C).b1(this.B);
                break;
            default:
                t2 t2Var = (t2) this.C;
                v vVar = ((h1) t2Var.B).N;
                h1.d(vVar);
                vVar.Y0(this.B);
                t2Var.F = null;
                break;
        }
    }
}
