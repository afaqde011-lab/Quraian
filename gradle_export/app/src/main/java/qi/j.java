package qi;

import java.io.IOException;
import java.io.InputStream;

public final class j extends InputStream {
    public int A;
    public int B;
    public final l C;

    public j(l lVar, i iVar) {
        this.C = lVar;
        this.A = lVar.O(iVar.f13027a + 4);
        this.B = iVar.f13028b;
    }

    @Override
    public final int read() throws IOException {
        if (this.B == 0) {
            return -1;
        }
        l lVar = this.C;
        lVar.A.seek(this.A);
        int i10 = lVar.A.read();
        this.A = lVar.O(this.A + 1);
        this.B--;
        return i10;
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i12 = this.B;
        if (i12 <= 0) {
            return -1;
        }
        if (i11 > i12) {
            i11 = i12;
        }
        int i13 = this.A;
        l lVar = this.C;
        lVar.F(i13, bArr, i10, i11);
        this.A = lVar.O(this.A + i11);
        this.B -= i11;
        return i11;
    }
}
