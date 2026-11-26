package rr;

import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import h00.v;
import kotlin.jvm.internal.m;
import l1.q;
import z1.p;

public final class b implements cq.j {
    public final pm.c a;
    public final p b = q.y(new p9.g[]{HomeRoute$HomeScreen.INSTANCE});

    public b(pm.c cVar) {
        this.a = cVar;
    }

    @Override
    public final void a() {
        v.z0(this.b);
    }

    @Override
    public final p b() {
        return this.b;
    }

    @Override
    public final void c(p9.g route) {
        m.e(route, "route");
        this.b.add(route);
    }
}
