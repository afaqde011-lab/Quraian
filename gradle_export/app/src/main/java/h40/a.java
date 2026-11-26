package h40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.jvm.internal.z;

public final class a extends Thread {
    public static final AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");
    public final m A;
    public final z B;
    public b C;
    public long D;
    public long E;
    public int F;
    public boolean G;
    public final c H;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile int workerCtl$volatile;

    public a(c cVar, int i) {
        this.H = cVar;
        setDaemon(true);
        setContextClassLoader(c.class.getClassLoader());
        this.A = new m();
        this.B = new z();
        this.C = b.D;
        this.nextParkedWorker = c.K;
        int iNanoTime = (int) System.nanoTime();
        this.F = iNanoTime == 0 ? 42 : iNanoTime;
        f(i);
    }

    public final i a(boolean z) {
        i iVarE;
        i iVarE2;
        long j;
        b bVar = this.C;
        b bVar2 = b.A;
        c cVar = this.H;
        i iVar = null;
        m mVar = this.A;
        if (bVar != bVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = c.I;
            do {
                j = atomicLongFieldUpdater.get(cVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mVar.getClass();
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar2 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar2 == null || !iVar2.B) {
                            int i = m.d.get(mVar);
                            int i2 = m.c.get(mVar);
                            while (i != i2 && m.e.get(mVar) != 0) {
                                i2--;
                                i iVarC = mVar.c(i2, true);
                                if (iVarC != null) {
                                    iVar = iVarC;
                                    break;
                                }
                            }
                            break;
                        }
                        if (atomicReferenceFieldUpdater.compareAndSet(mVar, iVar2, null)) {
                            iVar = iVar2;
                            break;
                        }
                    }
                    if (iVar != null) {
                        return iVar;
                    }
                    i iVar3 = (i) cVar.F.c();
                    return iVar3 == null ? i(1) : iVar3;
                }
            } while (!c.I.compareAndSet(cVar, j, j - 4398046511104L));
            this.C = b.A;
        }
        if (z) {
            boolean z2 = d(cVar.A * 2) == 0;
            if (z2 && (iVarE2 = e()) != null) {
                return iVarE2;
            }
            mVar.getClass();
            i iVarB = (i) m.b.getAndSet(mVar, null);
            if (iVarB == null) {
                iVarB = mVar.b();
            }
            if (iVarB != null) {
                return iVarB;
            }
            if (!z2 && (iVarE = e()) != null) {
                return iVarE;
            }
        } else {
            i iVarE3 = e();
            if (iVarE3 != null) {
                return iVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.F;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.F = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.H;
        if (iD == 0) {
            i iVar = (i) cVar.E.c();
            return iVar != null ? iVar : (i) cVar.F.c();
        }
        i iVar2 = (i) cVar.F.c();
        return iVar2 != null ? iVar2 : (i) cVar.E.c();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.H.D);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.C;
        boolean z = bVar2 == b.A;
        if (z) {
            c.I.addAndGet(this.H, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.C = bVar;
        }
        return z;
    }

    public final i i(int i) {
        long j;
        i iVarC;
        long j2;
        long j3;
        i iVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.I;
        c cVar = this.H;
        int i2 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        i iVar2 = null;
        if (i2 < 2) {
            return null;
        }
        int iD = d(i2);
        int i3 = 0;
        long jMin = Long.MAX_VALUE;
        while (i3 < i2) {
            iD++;
            if (iD > i2) {
                iD = 1;
            }
            a aVar = (a) cVar.G.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.A;
                if (i != 3) {
                    mVar.getClass();
                    int i4 = m.d.get(mVar);
                    int i5 = m.c.get(mVar);
                    boolean z = i == 1;
                    while (true) {
                        if (i4 != i5) {
                            j = 0;
                            if (!z || m.e.get(mVar) != 0) {
                                int i6 = i4 + 1;
                                iVarC = mVar.c(i4, z);
                                if (iVarC != null) {
                                    break;
                                }
                                i4 = i6;
                            }
                        } else {
                            j = 0;
                        }
                        iVarC = iVar2;
                        break;
                    }
                } else {
                    iVarC = mVar.b();
                    j = 0;
                }
                z zVar = this.B;
                if (iVarC == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.b;
                        i iVar3 = (i) atomicReferenceFieldUpdater.get(mVar);
                        if (iVar3 == null) {
                            j2 = -1;
                        } else {
                            j2 = -1;
                            if (((iVar3.B ? 1 : 2) & i) != 0) {
                                k.f.getClass();
                                m mVar2 = mVar;
                                long jNanoTime = System.nanoTime() - iVar3.A;
                                long j4 = k.b;
                                if (jNanoTime < j4) {
                                    j3 = j4 - jNanoTime;
                                    iVar = null;
                                    break;
                                }
                                iVar = null;
                                if (atomicReferenceFieldUpdater.compareAndSet(mVar2, iVar3, null)) {
                                    zVar.A = iVar3;
                                    j3 = -1;
                                    break;
                                }
                                mVar = mVar2;
                                iVar2 = null;
                            }
                        }
                        j3 = -2;
                        iVar = iVar2;
                        break;
                    }
                } else {
                    zVar.A = iVarC;
                    iVar = iVar2;
                    j3 = -1;
                    j2 = -1;
                }
                if (j3 == j2) {
                    i iVar4 = (i) zVar.A;
                    zVar.A = iVar;
                    return iVar4;
                }
                if (j3 > j) {
                    jMin = Math.min(jMin, j3);
                }
            }
            i3++;
            iVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.E = jMin;
        return null;
    }

    @Override
    public final void run() {
        long j;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (c.J.get(this.H) != 1) {
                    b bVar = this.C;
                    b bVar2 = b.E;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.G);
                    if (iVarA != null) {
                        this.E = 0L;
                        c cVar = this.H;
                        this.D = 0L;
                        if (this.C == b.C) {
                            this.C = b.B;
                        }
                        if (!iVarA.B) {
                            try {
                                iVarA.run();
                                break;
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                                break;
                            }
                        }
                        if (h(b.B) && !cVar.x() && !cVar.v(c.I.get(cVar))) {
                            cVar.x();
                        }
                        try {
                            iVarA.run();
                        } catch (Throwable th2) {
                            Thread threadCurrentThread2 = Thread.currentThread();
                            threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                        }
                        c.I.addAndGet(cVar, -2097152L);
                        if (this.C == bVar2) {
                            break;
                        }
                        this.C = b.D;
                        break;
                    }
                    this.G = false;
                    if (this.E == 0) {
                        Object obj = this.nextParkedWorker;
                        eh.l lVar = c.K;
                        if (obj != lVar) {
                            I.set(this, -1);
                            while (this.nextParkedWorker != c.K) {
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = I;
                                if (atomicIntegerFieldUpdater.get(this) != -1) {
                                    break;
                                }
                                c cVar2 = this.H;
                                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = c.J;
                                if (atomicIntegerFieldUpdater2.get(cVar2) == 1) {
                                    break;
                                }
                                b bVar3 = this.C;
                                b bVar4 = b.E;
                                if (bVar3 == bVar4) {
                                    break;
                                }
                                h(b.C);
                                Thread.interrupted();
                                if (this.D == 0) {
                                    j = 2097151;
                                    this.D = System.nanoTime() + this.H.C;
                                } else {
                                    j = 2097151;
                                }
                                LockSupport.parkNanos(this.H.C);
                                if (System.nanoTime() - this.D >= 0) {
                                    this.D = 0L;
                                    c cVar3 = this.H;
                                    synchronized (cVar3.G) {
                                        try {
                                            if (!(atomicIntegerFieldUpdater2.get(cVar3) == 1)) {
                                                AtomicLongFieldUpdater atomicLongFieldUpdater = c.I;
                                                if (((int) (atomicLongFieldUpdater.get(cVar3) & j)) > cVar3.A) {
                                                    if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i = this.indexInArray;
                                                        f(0);
                                                        cVar3.r(this, i, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar3) & j);
                                                        if (andDecrement != i) {
                                                            Object objB = cVar3.G.b(andDecrement);
                                                            kotlin.jvm.internal.m.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar3.G.c(i, aVar);
                                                            aVar.f(i);
                                                            cVar3.r(aVar, andDecrement, i);
                                                        }
                                                        cVar3.G.c(andDecrement, null);
                                                        this.C = bVar4;
                                                    }
                                                }
                                            }
                                        } catch (Throwable th3) {
                                            throw th3;
                                        }
                                    }
                                }
                            }
                        } else {
                            c cVar4 = this.H;
                            if (this.nextParkedWorker == lVar) {
                                AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.H;
                                while (true) {
                                    long j2 = atomicLongFieldUpdater2.get(cVar4);
                                    int i2 = this.indexInArray;
                                    this.nextParkedWorker = cVar4.G.b((int) (j2 & 2097151));
                                    c cVar5 = cVar4;
                                    if (c.H.compareAndSet(cVar5, j2, ((j2 + 2097152) & (-2097152)) | ((long) i2))) {
                                        break;
                                    } else {
                                        cVar4 = cVar5;
                                    }
                                }
                            }
                        }
                    } else {
                        if (z) {
                            h(b.C);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.E);
                            this.E = 0L;
                            break;
                        }
                        z = true;
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.E);
    }
}
