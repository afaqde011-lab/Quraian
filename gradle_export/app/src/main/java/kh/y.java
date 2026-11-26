package kh;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class y extends fh.w implements ScheduledFuture, v, Future {
    public final l B;
    public final ScheduledFuture C;

    public y(l lVar, ScheduledFuture scheduledFuture) {
        this.B = lVar;
        this.C = scheduledFuture;
    }

    public final boolean B(boolean z10) {
        return this.B.cancel(z10);
    }

    @Override
    public final void a(Runnable runnable, Executor executor) {
        this.B.a(runnable, executor);
    }

    @Override
    public final boolean cancel(boolean z10) {
        boolean zB = B(z10);
        if (zB) {
            this.C.cancel(z10);
        }
        return zB;
    }

    @Override
    public final int compareTo(Delayed delayed) {
        return this.C.compareTo(delayed);
    }

    @Override
    public final Object get() {
        return this.B.get();
    }

    @Override
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.B.get(j9, timeUnit);
    }

    @Override
    public final long getDelay(TimeUnit timeUnit) {
        return this.C.getDelay(timeUnit);
    }

    @Override
    public final Object i() {
        return this.B;
    }

    @Override
    public final boolean isCancelled() {
        return this.B.isCancelled();
    }

    @Override
    public final boolean isDone() {
        return this.B.isDone();
    }
}
