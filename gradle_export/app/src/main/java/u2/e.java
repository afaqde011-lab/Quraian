package u2;

import b2.q;
import b3.e1;
import b3.j0;
import c3.d2;
import c3.y2;
import kotlin.Metadata;
import kotlin.jvm.internal.m;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lu2/e;", "Lb3/e1;", "Lu2/i;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class e extends e1 {
    public final a B;
    public final d C;

    public e(a aVar, d dVar) {
        this.B = aVar;
        this.C = dVar;
    }

    @Override
    public final q d() {
        return new i(this.B, this.C);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return m.a(eVar.B, this.B) && m.a(eVar.C, this.C);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "nestedScroll";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "connection");
        y2Var.c(this.C, "dispatcher");
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        d dVar = this.C;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override
    public final void i(q qVar) {
        i iVar = (i) qVar;
        iVar.O = this.B;
        d dVar = iVar.P;
        if (dVar.f14921a == iVar) {
            dVar.f14921a = null;
        }
        d dVar2 = this.C;
        if (dVar2 == null) {
            iVar.P = new d();
        } else if (!dVar2.equals(dVar)) {
            iVar.P = dVar2;
        }
        if (iVar.N) {
            d dVar3 = iVar.P;
            dVar3.f14921a = iVar;
            dVar3.f14922b = null;
            iVar.Q = null;
            dVar3.f14923c = new j0(iVar, 26);
            dVar3.f14924d = iVar.p1();
        }
    }
}
