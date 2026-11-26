package ns;

import ab.y;
import android.net.NetworkRequest;
import com.mchutov.quranify.insights.data.worker.ListeningEventsWorker;
import h00.q;
import is.c0;
import is.c1;
import is.l0;
import is.p0;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import za.j0;
import za.w;
import za.x;

public final class c {
    public final c0 a;
    public final p0 b;
    public final c1 c;
    public final l0 d;
    public final wo.c0 e;
    public final au.a f;
    public final y g;
    public final j40.c h = j40.d.a();

    public c(c0 c0Var, p0 p0Var, c1 c1Var, l0 l0Var, wo.c0 c0Var2, au.a aVar, y yVar) {
        this.a = c0Var;
        this.b = p0Var;
        this.c = c1Var;
        this.d = l0Var;
        this.e = c0Var2;
        this.f = aVar;
        this.g = yVar;
    }

    public static final java.lang.Object a(ns.c r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: ns.c.a(ns.c, m00.c):java.lang.Object");
    }

    public final void b() {
        x xVar = new x(ListeningEventsWorker.class);
        w wVar = w.A;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ((j0) xVar).c.j = new za.e(new ib.f((NetworkRequest) null), w.B, false, false, false, false, -1L, -1L, q.r1(linkedHashSet));
        za.y yVarB = xVar.e(za.a.A, 30L, TimeUnit.SECONDS).b();
        this.g.x("listening_events_work", za.l.B, yVarB);
    }

    public final java.lang.Object c(java.util.List r11, m00.c r12) {
        throw new UnsupportedOperationException("Method not decompiled: ns.c.c(java.util.List, m00.c):java.lang.Object");
    }
}
