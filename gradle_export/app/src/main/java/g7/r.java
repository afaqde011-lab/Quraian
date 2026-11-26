package g7;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

public final class r implements f {
    public final f A;
    public long B;
    public Uri C;
    public Map D;

    public r(f fVar) {
        fVar.getClass();
        this.A = fVar;
        this.C = Uri.EMPTY;
        this.D = Collections.EMPTY_MAP;
    }

    @Override
    public final void close() {
        this.A.close();
    }

    @Override
    public final long p(j jVar) {
        f fVar = this.A;
        this.C = jVar.f6218a;
        this.D = Collections.EMPTY_MAP;
        try {
            return fVar.p(jVar);
        } finally {
            Uri uriY = fVar.y();
            if (uriY != null) {
                this.C = uriY;
            }
            this.D = fVar.r();
        }
    }

    @Override
    public final Map r() {
        return this.A.r();
    }

    @Override
    public final int read(byte[] bArr, int i10, int i11) {
        int i12 = this.A.read(bArr, i10, i11);
        if (i12 != -1) {
            this.B += (long) i12;
        }
        return i12;
    }

    @Override
    public final void s(s sVar) {
        sVar.getClass();
        this.A.s(sVar);
    }

    @Override
    public final Uri y() {
        return this.A.y();
    }
}
