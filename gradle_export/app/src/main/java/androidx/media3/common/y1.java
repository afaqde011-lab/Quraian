package androidx.media3.common;

import android.os.Handler;
import k9.v3;

public final class y1 implements z1, e7.m, e7.h {
    public final long A;

    public y1(long j9) {
        this.A = j9;
    }

    @Override
    public void accept(Object obj) {
        ((v3) obj).seekTo(this.A);
    }

    @Override
    public long get() {
        return this.A;
    }

    @Override
    public void invoke(Object obj) {
        gi.c cVar;
        k7.n nVar;
        Handler handler;
        k7.y yVar = (k7.y) obj;
        k7.c0 c0Var = yVar.f9185b;
        if (!yVar.equals(c0Var.f9004j) || (cVar = c0Var.f9006n) == null || (handler = (nVar = ((k7.e0) cVar.B).f9033e1).f9111a) == null) {
            return;
        }
        handler.post(new k7.l(nVar, this.A));
    }
}
