package k50;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public final class r extends k0 {
    public k0 e;

    public r(k0 delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.e = delegate;
    }

    @Override
    public final k0 a() {
        return this.e.a();
    }

    @Override
    public final k0 b() {
        return this.e.b();
    }

    @Override
    public final long c() {
        return this.e.c();
    }

    @Override
    public final k0 d(long j) {
        return this.e.d(j);
    }

    @Override
    public final boolean e() {
        return this.e.e();
    }

    @Override
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override
    public final k0 g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.m.e(unit, "unit");
        return this.e.g(j);
    }
}
