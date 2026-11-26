package kh;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

public class x extends AbstractExecutorService implements w, AutoCloseable {
    public final ExecutorService A;

    public x(ExecutorService executorService) {
        executorService.getClass();
        this.A = executorService;
    }

    public final v a(Callable callable) {
        return (v) super.submit(callable);
    }

    @Override
    public final boolean awaitTermination(long j9, TimeUnit timeUnit) {
        return this.A.awaitTermination(j9, timeUnit);
    }

    @Override
    public final void close() {
        boolean zIsTerminated;
        if (this == ForkJoinPool.commonPool() || (zIsTerminated = isTerminated())) {
            return;
        }
        shutdown();
        boolean z10 = false;
        while (!zIsTerminated) {
            try {
                zIsTerminated = awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z10) {
                    shutdownNow();
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public final void execute(Runnable runnable) {
        this.A.execute(runnable);
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
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new d0(Executors.callable(runnable, obj));
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new d0(callable);
    }

    @Override
    public final void shutdown() {
        this.A.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.A.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return (v) super.submit(runnable);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (v) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (v) super.submit(callable);
    }

    public final String toString() {
        return super.toString() + "[" + this.A + "]";
    }
}
