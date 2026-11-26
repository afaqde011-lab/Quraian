package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

public final class j0 extends f40.p {
    public static final AtomicIntegerFieldUpdater E = AtomicIntegerFieldUpdater.newUpdater(j0.class, "_decision$volatile");
    private volatile int _decision$volatile;

    @Override
    public final void n(Object obj) throws DispatchException {
        o(obj);
    }

    @Override
    public final void o(Object obj) throws DispatchException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = E;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                f40.a.h(c0.A(obj), qd.s0.j0(this.D));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
