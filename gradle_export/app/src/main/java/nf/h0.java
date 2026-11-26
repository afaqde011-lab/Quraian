package nf;

public abstract class h0 {
    public static final char[] A = "0123456789abcdef".toCharArray();

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj instanceof h0) {
            byte[] bArr = ((g0) this).B;
            int length = bArr.length * 8;
            byte[] bArr2 = ((g0) ((h0) obj)).B;
            if (length == bArr2.length * 8) {
                if (bArr.length == bArr2.length) {
                    z10 = true;
                    for (int i10 = 0; i10 < bArr.length; i10++) {
                        z10 &= bArr[i10] == bArr2[i10];
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        byte[] bArr = ((g0) this).B;
        if (bArr.length * 8 < 32) {
            int i10 = bArr[0] & 255;
            for (int i11 = 1; i11 < bArr.length; i11++) {
                i10 |= (bArr[i11] & 255) << (i11 * 8);
            }
            return i10;
        }
        int length = bArr.length;
        if (length < 4) {
            throw new IllegalStateException(b.c("HashCode#asInt() requires >= 4 bytes (it only has %s bytes).", Integer.valueOf(length)));
        }
        int i12 = bArr[0] & 255;
        int i13 = bArr[1] & 255;
        int i14 = bArr[2] & 255;
        return ((bArr[3] & 255) << 24) | i12 | (i13 << 8) | (i14 << 16);
    }

    public final String toString() {
        byte[] bArr = ((g0) this).B;
        int length = bArr.length;
        StringBuilder sb2 = new StringBuilder(length + length);
        for (byte b7 : bArr) {
            char[] cArr = A;
            sb2.append(cArr[(b7 >> 4) & 15]);
            sb2.append(cArr[b7 & 15]);
        }
        return sb2.toString();
    }
}
