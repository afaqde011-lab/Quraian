package gh;

import ta.c0;

public final class c extends d {
    public c(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new a(str, charArray), (Character) '=');
        c0.s(charArray.length == 64);
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        c0.y(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = i11 + 2;
            int i14 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16);
            i11 += 3;
            int i15 = i14 | (bArr[i13] & 255);
            a aVar = this.f6333a;
            char[] cArr = aVar.f6324b;
            char[] cArr2 = aVar.f6324b;
            sb2.append(cArr[i15 >>> 18]);
            sb2.append(cArr2[(i15 >>> 12) & 63]);
            sb2.append(cArr2[(i15 >>> 6) & 63]);
            sb2.append(cArr2[i15 & 63]);
        }
        if (i11 < i10) {
            a(sb2, bArr, i11, i10 - i11);
        }
    }
}
