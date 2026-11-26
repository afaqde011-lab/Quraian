package k9;

public final class f0 implements p0 {
    public final int A;
    public final t0 B;
    public final androidx.media3.common.q0 C;

    public f0(t0 t0Var, androidx.media3.common.q0 q0Var, int i10) {
        this.A = i10;
        this.B = t0Var;
        this.C = q0Var;
    }

    @Override
    public final void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                mVar.v0(this.B.f9440c, i10, this.C.c(true));
                break;
            default:
                mVar.Y1(this.B.f9440c, i10, this.C.c(true));
                break;
        }
    }
}
