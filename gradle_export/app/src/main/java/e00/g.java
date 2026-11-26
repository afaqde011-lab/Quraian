package e00;

import a40.m0;
import com.mchutov.core.security.Obfuscated;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterCollectionScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterTabRoute$ReciterRootScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$SearchScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import e1.i0;
import g1.e3;
import g1.f6;
import g1.l8;
import g1.q0;
import g1.r0;
import g1.r3;
import g1.u3;
import g1.w4;
import g1.w5;
import java.util.UUID;
import k1.h0;
import l1.q2;
import p40.o0;

public final class g implements u00.a {
    public final int A;

    public g(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return h.a(true);
            case 1:
                return h.a(false);
            case 2:
                float f = f.a;
                long j = i2.t.g;
                return new i(j, va.a.R(new k(j != 16 ? i2.t.b(i2.t.d(j) * 0.7f, j) : j, 3)), f.a, 0.15f, l.a);
            case 3:
                h40.e eVar = m0.a;
                return h40.d.C;
            case 4:
                l1.t tVar = i0.a;
                return null;
            case 5:
                return e1.j.a;
            case 6:
                return o0.e("com.mchutov.quranify.auth.domain.model.AuthMethod", ep.e.values());
            case 7:
                return Long.valueOf(Long.parseLong(Obfuscated.INSTANCE.decode("7894452cd735a9581cc574")));
            case 8:
                return SearchRoute$SearchScreen._init_$_anonymous_();
            case 9:
                return SearchTabRoute$SearchScreen._init_$_anonymous_();
            case 10:
                return PlaylistsRoute$PlaylistsScreen._init_$_anonymous_();
            case 11:
                return PlaylistsTabRoute$PlaylistsRootScreen._init_$_anonymous_();
            case 12:
                float f2 = g1.e.a;
                return e3.a;
            case 13:
                long j2 = k1.f.z;
                return new q0(j2, k1.f.j, k1.f.A, k1.f.k, k1.f.e, k1.f.E, k1.f.n, k1.f.F, k1.f.o, k1.f.R, k1.f.t, k1.f.S, k1.f.u, k1.f.a, k1.f.g, k1.f.I, k1.f.r, k1.f.Q, k1.f.s, j2, k1.f.f, k1.f.d, k1.f.b, k1.f.h, k1.f.c, k1.f.i, k1.f.x, k1.f.y, k1.f.D, k1.f.J, k1.f.P, k1.f.K, k1.f.L, k1.f.M, k1.f.N, k1.f.O, k1.f.B, k1.f.C, k1.f.l, k1.f.m, k1.f.G, k1.f.H, k1.f.p, k1.f.q, k1.f.T, k1.f.U, k1.f.v, k1.f.w);
            case 14:
                q2 q2Var = r0.a;
                return Boolean.TRUE;
            case 15:
                return l1.q.z(new r3.w((String) null, 0L, 7));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                return l1.q.z(Boolean.FALSE);
            case 17:
                return Float.valueOf(0.0f);
            case 18:
                z2.r rVar = r3.a;
                return Boolean.TRUE;
            case 19:
                return new y3.f(48);
            case 20:
                q2 q2Var2 = u3.a;
                return Boolean.FALSE;
            case 21:
                return w4.a;
            case 22:
                return UUID.randomUUID();
            case 23:
                return new w5();
            case 24:
                return new f6();
            case 25:
                return new y3.f(0);
            case 26:
                return k1.i0.a;
            case 27:
                m3.r0 r0Var = h0.d;
                m3.r0 r0Var2 = h0.e;
                m3.r0 r0Var3 = h0.f;
                m3.r0 r0Var4 = h0.g;
                m3.r0 r0Var5 = h0.h;
                m3.r0 r0Var6 = h0.i;
                m3.r0 r0Var7 = h0.m;
                m3.r0 r0Var8 = h0.n;
                m3.r0 r0Var9 = h0.o;
                m3.r0 r0Var10 = h0.a;
                m3.r0 r0Var11 = h0.b;
                m3.r0 r0Var12 = h0.c;
                m3.r0 r0Var13 = h0.j;
                m3.r0 r0Var14 = h0.k;
                m3.r0 r0Var15 = h0.l;
                return new l8(r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, r0Var9, r0Var10, r0Var11, r0Var12, r0Var13, r0Var14, r0Var15, r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, r0Var9, r0Var10, r0Var11, r0Var12, r0Var13, r0Var14, r0Var15);
            case 28:
                return ReciterRoute$ReciterCollectionScreen._init_$_anonymous_();
            default:
                return ReciterTabRoute$ReciterRootScreen._init_$_anonymous_();
        }
    }
}
