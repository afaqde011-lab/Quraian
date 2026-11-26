package zs;

import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import cq.m;
import h00.v;
import l1.i1;
import l1.q;
import p9.g;
import z1.p;

public final class a implements m {
    public final i1 a;
    public final i1 b;
    public final p c;
    public final i1 d;
    public final i1 e;

    public a() {
        Boolean bool = Boolean.TRUE;
        i1 i1VarZ = q.z(bool);
        this.a = i1VarZ;
        i1 i1VarZ2 = q.z(bool);
        this.b = i1VarZ2;
        this.c = q.y(new g[]{InsightsTabRoute$InsightsScreen.INSTANCE});
        this.d = i1VarZ;
        this.e = i1VarZ2;
    }

    @Override
    public final g a() {
        return (g) v.z0(this.c);
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
