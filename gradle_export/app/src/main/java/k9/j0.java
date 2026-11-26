package k9;

public final class j0 implements e7.m, p0 {
    public final int A;
    public final t0 B;
    public final boolean C;

    public j0(t0 t0Var, boolean z10, int i10) {
        this.A = i10;
        this.B = t0Var;
        this.C = z10;
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 1:
                mVar.f0(this.B.f9440c, i10, this.C);
                break;
            case 2:
                mVar.F0(this.B.f9440c, i10, this.C);
                break;
            default:
                mVar.v1(this.B.f9440c, i10, this.C);
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (this.A) {
            case 0:
                d1Var.A(this.B.f9452q.f9512t, this.C);
                break;
            default:
                d1Var.A(this.B.f9452q.f9512t, this.C);
                break;
        }
    }
}
