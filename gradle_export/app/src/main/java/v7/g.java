package v7;

import androidx.media3.common.l2;

public final class g extends n implements Comparable {
    public final int E;
    public final int F;

    public g(int i10, l2 l2Var, int i11, j jVar, int i12) {
        int i13;
        super(i10, l2Var, i11);
        this.E = i7.a.l(i12, jVar.B0) ? 1 : 0;
        androidx.media3.common.t tVar = this.D;
        int i14 = tVar.f1601u;
        int i15 = -1;
        if (i14 != -1 && (i13 = tVar.f1602v) != -1) {
            i15 = i14 * i13;
        }
        this.F = i15;
    }

    @Override
    public final int a() {
        return this.E;
    }

    @Override
    public final boolean b(n nVar) {
        return false;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.F, ((g) obj).F);
    }
}
