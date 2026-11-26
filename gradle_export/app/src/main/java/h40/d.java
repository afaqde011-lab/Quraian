package h40;

import a40.v;
import a40.x0;
import f40.s;
import java.util.concurrent.Executor;

public final class d extends x0 implements Executor {
    public static final d C = new d();
    public static final v D;

    static {
        l lVar = l.C;
        int i = s.a;
        if (64 >= i) {
            i = 64;
        }
        D = lVar.q0(f40.a.l(i, "kotlinx.coroutines.io.parallelism", 12));
    }

    @Override
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override
    public final void execute(Runnable runnable) {
        n0(k00.j.A, runnable);
    }

    @Override
    public final void n0(k00.i iVar, Runnable runnable) {
        D.n0(iVar, runnable);
    }

    @Override
    public final void o0(k00.i iVar, Runnable runnable) {
        D.o0(iVar, runnable);
    }

    @Override
    public final v q0(int i) {
        return l.C.q0(1);
    }

    @Override
    public final String toString() {
        return "Dispatchers.IO";
    }
}
