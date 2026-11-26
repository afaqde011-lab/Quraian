package tf;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public final class e1 extends o1 {
    public static final AtomicLong L = new AtomicLong(Long.MIN_VALUE);
    public d1 D;
    public d1 E;
    public final PriorityBlockingQueue F;
    public final LinkedBlockingQueue G;
    public final b1 H;
    public final b1 I;
    public final Object J;
    public final Semaphore K;

    public e1(h1 h1Var) {
        super(h1Var);
        this.J = new Object();
        this.K = new Semaphore(2);
        this.F = new PriorityBlockingQueue();
        this.G = new LinkedBlockingQueue();
        this.H = new b1(this, "Thread death: Uncaught exception on worker thread");
        this.I = new b1(this, "Thread death: Uncaught exception on network thread");
    }

    @Override
    public final void V0() {
        if (Thread.currentThread() != this.D) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override
    public final boolean W0() {
        return false;
    }

    public final void Z0() {
        if (Thread.currentThread() != this.E) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final void a1() {
        if (Thread.currentThread() == this.D) {
            throw new IllegalStateException("Call not expected from worker thread");
        }
    }

    public final boolean b1() {
        return Thread.currentThread() == this.D;
    }

    public final c1 c1(Callable callable) {
        X0();
        c1 c1Var = new c1(this, callable, false);
        if (Thread.currentThread() != this.D) {
            i1(c1Var);
            return c1Var;
        }
        if (!this.F.isEmpty()) {
            q0 q0Var = ((h1) this.B).F;
            h1.g(q0Var);
            q0Var.J.b("Callable skipped the worker queue.");
        }
        c1Var.run();
        return c1Var;
    }

    public final c1 d1(Callable callable) {
        X0();
        c1 c1Var = new c1(this, callable, true);
        if (Thread.currentThread() == this.D) {
            c1Var.run();
            return c1Var;
        }
        i1(c1Var);
        return c1Var;
    }

    public final void e1(Runnable runnable) {
        X0();
        com.google.android.gms.common.internal.d0.h(runnable);
        i1(new c1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object f1(AtomicReference atomicReference, long j9, String str, Runnable runnable) {
        synchronized (atomicReference) {
            e1 e1Var = ((h1) this.B).G;
            h1.g(e1Var);
            e1Var.e1(runnable);
            try {
                atomicReference.wait(j9);
            } catch (InterruptedException unused) {
                q0 q0Var = ((h1) this.B).F;
                h1.g(q0Var);
                b50.b bVar = q0Var.J;
                StringBuilder sb2 = new StringBuilder(str.length() + 24);
                sb2.append("Interrupted waiting for ");
                sb2.append(str);
                bVar.b(sb2.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            q0 q0Var2 = ((h1) this.B).F;
            h1.g(q0Var2);
            q0Var2.J.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void g1(Runnable runnable) {
        X0();
        i1(new c1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void h1(Runnable runnable) {
        X0();
        c1 c1Var = new c1(this, runnable, false, "Task exception on network thread");
        synchronized (this.J) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.G;
                linkedBlockingQueue.add(c1Var);
                d1 d1Var = this.E;
                if (d1Var == null) {
                    d1 d1Var2 = new d1(this, "Measurement Network", linkedBlockingQueue);
                    this.E = d1Var2;
                    d1Var2.setUncaughtExceptionHandler(this.I);
                    this.E.start();
                } else {
                    Object obj = d1Var.A;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i1(c1 c1Var) {
        synchronized (this.J) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.F;
                priorityBlockingQueue.add(c1Var);
                d1 d1Var = this.D;
                if (d1Var == null) {
                    d1 d1Var2 = new d1(this, "Measurement Worker", priorityBlockingQueue);
                    this.D = d1Var2;
                    d1Var2.setUncaughtExceptionHandler(this.H);
                    this.D.start();
                } else {
                    Object obj = d1Var.A;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
