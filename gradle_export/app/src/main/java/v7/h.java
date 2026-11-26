package v7;

import fh.g0;

public final class h implements Comparable {
    public final boolean A;
    public final boolean B;

    public h(androidx.media3.common.t tVar, int i10) {
        this.A = (tVar.f1587e & 1) != 0;
        this.B = i7.a.l(i10, false);
    }

    @Override
    public final int compareTo(Object obj) {
        h hVar = (h) obj;
        return g0.f5672a.c(this.B, hVar.B).c(this.A, hVar.A).e();
    }
}
