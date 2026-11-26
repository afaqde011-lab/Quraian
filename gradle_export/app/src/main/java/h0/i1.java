package h0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/i1;", "Lb3/e1;", "Lh0/j1;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class i1 extends b3.e1 {
    public final u00.k B;
    public final as.d0 C;

    public i1(u00.k kVar, as.d0 d0Var) {
        this.B = kVar;
        this.C = d0Var;
    }

    @Override
    public final b2.q d() {
        j1 j1Var = new j1();
        j1Var.O = this.B;
        j1Var.P = true;
        return j1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i1 i1Var = obj instanceof i1 ? (i1) obj : null;
        return i1Var != null && this.B == i1Var.B;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        this.C.invoke(d2Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.B.hashCode() * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        j1 j1Var = (j1) qVar;
        u00.k kVar = j1Var.O;
        u00.k kVar2 = this.B;
        if (kVar != kVar2 || !j1Var.P) {
            b3.m.y(j1Var).W(false);
        }
        j1Var.O = kVar2;
        j1Var.P = true;
    }

    public final String toString() {
        return "OffsetPxModifier(offset=" + this.B + ", rtlAware=true)";
    }
}
