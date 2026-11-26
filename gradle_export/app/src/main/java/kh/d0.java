package kh;

import com.google.android.gms.common.api.internal.m0;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.locks.LockSupport;

public final class d0 extends l implements RunnableFuture, g {
    public volatile c0 H;

    public d0(Callable callable) {
        this.H = new c0(this, callable);
    }

    @Override
    public final void d() {
        c0 c0Var;
        Object obj = this.A;
        if ((obj instanceof a) && ((a) obj).f9661a && (c0Var = this.H) != null) {
            m0 m0Var = c0.D;
            m0 m0Var2 = c0.C;
            Runnable runnable = (Runnable) c0Var.get();
            if (runnable instanceof Thread) {
                u uVar = new u(c0Var);
                u.a(uVar, Thread.currentThread());
                if (c0Var.compareAndSet(runnable, uVar)) {
                    try {
                        ((Thread) runnable).interrupt();
                        if (((Runnable) c0Var.getAndSet(m0Var2)) == m0Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                    } catch (Throwable th2) {
                        if (((Runnable) c0Var.getAndSet(m0Var2)) == m0Var) {
                            LockSupport.unpark((Thread) runnable);
                        }
                        throw th2;
                    }
                }
            }
        }
        this.H = null;
    }

    @Override
    public final boolean isCancelled() {
        return this.A instanceof a;
    }

    @Override
    public final String j() {
        c0 c0Var = this.H;
        if (c0Var == null) {
            return super.j();
        }
        return "task=[" + c0Var + "]";
    }

    @Override
    public final void run() {
        c0 c0Var = this.H;
        if (c0Var != null) {
            c0Var.run();
        }
        this.H = null;
    }
}
