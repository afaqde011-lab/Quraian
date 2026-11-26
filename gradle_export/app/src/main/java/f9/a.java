package f9;

import a8.n0;
import android.graphics.Rect;
import java.util.Arrays;

public final class a {

    public boolean f5570b;

    public boolean f5571c;

    public int[] f5572d;

    public int f5573e;

    public int f5574f;

    public Rect f5575g;

    public final int[] f5569a = new int[4];

    public int f5576h = -1;

    public int f5577i = -1;

    public static int a(int[] iArr, int i10) {
        return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
    }

    public static int c(int i10, int i11) {
        return (i10 & 16777215) | ((i11 * 17) << 24);
    }

    public final void b(n0 n0Var, boolean z10, Rect rect, int[] iArr) {
        int i10;
        int i11;
        int iWidth = rect.width();
        int iHeight = rect.height();
        int i12 = !z10 ? 1 : 0;
        int i13 = i12 * iWidth;
        while (true) {
            int i14 = 0;
            do {
                int i15 = 1;
                int i16 = 0;
                while (true) {
                    if (i16 >= i15 || i15 > 64) {
                        i10 = i16 & 3;
                        if (i16 >= 4) {
                            i11 = i16 >> 2;
                            break;
                        } else {
                            i11 = iWidth;
                            break;
                        }
                    }
                    if (n0Var.b() < 4) {
                        i10 = -1;
                        i11 = 0;
                        break;
                    } else {
                        i16 = (i16 << 4) | n0Var.i(4);
                        i15 <<= 2;
                    }
                }
                int iMin = Math.min(i11, iWidth - i14);
                if (iMin > 0) {
                    int i17 = i13 + iMin;
                    Arrays.fill(iArr, i13, i17, this.f5569a[i10]);
                    i14 += iMin;
                    i13 = i17;
                }
            } while (i14 < iWidth);
            i12 += 2;
            if (i12 >= iHeight) {
                return;
            }
            i13 = i12 * iWidth;
            n0Var.c();
        }
    }
}
