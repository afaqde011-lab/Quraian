package gh;

import com.google.android.gms.cast.Cast;
import com.google.android.gms.internal.measurement.y3;
import java.math.RoundingMode;
import java.util.Arrays;

public final class a {

    public final String f6323a;

    public final char[] f6324b;

    public final int f6325c;

    public final int f6326d;

    public final int f6327e;

    public final int f6328f;

    public final byte[] f6329g;

    public final boolean f6330h;

    public a(String str, char[] cArr) {
        byte[] bArr = new byte[Cast.MAX_NAMESPACE_LENGTH];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(ze.d.H("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(ze.d.H("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public a(String str, char[] cArr, byte[] bArr, boolean z10) {
        str.getClass();
        this.f6323a = str;
        cArr.getClass();
        this.f6324b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iP = y3.P(length);
            this.f6326d = iP;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iP);
            int i10 = 1 << (3 - iNumberOfTrailingZeros);
            this.f6327e = i10;
            this.f6328f = iP >> iNumberOfTrailingZeros;
            this.f6325c = cArr.length - 1;
            this.f6329g = bArr;
            boolean[] zArr = new boolean[i10];
            for (int i11 = 0; i11 < this.f6328f; i11++) {
                int i12 = this.f6326d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[y3.A(i11 * 8, i12)] = true;
            }
            this.f6330h = z10;
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6330h == aVar.f6330h && Arrays.equals(this.f6324b, aVar.f6324b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6324b) + (this.f6330h ? 1231 : 1237);
    }

    public final String toString() {
        return this.f6323a;
    }
}
