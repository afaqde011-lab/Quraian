package l0;

import c3.d2;
import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ll0/m;", "Lb3/e1;", "Ll0/n;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m extends b3.e1 {
    public final x.y B;
    public final x.y C;
    public final x.y D;

    public m(x.y yVar, x.y yVar2, x.y yVar3) {
        this.B = yVar;
        this.C = yVar2;
        this.D = yVar3;
    }

    @Override
    public final b2.q d() {
        n nVar = new n();
        nVar.O = this.B;
        nVar.P = this.C;
        nVar.Q = this.D;
        return nVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.m.a(this.B, mVar.B) && kotlin.jvm.internal.m.a(this.C, mVar.C) && kotlin.jvm.internal.m.a(this.D, mVar.D);
    }

    @Override
    public final void h(d2 d2Var) {
        d2Var.f2644a = "animateItem";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "fadeInSpec");
        y2Var.c(this.C, "placementSpec");
        y2Var.c(this.D, "fadeOutSpec");
    }

    public final int hashCode() {
        x.y yVar = this.B;
        int iHashCode = (yVar == null ? 0 : yVar.hashCode()) * 31;
        x.y yVar2 = this.C;
        int iHashCode2 = (iHashCode + (yVar2 == null ? 0 : yVar2.hashCode())) * 31;
        x.y yVar3 = this.D;
        return iHashCode2 + (yVar3 != null ? yVar3.hashCode() : 0);
    }

    @Override
    public final void i(b2.q qVar) {
        n nVar = (n) qVar;
        nVar.O = this.B;
        nVar.P = this.C;
        nVar.Q = this.D;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.B + ", placementSpec=" + this.C + ", fadeOutSpec=" + this.D + ')';
    }
}
