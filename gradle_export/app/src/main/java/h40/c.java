package h40;

import a40.c0;
import com.google.android.gms.internal.measurement.x5;
import f40.o;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;

public final class c implements Executor, Closeable {
    public static final AtomicLongFieldUpdater H = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");
    public static final AtomicLongFieldUpdater I = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");
    public static final AtomicIntegerFieldUpdater J = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");
    public static final eh.l K = new eh.l("NOT_IN_STACK", 2);
    public final int A;
    public final int B;
    public final long C;
    public final String D;
    public final f E;
    public final f F;
    public final o G;
    private volatile int _isTerminated$volatile;
    private volatile long controlState$volatile;
    private volatile long parkedWorkersStack$volatile;

    public c(long j, int i, int i2, String str) {
        this.A = i;
        this.B = i2;
        this.C = j;
        this.D = str;
        if (i < 1) {
            throw new IllegalArgumentException(g4.c.i("Core pool size ", i, " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(w.c.h(i2, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(g4.c.i("Max pool size ", i2, " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(oi.k.i("Idle worker keep alive time ", j, " must be positive").toString());
        }
        this.E = new f();
        this.F = new f();
        this.G = new o((i + 1) * 2);
        this.controlState$volatile = ((long) i) << 42;
    }

    public static void l(c cVar, Runnable runnable, int i) {
        cVar.i(runnable, false, (i & 4) == 0);
    }

    public final int a() {
        synchronized (this.G) {
            try {
                if (J.get(this) == 1) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = I;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.A) {
                    return 0;
                }
                if (i >= this.B) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.G.b(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i3);
                this.G.c(i3, aVar);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i4 = i2 + 1;
                aVar.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void close() throws InterruptedException {
        int i;
        i iVarA;
        if (J.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !kotlin.jvm.internal.m.a(aVar.H, this)) {
                aVar = null;
            }
            synchronized (this.G) {
                i = (int) (I.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object objB = this.G.b(i2);
                    kotlin.jvm.internal.m.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        m mVar = aVar2.A;
                        f fVar = this.F;
                        mVar.getClass();
                        i iVar = (i) m.b.getAndSet(mVar, null);
                        if (iVar != null) {
                            fVar.a(iVar);
                        }
                        while (true) {
                            i iVarB = mVar.b();
                            if (iVarB == null) {
                                break;
                            } else {
                                fVar.a(iVarB);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            f fVar2 = this.F;
            fVar2.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f40.j.a;
            while (true) {
                f40.l lVar = (f40.l) atomicReferenceFieldUpdater.get(fVar2);
                if (lVar.b()) {
                    break;
                } else {
                    atomicReferenceFieldUpdater.compareAndSet(fVar2, lVar, lVar.c());
                }
            }
            f fVar3 = this.E;
            fVar3.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f40.j.a;
            while (true) {
                f40.l lVar2 = (f40.l) atomicReferenceFieldUpdater2.get(fVar3);
                if (lVar2.b()) {
                    break;
                } else {
                    atomicReferenceFieldUpdater2.compareAndSet(fVar3, lVar2, lVar2.c());
                }
            }
            while (true) {
                if (aVar != null) {
                    iVarA = aVar.a(true);
                    if (iVarA == null) {
                        iVarA = (i) this.E.c();
                        if (iVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    iVarA = (i) this.E.c();
                    if (iVarA == null && (iVarA = (i) this.F.c()) == null) {
                        break;
                    }
                }
                try {
                    iVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(b.E);
            }
            H.set(this, 0L);
            I.set(this, 0L);
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        l(this, runnable, 6);
    }

    public final void i(Runnable runnable, boolean z, boolean z2) {
        i jVar;
        b bVar;
        k.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.A = jNanoTime;
            jVar.B = z;
        } else {
            jVar = new j(runnable, jNanoTime, z);
        }
        boolean z3 = jVar.B;
        AtomicLongFieldUpdater atomicLongFieldUpdater = I;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !kotlin.jvm.internal.m.a(aVar.H, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.C) != b.E && (jVar.B || bVar != b.B)) {
            aVar.G = true;
            m mVar = aVar.A;
            if (z2) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.B ? this.F.a(jVar) : this.E.a(jVar))) {
                throw new RejectedExecutionException(x5.n(new StringBuilder(), this.D, " was terminated"));
            }
        }
        if (z3) {
            if (x() || v(jAddAndGet)) {
                return;
            }
            x();
            return;
        }
        if (x() || v(atomicLongFieldUpdater.get(this))) {
            return;
        }
        x();
    }

    public final void r(a aVar, int i, int i2) {
        while (true) {
            long j = H.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == K) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                c cVar = this;
                if (H.compareAndSet(cVar, j, ((long) i3) | j2)) {
                    return;
                } else {
                    this = cVar;
                }
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        o oVar = this.G;
        int iA = oVar.a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iA; i6++) {
            a aVar = (a) oVar.b(i6);
            if (aVar != null) {
                m mVar = aVar.A;
                mVar.getClass();
                int i7 = m.b.get(mVar) != null ? (m.c.get(mVar) - m.d.get(mVar)) + 1 : m.c.get(mVar) - m.d.get(mVar);
                int iOrdinal = aVar.C.ordinal();
                if (iOrdinal == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i3++;
                } else if (iOrdinal == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = I.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.D);
        sb4.append('@');
        sb4.append(c0.q(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.A;
        sb4.append(i8);
        sb4.append(", max = ");
        w.c.u(sb4, this.B, "}, Worker States {CPU = ", i, ", blocking = ");
        w.c.u(sb4, i2, ", parked = ", i3, ", dormant = ");
        w.c.u(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.E.b());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.F.b());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }

    public final boolean v(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.A;
        if (i < i2) {
            int iA = a();
            if (iA == 1 && i2 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        c cVar;
        eh.l lVar;
        int iB;
        while (true) {
            long j = H.get(this);
            a aVar = (a) this.G.b((int) (2097151 & j));
            if (aVar == null) {
                aVar = null;
                cVar = this;
            } else {
                long j2 = (2097152 + j) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    lVar = K;
                    if (objC == lVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                    j = j;
                }
                if (iB >= 0) {
                    c cVar2 = this;
                    boolean zCompareAndSet = H.compareAndSet(cVar2, j, ((long) iB) | j2);
                    cVar = cVar2;
                    if (zCompareAndSet) {
                        aVar.g(lVar);
                    }
                    this = cVar;
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.I.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
            this = cVar;
        }
    }
}
