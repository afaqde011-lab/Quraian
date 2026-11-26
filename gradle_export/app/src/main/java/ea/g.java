package ea;

public final class g implements ma.c {
    public final ma.c A;

    public g(ma.c cVar) {
        this.A = cVar;
    }

    @Override
    public final boolean C() {
        return this.A.C();
    }

    @Override
    public final String R(int i10) {
        return this.A.R(i10);
    }

    @Override
    public final void close() {
        ma.c cVar = this.A;
        cVar.reset();
        cVar.h();
    }

    @Override
    public final void d(int i10, long j9) {
        this.A.d(i10, j9);
    }

    @Override
    public final boolean d0() {
        return this.A.d0();
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        this.A.e(i10, bArr);
    }

    @Override
    public final void f(int i10) {
        this.A.f(i10);
    }

    @Override
    public final byte[] getBlob(int i10) {
        return this.A.getBlob(i10);
    }

    @Override
    public final int getColumnCount() {
        return this.A.getColumnCount();
    }

    @Override
    public final String getColumnName(int i10) {
        return this.A.getColumnName(i10);
    }

    @Override
    public final long getLong(int i10) {
        return this.A.getLong(i10);
    }

    @Override
    public final void h() {
        this.A.h();
    }

    @Override
    public final boolean isNull(int i10) {
        return this.A.isNull(i10);
    }

    @Override
    public final void reset() {
        this.A.reset();
    }

    @Override
    public final void y(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "value");
        this.A.y(i10, str);
    }
}
