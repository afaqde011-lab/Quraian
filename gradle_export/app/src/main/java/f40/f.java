package f40;

import a40.e0;
import a40.h0;
import a40.o0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.DispatchException;

public final class f extends a40.v implements h0 {
    public static final AtomicIntegerFieldUpdater H = AtomicIntegerFieldUpdater.newUpdater(f.class, "runningWorkers$volatile");
    public final h0 C;
    public final a40.v D;
    public final int E;
    public final j F;
    public final Object G;
    private volatile int runningWorkers$volatile;

    public f(a40.v vVar, int i) {
        h0 h0Var = vVar instanceof h0 ? (h0) vVar : null;
        this.C = h0Var == null ? e0.a : h0Var;
        this.D = vVar;
        this.E = i;
        this.F = new j();
        this.G = new Object();
    }

    @Override
    public final void A(long j, a40.k kVar) {
        this.C.A(j, kVar);
    }

    @Override
    public final o0 S(long j, Runnable runnable, k00.i iVar) {
        return this.C.S(j, runnable, iVar);
    }

    @Override
    public final void n0(k00.i iVar, Runnable runnable) throws DispatchException {
        Runnable runnableR0;
        this.F.a(runnable);
        if (H.get(this) >= this.E || !s0() || (runnableR0 = r0()) == null) {
            return;
        }
        a.i(this.D, this, new kh.r(7, this, runnableR0, false));
    }

    @Override
    public final void o0(k00.i iVar, Runnable runnable) {
        Runnable runnableR0;
        this.F.a(runnable);
        if (H.get(this) >= this.E || !s0() || (runnableR0 = r0()) == null) {
            return;
        }
        this.D.o0(this, new kh.r(7, this, runnableR0, false));
    }

    @Override
    public final a40.v q0(int i) {
        a.a(1);
        return 1 >= this.E ? this : super.q0(1);
    }

    public final Runnable r0() {
        while (true) {
            Runnable runnable = (Runnable) this.F.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.G) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = H;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.F.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean s0() {
        synchronized (this.G) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = H;
            if (atomicIntegerFieldUpdater.get(this) >= this.E) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.D);
        sb.append(".limitedParallelism(");
        return oi.k.l(sb, this.E, ')');
    }
}
