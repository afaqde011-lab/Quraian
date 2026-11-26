package nf;

public final class n0 extends o0 {
    public n0(String str, String str2) {
        char[] charArray = str2.toCharArray();
        super(new l0(str, charArray), (Character) '=');
        if (charArray.length != 64) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        int i11 = 0;
        b.m(0, i10, bArr.length);
        for (int i12 = i10; i12 >= 3; i12 -= 3) {
            int i13 = ((bArr[i11 + 1] & 255) << 8) | ((bArr[i11] & 255) << 16) | (bArr[i11 + 2] & 255);
            l0 l0Var = this.f11249a;
            char[] cArr = l0Var.f11238b;
            char[] cArr2 = l0Var.f11238b;
            sb2.append(cArr[i13 >>> 18]);
            sb2.append(cArr2[(i13 >>> 12) & 63]);
            sb2.append(cArr2[(i13 >>> 6) & 63]);
            sb2.append(cArr2[i13 & 63]);
            i11 += 3;
        }
        if (i11 < i10) {
            b(sb2, bArr, i11, i10 - i11);
        }
    }
}
