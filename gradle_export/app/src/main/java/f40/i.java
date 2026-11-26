package f40;

import a40.c0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class i {
    public static final AtomicReferenceFieldUpdater A = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_next$volatile");
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_prev$volatile");
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(i.class, Object.class, "_removedRef$volatile");
    private volatile Object _next$volatile = this;
    private volatile Object _prev$volatile = this;
    private volatile Object _removedRef$volatile;

    public final boolean d(i iVar, int i) {
        i iVarE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            iVarE = e();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
            if (iVarE == null) {
                Object obj = atomicReferenceFieldUpdater2.get(this);
                while (true) {
                    iVarE = (i) obj;
                    if (!iVarE.h()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater2.get(iVarE);
                }
            }
            if (iVarE instanceof g) {
                return (((g) iVarE).D & i) == 0 && iVarE.d(iVar, i);
            }
            atomicReferenceFieldUpdater2.set(iVar, iVarE);
            atomicReferenceFieldUpdater = A;
            atomicReferenceFieldUpdater.set(iVar, this);
        } while (!atomicReferenceFieldUpdater.compareAndSet(iVarE, this, iVar));
        iVar.f(this);
        return true;
    }

    public final i e() {
        i iVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = B;
            i iVar2 = (i) atomicReferenceFieldUpdater2.get(this);
            iVar = iVar2;
            while (true) {
                i iVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = A;
                    obj = atomicReferenceFieldUpdater.get(iVar);
                    if (obj == this) {
                        if (iVar2 != iVar && !atomicReferenceFieldUpdater2.compareAndSet(this, iVar2, iVar)) {
                            break;
                        }
                        break;
                    }
                    if (h()) {
                        return null;
                    }
                    if (!(obj instanceof n)) {
                        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                        iVar3 = iVar;
                        iVar = (i) obj;
                    } else {
                        if (iVar3 != null) {
                            break;
                        }
                        iVar = (i) atomicReferenceFieldUpdater2.get(iVar);
                    }
                }
                if (!atomicReferenceFieldUpdater.compareAndSet(iVar3, iVar, ((n) obj).a)) {
                    break;
                }
                iVar = iVar3;
            }
        }
        return iVar;
    }

    public final void f(i iVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        i iVar2;
        do {
            atomicReferenceFieldUpdater = B;
            iVar2 = (i) atomicReferenceFieldUpdater.get(iVar);
            if (A.get(this) != iVar) {
                return;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(iVar, iVar2, this));
        if (h()) {
            iVar.e();
        }
    }

    public final i g() {
        i iVar;
        Object obj = A.get(this);
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar != null && (iVar = nVar.a) != null) {
            return iVar;
        }
        kotlin.jvm.internal.m.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        return (i) obj;
    }

    public boolean h() {
        return A.get(this) instanceof n;
    }

    public String toString() {
        return new h(1, 0, c0.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + c0.q(this);
    }
}
