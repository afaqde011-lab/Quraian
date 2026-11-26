package q0;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lq0/c2;", "Lb3/e1;", "Lq0/d2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c2 extends b3.e1 {
    public final m3.r0 B;

    public c2(m3.r0 r0Var) {
        this.B = r0Var;
    }

    @Override
    public final b2.q d() {
        return new d2(this.B);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c2)) {
            return false;
        }
        return kotlin.jvm.internal.m.a(this.B, ((c2) obj).B);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "textFieldMinSize";
        d2Var.f2646c.c(this.B, "style");
    }

    public final int hashCode() {
        return this.B.hashCode();
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        d2 d2Var = (d2) qVar;
        d2Var.getClass();
        m3.r0 r0VarJ = m3.h0.j(this.B, b3.m.y(d2Var).f2053a0);
        d2Var.B1(r0VarJ, (q3.h) b3.m.h(d2Var, c3.o1.f2737k));
        jk.l lVar = d2Var.Q;
        if (lVar == null) {
            throw g4.c.o("Min size state is not set.");
        }
        jk.l.a(lVar, null, null, r0VarJ, 23);
        b3.m.n(d2Var);
    }
}
