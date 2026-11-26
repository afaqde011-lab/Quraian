package e7;

import java.util.Arrays;

public final class q {

    public final int f5165a = 1;

    public int f5166b;

    public long[] f5167c;

    public q() {
    }

    public q(int i10) {
        this.f5167c = new long[i10];
    }

    public final void a(long j9) {
        switch (this.f5165a) {
            case 0:
                int i10 = this.f5166b;
                long[] jArr = this.f5167c;
                if (i10 == jArr.length) {
                    this.f5167c = Arrays.copyOf(jArr, i10 * 2);
                }
                long[] jArr2 = this.f5167c;
                int i11 = this.f5166b;
                this.f5166b = i11 + 1;
                jArr2[i11] = j9;
                break;
            default:
                if (!c(j9)) {
                    int i12 = this.f5166b;
                    long[] jArrCopyOf = this.f5167c;
                    if (i12 >= jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, Math.max(i12 + 1, jArrCopyOf.length * 2));
                        kotlin.jvm.internal.m.d(jArrCopyOf, "copyOf(...)");
                        this.f5167c = jArrCopyOf;
                    }
                    jArrCopyOf[i12] = j9;
                    if (i12 >= this.f5166b) {
                        this.f5166b = i12 + 1;
                    }
                }
                break;
        }
    }

    public void b(long[] jArr) {
        int length = this.f5166b + jArr.length;
        long[] jArr2 = this.f5167c;
        if (length > jArr2.length) {
            this.f5167c = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
        }
        System.arraycopy(jArr, 0, this.f5167c, this.f5166b, jArr.length);
        this.f5166b = length;
    }

    public boolean c(long j9) {
        int i10 = this.f5166b;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f5167c[i11] == j9) {
                return true;
            }
        }
        return false;
    }

    public long d(int i10) {
        if (i10 >= 0 && i10 < this.f5166b) {
            return this.f5167c[i10];
        }
        StringBuilder sbQ = oi.k.q("Invalid index ", i10, ", size is ");
        sbQ.append(this.f5166b);
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public void e(long j9) {
        int i10 = this.f5166b;
        int i11 = 0;
        while (i11 < i10) {
            if (j9 == this.f5167c[i11]) {
                int i12 = this.f5166b - 1;
                while (i11 < i12) {
                    long[] jArr = this.f5167c;
                    int i13 = i11 + 1;
                    jArr[i11] = jArr[i13];
                    i11 = i13;
                }
                this.f5166b--;
                return;
            }
            i11++;
        }
    }
}
