package w;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw/y1;", "Lb3/e1;", "Lw/z1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y1 extends b3.e1 {
    public final u1 B;

    public y1(u1 u1Var) {
        this.B = u1Var;
    }

    @Override
    public final b2.q d() {
        z1 z1Var = new z1();
        z1Var.O = this.B;
        return z1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1) && kotlin.jvm.internal.m.a(this.B, ((y1) obj).B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "SharedTransitionScopeRootModifier";
        d2Var.f2646c.c(this.B, "sharedTransitionScope");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) {
        z1 z1Var = (z1) qVar;
        u1 u1Var = z1Var.O;
        u1 u1Var2 = this.B;
        if (!kotlin.jvm.internal.m.a(u1Var2, u1Var)) {
            b3.m.t(z1Var, u1Var2.D);
        }
        z1Var.O = u1Var2;
    }

    public final String toString() {
        return "SharedTransitionScopeRootModifierElement(sharedTransitionScope=" + this.B + ')';
    }
}
