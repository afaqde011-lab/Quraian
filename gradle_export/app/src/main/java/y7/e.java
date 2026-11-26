package y7;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.w2;

public final class e implements b0 {

    public final h f16661b;

    public e(h hVar) {
        this.f16661b = hVar;
    }

    @Override
    public final void a(w2 w2Var) {
    }

    @Override
    public final void b() {
        h hVar = this.f16661b;
        Surface surface = hVar.f16690v1;
        if (surface != null) {
            k7.n nVar = hVar.f16675g1;
            Handler handler = nVar.f9111a;
            if (handler != null) {
                handler.post(new oi.r(nVar, surface, SystemClock.elapsedRealtime()));
            }
            hVar.f16693y1 = true;
        }
    }

    @Override
    public final void c() {
        h hVar = this.f16661b;
        if (hVar.f16690v1 != null) {
            hVar.Q0(0, 1);
        }
    }

    @Override
    public final void d() {
        i7.c0 c0Var = this.f16661b.f12424i0;
        if (c0Var != null) {
            c0Var.a();
        }
    }
}
