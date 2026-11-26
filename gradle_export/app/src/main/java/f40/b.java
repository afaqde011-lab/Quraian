package f40;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class b {
    public static final AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_prev$volatile");
    private volatile Object _next$volatile;
    private volatile Object _prev$volatile;

    public b(q qVar) {
        this._prev$volatile = qVar;
    }

    public final void b() {
        B.set(this, null);
    }

    public final b c() {
        Object obj = A.get(this);
        if (obj == a.a) {
            return null;
        }
        return (b) obj;
    }

    public abstract boolean d();

    public final void e() {
        Object obj;
        b bVarC;
        if (c() == null) {
            return;
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            b bVar = (b) atomicReferenceFieldUpdater.get(this);
            while (bVar != null && bVar.d()) {
                bVar = (b) atomicReferenceFieldUpdater.get(bVar);
            }
            b bVarC2 = c();
            kotlin.jvm.internal.m.b(bVarC2);
            while (bVarC2.d() && (bVarC = bVarC2.c()) != null) {
                bVarC2 = bVarC;
            }
            do {
                obj = atomicReferenceFieldUpdater.get(bVarC2);
            } while (!atomicReferenceFieldUpdater.compareAndSet(bVarC2, obj, ((b) obj) == null ? null : bVar));
            if (bVar != null) {
                A.set(bVar, bVarC2);
            }
            if (!bVarC2.d() || bVarC2.c() == null) {
                if (bVar == null || !bVar.d()) {
                    return;
                }
            }
        }
    }
}
