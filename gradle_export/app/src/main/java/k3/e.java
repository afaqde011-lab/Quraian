package k3;

import u.m;
import u.w;
import y3.j;

public final class e {

    public final w f8957a;

    public d f8958b;

    public long f8959c;

    public long f8960d;

    public long f8961e;

    public long f8962f;

    public float[] f8963g;

    public e() {
        w wVar = m.f14876a;
        this.f8957a = new w();
        this.f8959c = -1L;
        this.f8960d = 0L;
        this.f8961e = 0L;
    }

    public final void a(d dVar, long j9, long j10, float[] fArr, long j11) throws Exception {
        long j12 = dVar.f8955g;
        if (j11 - j12 > 0 || j12 == Long.MIN_VALUE) {
            dVar.f8955g = j11;
            dVar.a(dVar.f8953e, dVar.f8954f, j9, j10, fArr);
        }
    }

    public final boolean b(long j9, long j10, float[] fArr, int i10, int i11) {
        boolean z10;
        if (j.b(j10, this.f8960d)) {
            z10 = false;
        } else {
            this.f8960d = j10;
            z10 = true;
        }
        if (!j.b(j9, this.f8961e)) {
            this.f8961e = j9;
            z10 = true;
        }
        if (fArr != null) {
            this.f8963g = fArr;
            z10 = true;
        }
        long j11 = (((long) i10) << 32) | (((long) i11) & 4294967295L);
        if (j11 == this.f8962f) {
            return z10;
        }
        this.f8962f = j11;
        return true;
    }
}
