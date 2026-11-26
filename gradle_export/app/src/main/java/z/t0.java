package z;

import c3.d2;
import c3.y2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/t0;", "Lb3/e1;", "Lz/u0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class t0 extends b3.e1 {
    public final f0.i B;
    public final v0 C;

    public t0(f0.i iVar, v0 v0Var) {
        this.B = iVar;
        this.C = v0Var;
    }

    @Override
    public final b2.q d() {
        b3.k kVarA = this.C.a(this.B);
        u0 u0Var = new u0();
        u0Var.Q = kVarA;
        u0Var.B1(kVarA);
        return u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return kotlin.jvm.internal.m.a(this.B, t0Var.B) && kotlin.jvm.internal.m.a(this.C, t0Var.C);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "indication";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "interactionSource");
        y2Var.c(this.C, "indication");
    }

    public final int hashCode() {
        return this.C.hashCode() + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        u0 u0Var = (u0) qVar;
        b3.k kVarA = this.C.a(this.B);
        u0Var.C1(u0Var.Q);
        u0Var.Q = kVarA;
        u0Var.B1(kVarA);
    }
}
