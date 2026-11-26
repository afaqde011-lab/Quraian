package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/o1;", "Lb3/e1;", "Lh0/q1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class o1 extends b3.e1 {
    public final n1 B;
    public final a1.e1 C;

    public o1(n1 n1Var, a1.e1 e1Var) {
        this.B = n1Var;
        this.C = e1Var;
    }

    @Override
    public final b2.q d() {
        q1 q1Var = new q1();
        q1Var.O = this.B;
        return q1Var;
    }

    public final boolean equals(Object obj) {
        o1 o1Var = obj instanceof o1 ? (o1) obj : null;
        if (o1Var == null) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.B, o1Var.B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        this.C.invoke(d2Var);
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((q1) qVar).O = this.B;
    }
}
