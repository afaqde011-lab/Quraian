package i7;

public final class q implements e7.m, e7.n {
    public final int A;
    public final z B;

    public q(z zVar, int i10) {
        this.A = i10;
        this.B = zVar;
    }

    @Override
    public void h(Object obj, androidx.media3.common.r rVar) {
        ((androidx.media3.common.d1) obj).l(this.B.f7477f, new androidx.media3.common.c1(rVar));
    }

    @Override
    public void invoke(Object obj) {
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (this.A) {
            case 0:
                d1Var.E(this.B.U);
                break;
            default:
                d1Var.T(this.B.S);
                break;
        }
    }
}
