package w7;

import android.net.Uri;
import e7.i0;
import java.io.IOException;
import s7.r;

public final class o implements j {
    public final long A = r.f13729f.getAndIncrement();
    public final g7.j B;
    public final int C;
    public final g7.r D;
    public final n E;
    public volatile Object F;

    public o(g7.f fVar, g7.j jVar, int i10, n nVar) {
        this.D = new g7.r(fVar);
        this.B = jVar;
        this.C = i10;
        this.E = nVar;
    }

    @Override
    public final void h() {
        this.D.B = 0L;
        g7.h hVar = new g7.h(this.D, this.B);
        try {
            hVar.A.p(hVar.B);
            hVar.D = true;
            Uri uriY = this.D.A.y();
            uriY.getClass();
            this.F = this.E.p(uriY, hVar);
        } finally {
            String str = i0.f5136a;
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override
    public final void l() {
    }
}
