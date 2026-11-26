package ji;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class f implements ScheduledExecutorService, AutoCloseable {
    public final ExecutorService A;
    public final ScheduledExecutorService B;

    public f(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.A = executorService;
        this.B = scheduledExecutorService;
    }

    @Override
    public final boolean awaitTermination(long j9, TimeUnit timeUnit) {
        return this.A.awaitTermination(j9, timeUnit);
    }

    @Override
    public final void close() {
        if (this == ForkJoinPool.commonPool() || isTerminated()) {
            return;
        }
        shutdown();
        throw null;
    }

    @Override
    public final void execute(Runnable runnable) {
        this.A.execute(runnable);
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.A.invokeAll(collection);
    }

    @Override
    public final List invokeAll(Collection collection, long j9, TimeUnit timeUnit) {
        return this.A.invokeAll(collection, j9, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.A.invokeAny(collection);
    }

    @Override
    public final Object invokeAny(Collection collection, long j9, TimeUnit timeUnit) {
        return this.A.invokeAny(collection, j9, timeUnit);
    }

    @Override
    public final boolean isShutdown() {
        return this.A.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.A.isTerminated();
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j9, TimeUnit timeUnit) {
        return new h(new de.f(this, runnable, j9, timeUnit, 1));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j9, TimeUnit timeUnit) {
        return new h(new de.f(this, callable, j9, timeUnit, 2));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        return new h(new d(this, runnable, j9, j10, timeUnit, 0));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        return new h(new d(this, runnable, j9, j10, timeUnit, 1));
    }

    @Override
    public final void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.A.submit(runnable);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.A.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return this.A.submit(callable);
    }
}
