package u8;

import e7.i0;
import ta.c0;

public final class t {

    public final q f15124a;

    public final int f15125b;

    public final long[] f15126c;

    public final int[] f15127d;

    public final int f15128e;

    public final long[] f15129f;

    public final int[] f15130g;

    public final int[] f15131h;

    public final long f15132i;

    public final boolean f15133j;

    public t(q qVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, int[] iArr3, boolean z10, long j9, int i11) {
        c0.s(iArr.length == jArr2.length);
        c0.s(jArr.length == jArr2.length);
        c0.s(iArr2.length == jArr2.length);
        this.f15124a = qVar;
        this.f15126c = jArr;
        this.f15127d = iArr;
        this.f15128e = i10;
        this.f15129f = jArr2;
        this.f15130g = iArr2;
        this.f15131h = iArr3;
        this.f15133j = z10;
        this.f15132i = j9;
        this.f15125b = i11;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public final int a(long j9) {
        boolean z10 = this.f15133j;
        int i10 = 0;
        long[] jArr = this.f15129f;
        if (z10) {
            return i0.e(jArr, j9, false);
        }
        int[] iArr = this.f15131h;
        int length = iArr.length - 1;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (jArr[iArr[i12]] <= j9) {
                i10 = i12 + 1;
                i11 = i12;
            } else {
                length = i12 - 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i11]];
        if (j10 == j9) {
            while (i11 > 0 && jArr[iArr[i11 - 1]] == j10) {
                i11--;
            }
        }
        return iArr[i11];
    }

    public final int b(long j9) {
        boolean z10 = this.f15133j;
        long[] jArr = this.f15129f;
        if (z10) {
            return i0.b(jArr, j9, true);
        }
        int[] iArr = this.f15131h;
        int length = iArr.length - 1;
        int i10 = 0;
        int i11 = -1;
        while (i10 <= length) {
            int i12 = ((length - i10) / 2) + i10;
            if (jArr[iArr[i12]] >= j9) {
                length = i12 - 1;
                i11 = i12;
            } else {
                i10 = i12 + 1;
            }
        }
        if (i11 == -1) {
            return -1;
        }
        long j10 = jArr[iArr[i11]];
        if (j10 == j9) {
            while (i11 < iArr.length - 1) {
                int i13 = i11 + 1;
                if (jArr[iArr[i13]] != j10) {
                    break;
                }
                i11 = i13;
            }
        }
        return iArr[i11];
    }
}
