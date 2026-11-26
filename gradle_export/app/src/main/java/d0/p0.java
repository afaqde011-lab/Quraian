package d0;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld0/p0;", "Lb3/e1;", "Ld0/s0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p0 extends b3.e1 {
    public static final bw.b J = new bw.b(14);
    public final h1.l B;
    public final q1 C;
    public final boolean D;
    public final f0.i E;
    public final boolean F;
    public final u00.o G;
    public final u00.o H;
    public final boolean I;

    public p0(h1.l lVar, q1 q1Var, boolean z10, f0.i iVar, boolean z11, q0 q0Var, u00.o oVar, boolean z12) {
        this.B = lVar;
        this.C = q1Var;
        this.D = z10;
        this.E = iVar;
        this.F = z11;
        this.G = q0Var;
        this.H = oVar;
        this.I = z12;
    }

    @Override
    public final b2.q d() {
        bw.b bVar = J;
        boolean z10 = this.D;
        f0.i iVar = this.E;
        q1 q1Var = this.C;
        s0 s0Var = new s0(bVar, z10, iVar, q1Var);
        s0Var.f4502j0 = this.B;
        s0Var.f4503k0 = q1Var;
        s0Var.f4504l0 = this.F;
        s0Var.f4505m0 = this.G;
        s0Var.f4506n0 = this.H;
        s0Var.f4507o0 = this.I;
        return s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0.class != obj.getClass()) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.m.a(this.B, p0Var.B) && this.C == p0Var.C && this.D == p0Var.D && kotlin.jvm.internal.m.a(this.E, p0Var.E) && this.F == p0Var.F && kotlin.jvm.internal.m.a(this.G, p0Var.G) && kotlin.jvm.internal.m.a(this.H, p0Var.H) && this.I == p0Var.I;
    }

    @Override
    public final void h(c3.d2 d2Var) {
        d2Var.f2644a = "draggable";
        c3.y2 y2Var = d2Var.f2646c;
        y2Var.c(this.C, "orientation");
        y2Var.c(Boolean.valueOf(this.D), "enabled");
        y2Var.c(Boolean.valueOf(this.I), "reverseDirection");
        y2Var.c(this.E, "interactionSource");
        y2Var.c(Boolean.valueOf(this.F), "startDragImmediately");
        y2Var.c(this.G, "onDragStarted");
        y2Var.c(this.H, "onDragStopped");
        y2Var.c(this.B, "state");
    }

    public final int hashCode() {
        int iE = w.c.e((this.C.hashCode() + (this.B.hashCode() * 31)) * 31, 31, this.D);
        f0.i iVar = this.E;
        return Boolean.hashCode(this.I) + ((this.H.hashCode() + ((this.G.hashCode() + w.c.e((iE + (iVar != null ? iVar.hashCode() : 0)) * 31, 31, this.F)) * 31)) * 31);
    }

    @Override
    public final void i(b2.q qVar) {
        boolean z10;
        boolean z11;
        s0 s0Var = (s0) qVar;
        h1.l lVar = s0Var.f4502j0;
        h1.l lVar2 = this.B;
        if (kotlin.jvm.internal.m.a(lVar, lVar2)) {
            z10 = false;
        } else {
            s0Var.f4502j0 = lVar2;
            z10 = true;
        }
        q1 q1Var = s0Var.f4503k0;
        q1 q1Var2 = this.C;
        if (q1Var != q1Var2) {
            s0Var.f4503k0 = q1Var2;
            z10 = true;
        }
        boolean z12 = s0Var.f4507o0;
        boolean z13 = this.I;
        if (z12 != z13) {
            s0Var.f4507o0 = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        s0Var.f4505m0 = this.G;
        s0Var.f4506n0 = this.H;
        s0Var.f4504l0 = this.F;
        s0Var.V1(J, this.D, this.E, q1Var2, z11);
    }
}
