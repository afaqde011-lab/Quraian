package ji;

import java.util.concurrent.Executor;

public final class i implements Executor {
    public static final i A;
    public static final i[] B;

    static {
        i iVar = new i("INSTANCE", 0);
        A = iVar;
        B = new i[]{iVar};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) B.clone();
    }

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
