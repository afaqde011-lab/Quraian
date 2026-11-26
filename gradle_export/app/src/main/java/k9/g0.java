package k9;

public final class g0 implements p0 {
    public final int A;
    public final t0 B;
    public final int C;
    public final int D;

    public g0(t0 t0Var, int i10, int i11, int i12) {
        this.A = i12;
        this.B = t0Var;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                mVar.W(this.B.f9440c, i10, this.C, this.D);
                break;
            case 1:
                mVar.S(this.B.f9440c, i10, this.C, this.D);
                break;
            default:
                mVar.F(this.B.f9440c, i10, this.C, this.D);
                break;
        }
    }
}
