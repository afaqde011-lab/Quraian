package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/v0;", "Lb3/e1;", "Lh0/w0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v0 extends b3.e1 {
    @Override
    public final b2.q d() {
        x0 x0Var = x0.A;
        w0 w0Var = new w0(0);
        w0Var.P = x0Var;
        w0Var.Q = true;
        return w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof v0 ? (v0) obj : null) == null) {
            return false;
        }
        x0 x0Var = x0.A;
        return true;
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (x0.A.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        w0 w0Var = (w0) qVar;
        w0Var.P = x0.A;
        w0Var.Q = true;
    }
}
