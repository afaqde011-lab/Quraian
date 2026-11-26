package o0;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import f0.i;
import j3.k;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import z.v0;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lo0/f;", "Lb3/e1;", "Lo0/g;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f extends e1 {
    public final l3.a B;
    public final i C;
    public final v0 D;
    public final boolean E;
    public final k F;
    public final u00.a G;

    public f(l3.a aVar, i iVar, v0 v0Var, boolean z10, k kVar, u00.a aVar2) {
        this.B = aVar;
        this.C = iVar;
        this.D = v0Var;
        this.E = z10;
        this.F = kVar;
        this.G = aVar2;
    }

    @Override
    public final q d() {
        g gVar = new g(this.C, this.D, false, this.E, null, this.F, this.G);
        gVar.f11468n0 = this.B;
        return gVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.B == fVar.B && m.a(this.C, fVar.C) && m.a(this.D, fVar.D) && this.E == fVar.E && this.F.equals(fVar.F) && this.G == fVar.G;
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "triStateToggleable";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "state");
        y2Var.c(this.C, "interactionSource");
        y2Var.c(this.D, "indicationNodeFactory");
        y2Var.c(Boolean.valueOf(this.E), "enabled");
        y2Var.c(this.F, "role");
        y2Var.c(this.G, "onClick");
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        i iVar = this.C;
        int iHashCode2 = (iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31;
        v0 v0Var = this.D;
        return this.G.hashCode() + w.c.d(this.F.f7937a, w.c.e(w.c.e((iHashCode2 + (v0Var != null ? v0Var.hashCode() : 0)) * 31, 31, false), 31, this.E), 31);
    }

    @Override
    public final void i(q qVar) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        g gVar = (g) qVar;
        l3.a aVar = gVar.f11468n0;
        l3.a aVar2 = this.B;
        if (aVar != aVar2) {
            gVar.f11468n0 = aVar2;
            b3.m.o(gVar);
        }
        gVar.P1(this.C, this.D, false, this.E, null, this.F, this.G);
    }
}
