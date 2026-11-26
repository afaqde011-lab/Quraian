package k00;

import g00.m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class k implements c, m00.d {
    public static final AtomicReferenceFieldUpdater B = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "result");
    public final c A;
    private volatile Object result;

    public k(c cVar) {
        l00.a aVar = l00.a.B;
        this.A = cVar;
        this.result = aVar;
    }

    public k(c cVar, l00.a aVar) {
        this.A = cVar;
        this.result = aVar;
    }

    public final Object a() {
        Object obj = this.result;
        l00.a aVar = l00.a.B;
        if (obj == aVar) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = B;
            l00.a aVar2 = l00.a.A;
            if (atomicReferenceFieldUpdater.compareAndSet(this, aVar, aVar2)) {
                return aVar2;
            }
            obj = this.result;
        }
        if (obj == l00.a.C) {
            return l00.a.A;
        }
        if (obj instanceof m) {
            throw ((m) obj).A;
        }
        return obj;
    }

    @Override
    public final m00.d getCallerFrame() {
        c cVar = this.A;
        if (cVar instanceof m00.d) {
            return (m00.d) cVar;
        }
        return null;
    }

    @Override
    public final i getContext() {
        return this.A.getContext();
    }

    @Override
    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.result;
            l00.a aVar = l00.a.B;
            if (obj2 != aVar) {
                l00.a aVar2 = l00.a.A;
                if (obj2 != aVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (B.compareAndSet(this, aVar2, l00.a.C)) {
                    this.A.resumeWith(obj);
                    return;
                }
            } else if (B.compareAndSet(this, aVar, obj)) {
                return;
            }
        }
    }

    public final String toString() {
        return "SafeContinuation for " + this.A;
    }
}
