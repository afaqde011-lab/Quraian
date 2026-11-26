package dz;

import ab.a0;
import androidx.lifecycle.u0;
import com.mchutov.quranify.settings.presentation.screen.downloadmanager.DownloadManagerEffect$CloseScreen;
import h00.x;
import kotlin.NoWhenBranchMatchedException;
import ta.c0;

public final class s extends vm.a {
    public final zt.a d;
    public final xw.k e;
    public final xv.c f;
    public final io.a g;
    public final jo.d h;
    public final ko.g i;

    public s(zt.a aVar, xw.k kVar, xv.c cVar, io.a aVar2, jo.d dVar, ko.g gVar) {
        x xVar = x.A;
        super(new n(ze.d.E(xVar), ze.d.E(xVar), ze.d.E(xVar)));
        this.d = aVar;
        this.e = kVar;
        this.f = cVar;
        this.g = aVar2;
        this.h = dVar;
        this.i = gVar;
        k00.c cVar2 = null;
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, cVar2, 1), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, cVar2, 2), 31);
    }

    public final void j(g action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof b) {
            a0.A0(this, DownloadManagerEffect$CloseScreen.INSTANCE);
            return;
        }
        k00.c cVar = null;
        if (action instanceof c) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new o(this, cVar, 0), 31);
            return;
        }
        if (action instanceof e) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p(this, ((e) action).a, cVar, 1), 31);
        } else if (action instanceof d) {
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p(this, ((d) action).a, cVar, 0), 31);
        } else {
            if (!(action instanceof f)) {
                throw new NoWhenBranchMatchedException();
            }
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new p(this, ((f) action).a, cVar, 2), 31);
        }
    }
}
