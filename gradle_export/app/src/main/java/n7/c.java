package n7;

import android.os.Handler;
import e7.i0;

public final class c implements k {
    public final h A;
    public e B;
    public boolean C;
    public final d D;

    public c(d dVar, h hVar) {
        this.D = dVar;
        this.A = hVar;
    }

    @Override
    public final void release() {
        Handler handler = this.D.f11162u;
        handler.getClass();
        i0.M(handler, new m9.f(this, 3));
    }
}
