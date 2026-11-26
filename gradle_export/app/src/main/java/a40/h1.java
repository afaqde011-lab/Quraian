package a40;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class h1 extends f40.i implements o0, b1 {
    public m1 D;

    @Override
    public final boolean a() {
        return true;
    }

    @Override
    public final p1 c() {
        return null;
    }

    @Override
    public final void dispose() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2;
        Object obj2;
        f40.i iVar;
        f40.n nVar;
        m1 m1VarI = i();
        do {
            atomicReferenceFieldUpdater = m1.A;
            obj = atomicReferenceFieldUpdater.get(m1VarI);
            if (!(obj instanceof h1)) {
                if (!(obj instanceof b1) || ((b1) obj).c() == null) {
                    return;
                }
                do {
                    atomicReferenceFieldUpdater2 = f40.i.A;
                    obj2 = atomicReferenceFieldUpdater2.get(this);
                    if (obj2 instanceof f40.n) {
                        return;
                    }
                    if (obj2 == this) {
                        return;
                    }
                    kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    iVar = (f40.i) obj2;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f40.i.C;
                    nVar = (f40.n) atomicReferenceFieldUpdater3.get(iVar);
                    if (nVar == null) {
                        nVar = new f40.n(iVar);
                        atomicReferenceFieldUpdater3.set(iVar, nVar);
                    }
                } while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar));
                iVar.e();
                return;
            }
            if (obj != this) {
                return;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(m1VarI, obj, c0.j));
    }

    public e1 getParent() {
        return i();
    }

    public final m1 i() {
        m1 m1Var = this.D;
        if (m1Var != null) {
            return m1Var;
        }
        kotlin.jvm.internal.m.k("job");
        throw null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override
    public final String toString() {
        return getClass().getSimpleName() + '@' + c0.q(this) + "[job@" + c0.q(i()) + ']';
    }
}
