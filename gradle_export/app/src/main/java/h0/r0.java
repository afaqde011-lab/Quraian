package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/r0;", "Lb3/e1;", "Lh0/s0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r0 extends b3.e1 {
    public final l2 B;

    public r0(l2 l2Var) {
        this.B = l2Var;
    }

    @Override
    public final b2.q d() {
        return new s0(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return kotlin.jvm.internal.m.a(((r0) obj).B, this.B);
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
        s0 s0Var = (s0) qVar;
        l2 l2Var = s0Var.Q;
        l2 l2Var2 = this.B;
        if (kotlin.jvm.internal.m.a(l2Var2, l2Var)) {
            return;
        }
        s0Var.Q = l2Var2;
        s0Var.C1();
    }
}
