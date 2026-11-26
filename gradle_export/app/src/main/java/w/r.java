package w;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Lw/r;", "S", "Lb3/e1;", "Lw/u;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class r<S> extends b3.e1 {
    public final x.j1 B;
    public final l1.z0 C;
    public final v D;

    public r(x.j1 j1Var, l1.z0 z0Var, v vVar) {
        this.B = j1Var;
        this.C = z0Var;
        this.D = vVar;
    }

    @Override
    public final b2.q d() {
        u uVar = new u(1);
        uVar.P = this.B;
        uVar.Q = this.C;
        uVar.R = this.D;
        uVar.S = m.f15790a;
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return kotlin.jvm.internal.m.a(rVar.B, this.B) && rVar.C.equals(this.C);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "sizeTransform";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "sizeAnimation");
        y2Var.c(this.C, "sizeTransform");
        y2Var.c(this.D, "scope");
    }

    public final int hashCode() {
        int iHashCode = this.D.hashCode() * 31;
        x.j1 j1Var = this.B;
        return this.C.hashCode() + ((iHashCode + (j1Var != null ? j1Var.hashCode() : 0)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        u uVar = (u) qVar;
        uVar.P = this.B;
        uVar.Q = this.C;
        uVar.R = this.D;
    }
}
