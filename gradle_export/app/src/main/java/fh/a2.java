package fh;

import java.util.Arrays;

public final class a2 {

    public transient Object[] f5664a;

    public transient int[] f5665b;

    public transient int f5666c;

    public transient int[] f5667d;

    public transient long[] f5668e;

    public transient float f5669f;

    public transient int f5670g;

    public final void a(int i10) {
        if (i10 > this.f5668e.length) {
            f(i10);
        }
        if (i10 >= this.f5670g) {
            g(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    public final int b(Object obj) {
        int iC = c(obj);
        if (iC == -1) {
            return 0;
        }
        return this.f5665b[iC];
    }

    public final int c(Object obj) {
        int iX = w.x(obj);
        int[] iArr = this.f5667d;
        int i10 = iArr[(iArr.length - 1) & iX];
        while (i10 != -1) {
            long j9 = this.f5668e[i10];
            if (((int) (j9 >>> 32)) == iX && w50.c.A(obj, this.f5664a[i10])) {
                return i10;
            }
            i10 = (int) j9;
        }
        return -1;
    }

    public final void d(int i10) {
        ta.c0.r("Initial capacity must be non-negative", i10 >= 0);
        int iMax = Math.max(i10, 2);
        int iHighestOneBit = Integer.highestOneBit(iMax);
        if (iMax > ((int) (((double) 1.0f) * ((double) iHighestOneBit))) && (iHighestOneBit = iHighestOneBit << 1) <= 0) {
            iHighestOneBit = 1073741824;
        }
        int[] iArr = new int[iHighestOneBit];
        Arrays.fill(iArr, -1);
        this.f5667d = iArr;
        this.f5669f = 1.0f;
        this.f5664a = new Object[i10];
        this.f5665b = new int[i10];
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        this.f5668e = jArr;
        this.f5670g = Math.max(1, (int) (iHighestOneBit * 1.0f));
    }

    public final void e(int i10, Object obj) {
        long j9;
        if (i10 <= 0) {
            throw new IllegalArgumentException(g4.c.f(i10, "count must be positive but was: "));
        }
        long[] jArr = this.f5668e;
        Object[] objArr = this.f5664a;
        int[] iArr = this.f5665b;
        int iX = w.x(obj);
        int[] iArr2 = this.f5667d;
        int length = (iArr2.length - 1) & iX;
        int i11 = this.f5666c;
        int i12 = iArr2[length];
        if (i12 == -1) {
            iArr2[length] = i11;
            j9 = 4294967295L;
        } else {
            while (true) {
                long j10 = jArr[i12];
                j9 = 4294967295L;
                if (((int) (j10 >>> 32)) == iX && w50.c.A(obj, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return;
                } else {
                    int i14 = (int) j10;
                    if (i14 == -1) {
                        jArr[i12] = ((-4294967296L) & j10) | (((long) i11) & 4294967295L);
                        break;
                    }
                    i12 = i14;
                }
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i15 = i11 + 1;
        int length2 = this.f5668e.length;
        if (i15 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            int i16 = iMax >= 0 ? iMax : Integer.MAX_VALUE;
            if (i16 != length2) {
                f(i16);
            }
        }
        this.f5668e[i11] = (((long) iX) << 32) | j9;
        this.f5664a[i11] = obj;
        this.f5665b[i11] = i10;
        this.f5666c = i15;
        if (i11 >= this.f5670g) {
            g(this.f5667d.length * 2);
        }
    }

    public final void f(int i10) {
        this.f5664a = Arrays.copyOf(this.f5664a, i10);
        this.f5665b = Arrays.copyOf(this.f5665b, i10);
        long[] jArr = this.f5668e;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f5668e = jArrCopyOf;
    }

    public final void g(int i10) {
        if (this.f5667d.length >= 1073741824) {
            this.f5670g = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f5669f)) + 1;
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        long[] jArr = this.f5668e;
        int i12 = i10 - 1;
        for (int i13 = 0; i13 < this.f5666c; i13++) {
            int i14 = (int) (jArr[i13] >>> 32);
            int i15 = i14 & i12;
            int i16 = iArr[i15];
            iArr[i15] = i13;
            jArr[i13] = (((long) i14) << 32) | (((long) i16) & 4294967295L);
        }
        this.f5670g = i11;
        this.f5667d = iArr;
    }
}
