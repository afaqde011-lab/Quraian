package oe;

import java.util.concurrent.Executor;

public final class h implements Executor {
    public static final h B = new h(0);
    public static final h C = new h(1);
    public final int A;

    public h(int i10) {
        this.A = i10;
    }

    @Override
    public final void execute(Runnable runnable) {
        switch (this.A) {
            case 0:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
