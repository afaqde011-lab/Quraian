package kc;

import java.util.Arrays;

public final class c {

    public final float[] f9586a;

    public final int[] f9587b;

    public c(float[] fArr, int[] iArr) {
        this.f9586a = fArr;
        this.f9587b = iArr;
    }

    public final c a(float[] fArr) {
        int iD;
        int[] iArr = new int[fArr.length];
        for (int i10 = 0; i10 < fArr.length; i10++) {
            float f3 = fArr[i10];
            float[] fArr2 = this.f9586a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f3);
            int[] iArr2 = this.f9587b;
            if (iBinarySearch >= 0) {
                iD = iArr2[iBinarySearch];
            } else {
                int i11 = -(iBinarySearch + 1);
                if (i11 == 0) {
                    iD = iArr2[0];
                } else if (i11 == iArr2.length - 1) {
                    iD = iArr2[iArr2.length - 1];
                } else {
                    int i12 = i11 - 1;
                    float f10 = fArr2[i12];
                    iD = w50.c.D((f3 - f10) / (fArr2[i11] - f10), iArr2[i12], iArr2[i11]);
                }
            }
            iArr[i10] = iD;
        }
        return new c(fArr, iArr);
    }
}
