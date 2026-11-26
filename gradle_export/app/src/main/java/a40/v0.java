package a40;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

public abstract class v0 extends w0 implements h0 {
    public static final AtomicReferenceFieldUpdater G = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_queue$volatile");
    public static final AtomicReferenceFieldUpdater H = AtomicReferenceFieldUpdater.newUpdater(v0.class, Object.class, "_delayed$volatile");
    public static final AtomicIntegerFieldUpdater I = AtomicIntegerFieldUpdater.newUpdater(v0.class, "_isCompleted$volatile");
    private volatile Object _delayed$volatile;
    private volatile int _isCompleted$volatile;
    private volatile Object _queue$volatile;

    @Override
    public final void A(long j, k kVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            r0 r0Var = new r0(this, j2 + jNanoTime, kVar);
            C0(jNanoTime, r0Var);
            kVar.v(new h(r0Var, 2));
        }
    }

    public final boolean A0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (I.get(this) == 1) {
                return false;
            }
            if (obj == null) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof f40.l) {
                f40.l lVar = (f40.l) obj;
                int iA = lVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA == 1) {
                    atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar.c());
                } else if (iA == 2) {
                    return false;
                }
            } else {
                if (obj == c0.c) {
                    return false;
                }
                f40.l lVar2 = new f40.l(8, true);
                lVar2.a((Runnable) obj);
                lVar2.a(runnable);
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar2)) {
                    return true;
                }
            }
        }
    }

    public final boolean B0() {
        Object obj;
        long j;
        h00.m mVar = this.E;
        if (mVar != null ? mVar.isEmpty() : true) {
            u0 u0Var = (u0) H.get(this);
            if (u0Var == null) {
                obj = G.get(this);
                if (obj != null) {
                    if (obj instanceof f40.l) {
                        j = f40.l.f.get((f40.l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == c0.c) {
                    }
                }
                return true;
            }
            if (f40.v.b.get(u0Var) == 0) {
                obj = G.get(this);
                if (obj != null) {
                    if (obj instanceof f40.l) {
                        j = f40.l.f.get((f40.l) obj);
                        if (((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == c0.c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void C0(long j, t0 t0Var) {
        int iA;
        Thread threadT0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = H;
        t0 t0Var2 = null;
        if (I.get(this) == 1) {
            iA = 1;
        } else {
            u0 u0Var = (u0) atomicReferenceFieldUpdater.get(this);
            if (u0Var == null) {
                u0 u0Var2 = new u0();
                u0Var2.c = j;
                atomicReferenceFieldUpdater.compareAndSet(this, null, u0Var2);
                Object obj = atomicReferenceFieldUpdater.get(this);
                kotlin.jvm.internal.m.b(obj);
                u0Var = (u0) obj;
            }
            iA = t0Var.a(j, u0Var, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                x0(j, t0Var);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        u0 u0Var3 = (u0) atomicReferenceFieldUpdater.get(this);
        if (u0Var3 != null) {
            synchronized (u0Var3) {
                t0[] t0VarArr = u0Var3.a;
                t0Var2 = t0VarArr != null ? t0VarArr[0] : null;
            }
        }
        if (t0Var2 != t0Var || Thread.currentThread() == (threadT0 = t0())) {
            return;
        }
        LockSupport.unpark(threadT0);
    }

    public o0 S(long j, Runnable runnable, k00.i iVar) {
        return e0.a.S(j, runnable, iVar);
    }

    @Override
    public final void n0(k00.i iVar, Runnable runnable) {
        y0(runnable);
    }

    @Override
    public void shutdown() {
        t0 t0VarB;
        x1.a.set(null);
        I.set(this, 1);
        eh.l lVar = c0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
                    break;
                }
            } else if (obj instanceof f40.l) {
                ((f40.l) obj).b();
                break;
            } else {
                if (obj == lVar) {
                    break;
                }
                f40.l lVar2 = new f40.l(8, true);
                lVar2.a((Runnable) obj);
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar2)) {
                    break;
                }
            }
        }
        while (v0() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            u0 u0Var = (u0) H.get(this);
            if (u0Var == null) {
                return;
            }
            synchronized (u0Var) {
                t0VarB = f40.v.b.get(u0Var) > 0 ? u0Var.b(0) : null;
            }
            if (t0VarB == null) {
                return;
            } else {
                x0(jNanoTime, t0VarB);
            }
        }
    }

    @Override
    public final long v0() {
        Runnable runnable;
        t0 t0Var;
        eh.l lVar = c0.c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = G;
        if (!w0()) {
            z0();
            while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof f40.l) {
                        f40.l lVar2 = (f40.l) obj;
                        Object objD = lVar2.d();
                        if (objD != f40.l.g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar2.c());
                    } else if (obj != lVar) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                            runnable = (Runnable) obj;
                            break;
                        }
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            h00.m mVar = this.E;
            if (((mVar == null || mVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof f40.l) {
                        long j = f40.l.f.get((f40.l) obj2);
                        if (((int) (1073741823 & j)) != ((int) ((j & 1152921503533105152L) >> 30))) {
                            return 0L;
                        }
                    } else if (obj2 == lVar) {
                        return Long.MAX_VALUE;
                    }
                }
                u0 u0Var = (u0) H.get(this);
                if (u0Var != null) {
                    synchronized (u0Var) {
                        t0[] t0VarArr = u0Var.a;
                        t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    }
                    if (t0Var != null) {
                        long jNanoTime = t0Var.A - System.nanoTime();
                        if (jNanoTime >= 0) {
                            return jNanoTime;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void y0(Runnable runnable) {
        z0();
        if (!A0(runnable)) {
            d0.J.y0(runnable);
            return;
        }
        Thread threadT0 = t0();
        if (Thread.currentThread() != threadT0) {
            LockSupport.unpark(threadT0);
        }
    }

    public final void z0() {
        t0 t0VarB;
        u0 u0Var = (u0) H.get(this);
        if (u0Var == null || f40.v.b.get(u0Var) == 0) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            synchronized (u0Var) {
                try {
                    t0[] t0VarArr = u0Var.a;
                    t0VarB = null;
                    t0 t0Var = t0VarArr != null ? t0VarArr[0] : null;
                    if (t0Var != null) {
                        t0VarB = ((jNanoTime - t0Var.A) > 0L ? 1 : ((jNanoTime - t0Var.A) == 0L ? 0 : -1)) >= 0 ? A0(t0Var) : false ? u0Var.b(0) : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (t0VarB != null);
    }
}
