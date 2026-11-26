package f40;

import a40.s1;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public abstract class q extends b implements s1 {
    public static final AtomicIntegerFieldUpdater D = AtomicIntegerFieldUpdater.newUpdater(q.class, "cleanedAndPointers$volatile");
    public final long C;
    private volatile int cleanedAndPointers$volatile;

    public q(long j, q qVar, int i) {
        super(qVar);
        this.C = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override
    public final boolean d() {
        return D.get(this) == g() && c() != null;
    }

    public final boolean f() {
        return D.addAndGet(this, -65536) == g() && c() != null;
    }

    public abstract int g();

    public abstract void h(int i, k00.i iVar);

    public final void i() {
        if (D.incrementAndGet(this) == g()) {
            e();
        }
    }

    public final boolean j() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = D;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == g() && c() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
