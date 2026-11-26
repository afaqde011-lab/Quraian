package f40;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class j {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$volatile");
    private volatile Object _cur$volatile = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int iA = lVar.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVar.c());
            } else if (iA == 2) {
                return false;
            }
        }
    }

    public final int b() {
        l lVar = (l) a.get(this);
        lVar.getClass();
        long j = l.f.get(lVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object c() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object objD = lVar.d();
            if (objD != l.g) {
                return objD;
            }
            atomicReferenceFieldUpdater.compareAndSet(this, lVar, lVar.c());
        }
    }
}
