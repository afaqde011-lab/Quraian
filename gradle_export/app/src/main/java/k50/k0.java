package k50;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class k0 {
    public static final j0 d = new j0();
    public boolean a;
    public long b;
    public long c;

    public k0 a() {
        this.a = false;
        return this;
    }

    public k0 b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public k0 d(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public boolean e() {
        return this.a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public k0 g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        if (j < 0) {
            throw new IllegalArgumentException(w.c.i(j, "timeout < 0: ").toString());
        }
        this.c = unit.toNanos(j);
        return this;
    }
}
