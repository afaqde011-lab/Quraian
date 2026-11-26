package k9;

public final class b0 implements e7.m, p0, e7.n {
    public final int A;
    public final t0 B;

    public b0(t0 t0Var, int i10) {
        this.A = i10;
        this.B = t0Var;
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 2:
                mVar.u0(this.B.f9440c, i10);
                break;
            case 3:
                mVar.b0(this.B.f9440c, i10);
                break;
            case 4:
                mVar.l1(this.B.f9440c, i10);
                break;
            case 5:
                mVar.p(this.B.f9440c, i10);
                break;
            case 6:
            default:
                mVar.s1(this.B.f9440c, i10);
                break;
            case 7:
                mVar.G0(this.B.f9440c, i10);
                break;
            case 8:
                mVar.G1(this.B.f9440c, i10);
                break;
            case 9:
                mVar.N(this.B.f9440c, i10);
                break;
            case 10:
                mVar.l(this.B.f9440c, i10);
                break;
            case 11:
                mVar.l0(this.B.f9440c, i10);
                break;
            case 12:
                mVar.n1(this.B.f9440c, i10);
                break;
            case 13:
                mVar.E1(this.B.f9440c, i10);
                break;
            case 14:
                t0 t0Var = this.B;
                d1 d1Var = t0Var.f9440c;
                f4 f4Var = t0Var.f9449n;
                f4Var.getClass();
                if (f4Var.f9293a.f() < 6) {
                    mVar.U1(d1Var, i10, 0.0f);
                } else {
                    mVar.C0(d1Var, i10);
                }
                break;
            case 15:
                mVar.P0(this.B.f9440c, i10);
                break;
            case 16:
                mVar.B0(this.B.f9440c, i10);
                break;
        }
    }

    @Override
    public void h(Object obj, androidx.media3.common.r rVar) {
        ((androidx.media3.common.d1) obj).l(this.B.f9438a, new androidx.media3.common.c1(rVar));
    }

    @Override
    public void invoke(Object obj) {
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (this.A) {
            case 0:
                d1Var.T(this.B.f9461z);
                break;
            default:
                d1Var.T(this.B.f9461z);
                break;
        }
    }
}
