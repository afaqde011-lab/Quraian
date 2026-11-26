package a40;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

public final class d0 extends v0 implements Runnable {
    public static final d0 J;
    public static final long K;
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    static {
        Long l;
        d0 d0Var = new d0();
        J = d0Var;
        d0Var.u0(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        K = timeUnit.toNanos(l.longValue());
    }

    public final synchronized void D0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            v0.G.set(this, null);
            v0.H.set(this, null);
            notifyAll();
        }
    }

    @Override
    public final o0 S(long j, Runnable runnable, k00.i iVar) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return r1.A;
        }
        long jNanoTime = System.nanoTime();
        s0 s0Var = new s0(runnable, j2 + jNanoTime);
        C0(jNanoTime, s0Var);
        return s0Var;
    }

    @Override
    public final void run() {
        x1.a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    D0();
                    if (B0()) {
                        return;
                    }
                    t0();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jV0 = v0();
                    if (jV0 == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = K + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            D0();
                            if (B0()) {
                                return;
                            }
                            t0();
                            return;
                        }
                        if (jV0 > j2) {
                            jV0 = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jV0 > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            D0();
                            if (B0()) {
                                return;
                            }
                            t0();
                            return;
                        }
                        LockSupport.parkNanos(this, jV0);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            D0();
            if (!B0()) {
                t0();
            }
            throw th;
        }
    }

    @Override
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }

    @Override
    public final Thread t0() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setContextClassLoader(J.getClass().getClassLoader());
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override
    public final String toString() {
        return "DefaultExecutor";
    }

    @Override
    public final void x0(long j, t0 t0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override
    public final void y0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.y0(runnable);
    }
}
