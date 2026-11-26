package a8;

import java.util.Arrays;

public final class k implements d0 {

    public final int f282a;

    public final int[] f283b;

    public final long[] f284c;

    public final long[] f285d;

    public final long[] f286e;

    public final long f287f;

    public k(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f283b = iArr;
        this.f284c = jArr;
        this.f285d = jArr2;
        this.f286e = jArr3;
        int length = iArr.length;
        this.f282a = length;
        if (length > 0) {
            this.f287f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f287f = 0L;
        }
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final c0 d(long j9) {
        long[] jArr = this.f286e;
        int iE = e7.i0.e(jArr, j9, true);
        long j10 = jArr[iE];
        long[] jArr2 = this.f284c;
        e0 e0Var = new e0(j10, jArr2[iE]);
        if (j10 >= j9 || iE == this.f282a - 1) {
            return new c0(e0Var, e0Var);
        }
        int i10 = iE + 1;
        return new c0(e0Var, new e0(jArr[i10], jArr2[i10]));
    }

    @Override
    public final long f() {
        return this.f287f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f282a + ", sizes=" + Arrays.toString(this.f283b) + ", offsets=" + Arrays.toString(this.f284c) + ", timeUs=" + Arrays.toString(this.f286e) + ", durationsUs=" + Arrays.toString(this.f285d) + ")";
    }
}
