package a40;

public final class s0 extends t0 {
    public final Runnable C;

    public s0(Runnable runnable, long j) {
        super(j);
        this.C = runnable;
    }

    @Override
    public final void run() {
        this.C.run();
    }

    @Override
    public final String toString() {
        return super.toString() + this.C;
    }
}
