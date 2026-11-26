package androidx.media3.cast;

import androidx.media3.common.d1;
import k9.v3;

public final class m implements e7.m, e7.h {
    public final int A;
    public final boolean B;
    public final int C;

    public m(int i10, int i11, boolean z10) {
        this.A = i11;
        this.B = z10;
        this.C = i10;
    }

    public m(int i10, boolean z10) {
        this.A = 2;
        this.C = i10;
        this.B = z10;
    }

    @Override
    public void accept(Object obj) {
        ((v3) obj).setDeviceMuted(this.B, this.C);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.A) {
            case 0:
                ((d1) obj).N(this.C, this.B);
                break;
            case 1:
                ((d1) obj).m(this.C, this.B);
                break;
            default:
                ((d1) obj).A(this.C, this.B);
                break;
        }
    }
}
