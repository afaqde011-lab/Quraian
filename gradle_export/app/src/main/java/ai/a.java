package ai;

import java.util.Arrays;
import zh.i;

public final class a {

    public final byte[] f486a;

    public a(int i10, byte[] bArr) {
        byte[] bArr2 = new byte[i10];
        this.f486a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i10);
    }

    public static a a(byte[] bArr) {
        if (bArr != null) {
            return new a(bArr.length, bArr);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return Arrays.equals(((a) obj).f486a, this.f486a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f486a);
    }

    public final String toString() {
        return "Bytes(" + i.f(this.f486a) + ")";
    }
}
