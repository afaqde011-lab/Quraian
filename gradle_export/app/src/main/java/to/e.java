package to;

import ab.a0;
import android.graphics.Bitmap;
import h00.n;

public final class e implements zb.c {
    public static void c(int[] iArr, int i, int i2) {
        iArr[0] = ((i >>> 24) * i2) + iArr[0];
        iArr[1] = (((i >> 16) & 255) * i2) + iArr[1];
        iArr[2] = (((i >> 8) & 255) * i2) + iArr[2];
        iArr[3] = (i2 * (i & 255)) + iArr[3];
    }

    public static void d(int i, int i2, int i3, int i4, int i5, int[] iArr, int[] iArr2) {
        int i6 = (i5 * 2) + 1;
        int[] iArr3 = new int[4];
        for (int i7 = 0; i7 < i; i7++) {
            int i8 = i7 * i3;
            n.A0(iArr3, 0);
            int i9 = -i5;
            if (i9 <= i5) {
                while (true) {
                    c(iArr3, iArr[(a0.y(i9, 0, i2 - 1) * i4) + i8], 1);
                    if (i9 == i5) {
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            for (int i11 = 0; i11 < i2; i11++) {
                iArr2[(i11 * i4) + i8] = ((iArr3[0] / i6) << 24) | ((iArr3[1] / i6) << 16) | ((iArr3[2] / i6) << 8) | (iArr3[3] / i6);
                int i12 = i2 - 1;
                c(iArr3, iArr[(a0.y(i11 - i5, 0, i12) * i4) + i8], -1);
                c(iArr3, iArr[(a0.y(i11 + i5 + 1, 0, i12) * i4) + i8], 1);
            }
        }
    }

    public final Bitmap a(Bitmap bitmap, xb.g gVar) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i];
        int iMin = Math.min(width, height) / 6;
        int i2 = iMin < 1 ? 1 : iMin;
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = width;
            int[] iArr3 = iArr2;
            int[] iArr4 = iArr;
            d(height, i4, i4, 1, i2, iArr4, iArr3);
            width = i4;
            iArr2 = iArr3;
            d(width, height, 1, width, i2, iArr2, iArr4);
            iArr = iArr4;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.m.d(bitmapCreateBitmap, "createBitmap(...)");
        bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmapCreateBitmap;
    }

    public final String b() {
        return "glow";
    }
}
