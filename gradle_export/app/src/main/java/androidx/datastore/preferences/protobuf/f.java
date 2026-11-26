package androidx.datastore.preferences.protobuf;

public final class f extends g {
    public final int E;
    public final int F;

    public f(byte[] bArr, int i10, int i11) {
        super(bArr);
        g.b(i10, i10 + i11, bArr.length);
        this.E = i10;
        this.F = i11;
    }

    @Override
    public final byte a(int i10) {
        int i11 = this.F;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.B[this.E + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g4.c.f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(w.c.h(i10, i11, "Index > length: ", ", "));
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        System.arraycopy(this.B, this.E, bArr, 0, i10);
    }

    @Override
    public final int h() {
        return this.E;
    }

    @Override
    public final byte i(int i10) {
        return this.B[this.E + i10];
    }

    @Override
    public final int size() {
        return this.F;
    }
}
