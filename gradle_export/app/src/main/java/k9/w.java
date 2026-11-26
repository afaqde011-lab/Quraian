package k9;

public final class w implements p0, e7.m {
    public final int A;
    public final t0 B;
    public final int C;

    public w(t0 t0Var, int i10, int i11) {
        this.A = i11;
        this.B = t0Var;
        this.C = i10;
    }

    @Override
    public void b(m mVar, int i10) {
        switch (this.A) {
            case 0:
                mVar.w1(this.B.f9440c, i10, this.C);
                break;
            case 1:
                mVar.B1(this.B.f9440c, i10, this.C);
                break;
            case 2:
            case 3:
            case 5:
            case 7:
            default:
                mVar.H0(this.B.f9440c, i10, this.C);
                break;
            case 4:
                mVar.X1(this.B.f9440c, i10, this.C);
                break;
            case 6:
                mVar.W1(this.B.f9440c, i10, this.C);
                break;
            case 8:
                mVar.f1(this.B.f9440c, i10, this.C);
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (this.A) {
            case 2:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
            case 3:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
            case 4:
            case 6:
            case 8:
            case 9:
            default:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
            case 5:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
            case 7:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
            case 10:
                d1Var.A(this.C, this.B.f9452q.f9513u);
                break;
        }
    }
}
