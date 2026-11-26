package fw;

import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import cq.m;
import h00.v;
import l1.i1;
import l1.q;
import z1.p;

public final class b implements m {
    public final i1 a;
    public final p b;
    public final i1 c;
    public final i1 d;

    public b() {
        Boolean bool = Boolean.TRUE;
        i1 i1VarZ = q.z(bool);
        this.a = i1VarZ;
        i1 i1VarZ2 = q.z(bool);
        this.b = q.y(new p9.g[]{PlaylistsTabRoute$PlaylistsRootScreen.INSTANCE});
        this.c = i1VarZ;
        this.d = i1VarZ2;
    }

    @Override
    public final p9.g a() {
        return (p9.g) v.z0(this.b);
    }

    @Override
    public final p b() {
        return this.b;
    }

    @Override
    public final i1 c() {
        return this.c;
    }

    @Override
    public final i1 d() {
        return this.d;
    }
}
