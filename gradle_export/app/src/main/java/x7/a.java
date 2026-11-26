package x7;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import uh.k;

public final class a implements Executor {
    public final Executor A;
    public final k B;

    public a(ExecutorService executorService, k kVar) {
        this.A = executorService;
        this.B = kVar;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.A.execute(runnable);
    }
}
