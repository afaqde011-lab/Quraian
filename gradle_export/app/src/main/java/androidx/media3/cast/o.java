package androidx.media3.cast;

import androidx.media3.common.d1;
import k9.v3;

public final class o implements e7.m, e7.h {
    public final int A;
    public final boolean B;

    public o(int i10, boolean z10) {
        this.A = i10;
        this.B = z10;
    }

    @Override
    public void accept(Object obj) {
        int i10 = this.A;
        boolean z10 = this.B;
        v3 v3Var = (v3) obj;
        switch (i10) {
            case 4:
                v3Var.setPlayWhenReady(z10);
                break;
            case 5:
                v3Var.setDeviceMuted(z10);
                break;
            default:
                v3Var.setShuffleModeEnabled(z10);
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        boolean z10 = this.B;
        d1 d1Var = (d1) obj;
        switch (i10) {
            case 0:
                d1Var.V(z10);
                break;
            case 1:
                d1Var.w(z10);
                break;
            case 2:
                d1Var.J(z10);
                break;
            default:
                d1Var.w(z10);
                break;
        }
    }
}
