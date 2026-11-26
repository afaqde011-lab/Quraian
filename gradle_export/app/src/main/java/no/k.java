package no;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.w;
import i7.z;

public final class k implements DefaultLifecycleObserver {
    public final n A;

    public k(n nVar) {
        this.A = nVar;
    }

    public final void onStop(w wVar) {
        n nVar = this.A;
        z zVar = nVar.b.b;
        if (zVar == null || nVar.d() == null) {
            return;
        }
        nVar.s(true);
        d dVar = nVar.m;
        long currentPosition = zVar.getCurrentPosition();
        long j = currentPosition < 0 ? 0L : currentPosition;
        if (dVar.f != null) {
            d.b(dVar, ho.l.APP_BACKGROUND, j, null, null, 0, 60);
        }
        dVar.c();
    }
}
