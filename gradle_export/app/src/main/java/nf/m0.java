package nf;

public final class m0 extends o0 {

    public final char[] f11245e;

    public m0(l0 l0Var) {
        super(l0Var, (Character) null);
        this.f11245e = new char[512];
        char[] cArr = l0Var.f11238b;
        if (cArr.length != 16) {
            throw new IllegalArgumentException();
        }
        for (int i10 = 0; i10 < 256; i10++) {
            char[] cArr2 = this.f11245e;
            cArr2[i10] = cArr[i10 >>> 4];
            cArr2[i10 | 256] = cArr[i10 & 15];
        }
    }

    @Override
    public final void a(StringBuilder sb2, byte[] bArr, int i10) {
        b.m(0, i10, bArr.length);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = bArr[i11] & 255;
            char[] cArr = this.f11245e;
            sb2.append(cArr[i12]);
            sb2.append(cArr[i12 | 256]);
        }
    }
}
