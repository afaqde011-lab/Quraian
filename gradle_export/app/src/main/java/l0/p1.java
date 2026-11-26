package l0;

import c3.d2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll0/p1;", "Lb3/e1;", "Ll0/q1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p1 extends b3.e1 {
    public final v0 B;

    public p1(v0 v0Var) {
        this.B = v0Var;
    }

    @Override
    public final b2.q d() {
        q1 q1Var = new q1();
        q1Var.O = this.B;
        return q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p1) && kotlin.jvm.internal.m.a(this.B, ((p1) obj).B);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "traversablePrefetchState";
        d2Var.f2645b = this.B;
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        ((q1) qVar).O = this.B;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.B + ')';
    }
}
