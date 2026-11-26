package y5;

import java.io.IOException;
import java.io.InputStream;

public final class f extends b {
    public f(InputStream inputStream) {
        super(inputStream);
        if (!inputStream.markSupported()) {
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
        this.A.mark(Integer.MAX_VALUE);
    }

    public f(byte[] bArr) {
        super(bArr);
        this.A.mark(Integer.MAX_VALUE);
    }

    public final void i(long j9) throws IOException {
        int i10 = this.B;
        if (i10 > j9) {
            this.B = 0;
            this.A.reset();
        } else {
            j9 -= (long) i10;
        }
        a((int) j9);
    }
}
