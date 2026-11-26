package y5;

import android.media.MediaDataSource;
import java.io.IOException;

public final class a extends MediaDataSource {
    public long A;
    public final f B;

    public a(f fVar) {
        this.B = fVar;
    }

    @Override
    public final void close() {
    }

    @Override
    public final long getSize() {
        return -1L;
    }

    @Override
    public final int readAt(long j9, byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (j9 < 0) {
            return -1;
        }
        try {
            long j10 = this.A;
            f fVar = this.B;
            if (j10 != j9) {
                if (j10 >= 0 && j9 >= j10 + ((long) fVar.A.available())) {
                    return -1;
                }
                fVar.i(j9);
                this.A = j9;
            }
            if (i11 > fVar.A.available()) {
                i11 = fVar.A.available();
            }
            int i12 = fVar.read(bArr, i10, i11);
            if (i12 >= 0) {
                this.A += (long) i12;
                return i12;
            }
        } catch (IOException unused) {
        }
        this.A = -1L;
        return -1;
    }
}
