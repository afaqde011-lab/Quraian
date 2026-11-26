package z;

import c3.d2;
import c3.y2;
import d0.n2;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lz/q1;", "Lb3/e1;", "Lz/r1;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q1 extends b3.e1 {
    public final n2 B;
    public final d0.q1 C;
    public final boolean D;
    public final d0.t0 E;
    public final f0.i F;
    public final d0.c G;
    public final boolean H;
    public final h1 I;

    public q1(d0.c cVar, d0.t0 t0Var, d0.q1 q1Var, n2 n2Var, f0.i iVar, h1 h1Var, boolean z10, boolean z11) {
        this.B = n2Var;
        this.C = q1Var;
        this.D = z10;
        this.E = t0Var;
        this.F = iVar;
        this.G = cVar;
        this.H = z11;
        this.I = h1Var;
    }

    @Override
    public final b2.q d() {
        r1 r1Var = new r1();
        r1Var.Q = this.B;
        r1Var.R = this.C;
        r1Var.S = this.D;
        r1Var.T = this.E;
        r1Var.U = this.F;
        r1Var.V = this.G;
        r1Var.W = this.H;
        r1Var.X = this.I;
        return r1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q1.class != obj.getClass()) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return kotlin.jvm.internal.m.a(this.B, q1Var.B) && this.C == q1Var.C && this.D == q1Var.D && kotlin.jvm.internal.m.a(this.E, q1Var.E) && kotlin.jvm.internal.m.a(this.F, q1Var.F) && kotlin.jvm.internal.m.a(this.G, q1Var.G) && this.H == q1Var.H && kotlin.jvm.internal.m.a(this.I, q1Var.I);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "scrollableArea";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "state");
        y2Var.c(this.C, "orientation");
        if (!this.H) {
            y2Var.c(this.I, "overscrollEffect");
        }
        y2Var.c(Boolean.valueOf(this.D), "enabled");
        y2Var.c(Boolean.FALSE, "reverseScrolling");
        y2Var.c(this.E, "flingBehavior");
        y2Var.c(this.F, "interactionSource");
        y2Var.c(this.G, "bringIntoViewSpec");
    }

    public final int hashCode() {
        int iE = w.c.e(w.c.e((this.C.hashCode() + (this.B.hashCode() * 31)) * 31, 31, this.D), 31, false);
        d0.t0 t0Var = this.E;
        int iHashCode = (iE + (t0Var != null ? t0Var.hashCode() : 0)) * 31;
        f0.i iVar = this.F;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        d0.c cVar = this.G;
        int iE2 = w.c.e((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31, 31, this.H);
        h1 h1Var = this.I;
        return iE2 + (h1Var != null ? h1Var.hashCode() : 0);
    }

    @Override
    public final void i(b2.q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ((r1) qVar).G1(this.G, this.E, this.C, this.B, this.F, this.I, this.H, this.D);
    }
}
