package kh;

import com.google.android.gms.common.api.internal.m0;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

public final class c0 extends AtomicReference implements Runnable {
    public static final m0 C;
    public static final m0 D;
    public final Callable A;
    public final d0 B;

    static {
        int i10 = 1;
        C = new m0(i10);
        D = new m0(i10);
    }

    public c0(d0 d0Var, Callable callable) {
        this.B = d0Var;
        callable.getClass();
        this.A = callable;
    }

    public final void a(Thread thread) {
        Runnable runnable = (Runnable) get();
        u uVar = null;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            boolean z11 = runnable instanceof u;
            m0 m0Var = D;
            if (!z11 && runnable != m0Var) {
                break;
            }
            if (z11) {
                uVar = (u) runnable;
            }
            i10++;
            if (i10 <= 1000) {
                Thread.yield();
            } else if (runnable == m0Var || compareAndSet(runnable, m0Var)) {
                z10 = Thread.interrupted() || z10;
                LockSupport.park(uVar);
            }
            runnable = (Runnable) get();
        }
        if (z10) {
            thread.interrupt();
        }
    }

    @Override
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objCall = null;
        if (compareAndSet(null, threadCurrentThread)) {
            d0 d0Var = this.B;
            boolean zIsDone = d0Var.isDone();
            m0 m0Var = C;
            if (!zIsDone) {
                try {
                    objCall = this.A.call();
                } catch (Throwable th2) {
                    try {
                        if (th2 instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, m0Var)) {
                            a(threadCurrentThread);
                        }
                        if (zIsDone) {
                            return;
                        }
                        d0Var.m(th2);
                        return;
                    } catch (Throwable th3) {
                        if (!compareAndSet(threadCurrentThread, m0Var)) {
                            a(threadCurrentThread);
                        }
                        if (!zIsDone) {
                            d0Var.l(null);
                        }
                        throw th3;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, m0Var)) {
                a(threadCurrentThread);
            }
            if (zIsDone) {
                return;
            }
            d0Var.l(objCall);
        }
    }

    @Override
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == C) {
            str = "running=[DONE]";
        } else if (runnable instanceof u) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + this.A.toString();
    }
}
