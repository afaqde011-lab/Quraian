package k50;

import java.io.IOException;

public abstract class q implements i0 {
    public final i0 A;

    public q(i0 delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.A = delegate;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public void close() throws IOException {
        this.A.close();
    }

    @Override
    public long s(i sink, long j) {
        kotlin.jvm.internal.m.e(sink, "sink");
        return this.A.s(sink, j);
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
