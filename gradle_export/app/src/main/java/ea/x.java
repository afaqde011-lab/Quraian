package ea;

import a10.h0;
import com.google.android.gms.internal.measurement.y3;

public final class x implements ma.c {
    public final ma.c A;
    public final long B;
    public final d0 C;

    public x(d0 d0Var, ma.c cVar) {
        kotlin.jvm.internal.m.e(cVar, "delegate");
        this.C = d0Var;
        this.A = cVar;
        this.B = y3.y();
    }

    @Override
    public final String R(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.R(i10);
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final void close() throws Exception {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.close();
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final void d(int i10, long j9) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.d(i10, j9);
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final boolean d0() {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.d0();
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.e(i10, bArr);
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final void f(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.f(i10);
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final byte[] getBlob(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.getBlob(i10);
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final int getColumnCount() {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.getColumnCount();
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final String getColumnName(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.getColumnName(i10);
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final long getLong(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.getLong(i10);
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final void h() {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.h();
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final boolean isNull(int i10) {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            return this.A.isNull(i10);
        }
        h0.M(21, "Attempted to use statement on a different thread");
        throw null;
    }

    @Override
    public final void reset() {
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.reset();
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    @Override
    public final void y(int i10, String str) {
        kotlin.jvm.internal.m.e(str, "value");
        if (this.C.f5219e) {
            h0.M(21, "Statement is recycled");
            throw null;
        }
        if (this.B == y3.y()) {
            this.A.y(i10, str);
        } else {
            h0.M(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }
}
