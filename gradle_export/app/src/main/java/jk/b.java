package jk;

import b2.q;
import b3.e1;
import c3.d2;
import c3.y2;
import g1.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import u00.n;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljk/b;", "Lb3/e1;", "Ljk/g;", "backdrop"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class b extends e1 {
    public final a B;
    public final l C;
    public final u00.k D;
    public final u00.k E;
    public final n F;
    public final u00.k G;

    public b(a aVar, l lVar, u00.k kVar, u00.k kVar2, n nVar, u00.k kVar3) {
        m.e(aVar, "backdrop");
        m.e(kVar, "effects");
        this.B = aVar;
        this.C = lVar;
        this.D = kVar;
        this.E = kVar2;
        this.F = nVar;
        this.G = kVar3;
    }

    @Override
    public final q d() {
        return new g(this.B, this.C, this.D, this.E, this.F, this.G);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.B, bVar.B) && this.C.equals(bVar.C) && m.a(this.D, bVar.D) && m.a(this.E, bVar.E) && this.F.equals(bVar.F) && m.a(this.G, bVar.G);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "drawBackdrop";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "backdrop");
        y2Var.c(this.C, "shapeProvider");
        y2Var.c(this.D, "effects");
        y2Var.c(this.E, "layerBlock");
        y2Var.c(null, "exportedBackdrop");
        y2Var.c(null, "onDrawBehind");
        y2Var.c(this.F, "onDrawBackdrop");
        y2Var.c(this.G, "onDrawSurface");
        y2Var.c(null, "onDrawFront");
    }

    public final int hashCode() {
        int iHashCode = (this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31;
        u00.k kVar = this.E;
        int iHashCode2 = (this.F.hashCode() + ((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 29791)) * 31;
        u00.k kVar2 = this.G;
        return (iHashCode2 + (kVar2 != null ? kVar2.hashCode() : 0)) * 31;
    }

    @Override
    public final void i(q qVar) {
        g gVar = (g) qVar;
        m.e(gVar, "node");
        a aVar = this.B;
        m.e(aVar, "<set-?>");
        gVar.O = aVar;
        gVar.P = this.C;
        u00.k kVar = this.D;
        m.e(kVar, "<set-?>");
        gVar.Q = kVar;
        gVar.R = this.E;
        gVar.S = this.F;
        gVar.T = this.G;
        b3.m.t(gVar, new l0(gVar, 13));
    }
}
