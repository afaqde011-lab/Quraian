package z;

import c3.d2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/j1;", "Lb3/e1;", "Lz/k1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class j1 extends b3.e1 {
    public final h1 B;

    public j1(h1 h1Var) {
        this.B = h1Var;
    }

    @Override
    public final b2.q d() {
        h1 h1Var = this.B;
        b3.k kVarC = h1Var != null ? h1Var.c() : null;
        k1 k1Var = new k1();
        k1Var.Q = kVarC;
        return k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j1) {
            return kotlin.jvm.internal.m.a(this.B, ((j1) obj).B);
        }
        return false;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "overscroll";
        d2Var.f2646c.c(this.B, "overscrollEffect");
    }

    public final int hashCode() {
        h1 h1Var = this.B;
        if (h1Var != null) {
            return h1Var.hashCode();
        }
        return 0;
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        k1 k1Var = (k1) qVar;
        b3.k kVar = null;
        h1 h1Var = this.B;
        b3.k kVarC = h1Var != null ? h1Var.c() : null;
        b3.k kVar2 = k1Var.Q;
        if (kVar2 != null) {
            k1Var.C1(kVar2);
        }
        k1Var.Q = kVarC;
        if (kVarC != null && !((b2.q) kVarC).A.N) {
            k1Var.B1(kVarC);
            kVar = kVarC;
        }
        k1Var.Q = kVar;
    }
}
