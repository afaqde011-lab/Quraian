package nf;

import com.google.android.gms.cast.Cast;
import java.math.RoundingMode;
import java.util.Arrays;

public final class l0 {

    public final String f11237a;

    public final char[] f11238b;

    public final int f11239c;

    public final int f11240d;

    public final int f11241e;

    public final int f11242f;

    public final byte[] f11243g;

    public final boolean f11244h;

    public l0(String str, char[] cArr) {
        byte[] bArr = new byte[Cast.MAX_NAMESPACE_LENGTH];
        Arrays.fill(bArr, (byte) -1);
        for (int i10 = 0; i10 < cArr.length; i10++) {
            char c10 = cArr[i10];
            if (!(c10 < 128)) {
                throw new IllegalArgumentException(b.c("Non-ASCII character: %s", Character.valueOf(c10)));
            }
            if (!(bArr[c10] == -1)) {
                throw new IllegalArgumentException(b.c("Duplicate character: %s", Character.valueOf(c10)));
            }
            bArr[c10] = (byte) i10;
        }
        this(str, cArr, bArr, false);
    }

    public l0(String str, char[] cArr, byte[] bArr, boolean z10) {
        int iNumberOfLeadingZeros;
        boolean[] zArr;
        int i10;
        this.f11237a = str;
        cArr.getClass();
        this.f11238b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            if (length <= 0) {
                throw new IllegalArgumentException("x (0) must be > 0");
            }
            switch (p0.f11252a[roundingMode.ordinal()]) {
                case 1:
                    if (((length - 1) & length) != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                case 2:
                case 3:
                    iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(length);
                    this.f11240d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i11 = 1 << (3 - iNumberOfTrailingZeros);
                    this.f11241e = i11;
                    this.f11242f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros;
                    this.f11239c = length - 1;
                    this.f11243g = bArr;
                    zArr = new boolean[i11];
                    for (i10 = 0; i10 < this.f11242f; i10++) {
                        int i12 = this.f11240d;
                        RoundingMode roundingMode2 = RoundingMode.CEILING;
                        zArr[b.a(i10 * 8, i12)] = true;
                    }
                    this.f11244h = z10;
                    return;
                case 4:
                case 5:
                    iNumberOfLeadingZeros = 32 - Integer.numberOfLeadingZeros(length - 1);
                    this.f11240d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros2 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i13 = 1 << (3 - iNumberOfTrailingZeros2);
                    this.f11241e = i13;
                    this.f11242f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros2;
                    this.f11239c = length - 1;
                    this.f11243g = bArr;
                    zArr = new boolean[i13];
                    while (i10 < this.f11242f) {
                        int i14 = this.f11240d;
                        RoundingMode roundingMode3 = RoundingMode.CEILING;
                        zArr[b.a(i10 * 8, i14)] = true;
                    }
                    this.f11244h = z10;
                    return;
                case 6:
                case 7:
                case 8:
                    int iNumberOfLeadingZeros2 = Integer.numberOfLeadingZeros(length);
                    iNumberOfLeadingZeros = (31 - iNumberOfLeadingZeros2) + ((((-1257966797) >>> iNumberOfLeadingZeros2) - length) >>> 31);
                    this.f11240d = iNumberOfLeadingZeros;
                    int iNumberOfTrailingZeros3 = Integer.numberOfTrailingZeros(iNumberOfLeadingZeros);
                    int i15 = 1 << (3 - iNumberOfTrailingZeros3);
                    this.f11241e = i15;
                    this.f11242f = iNumberOfLeadingZeros >> iNumberOfTrailingZeros3;
                    this.f11239c = length - 1;
                    this.f11243g = bArr;
                    zArr = new boolean[i15];
                    while (i10 < this.f11242f) {
                        int i16 = this.f11240d;
                        RoundingMode roundingMode4 = RoundingMode.CEILING;
                        zArr[b.a(i10 * 8, i16)] = true;
                    }
                    this.f11244h = z10;
                    return;
                default:
                    throw new AssertionError();
            }
        } catch (ArithmeticException e3) {
            throw new IllegalArgumentException(g4.c.f(cArr.length, "Illegal alphabet length "), e3);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f11244h == l0Var.f11244h && Arrays.equals(this.f11238b, l0Var.f11238b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f11238b) + (true != this.f11244h ? 1237 : 1231);
    }

    public final String toString() {
        return this.f11237a;
    }
}
