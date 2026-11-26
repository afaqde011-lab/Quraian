package zh;

import java.nio.charset.Charset;

public abstract class f {

    public static final Charset f17472a = Charset.forName("UTF-8");

    public static byte[] a(java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: zh.f.a(java.lang.String):byte[]");
    }

    public static byte[] b(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = e.f17471h;
        int i10 = (length / 3) * 4;
        if (length % 3 > 0) {
            i10 += 4;
        }
        byte[] bArr3 = new byte[i10];
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        while (true) {
            int i14 = i11 + 3;
            if (i14 > length) {
                break;
            }
            int i15 = (bArr[i11 + 2] & 255) | ((bArr[i11] & 255) << 16) | ((bArr[i11 + 1] & 255) << 8);
            bArr3[i12] = bArr2[(i15 >> 18) & 63];
            bArr3[i12 + 1] = bArr2[(i15 >> 12) & 63];
            bArr3[i12 + 2] = bArr2[(i15 >> 6) & 63];
            bArr3[i12 + 3] = bArr2[i15 & 63];
            int i16 = i12 + 4;
            i13--;
            if (i13 == 0) {
                i12 += 5;
                bArr3[i16] = 10;
                i13 = 19;
            } else {
                i12 = i16;
            }
            i11 = i14;
        }
        if (i11 == length - 1) {
            int i17 = (bArr[i11] & 255) << 4;
            bArr3[i12] = bArr2[(i17 >> 6) & 63];
            bArr3[i12 + 1] = bArr2[i17 & 63];
            bArr3[i12 + 2] = 61;
            bArr3[i12 + 3] = 61;
            return bArr3;
        }
        if (i11 == length - 2) {
            int i18 = ((bArr[i11 + 1] & 255) << 2) | ((bArr[i11] & 255) << 10);
            bArr3[i12] = bArr2[(i18 >> 12) & 63];
            bArr3[i12 + 1] = bArr2[(i18 >> 6) & 63];
            bArr3[i12 + 2] = bArr2[i18 & 63];
            bArr3[i12 + 3] = 61;
        }
        return bArr3;
    }
}
