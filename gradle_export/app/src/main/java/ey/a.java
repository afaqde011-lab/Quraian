package ey;

import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import cq.m;
import h00.v;
import l1.i1;
import l1.q;
import p9.g;
import z1.p;

public final class a implements m {
    public final i1 a;
    public final p b;
    public final i1 c;
    public final i1 d;

    public a() {
        Boolean bool = Boolean.TRUE;
        i1 i1VarZ = q.z(bool);
        this.a = i1VarZ;
        i1 i1VarZ2 = q.z(bool);
        this.b = q.y(new g[]{SearchTabRoute$SearchScreen.INSTANCE});
        this.c = i1VarZ;
        this.d = i1VarZ2;
    }

    @Override
    public final g a() {
        return (g) v.z0(this.b);
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
