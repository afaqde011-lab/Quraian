package gx;

import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterCollectionScreen;
import h00.v;
import l1.q;
import z1.p;

public final class e implements cq.j {
    public final p a = q.y(new p9.g[]{ReciterRoute$ReciterCollectionScreen.INSTANCE});

    @Override
    public final void a() {
        v.z0(this.a);
    }

    @Override
    public final p b() {
        return this.a;
    }

    @Override
    public final void c(p9.g route) {
        kotlin.jvm.internal.m.e(route, "route");
        this.a.add(route);
    }
}
