package f5;

import java.util.concurrent.Executor;

public final class d implements Executor {
    public final int A;

    private final void a(Runnable runnable) {
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.run();
                break;
            case 1:
                q.a.g0().f12555a.f12559b.execute(runnable);
                break;
        }
    }
}
