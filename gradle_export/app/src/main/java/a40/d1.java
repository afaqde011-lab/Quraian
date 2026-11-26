package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class d1 extends h1 {
    public static final AtomicIntegerFieldUpdater F = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_invoked$volatile");
    public final g1 E;
    private volatile int _invoked$volatile;

    public d1(g1 g1Var) {
        this.E = g1Var;
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void k(Throwable th) {
        if (F.compareAndSet(this, 0, 1)) {
            this.E.invoke(th);
        }
    }
}
