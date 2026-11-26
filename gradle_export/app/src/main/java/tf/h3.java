package tf;

import java.util.Objects;

public final class h3 implements Runnable {
    public final long A;
    public final long B;
    public final s10.w0 C;

    public h3(s10.w0 w0Var, long j9, long j10) {
        Objects.requireNonNull(w0Var);
        this.C = w0Var;
        this.A = j9;
        this.B = j10;
    }

    @Override
    public final void run() {
        e1 e1Var = ((h1) ((j3) this.C.C).B).G;
        h1.g(e1Var);
        e1Var.e1(new a50.d(this, 23));
    }
}
