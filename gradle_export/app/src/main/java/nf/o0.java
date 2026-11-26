package nf;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

public class o0 {

    public static final m0 f11248d;

    public final l0 f11249a;

    public final Character f11250b;

    public volatile o0 f11251c;

    static {
        new n0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new n0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new o0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new o0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f11248d = new m0(new l0("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public o0(String str, String str2) {
        this(new l0(str, str2.toCharArray()), (Character) '=');
    }

    public o0(l0 l0Var, Character ch2) {
        this.f11249a = l0Var;
        if (ch2 != null) {
            byte[] bArr = l0Var.f11243g;
            if (bArr.length > 61 && bArr[61] != -1) {
                throw new IllegalArgumentException(b.c("Padding character %s was already in alphabet", ch2));
            }
        }
        this.f11250b = ch2;
    }

    public void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        b.m(0, i10, bArr.length);
        while (i11 < i10) {
            l0 l0Var = this.f11249a;
            b(sb2, bArr, i11, Math.min(l0Var.f11242f, i10 - i11));
            i11 += l0Var.f11242f;
        }
    }

    public final void b(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        b.m(i10, i10 + i11, bArr.length);
        l0 l0Var = this.f11249a;
        int i12 = l0Var.f11242f;
        int i13 = l0Var.f11240d;
        if (i11 > i12) {
            throw new IllegalArgumentException();
        }
        int i14 = 0;
        long j9 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j9 = (j9 | ((long) (bArr[i10 + i15] & 255))) << 8;
        }
        int i16 = (i11 + 1) * 8;
        while (i14 < i11 * 8) {
            sb2.append(l0Var.f11238b[((int) (j9 >>> ((i16 - i13) - i14))) & l0Var.f11239c]);
            i14 += i13;
        }
        if (this.f11250b != null) {
            while (i14 < l0Var.f11242f * 8) {
                sb2.append('=');
                i14 += i13;
            }
        }
    }

    public final String c(int i10, byte[] bArr) {
        b.m(0, i10, bArr.length);
        l0 l0Var = this.f11249a;
        int i11 = l0Var.f11242f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb2 = new StringBuilder(l0Var.f11241e * b.a(i10, i11));
        try {
            a(sb2, bArr, i10);
            return sb2.toString();
        } catch (IOException e3) {
            throw new AssertionError(e3);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o0) {
            o0 o0Var = (o0) obj;
            if (this.f11249a.equals(o0Var.f11249a) && Objects.equals(this.f11250b, o0Var.f11250b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f11250b) ^ this.f11249a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        l0 l0Var = this.f11249a;
        sb2.append(l0Var);
        if (8 % l0Var.f11240d != 0) {
            Character ch2 = this.f11250b;
            if (ch2 == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(ch2);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }
}
