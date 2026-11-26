package d4;

import java.util.concurrent.Executor;

public final class l implements Executor {
    public static final l A;
    public static final l[] B;

    static {
        l lVar = new l("INSTANCE", 0);
        A = lVar;
        B = new l[]{lVar};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) B.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override
    public final String toString() {
        return "DirectExecutor";
    }
}
