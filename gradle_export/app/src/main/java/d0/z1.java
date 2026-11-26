package d0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld0/z1;", "Lb3/e1;", "Ld0/m2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z1 extends b3.e1 {
    public final n2 B;
    public final q1 C;
    public final boolean D;
    public final boolean E;
    public final f0.i F;

    public z1(n2 n2Var, q1 q1Var, boolean z10, boolean z11, f0.i iVar) {
        this.B = n2Var;
        this.C = q1Var;
        this.D = z10;
        this.E = z11;
        this.F = iVar;
    }

    @Override
    public final b2.q d() {
        return new m2(null, null, this.C, this.B, this.F, null, this.D, this.E);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z1)) {
            return false;
        }
        z1 z1Var = (z1) obj;
        return kotlin.jvm.internal.m.a(this.B, z1Var.B) && this.C == z1Var.C && this.D == z1Var.D && this.E == z1Var.E && kotlin.jvm.internal.m.a(this.F, z1Var.F);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "scrollable";
        c3.y2 y2Var = d2Var.f2646c;
        y2Var.c(this.C, "orientation");
        y2Var.c(this.B, "state");
        y2Var.c(null, "overscrollEffect");
        y2Var.c(Boolean.valueOf(this.D), "enabled");
        y2Var.c(Boolean.valueOf(this.E), "reverseDirection");
        y2Var.c(null, "flingBehavior");
        y2Var.c(this.F, "interactionSource");
        y2Var.c(null, "bringIntoViewSpec");
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e((this.C.hashCode() + (this.B.hashCode() * 31)) * 961, 31, this.D), 961, this.E);
        f0.i iVar = this.F;
        return (iE + (iVar != null ? iVar.hashCode() : 0)) * 31;
    }

    @Override
    public final void i(b2.q qVar) {
        ((m2) qVar).W1(null, null, this.C, this.B, this.F, null, this.D, this.E);
    }
}
