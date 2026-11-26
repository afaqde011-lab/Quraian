package za;

import java.util.concurrent.Executor;

public final class j implements Executor {
    public static final j A;
    public static final j[] B;

    static {
        j jVar = new j("INSTANCE", 0);
        A = jVar;
        j[] jVarArr = {jVar};
        B = jVarArr;
        f50.c.v(jVarArr);
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) B.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        kotlin.jvm.internal.m.e(runnable, "command");
        runnable.run();
    }

    @Override
    public final String toString() {
        return "DirectExecutor";
    }
}
