package androidx.media3.cast;

import androidx.media3.common.d1;
import k9.v3;

public final class q implements e7.m, e7.h {
    public final int A;
    public final float B;

    public q(float f3, int i10) {
        this.A = i10;
        this.B = f3;
    }

    @Override
    public void accept(Object obj) {
        int i10 = this.A;
        float f3 = this.B;
        v3 v3Var = (v3) obj;
        switch (i10) {
            case 4:
                v3Var.setPlaybackSpeed(f3);
                break;
            default:
                v3Var.setVolume(f3);
                break;
        }
    }

    @Override
    public void invoke(Object obj) {
        int i10 = this.A;
        float f3 = this.B;
        d1 d1Var = (d1) obj;
        switch (i10) {
            case 0:
                d1Var.n(f3);
                break;
            case 1:
                d1Var.n(f3);
                break;
            case 2:
                d1Var.n(f3);
                break;
            default:
                d1Var.n(f3);
                break;
        }
    }
}
