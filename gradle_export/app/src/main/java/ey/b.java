package ey;

import com.mchutov.quranify.search.presentation.navigation.SearchRoute$SearchScreen;
import cq.j;
import h00.v;
import kotlin.jvm.internal.m;
import l1.q;
import p9.g;
import z1.p;

public final class b implements j {
    public final p a = q.y(new g[]{SearchRoute$SearchScreen.INSTANCE});

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
        p pVar = this.a;
        if (m.a(h00.q.U0(pVar), route)) {
            return;
        }
        pVar.add(route);
    }
}
