package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public final class y1 extends h1 {
    public static final AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(y1.class, "_state$volatile");
    public final Thread E = Thread.currentThread();
    public o0 F;
    private volatile int _state$volatile;

    public static void m(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override
    public final boolean j() {
        return true;
    }

    @Override
    public final void k(Throwable th) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = G;
            i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1 || i == 2 || i == 3) {
                    return;
                }
                m(i);
                throw null;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 2));
        this.E.interrupt();
        atomicIntegerFieldUpdater.set(this, 3);
    }

    public final void l() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 2) {
                    if (i == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        m(i);
                        throw null;
                    }
                }
            } else if (atomicIntegerFieldUpdater.compareAndSet(this, i, 1)) {
                o0 o0Var = this.F;
                if (o0Var != null) {
                    o0Var.dispose();
                    return;
                }
                return;
            }
        }
    }
}
