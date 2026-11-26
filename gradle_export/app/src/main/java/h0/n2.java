package h0;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lh0/n2;", "Lb3/e1;", "Lh0/p2;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n2 extends b3.e1 {
    public final z B;
    public final boolean C;
    public final u00.n D;
    public final Object E;
    public final String F;

    public n2(z zVar, boolean z10, u00.n nVar, Object obj, String str) {
        this.B = zVar;
        this.C = z10;
        this.D = nVar;
        this.E = obj;
        this.F = str;
    }

    @Override
    public final b2.q d() {
        p2 p2Var = new p2();
        p2Var.O = this.B;
        p2Var.P = this.C;
        p2Var.Q = this.D;
        return p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n2.class != obj.getClass()) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return this.B == n2Var.B && this.C == n2Var.C && kotlin.jvm.internal.m.a(this.E, n2Var.E);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = this.F;
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.E, "align");
        y2Var.c(Boolean.valueOf(this.C), "unbounded");
    }

    public final int hashCode() {
        return this.E.hashCode() + w.c.e(this.B.hashCode() * 31, 31, this.C);
    }

    @Override
    public final void i(b2.q qVar) {
        p2 p2Var = (p2) qVar;
        p2Var.O = this.B;
        p2Var.P = this.C;
        p2Var.Q = this.D;
    }
}
