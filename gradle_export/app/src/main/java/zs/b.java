package zs;

import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import cq.j;
import h00.v;
import kotlin.jvm.internal.m;
import l1.q;
import p9.g;
import z1.p;

public final class b implements j {
    public final p a = q.y(new g[]{InsightsRoute$InsightsScreen.INSTANCE});

    @Override
    public final void a() {
        v.z0(this.a);
    }

    @Override
    public final p b() {
        return this.a;
    }

    @Override
    public final void c(g route) {
        m.e(route, "route");
        this.a.add(route);
    }
}
