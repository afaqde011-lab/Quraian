package i7;

import k9.i2;
import k9.v3;
import k9.z1;

public final class p implements e7.m, k9.c1, i2, e7.h {
    public final int A;
    public final int B;
    public final int C;

    public p(int i10, int i11, int i12) {
        this.A = i12;
        this.B = i10;
        this.C = i11;
    }

    @Override
    public void accept(Object obj) {
        switch (this.A) {
            case 4:
                ((v3) obj).setDeviceVolume(this.B, this.C);
                break;
            default:
                ((v3) obj).moveMediaItem(this.B, this.C);
                break;
        }
    }

    @Override
    public void c(z1 z1Var, int i10) {
        z1Var.b(i10, this.B, this.C);
    }

    @Override
    public void g(k9.t0 t0Var) {
        t0Var.x(this.B, this.C);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((androidx.media3.common.d1) obj).S(this.B, this.C);
                break;
            default:
                ((androidx.media3.common.d1) obj).S(this.B, this.C);
                break;
        }
    }
}
