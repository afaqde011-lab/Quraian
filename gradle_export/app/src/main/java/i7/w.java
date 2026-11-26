package i7;

import android.media.MediaFormat;

public final class w implements y7.t, z7.a, e1 {
    public y7.t A;
    public z7.a B;
    public y7.t C;
    public z7.a D;

    @Override
    public final void a() {
        z7.a aVar = this.D;
        if (aVar != null) {
            aVar.a();
        }
        z7.a aVar2 = this.B;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override
    public final void b(long j9, long j10, androidx.media3.common.t tVar, MediaFormat mediaFormat) {
        y7.t tVar2 = this.C;
        if (tVar2 != null) {
            tVar2.b(j9, j10, tVar, mediaFormat);
        }
        y7.t tVar3 = this.A;
        if (tVar3 != null) {
            tVar3.b(j9, j10, tVar, mediaFormat);
        }
    }

    @Override
    public final void c(float[] fArr, long j9) {
        z7.a aVar = this.D;
        if (aVar != null) {
            aVar.c(fArr, j9);
        }
        z7.a aVar2 = this.B;
        if (aVar2 != null) {
            aVar2.c(fArr, j9);
        }
    }

    @Override
    public final void e(int i10, Object obj) {
        if (i10 == 7) {
            this.A = (y7.t) obj;
            return;
        }
        if (i10 == 8) {
            this.B = (z7.a) obj;
            return;
        }
        if (i10 != 10000) {
            return;
        }
        z7.k kVar = (z7.k) obj;
        if (kVar == null) {
            this.C = null;
            this.D = null;
        } else {
            this.C = kVar.getVideoFrameMetadataListener();
            this.D = kVar.getCameraMotionListener();
        }
    }
}
