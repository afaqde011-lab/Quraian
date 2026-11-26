package o0;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import f0.i;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import z.v0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo0/a;", "Lb3/e1;", "Lo0/d;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class a extends e1 {
    public final boolean B;
    public final i C;
    public final v0 D;
    public final boolean E;
    public final u00.a F;

    public a(boolean z10, i iVar, v0 v0Var, boolean z11, u00.a aVar) {
        this.B = z10;
        this.C = iVar;
        this.D = v0Var;
        this.E = z11;
        this.F = aVar;
    }

    @Override
    public final q d() {
        d dVar = new d(this.C, this.D, false, this.E, null, null, this.F);
        dVar.f11467n0 = this.B;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.B == aVar.B && m.a(this.C, aVar.C) && m.a(this.D, aVar.D) && this.E == aVar.E && this.F == aVar.F;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "selectable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(Boolean.valueOf(this.B), "selected");
        y2Var.c(this.C, "interactionSource");
        y2Var.c(this.D, "indicationNodeFactory");
        y2Var.c(Boolean.valueOf(this.E), "enabled");
        y2Var.c(null, "role");
        y2Var.c(this.F, "onClick");
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.B) * 31;
        i iVar = this.C;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        v0 v0Var = this.D;
        return this.F.hashCode() + w.c.e(w.c.e((iHashCode2 + (v0Var != null ? v0Var.hashCode() : 0)) * 31, 31, false), 961, this.E);
    }

    @Override
    public final void i(q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        d dVar = (d) qVar;
        boolean z10 = dVar.f11467n0;
        boolean z11 = this.B;
        if (z10 != z11) {
            dVar.f11467n0 = z11;
            b3.m.o(dVar);
        }
        dVar.P1(this.C, this.D, false, this.E, null, null, this.F);
    }
}
