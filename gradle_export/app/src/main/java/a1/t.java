package a1;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"La1/t;", "Lb3/e1;", "La1/x;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends b3.e1 {
    public final r3.c0 B;
    public final r3.w C;
    public final q0.j1 D;
    public final boolean E;
    public final boolean F;
    public final r3.p G;
    public final e1.v0 H;
    public final r3.j I;
    public final g2.t J;

    public t(r3.c0 c0Var, r3.w wVar, q0.j1 j1Var, boolean z10, boolean z11, r3.p pVar, e1.v0 v0Var, r3.j jVar, g2.t tVar) {
        this.B = c0Var;
        this.C = wVar;
        this.D = j1Var;
        this.E = z10;
        this.F = z11;
        this.G = pVar;
        this.H = v0Var;
        this.I = jVar;
        this.J = tVar;
    }

    @Override
    public final b2.q d() {
        x xVar = new x();
        xVar.Q = this.B;
        xVar.R = this.C;
        xVar.S = this.D;
        xVar.T = this.E;
        xVar.U = this.F;
        xVar.V = this.G;
        e1.v0 v0Var = this.H;
        xVar.W = v0Var;
        xVar.X = this.I;
        xVar.Y = this.J;
        v0Var.f5021g = new u(xVar, 4);
        return xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.B.equals(tVar.B) && kotlin.jvm.internal.m.a(this.C, tVar.C) && this.D.equals(tVar.D) && this.E == tVar.E && this.F == tVar.F && kotlin.jvm.internal.m.a(this.G, tVar.G) && this.H.equals(tVar.H) && kotlin.jvm.internal.m.a(this.I, tVar.I) && kotlin.jvm.internal.m.a(this.J, tVar.J);
    }

    @Override
    public final void h(c3.d2 d2Var) {
    }

    public final int hashCode() {
        return this.J.hashCode() + ((this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + w.c.e(w.c.e(w.c.e((this.D.hashCode() + ((this.C.hashCode() + (this.B.hashCode() * 31)) * 31)) * 31, 31, false), 31, this.E), 31, this.F)) * 31)) * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        x xVar = (x) qVar;
        boolean z10 = xVar.T;
        boolean z11 = xVar.U;
        r3.j jVar = xVar.X;
        e1.v0 v0Var = xVar.W;
        xVar.Q = this.B;
        r3.w wVar = this.C;
        xVar.R = wVar;
        xVar.S = this.D;
        boolean z12 = this.E;
        xVar.T = z12;
        xVar.V = this.G;
        e1.v0 v0Var2 = this.H;
        xVar.W = v0Var2;
        r3.j jVar2 = this.I;
        xVar.X = jVar2;
        xVar.Y = this.J;
        if (z12 != z10 || z12 != z10 || !kotlin.jvm.internal.m.a(jVar2, jVar) || this.F != z11 || !m3.q0.d(wVar.f13100b)) {
            b3.m.o(xVar);
        }
        if (v0Var2.equals(v0Var)) {
            return;
        }
        v0Var2.f5021g = new u(xVar, 0);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.B + ", value=" + this.C + ", state=" + this.D + ", readOnly=false, enabled=" + this.E + ", isPassword=" + this.F + ", offsetMapping=" + this.G + ", manager=" + this.H + ", imeOptions=" + this.I + ", focusRequester=" + this.J + ')';
    }
}
