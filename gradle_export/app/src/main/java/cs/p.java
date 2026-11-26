package cs;

import a1.a0;
import androidx.lifecycle.u0;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeEvent;
import is.m1;
import kotlin.NoWhenBranchMatchedException;
import os.x;
import wo.c0;

public final class p extends vm.a {
    public final m1 d;
    public final HomeAnalytics e;
    public final c0 f;
    public final vs.c g;
    public final x h;

    public p(m1 m1Var, HomeAnalytics homeAnalytics, c0 c0Var, vs.c cVar, x xVar) {
        super(new m(0, 0, 0, false, false));
        this.d = m1Var;
        this.e = homeAnalytics;
        this.f = c0Var;
        this.g = cVar;
        this.h = xVar;
        homeAnalytics.logEvent(HomeEvent.StreakCardClicked.INSTANCE);
        xVar.k(7);
        ta.c0.M(u0.i(this), (k00.i) null, (u00.n) null, (u00.k) null, new a0(this, (k00.c) null, 8), 31);
    }

    public final void j(d dVar) {
        if (dVar instanceof b) {
            ab.a0.A0(this, e.a);
        } else {
            if (!(dVar instanceof c)) {
                throw new NoWhenBranchMatchedException();
            }
            this.e.logEvent(new HomeEvent.StreakShared("streak_detail"));
            m mVar = (m) this.c.d.getValue();
            ab.a0.A0(this, new f(mVar.a, mVar.d));
        }
    }
}
