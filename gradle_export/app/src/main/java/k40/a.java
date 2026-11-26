package k40;

import java.util.concurrent.Executor;

public final class a implements Executor {
    public static final a A = new a();

    @Override
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
