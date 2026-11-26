package t7;

import androidx.media3.common.t;
import q3.e0;

public abstract class a extends e {
    public final long J;
    public final long K;
    public final long L;
    public e0 M;
    public int[] N;

    public a(g7.f fVar, g7.j jVar, t tVar, int i10, Object obj, long j9, long j10, long j11, long j12, long j13) {
        super(fVar, jVar, 1, tVar, i10, obj, j9, j10);
        tVar.getClass();
        this.J = j13;
        this.K = j11;
        this.L = j12;
    }

    public final int a(int i10) {
        int[] iArr = this.N;
        iArr.getClass();
        return iArr[i10];
    }

    public long b() {
        long j9 = this.J;
        if (j9 != -1) {
            return j9 + 1;
        }
        return -1L;
    }

    public abstract boolean c();
}
