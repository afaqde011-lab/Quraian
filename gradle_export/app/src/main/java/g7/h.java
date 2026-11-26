package g7;

import java.io.InputStream;
import ta.c0;

public final class h extends InputStream {
    public final f A;
    public final j B;
    public boolean D = false;
    public boolean E = false;
    public final byte[] C = new byte[1];

    public h(f fVar, j jVar) {
        this.A = fVar;
        this.B = jVar;
    }

    @Override
    public final void close() {
        if (this.E) {
            return;
        }
        this.A.close();
        this.E = true;
    }

    @Override
    public final int read() {
        byte[] bArr = this.C;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        c0.A(!this.E);
        boolean z10 = this.D;
        f fVar = this.A;
        if (!z10) {
            fVar.p(this.B);
            this.D = true;
        }
        int i12 = fVar.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        return i12;
    }
}
