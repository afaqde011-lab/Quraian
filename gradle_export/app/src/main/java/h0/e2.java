package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/e2;", "Lb3/e1;", "Lh0/f2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e2 extends b3.e1 {
    public final c0 B;

    public e2(c0 c0Var) {
        this.B = c0Var;
    }

    @Override
    public final b2.q d() {
        f2 f2Var = new f2();
        f2Var.Q = this.B;
        return f2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e2) {
            return ((e2) obj).B.equals(this.B);
        }
        return false;
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        f2 f2Var = (f2) qVar;
        c0 c0Var = f2Var.Q;
        c0 c0Var2 = this.B;
        if (c0Var2.equals(c0Var)) {
            return;
        }
        f2Var.Q = c0Var2;
        f2Var.C1();
    }
}
