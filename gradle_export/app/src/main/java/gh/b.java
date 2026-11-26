package gh;

import ta.c0;

public final class b extends d {

    public final char[] f6331e;

    public b(a aVar) {
        super(aVar, (Character) null);
        this.f6331e = new char[512];
        char[] cArr = aVar.f6324b;
        c0.s(cArr.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f6331e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override
    public final void b(StringBuilder sb2, byte[] bArr, int i10) {
        c0.y(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f6331e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
