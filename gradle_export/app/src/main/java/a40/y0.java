package a40;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class y0 extends x0 implements h0 {
    public final Executor C;

    public y0(Executor executor) {
        this.C = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override
    public final void A(long j, k kVar) {
        Executor executor = this.C;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            com.google.android.gms.internal.play_billing.r0 r0Var = new com.google.android.gms.internal.play_billing.r0(this, kVar, 1);
            k00.i iVar = kVar.E;
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule((Runnable) r0Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                c0.j(iVar, c0.a("The task was rejected", e));
            }
        }
        if (scheduledFutureSchedule != null) {
            kVar.v(new h(scheduledFutureSchedule, 0));
        } else {
            d0.J.A(j, kVar);
        }
    }

    @Override
    public final o0 S(long j, Runnable runnable, k00.i iVar) {
        Executor executor = this.C;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                c0.j(iVar, c0.a("The task was rejected", e));
            }
        }
        return scheduledFutureSchedule != null ? new n0(scheduledFutureSchedule) : d0.J.S(j, runnable, iVar);
    }

    @Override
    public final void close() {
        Executor executor = this.C;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y0) && ((y0) obj).C == this.C;
    }

    public final int hashCode() {
        return System.identityHashCode(this.C);
    }

    @Override
    public final void n0(k00.i iVar, Runnable runnable) {
        try {
            this.C.execute(runnable);
        } catch (RejectedExecutionException e) {
            c0.j(iVar, c0.a("The task was rejected", e));
            h40.e eVar = m0.a;
            h40.d.C.n0(iVar, runnable);
        }
    }

    @Override
    public final String toString() {
        return this.C.toString();
    }
}
