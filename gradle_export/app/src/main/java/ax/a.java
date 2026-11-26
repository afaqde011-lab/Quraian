package ax;

import android.content.Context;
import b2.r;
import ca.v;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$PlaylistScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeTabRoute$HomeRootScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterCollectionScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterTabRoute$ReciterRootScreen;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationBenefitsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountCodeScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DevicesScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$SettingsScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.z6;
import gx.k;
import gx.n;
import h0.s;
import h0.z1;
import i2.b0;
import i2.t;
import kh.o;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.m1;
import l1.q;
import m3.r0;
import q3.u;
import qd.s0;
import qo.z;
import u00.p;
import ur.g1;
import x3.l;
import z2.w0;

public final class a implements p {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.A) {
            case 0:
                e60.a navigation = (e60.a) obj;
                ReciterRoute$ReciterCollectionScreen it = (ReciterRoute$ReciterCollectionScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation, "$this$navigation");
                m.e(it, "it");
                p30.f.R((l1.j) obj3, 0);
                break;
            case 1:
                e60.a navigation2 = (e60.a) obj;
                k route = (k) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation2, "$this$navigation");
                m.e(route, "route");
                p30.f.S(route.a, (l1.j) obj3, SearchReciterLauncher.$stable);
                break;
            case 2:
                e60.a navigation3 = (e60.a) obj;
                n route2 = (n) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation3, "$this$navigation");
                m.e(route2, "route");
                f50.k.f(route2.a, (l1.j) obj3, TopRecitersLauncher.$stable);
                break;
            case 3:
                e60.a navigation4 = (e60.a) obj;
                ReciterRoute$ReciterScreen route3 = (ReciterRoute$ReciterScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation4, "$this$navigation");
                m.e(route3, "route");
                nx.a.b(route3.getLauncher(), (l1.j) obj3, 0);
                break;
            case 4:
                e60.a navigation5 = (e60.a) obj;
                ReciterTabRoute$ReciterRootScreen it2 = (ReciterTabRoute$ReciterRootScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation5, "$this$navigation");
                m.e(it2, "it");
                f50.k.c((l1.j) obj3, 0);
                break;
            case 5:
                e60.a navigation6 = (e60.a) obj;
                PlaylistsRoute$PlaylistsScreen it3 = (PlaylistsRoute$PlaylistsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation6, "$this$navigation");
                m.e(it3, "it");
                o.e((l1.j) obj3, 0);
                break;
            case 6:
                e60.a navigation7 = (e60.a) obj;
                PlaylistsRoute$PlaylistScreen route4 = (PlaylistsRoute$PlaylistScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation7, "$this$navigation");
                m.e(route4, "route");
                as.a.b(route4.getLauncher(), (l1.j) obj3, 0);
                break;
            case 7:
                e60.a navigation8 = (e60.a) obj;
                PlaylistsTabRoute$PlaylistsRootScreen it4 = (PlaylistsTabRoute$PlaylistsRootScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation8, "$this$navigation");
                m.e(it4, "it");
                o.f((l1.j) obj3, 0);
                break;
            case 8:
                k0.k items = (k0.k) obj;
                ((Integer) obj2).getClass();
                g0 g0Var = (l1.j) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                m.e(items, "$this$items");
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 129) != 128)) {
                    b2.o oVar = b2.o.A;
                    r rVarE = z1.e(z1.d(oVar, 1.0f), 104);
                    w0 w0VarD = h0.o.d(b2.b.A, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarE, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    q.I(w0VarD, g0Var, b3.h.f);
                    q.I(m1VarM, g0Var, b3.h.e);
                    q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    q.E(g0Var, b3.h.h);
                    q.I(rVarC, g0Var, b3.h.d);
                    h0.o.a(z.n.f(f2.h.c(s.a.a(z1.e(z1.d(oVar, 1.0f), 96), b2.b.H), p0.f.a(24)), t.b(0.08f, dl.a.k), b0.b), g0Var, 0);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 9:
                return new e1.q((k00.i) obj, (Context) obj2, (e1.s) obj3, (t3.b) obj4);
            case 10:
                int iIntValue2 = ((Integer) obj).intValue();
                ((Boolean) obj2).getClass();
                g0 g0Var3 = (l1.j) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= g0Var3.e(iIntValue2) ? 4 : 2;
                }
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    z6.b(r30.k.P0(2, String.valueOf(iIntValue2)), z1.d(b2.o.A, 1.0f), dl.a.n, o.z(24), u.L, (q3.i) null, 0L, (l) null, new x3.k(3), 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var3, 1597488, 0, 261032);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 11:
                w.p AnimatedContent = (w.p) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                m.e(AnimatedContent, "$this$AnimatedContent");
                z6.b(String.valueOf(iIntValue4), (r) null, dl.a.i, 0L, (u) null, (q3.i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, dl.b.a, (l1.j) obj3, 0, 0, 131066);
                break;
            case 12:
                e60.a navigation9 = (e60.a) obj;
                HomeRoute$HomeScreen it5 = (HomeRoute$HomeScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation9, "$this$navigation");
                m.e(it5, "it");
                g1.d((l1.j) obj3, 0);
                break;
            case 13:
                e60.a navigation10 = (e60.a) obj;
                k route5 = (k) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation10, "$this$navigation");
                m.e(route5, "route");
                p30.f.S(route5.a, (l1.j) obj3, SearchReciterLauncher.$stable);
                break;
            case 14:
                e60.a navigation11 = (e60.a) obj;
                ReciterRoute$ReciterScreen route6 = (ReciterRoute$ReciterScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation11, "$this$navigation");
                m.e(route6, "route");
                nx.a.b(route6.getLauncher(), (l1.j) obj3, 0);
                break;
            case 15:
                e60.a navigation12 = (e60.a) obj;
                HomeRoute$PlaylistScreen routerItem = (HomeRoute$PlaylistScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation12, "$this$navigation");
                m.e(routerItem, "routerItem");
                as.a.b(routerItem.getLauncher(), (l1.j) obj3, 0);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a navigation13 = (e60.a) obj;
                HomeRoute$AudioStoryScreen routerItem2 = (HomeRoute$AudioStoryScreen) obj2;
                ((Integer) obj4).getClass();
                m.e(navigation13, "$this$navigation");
                m.e(routerItem2, "routerItem");
                z.a(routerItem2.getStoryId(), routerItem2.getSharedEpisodeId(), (l1.j) obj3, 0);
                break;
            case 17:
                e60.a navigation14 = (e60.a) obj;
                rr.f it6 = (rr.f) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation14, "$this$navigation");
                m.e(it6, "it");
                ds.a.a((l1.j) obj3, 0);
                break;
            case 18:
                e60.a navigation15 = (e60.a) obj;
                rr.i it7 = (rr.i) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation15, "$this$navigation");
                m.e(it7, "it");
                cs.a.c((l1.j) obj3, 0);
                break;
            case 19:
                e60.a navigation16 = (e60.a) obj;
                InsightsRoute$InsightsScreen it8 = (InsightsRoute$InsightsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation16, "$this$navigation");
                m.e(it8, "it");
                bt.a.e((l1.j) obj3, 0);
                break;
            case 20:
                e60.a navigation17 = (e60.a) obj;
                zs.d it9 = (zs.d) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation17, "$this$navigation");
                m.e(it9, "it");
                at.a.a((l1.j) obj3, 0);
                break;
            case 21:
                e60.a navigation18 = (e60.a) obj;
                HomeTabRoute$HomeRootScreen it10 = (HomeTabRoute$HomeRootScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation18, "$this$navigation");
                m.e(it10, "it");
                v.b((l1.j) obj3, 0);
                break;
            case 22:
                w.p AnimatedContent2 = (w.p) obj;
                su.e count = (su.e) obj2;
                int iIntValue5 = ((Integer) obj4).intValue();
                m.e(AnimatedContent2, "$this$AnimatedContent");
                m.e(count, "count");
                iv.a.g(count, (l1.j) obj3, (iIntValue5 >> 3) & 14);
                break;
            case 23:
                k0.k items2 = (k0.k) obj;
                ((Integer) obj2).getClass();
                g0 g0Var5 = (l1.j) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                m.e(items2, "$this$items");
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue6 & 1, (iIntValue6 & 129) != 128)) {
                    iw.a.d(null, g0Var5, 0);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 24:
                e60.a navigation19 = (e60.a) obj;
                SettingsRoute$SettingsScreen it11 = (SettingsRoute$SettingsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation19, "$this$navigation");
                m.e(it11, "it");
                s0.K((l1.j) obj3, 0);
                break;
            case 25:
                e60.a navigation20 = (e60.a) obj;
                SettingsRoute$DevicesScreen it12 = (SettingsRoute$DevicesScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation20, "$this$navigation");
                m.e(it12, "it");
                bz.a.a((l1.j) obj3, 0);
                break;
            case 26:
                e60.a navigation21 = (e60.a) obj;
                SettingsRoute$CancellationBenefitsScreen it13 = (SettingsRoute$CancellationBenefitsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation21, "$this$navigation");
                m.e(it13, "it");
                uy.m.b((l1.j) obj3, 0);
                break;
            case 27:
                e60.a navigation22 = (e60.a) obj;
                SettingsRoute$CancellationQuestionnaireScreen it14 = (SettingsRoute$CancellationQuestionnaireScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation22, "$this$navigation");
                m.e(it14, "it");
                pz.n.b((l1.j) obj3, 0);
                break;
            case 28:
                e60.a navigation23 = (e60.a) obj;
                SettingsRoute$DeleteAccountQuestionnaireScreen it15 = (SettingsRoute$DeleteAccountQuestionnaireScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation23, "$this$navigation");
                m.e(it15, "it");
                az.a.b((l1.j) obj3, 0);
                break;
            default:
                e60.a navigation24 = (e60.a) obj;
                SettingsRoute$DeleteAccountCodeScreen route7 = (SettingsRoute$DeleteAccountCodeScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation24, "$this$navigation");
                m.e(route7, "route");
                ze.d.b(route7.getLauncher(), (l1.j) obj3, 0);
                break;
        }
        return g00.b0.a;
    }
}
