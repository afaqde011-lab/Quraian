package w;

import c3.y2;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lw/m0;", "Lb3/e1;", "Lw/w0;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m0 extends b3.e1 {
    public final x.n1 B;
    public final x.j1 C;
    public final x.j1 D;
    public final x.j1 E;
    public final x0 F;
    public final y0 G;
    public final u00.a H;
    public final n0 I;

    public m0(x.n1 n1Var, x.j1 j1Var, x.j1 j1Var2, x.j1 j1Var3, x0 x0Var, y0 y0Var, u00.a aVar, n0 n0Var) {
        this.B = n1Var;
        this.C = j1Var;
        this.D = j1Var2;
        this.E = j1Var3;
        this.F = x0Var;
        this.G = y0Var;
        this.H = aVar;
        this.I = n0Var;
    }

    @Override
    public final b2.q d() {
        return new w0(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return kotlin.jvm.internal.m.a(m0Var.B, this.B) && kotlin.jvm.internal.m.a(m0Var.C, this.C) && kotlin.jvm.internal.m.a(m0Var.D, this.D) && kotlin.jvm.internal.m.a(m0Var.E, this.E) && kotlin.jvm.internal.m.a(m0Var.F, this.F) && kotlin.jvm.internal.m.a(m0Var.G, this.G) && m0Var.H == this.H && kotlin.jvm.internal.m.a(m0Var.I, this.I);
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "enterExitTransition";
        y2 y2Var = d2Var.f2646c;
        y2Var.c(this.B, "transition");
        y2Var.c(this.C, "sizeAnimation");
        y2Var.c(this.D, "offsetAnimation");
        y2Var.c(this.E, "slideAnimation");
        y2Var.c(this.F, "enter");
        y2Var.c(this.G, "exit");
        y2Var.c(this.I, "graphicsLayerBlock");
    }

    public final int hashCode() {
        int iHashCode = this.B.hashCode() * 31;
        x.j1 j1Var = this.C;
        int iHashCode2 = (iHashCode + (j1Var != null ? j1Var.hashCode() : 0)) * 31;
        x.j1 j1Var2 = this.D;
        int iHashCode3 = (iHashCode2 + (j1Var2 != null ? j1Var2.hashCode() : 0)) * 31;
        x.j1 j1Var3 = this.E;
        return this.I.hashCode() + ((this.H.hashCode() + ((this.G.f15824a.hashCode() + ((this.F.f15820a.hashCode() + ((iHashCode3 + (j1Var3 != null ? j1Var3.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        w0 w0Var = (w0) qVar;
        w0Var.P = this.B;
        w0Var.Q = this.C;
        w0Var.R = this.D;
        w0Var.S = this.E;
        w0Var.T = this.F;
        w0Var.U = this.G;
        w0Var.V = this.H;
        w0Var.W = this.I;
    }
}
