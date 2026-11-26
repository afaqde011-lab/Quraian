package k9;

public final class d2 implements i2, s2 {
    public final boolean A;
    public final boolean B;
    public final Object C;
    public final Object D;

    public d2(c4 c4Var, boolean z10, boolean z11, a2 a2Var) {
        this.C = c4Var;
        this.A = z10;
        this.B = z11;
        this.D = a2Var;
    }

    public d2(t2 t2Var, androidx.media3.common.q0 q0Var, boolean z10, boolean z11) {
        this.C = t2Var;
        this.D = q0Var;
        this.A = z10;
        this.B = z11;
    }

    @Override
    public void a(a2 a2Var) {
        t2 t2Var = (t2) this.C;
        kh.v vVarB = t2Var.f9463f.B(a2Var, fh.t0.s((androidx.media3.common.q0) this.D), -1, -9223372036854775807L);
        bd.f fVar = new bd.f();
        fVar.D = t2Var;
        fVar.C = a2Var;
        fVar.A = this.A;
        fVar.B = this.B;
        vVarB.a(new kh.r(vVarB, fVar, 0), kh.p.A);
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z1Var.f(i10, (c4) this.C, this.A, this.B, ((a2) this.D).f9208c);
    }
}
