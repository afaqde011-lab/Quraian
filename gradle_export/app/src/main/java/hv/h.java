package hv;

import ab.a0;

public final class h implements h0.h {
    public final float a;

    public h(float f) {
        this.a = f;
    }

    public final void b(y3.c cVar, int i, int[] iArr, int[] iArr2) {
        kotlin.jvm.internal.m.e(cVar, "<this>");
        int i2 = 0;
        int i3 = 0;
        for (int i4 : iArr) {
            i3 += i4;
        }
        int i5 = i - i3;
        if (i5 < 0) {
            i5 = 0;
        }
        int iY = a0.y(cVar.R0(this.a) + (i5 / 2), 0, i5);
        int length = iArr.length;
        int i6 = 0;
        while (i2 < length) {
            int i7 = iArr[i2];
            iArr2[i6] = iY;
            iY += i7;
            i2++;
            i6++;
        }
    }
}
