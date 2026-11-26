package k9;

import java.util.concurrent.Executor;

public final class p1 implements Executor {
    public final int A;
    public final s1 B;

    public p1(s1 s1Var, int i10) {
        this.A = i10;
        this.B = s1Var;
    }

    @Override
    public final void execute(Runnable runnable) {
        int i10 = this.A;
        s1 s1Var = this.B;
        switch (i10) {
            case 0:
                s1.b(s1Var, runnable);
                break;
            case 1:
                e7.i0.M(s1Var.l, runnable);
                break;
            default:
                e7.i0.M(s1Var.l, runnable);
                break;
        }
    }
}
