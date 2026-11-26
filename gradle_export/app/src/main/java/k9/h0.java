package k9;

public final class h0 implements p0, s2 {
    public final int A;
    public final Object B;
    public final float C;

    public h0(Object obj, float f3, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = f3;
    }

    @Override
    public void a(a2 a2Var) {
        ((t2) this.B).f9463f.f9430t.setPlaybackSpeed(this.C);
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                t0 t0Var = (t0) this.B;
                mVar.I1(t0Var.f9440c, i10, this.C);
                break;
            case 1:
                t0 t0Var2 = (t0) this.B;
                mVar.U1(t0Var2.f9440c, i10, this.C);
                break;
            default:
                t0 t0Var3 = (t0) this.B;
                d1 d1Var = t0Var3.f9440c;
                f4 f4Var = t0Var3.f9449n;
                f4Var.getClass();
                if (f4Var.f9293a.f() < 6) {
                    mVar.U1(d1Var, i10, this.C);
                } else {
                    mVar.g0(d1Var, i10);
                }
                break;
        }
    }
}
