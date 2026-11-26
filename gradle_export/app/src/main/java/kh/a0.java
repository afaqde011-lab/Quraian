package kh;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class a0 extends x implements ScheduledExecutorService {
    public final ScheduledExecutorService B;

    public a0(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        this.B = scheduledExecutorService;
    }

    @Override
    public final ScheduledFuture schedule(Runnable runnable, long j9, TimeUnit timeUnit) {
        d0 d0Var = new d0(Executors.callable(runnable, null));
        return new y(d0Var, this.B.schedule(d0Var, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture schedule(Callable callable, long j9, TimeUnit timeUnit) {
        d0 d0Var = new d0(callable);
        return new y(d0Var, this.B.schedule(d0Var, j9, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        z zVar = new z(runnable);
        return new y(zVar, this.B.scheduleAtFixedRate(zVar, j9, j10, timeUnit));
    }

    @Override
    public final ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j9, long j10, TimeUnit timeUnit) {
        z zVar = new z(runnable);
        return new y(zVar, this.B.scheduleWithFixedDelay(zVar, j9, j10, timeUnit));
    }
}
