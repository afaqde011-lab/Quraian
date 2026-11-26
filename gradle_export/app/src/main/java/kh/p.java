package kh;

import java.util.concurrent.Executor;

public final class p implements Executor {
    public static final p A;
    public static final p[] B;

    static {
        p pVar = new p("INSTANCE", 0);
        A = pVar;
        B = new p[]{pVar};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) B.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
