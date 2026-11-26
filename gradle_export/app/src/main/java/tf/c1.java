package tf;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public final class c1 extends FutureTask implements Comparable {
    public final long A;
    public final boolean B;
    public final String C;
    public final e1 D;

    public c1(e1 e1Var, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        this.D = e1Var;
        long andIncrement = e1.L.getAndIncrement();
        this.A = andIncrement;
        this.C = str;
        this.B = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q0 q0Var = ((h1) e1Var.B).F;
            h1.g(q0Var);
            q0Var.G.b("Tasks index overflow");
        }
    }

    public c1(e1 e1Var, Callable callable, boolean z10) {
        super(callable);
        this.D = e1Var;
        long andIncrement = e1.L.getAndIncrement();
        this.A = andIncrement;
        this.C = "Task exception on worker thread";
        this.B = z10;
        if (andIncrement == Long.MAX_VALUE) {
            q0 q0Var = ((h1) e1Var.B).F;
            h1.g(q0Var);
            q0Var.G.b("Tasks index overflow");
        }
    }

    @Override
    public final int compareTo(Object obj) {
        c1 c1Var = (c1) obj;
        boolean z10 = c1Var.B;
        boolean z11 = this.B;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j9 = c1Var.A;
        long j10 = this.A;
        if (j10 < j9) {
            return -1;
        }
        if (j10 > j9) {
            return 1;
        }
        q0 q0Var = ((h1) this.D.B).F;
        h1.g(q0Var);
        q0Var.H.c(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override
    public final void setException(Throwable th2) {
        q0 q0Var = ((h1) this.D.B).F;
        h1.g(q0Var);
        q0Var.G.c(th2, this.C);
        super.setException(th2);
    }
}
