package k50;

public abstract class p implements g0 {
    public final g0 A;

    public p(g0 delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.A = delegate;
    }

    @Override
    public final k0 c() {
        return this.A.c();
    }

    @Override
    public void c0(i iVar, long j) {
        this.A.c0(iVar, j);
    }

    @Override
    public void close() {
        this.A.close();
    }

    @Override
    public void flush() {
        this.A.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.A + ')';
    }
}
