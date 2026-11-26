package k9;

import java.util.List;
import java.util.Objects;

public final class x3 extends androidx.media3.common.k2 {

    public static final x3 f9542c;

    public static final Object f9543d;

    public final fh.t0 f9544a;

    public final w3 f9545b;

    static {
        fh.r0 r0Var = fh.t0.B;
        f9542c = new x3(fh.d2.E, null);
        f9543d = new Object();
    }

    public x3(fh.t0 t0Var, w3 w3Var) {
        this.f9544a = t0Var;
        this.f9545b = w3Var;
    }

    public final x3 a(int i10, List list) {
        fh.q0 q0Var = new fh.q0(4);
        fh.t0 t0Var = this.f9544a;
        q0Var.e(t0Var.subList(0, i10));
        for (int i11 = 0; i11 < list.size(); i11++) {
            q0Var.c(new w3((androidx.media3.common.q0) list.get(i11), -1L, -9223372036854775807L));
        }
        q0Var.e(t0Var.subList(i10, t0Var.size()));
        return new x3(q0Var.g(), this.f9545b);
    }

    public final long b(int i10) {
        if (i10 < 0) {
            return -1L;
        }
        fh.t0 t0Var = this.f9544a;
        if (i10 < t0Var.size()) {
            return ((w3) t0Var.get(i10)).f9540b;
        }
        return -1L;
    }

    public final w3 c(int i10) {
        w3 w3Var;
        fh.t0 t0Var = this.f9544a;
        return (i10 != t0Var.size() || (w3Var = this.f9545b) == null) ? (w3) t0Var.get(i10) : w3Var;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3)) {
            return false;
        }
        x3 x3Var = (x3) obj;
        return Objects.equals(this.f9544a, x3Var.f9544a) && Objects.equals(this.f9545b, x3Var.f9545b);
    }

    @Override
    public final int getIndexOfPeriod(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final androidx.media3.common.h2 getPeriod(int i10, androidx.media3.common.h2 h2Var, boolean z10) {
        w3 w3VarC = c(i10);
        h2Var.i(Long.valueOf(w3VarC.f9540b), null, i10, e7.i0.H(w3VarC.f9541c), 0L);
        return h2Var;
    }

    @Override
    public final int getPeriodCount() {
        return getWindowCount();
    }

    @Override
    public final Object getUidOfPeriod(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final androidx.media3.common.j2 getWindow(int i10, androidx.media3.common.j2 j2Var, long j9) {
        w3 w3VarC = c(i10);
        j2Var.b(f9543d, w3VarC.f9539a, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, true, false, null, 0L, e7.i0.H(w3VarC.f9541c), i10, i10, 0L);
        return j2Var;
    }

    @Override
    public final int getWindowCount() {
        return this.f9544a.size() + (this.f9545b == null ? 0 : 1);
    }

    @Override
    public final int hashCode() {
        return Objects.hash(this.f9544a, this.f9545b);
    }
}
