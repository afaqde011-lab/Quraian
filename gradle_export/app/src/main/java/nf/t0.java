package nf;

public final class t0 extends u0 {
    public final int D;
    public final int E;

    public t0(byte[] bArr, int i10, int i11) {
        super(bArr);
        u0.k(i10, i10 + i11, bArr.length);
        this.D = i10;
        this.E = i11;
    }

    @Override
    public final byte a(int i10) {
        int i11 = this.E;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.B[this.D + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g4.c.f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(w.c.h(i10, i11, "Index > length: ", ", "));
    }

    @Override
    public final byte b(int i10) {
        return this.B[this.D + i10];
    }

    @Override
    public final int c() {
        return this.D;
    }

    @Override
    public final int e() {
        return this.E;
    }

    @Override
    public final void h(int i10, byte[] bArr) {
        System.arraycopy(this.B, this.D, bArr, 0, i10);
    }
}
