package j40;

import a1.w;
import a40.c0;
import eh.l;
import g00.b0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qd.s0;

public final class c extends h implements a {
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "owner$volatile");
    private volatile Object owner$volatile;

    public c(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : d.a;
    }

    @Override
    public final boolean a(Object obj) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.G;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.A;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
                if (i2 <= 0) {
                    if (obj == null) {
                        return false;
                    }
                    while (e()) {
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 != d.a) {
                            if (obj2 != obj) {
                                return false;
                            }
                            throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
                        }
                    }
                } else if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    atomicReferenceFieldUpdater.set(this, obj);
                    return true;
                }
            }
        }
    }

    public final boolean e() {
        return Math.max(h.G.get(this), 0) == 0;
    }

    @Override
    public final void i(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            l lVar = d.a;
            if (obj2 != lVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, lVar)) {
                    d();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override
    public final Object l(k00.c cVar) {
        boolean zA = a(null);
        b0 b0Var = b0.a;
        if (!zA) {
            a40.k kVarS = c0.s(s0.j0(cVar));
            try {
                b bVar = new b(this, kVarS);
                while (true) {
                    int andDecrement = h.G.getAndDecrement(this);
                    if (andDecrement <= this.A) {
                        if (andDecrement > 0) {
                            c cVar2 = bVar.B;
                            H.set(cVar2, null);
                            a40.k kVar = bVar.A;
                            kVar.C(b0Var, kVar.C, new w(new h00.a(cVar2, bVar, 8), 2));
                            break;
                        }
                        if (c(bVar)) {
                            break;
                        }
                    }
                }
                Object objQ = kVarS.q();
                l00.a aVar = l00.a.A;
                if (objQ != aVar) {
                    objQ = b0Var;
                }
                if (objQ == aVar) {
                    return objQ;
                }
            } catch (Throwable th) {
                kVarS.B();
                throw th;
            }
        }
        return b0Var;
    }

    public final String toString() {
        return "Mutex@" + c0.q(this) + "[isLocked=" + e() + ",owner=" + H.get(this) + ']';
    }
}
