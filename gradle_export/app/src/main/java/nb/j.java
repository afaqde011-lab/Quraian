package nb;

import java.io.IOException;
import java.io.InputStream;

public final class j extends InputStream {
    public final InputStream A;
    public int B = 1073741824;

    public j(InputStream inputStream) {
        this.A = inputStream;
    }

    @Override
    public final int available() {
        return this.B;
    }

    @Override
    public final void close() throws IOException {
        this.A.close();
    }

    @Override
    public final int read() throws IOException {
        int i10 = this.A.read();
        if (i10 == -1) {
            this.B = 0;
        }
        return i10;
    }

    @Override
    public final int read(byte[] bArr) throws IOException {
        int i10 = this.A.read(bArr);
        if (i10 == -1) {
            this.B = 0;
        }
        return i10;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.A.read(bArr, i10, i11);
        if (i12 == -1) {
            this.B = 0;
        }
        return i12;
    }

    @Override
    public final long skip(long j9) {
        return this.A.skip(j9);
    }
}
