package fi;

import java.util.concurrent.Executor;

public final class d implements Executor {
    public static final d B = new d(0);
    public final int A;

    public d(int i10) {
        this.A = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.run();
                break;
            case 1:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
