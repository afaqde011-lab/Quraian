package sy;

import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute$SettingsScreen;
import cq.m;
import h00.v;
import l1.i1;
import l1.q;
import z1.p;

public final class b implements m {
    public final i1 a;
    public final i1 b;
    public final p c;
    public final i1 d;
    public final i1 e;

    public b() {
        Boolean bool = Boolean.TRUE;
        i1 i1VarZ = q.z(bool);
        this.a = i1VarZ;
        i1 i1VarZ2 = q.z(bool);
        this.b = i1VarZ2;
        this.c = q.y(new p9.g[]{SettingsTabRoute$SettingsScreen.INSTANCE});
        this.d = i1VarZ;
        this.e = i1VarZ2;
    }

    @Override
    public final p9.g a() {
        return (p9.g) v.z0(this.c);
    }

    @Override
    public final p b() {
        return this.c;
    }

    @Override
    public final i1 c() {
        return this.d;
    }

    @Override
    public final i1 d() {
        return this.e;
    }
}
