package a1;

import java.util.Arrays;

public final class c1 {

    public int[] f27a;

    public int f28b;

    public c1(int i10) {
        this.f27a = new int[i10];
    }

    public c1(int i10, boolean z10) {
        switch (i10) {
            case 2:
                this.f27a = new int[10];
                break;
            default:
                this.f27a = new int[30];
                break;
        }
    }

    public static long b(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = z10 ? i12 : i13;
        if (z10) {
            i12 = i13;
        }
        if (i10 < i11) {
            return m3.h0.b(i10, i10);
        }
        if (i10 == i11) {
            return i14 == 0 ? m3.h0.b(i11, i12 + i11) : m3.h0.b(i11, i11);
        }
        if (i10 < i11 + i14) {
            return i12 == 0 ? m3.h0.b(i11, i11) : m3.h0.b(i11, i12 + i11);
        }
        int i15 = (i10 - i14) + i12;
        return m3.h0.b(i15, i15);
    }

    public long a(int i10, boolean z10) {
        int iMax;
        int[] iArr = this.f27a;
        int i11 = this.f28b;
        if (i11 < 0) {
            iMax = i10;
        } else if (z10) {
            iMax = i10;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i12 * 3;
                int i14 = iArr[i13];
                int i15 = iArr[i13 + 1];
                int i16 = iArr[i13 + 2];
                long jB = b(z10, i10, i14, i15, i16);
                long jB2 = b(z10, iMax, i14, i15, i16);
                int i17 = m3.q0.f10519c;
                i10 = Math.min((int) (jB >> 32), (int) (jB2 >> 32));
                iMax = Math.max((int) (jB & 4294967295L), (int) (jB2 & 4294967295L));
            }
        } else {
            iMax = i10;
            for (int i18 = i11 - 1; -1 < i18; i18--) {
                int i19 = i18 * 3;
                int i20 = iArr[i19];
                int i21 = iArr[i19 + 1];
                int i22 = iArr[i19 + 2];
                long jB3 = b(z10, i10, i20, i21, i22);
                long jB4 = b(z10, iMax, i20, i21, i22);
                int i23 = m3.q0.f10519c;
                i10 = Math.min((int) (jB3 >> 32), (int) (jB4 >> 32));
                iMax = Math.max((int) (jB3 & 4294967295L), (int) (jB4 & 4294967295L));
            }
        }
        return m3.h0.b(i10, iMax);
    }

    public int c(int i10) {
        int i11 = this.f28b - 1;
        return i11 >= 0 ? this.f27a[i11] : i10;
    }

    public int d() {
        int[] iArr = this.f27a;
        int i10 = this.f28b - 1;
        this.f28b = i10;
        return iArr[i10];
    }

    public void e(int i10) {
        int[] iArrCopyOf = this.f27a;
        if (this.f28b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f27a = iArrCopyOf;
        }
        int i11 = this.f28b;
        this.f28b = i11 + 1;
        iArrCopyOf[i11] = i10;
    }

    public void f(int i10, int i11, int i12) {
        int i13 = this.f28b;
        int[] iArrCopyOf = this.f27a;
        int i14 = i13 + 3;
        if (i14 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f27a = iArrCopyOf;
        }
        iArrCopyOf[i13] = i10 + i12;
        iArrCopyOf[i13 + 1] = i11 + i12;
        iArrCopyOf[i13 + 2] = i12;
        this.f28b = i14;
    }

    public void g(int i10, int i11, int i12, int i13) {
        int i14 = this.f28b;
        int[] iArrCopyOf = this.f27a;
        int i15 = i14 + 4;
        if (i15 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
            this.f27a = iArrCopyOf;
        }
        iArrCopyOf[i14] = i10;
        iArrCopyOf[i14 + 1] = i11;
        iArrCopyOf[i14 + 2] = i12;
        iArrCopyOf[i14 + 3] = i13;
        this.f28b = i15;
    }

    public void h(int i10, int i11) {
        if (i10 < i11) {
            int i12 = i10 - 3;
            for (int i13 = i10; i13 < i11; i13 += 3) {
                int[] iArr = this.f27a;
                int i14 = iArr[i13];
                int i15 = iArr[i11];
                if (i14 < i15 || (i14 == i15 && iArr[i13 + 1] <= iArr[i11 + 1])) {
                    i12 += 3;
                    j(i12, i13);
                }
            }
            j(i12 + 3, i11);
            h(i10, i12);
            h(i12 + 6, i11);
        }
    }

    public void i(int i10, int i11, int i12) {
        if (!(i12 >= 0)) {
            g0.a.a("Expected newLen to be ≥ 0, was " + i12);
        }
        int iMin = Math.min(i10, i11);
        int iMax = Math.max(iMin, i11) - iMin;
        if (iMax >= 2 || iMax != i12) {
            int i13 = this.f28b + 1;
            int[] iArr = this.f27a;
            if (i13 > iArr.length / 3) {
                int[] iArrCopyOf = Arrays.copyOf(this.f27a, Math.max(i13 * 2, (iArr.length / 3) * 2) * 3);
                kotlin.jvm.internal.m.d(iArrCopyOf, "copyOf(...)");
                this.f27a = iArrCopyOf;
            }
            int[] iArr2 = this.f27a;
            int i14 = this.f28b * 3;
            iArr2[i14] = iMin;
            iArr2[i14 + 1] = iMax;
            iArr2[i14 + 2] = i12;
            this.f28b = i13;
        }
    }

    public void j(int i10, int i11) {
        int[] iArr = this.f27a;
        int i12 = iArr[i10];
        iArr[i10] = iArr[i11];
        iArr[i11] = i12;
        int i13 = i10 + 1;
        int i14 = i11 + 1;
        int i15 = iArr[i13];
        iArr[i13] = iArr[i14];
        iArr[i14] = i15;
        int i16 = i10 + 2;
        int i17 = i11 + 2;
        int i18 = iArr[i16];
        iArr[i16] = iArr[i17];
        iArr[i17] = i18;
    }
}
