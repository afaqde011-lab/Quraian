package k9;

public final class c0 implements e7.m, e7.h {
    public final int A;
    public final androidx.media3.common.z0 B;

    public c0(androidx.media3.common.z0 z0Var, int i10) {
        this.A = i10;
        this.B = z0Var;
    }

    @Override
    public void accept(Object obj) {
        ((v3) obj).setPlaybackParameters(this.B);
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        androidx.media3.common.z0 z0Var = this.B;
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (i10) {
            case 0:
                d1Var.x(z0Var);
                break;
            default:
                d1Var.x(z0Var);
                break;
        }
    }
}
