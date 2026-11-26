package ds;

import a1.a0;
import a1.p1;
import a1.r1;
import androidx.lifecycle.u0;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeEvent;
import is.m1;
import is.y;
import kotlin.NoWhenBranchMatchedException;
import os.x;
import ta.c0;

public final class n extends vm.a {
    public final jr.b d;
    public final m1 e;
    public final y f;
    public final HomeAnalytics g;
    public final x h;

    public n(jr.b bVar, m1 m1Var, y yVar, HomeAnalytics homeAnalytics, x xVar) {
        super(new m((mr.g) bVar.b.A.getValue(), 1, false, false));
        this.d = bVar;
        this.e = m1Var;
        this.f = yVar;
        this.g = homeAnalytics;
        this.h = xVar;
        i(m.a((m) this.c.d.getValue(), null, m1Var.b(), false, false, 27));
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a0(this, (k00.c) null, 15), 31);
        c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new br.c(2, null, 3), 31);
    }

    public final void j(g action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof c) {
            ab.a0.A0(this, h.a);
            return;
        }
        boolean z = action instanceof f;
        Integer numValueOf = null;
        HomeAnalytics homeAnalytics = this.g;
        pm.b bVar = this.c;
        if (z) {
            homeAnalytics.logEvent(new HomeEvent.StreakShared("progress_detail"));
            mr.g gVar = ((m) bVar.d.getValue()).a;
            if (gVar instanceof mr.f) {
                numValueOf = Integer.valueOf((int) (((mr.f) gVar).a / ((long) 60)));
            } else if (!(gVar instanceof mr.d)) {
                if (!kotlin.jvm.internal.m.a(gVar, mr.e.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                numValueOf = 0;
            }
            ab.a0.A0(this, new i(numValueOf));
            return;
        }
        if (action instanceof b) {
            i(m.a((m) bVar.d.getValue(), null, 0, true, false, 23));
            return;
        }
        if (action instanceof e) {
            if (((m) bVar.d.getValue()).d) {
                return;
            }
            i(m.a((m) bVar.d.getValue(), null, 0, false, false, 23));
        } else {
            if (!(action instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            int i = ((d) action).a;
            if (((m) bVar.d.getValue()).d) {
                return;
            }
            homeAnalytics.logEvent(new HomeEvent.GoalAdjusted(i));
            this.e.g(i);
            i(m.a((m) bVar.d.getValue(), null, i, false, true, 11));
            this.f.e();
            c0.M(u0.i(this), (k00.i) null, (u00.n) null, new r1(this, (k00.c) null, 3), new p1(this, i, (k00.c) null, 3), 23);
        }
    }
}
