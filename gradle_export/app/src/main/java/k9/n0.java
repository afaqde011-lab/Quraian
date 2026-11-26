package k9;

public final class n0 implements p0 {
    public final int A;
    public final t0 B;
    public final int C;
    public final androidx.media3.common.q0 D;

    public n0(t0 t0Var, int i10, androidx.media3.common.q0 q0Var, int i11) {
        this.A = i11;
        this.B = t0Var;
        this.C = i10;
        this.D = q0Var;
    }

    @Override
    public final void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                t0 t0Var = this.B;
                d1 d1Var = t0Var.f9440c;
                f4 f4Var = t0Var.f9449n;
                f4Var.getClass();
                int iF = f4Var.f9293a.f();
                int i11 = this.C;
                androidx.media3.common.q0 q0Var = this.D;
                if (iF < 2) {
                    mVar.n0(d1Var, i10, i11 + 1, q0Var.c(true));
                    mVar.X1(d1Var, i10, i11);
                } else {
                    mVar.M(d1Var, i10, i11, q0Var.c(true));
                }
                break;
            default:
                mVar.n0(this.B.f9440c, i10, this.C, this.D.c(true));
                break;
        }
    }
}
