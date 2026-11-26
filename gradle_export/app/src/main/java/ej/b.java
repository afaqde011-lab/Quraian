package ej;

import java.io.OutputStream;

public final class b extends OutputStream {
    public long A;

    @Override
    public final void write(int i10) {
        this.A++;
    }

    @Override
    public final void write(byte[] bArr) {
        this.A += (long) bArr.length;
    }

    @Override
    public final void write(byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 < 0 || i10 > bArr.length || i11 < 0 || (i12 = i10 + i11) > bArr.length || i12 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.A += (long) i11;
    }
}
