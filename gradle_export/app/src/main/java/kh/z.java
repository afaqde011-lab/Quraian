package kh;

public final class z extends h implements Runnable {
    public final Runnable H;

    public z(Runnable runnable) {
        runnable.getClass();
        this.H = runnable;
    }

    @Override
    public final String j() {
        return "task=[" + this.H + "]";
    }

    @Override
    public final void run() {
        try {
            this.H.run();
        } catch (Throwable th2) {
            m(th2);
            throw th2;
        }
    }
}
