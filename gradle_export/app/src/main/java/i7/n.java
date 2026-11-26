package i7;

import k9.v3;

public final class n implements e7.m, e7.h {
    public final int A;
    public final androidx.media3.common.t0 B;

    public n(androidx.media3.common.t0 t0Var, int i10) {
        this.A = i10;
        this.B = t0Var;
    }

    @Override
    public void accept(Object obj) {
        ((v3) obj).setPlaylistMetadata(this.B);
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        androidx.media3.common.t0 t0Var = this.B;
        androidx.media3.common.d1 d1Var = (androidx.media3.common.d1) obj;
        switch (i10) {
            case 0:
                d1Var.D(t0Var);
                break;
            default:
                d1Var.E(t0Var);
                break;
        }
    }
}
