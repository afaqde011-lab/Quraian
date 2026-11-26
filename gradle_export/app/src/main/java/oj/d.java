package oj;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class d extends FilterInputStream {
    public long A;
    public long B;

    public d(InputStream inputStream) {
        super(inputStream);
        this.B = -1L;
        this.A = 1048577L;
    }

    @Override
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.A);
    }

    @Override
    public final synchronized void mark(int i10) {
        ((FilterInputStream) this).in.mark(i10);
        this.B = this.A;
    }

    @Override
    public final int read() throws IOException {
        if (this.A == 0) {
            return -1;
        }
        int i10 = ((FilterInputStream) this).in.read();
        if (i10 != -1) {
            this.A--;
        }
        return i10;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j9 = this.A;
        if (j9 == 0) {
            return -1;
        }
        int i12 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j9));
        if (i12 != -1) {
            this.A -= (long) i12;
        }
        return i12;
    }

    @Override
    public final synchronized void reset() {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.B == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.A = this.B;
    }

    @Override
    public final long skip(long j9) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(Math.min(j9, this.A));
        this.A -= jSkip;
        return jSkip;
    }
}
