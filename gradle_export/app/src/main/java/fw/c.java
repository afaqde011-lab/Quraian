package fw;

import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistsScreen;
import cq.j;
import h00.v;
import kotlin.jvm.internal.m;
import l1.q;
import z1.p;

public final class c implements j {
    public final p a = q.y(new p9.g[]{PlaylistsRoute$PlaylistsScreen.INSTANCE});

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
        m.e(route, "route");
        this.a.add(route);
    }
}
