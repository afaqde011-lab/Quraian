package gh;

import java.util.Objects;
import ta.c0;

public class d {

    public static final b f6332d;

    public final a f6333a;

    public final Character f6334b;

    public volatile d f6335c;

    static {
        new c("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new c("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new d("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new d("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        f6332d = new b(new a("base16()", "0123456789ABCDEF".toCharArray()));
    }

    public d(a aVar, Character ch2) {
        boolean z10;
        this.f6333a = aVar;
        if (ch2 != null) {
            char cCharValue = ch2.charValue();
            byte[] bArr = aVar.f6329g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = true;
        }
        c0.t(z10, "Padding character %s was already in alphabet", ch2);
        this.f6334b = ch2;
    }

    public d(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    public final void a(StringBuilder sb2, byte[] bArr, int i10, int i11) {
        c0.y(i10, i10 + i11, bArr.length);
        a aVar = this.f6333a;
        int i12 = aVar.f6328f;
        int i13 = aVar.f6326d;
        int i14 = 0;
        c0.s(i11 <= i12);
        long j9 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            j9 = (j9 | ((long) (bArr[i10 + i15] & 255))) << 8;
        }
        int i16 = ((i11 + 1) * 8) - i13;
        while (i14 < i11 * 8) {
            sb2.append(aVar.f6324b[((int) (j9 >>> (i16 - i14))) & aVar.f6325c]);
            i14 += i13;
        }
        Character ch2 = this.f6334b;
        if (ch2 != null) {
            while (i14 < aVar.f6328f * 8) {
                sb2.append(ch2.charValue());
                i14 += i13;
            }
        }
    }

    public void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        c0.y(0, i10, bArr.length);
        while (i11 < i10) {
            a aVar = this.f6333a;
            a(sb2, bArr, i11, Math.min(aVar.f6328f, i10 - i11));
            i11 += aVar.f6328f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f6333a.equals(dVar.f6333a) && Objects.equals(this.f6334b, dVar.f6334b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f6334b) ^ this.f6333a.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        a aVar = this.f6333a;
        sb2.append(aVar);
        if (8 % aVar.f6326d != 0) {
            Character ch2 = this.f6334b;
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
