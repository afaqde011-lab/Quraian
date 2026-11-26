package com.google.crypto.tink.shaded.protobuf;

public final class g extends h {
    public final int E;
    public final int F;

    public g(byte[] bArr, int i10, int i11) {
        super(bArr);
        i.b(i10, i10 + i11, bArr.length);
        this.E = i10;
        this.F = i11;
    }

    @Override
    public final byte a(int i10) {
        int i11 = this.F;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.D[this.E + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException(g4.c.f(i10, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(w.c.h(i10, i11, "Index > length: ", ", "));
    }

    @Override
    public final void e(int i10, byte[] bArr) {
        System.arraycopy(this.D, this.E, bArr, 0, i10);
    }

    @Override
    public final int i() {
        return this.E;
    }

    @Override
    public final byte k(int i10) {
        return this.D[this.E + i10];
    }

    @Override
    public final int size() {
        return this.F;
    }
}
