package j40;

import a1.w;
import a40.c0;
import a40.e2;
import eh.l;
import f40.q;
import g00.b0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import qd.s0;

public class h {
    public static final AtomicReferenceFieldUpdater C = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head$volatile");
    public static final AtomicLongFieldUpdater D = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx$volatile");
    public static final AtomicReferenceFieldUpdater E = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail$volatile");
    public static final AtomicLongFieldUpdater F = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx$volatile");
    public static final AtomicIntegerFieldUpdater G = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits$volatile");
    public final int A;
    public final w B;
    private volatile int _availablePermits$volatile;
    private volatile long deqIdx$volatile;
    private volatile long enqIdx$volatile;
    private volatile Object head$volatile;
    private volatile Object tail$volatile;

    public h(int i, int i2) {
        this.A = i;
        if (i <= 0) {
            throw new IllegalArgumentException(g4.c.f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(g4.c.f(i, "The number of acquired permits should be in 0..").toString());
        }
        k kVar = new k(0L, null, 2);
        this.head$volatile = kVar;
        this.tail$volatile = kVar;
        this._availablePermits$volatile = i - i2;
        this.B = new w(this, 8);
    }

    public final Object b(m00.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int andDecrement;
        int i;
        do {
            atomicIntegerFieldUpdater = G;
            andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
            i = this.A;
        } while (andDecrement > i);
        b0 b0Var = b0.a;
        if (andDecrement <= 0) {
            a40.k kVarS = c0.s(s0.j0(cVar));
            try {
                if (!c(kVarS)) {
                    while (true) {
                        int andDecrement2 = atomicIntegerFieldUpdater.getAndDecrement(this);
                        if (andDecrement2 <= i) {
                            if (andDecrement2 > 0) {
                                kVarS.e(b0Var, this.B);
                                break;
                            }
                            if (c(kVarS)) {
                                break;
                            }
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

    public final boolean c(e2 e2Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = E;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        long andIncrement = F.getAndIncrement(this);
        f fVar = f.A;
        long j = andIncrement / ((long) j.f);
        loop0: while (true) {
            objB = f40.a.b(kVar, j, fVar);
            if (!f40.a.e(objB)) {
                q qVarC = f40.a.c(objB);
                while (true) {
                    q qVar = (q) atomicReferenceFieldUpdater.get(this);
                    if (qVar.C >= qVarC.C) {
                        break loop0;
                    }
                    if (!qVarC.j()) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                        if (!qVar.f()) {
                            break loop0;
                        }
                        qVar.e();
                        break loop0;
                    }
                    if (qVarC.f()) {
                        qVarC.e();
                    }
                }
            } else {
                break;
            }
        }
        k kVar2 = (k) f40.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = kVar2.E;
        int i = (int) (andIncrement % ((long) j.f));
        if (atomicReferenceArray.compareAndSet(i, null, e2Var)) {
            e2Var.b(kVar2, i);
            return true;
        }
        if (!atomicReferenceArray.compareAndSet(i, j.b, j.c)) {
            return false;
        }
        ((a40.j) e2Var).e(b0.a, this.B);
        return true;
    }

    public final void d() {
        int i;
        Object objB;
        int i2;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = G;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i3 = this.A;
            if (andIncrement >= i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i3) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i3).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C;
            k kVar = (k) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = D.getAndIncrement(this);
            long j = andIncrement2 / ((long) j.f);
            g gVar = g.A;
            while (true) {
                objB = f40.a.b(kVar, j, gVar);
                if (!f40.a.e(objB)) {
                    q qVarC = f40.a.c(objB);
                    while (true) {
                        q qVar = (q) atomicReferenceFieldUpdater.get(this);
                        if (qVar.C >= qVarC.C) {
                            break;
                        }
                        if (!qVarC.j()) {
                            break;
                        }
                        if (atomicReferenceFieldUpdater.compareAndSet(this, qVar, qVarC)) {
                            if (!qVar.f()) {
                                break;
                            }
                            qVar.e();
                            break;
                        } else if (qVarC.f()) {
                            qVarC.e();
                        }
                    }
                } else {
                    break;
                }
            }
            k kVar2 = (k) f40.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = kVar2.E;
            kVar2.b();
            i2 = 0;
            if (kVar2.C <= j) {
                int i4 = (int) (andIncrement2 % ((long) j.f));
                Object andSet = atomicReferenceArray.getAndSet(i4, j.b);
                if (andSet == null) {
                    int i5 = j.a;
                    while (true) {
                        if (i2 >= i5) {
                            i2 = !atomicReferenceArray.compareAndSet(i4, j.b, j.d) ? 1 : 0;
                            break;
                        } else {
                            if (atomicReferenceArray.get(i4) == j.c) {
                                i2 = 1;
                                break;
                            }
                            i2++;
                        }
                    }
                } else if (andSet != j.e) {
                    boolean z = andSet instanceof a40.j;
                    b0 b0Var = b0.a;
                    if (z) {
                        a40.j jVar = (a40.j) andSet;
                        l lVarG = jVar.g(b0Var, this.B);
                        if (lVarG != null) {
                            jVar.s(lVarG);
                            i2 = 1;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof i40.f)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        if (((i40.e) ((i40.f) andSet)).g(this, b0Var) == 0) {
                            i2 = 1;
                            break;
                            break;
                        }
                    }
                }
            }
        } while (i2 == 0);
    }
}
