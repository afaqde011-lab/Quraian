package o20;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public final class a extends FilterInputStream {
    public int A;

    public a(ByteArrayInputStream byteArrayInputStream, int i) {
        super(byteArrayInputStream);
        this.A = i;
    }

    @Override
    public final int available() {
        return Math.min(super.available(), this.A);
    }

    @Override
    public final int read() throws IOException {
        if (this.A <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.A--;
        }
        return i;
    }

    @Override
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.A;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.A -= i4;
        }
        return i4;
    }

    @Override
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(Math.min(j, this.A));
        if (jSkip >= 0) {
            this.A = (int) (((long) this.A) - jSkip);
        }
        return jSkip;
    }
}
