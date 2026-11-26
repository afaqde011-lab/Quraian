package mh;

import java.util.Arrays;

public final class k implements Comparable {
    public final byte[] A;

    public k(byte[] bArr) {
        this.A = Arrays.copyOf(bArr, bArr.length);
    }

    @Override
    public final int compareTo(Object obj) {
        k kVar = (k) obj;
        byte[] bArr = this.A;
        int length = bArr.length;
        byte[] bArr2 = kVar.A;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b7 = bArr[i10];
            byte b10 = kVar.A[i10];
            if (b7 != b10) {
                return b7 - b10;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return Arrays.equals(this.A, ((k) obj).A);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    public final String toString() {
        return zh.i.f(this.A);
    }
}
