package ax;

import com.mchutov.quranify.home.presentation.navigation.HomeTabRoute$HomeRootScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsTabRoute$PlaylistsRootScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterTabRoute$ReciterRootScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$SettingsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute$SettingsScreen;
import g00.b0;
import h00.y;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import u00.k;

public final class h implements k {
    public final int A;
    public final e60.a B;

    public h(e60.a aVar, int i) {
        this.A = i;
        this.B = aVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                p9.d _scopedInstanceFactory = (p9.d) obj;
                m.e(_scopedInstanceFactory, "$this$_scopedInstanceFactory");
                v1.c cVar = new v1.c(new d(this.B, 4), -557655062, true);
                _scopedInstanceFactory.a(a0.a.b(ReciterTabRoute$ReciterRootScreen.class), e.F, y.A, cVar);
                break;
            case 1:
                p9.d _scopedInstanceFactory2 = (p9.d) obj;
                m.e(_scopedInstanceFactory2, "$this$_scopedInstanceFactory");
                v1.c cVar2 = new v1.c(new d(this.B, 7), -557655062, true);
                _scopedInstanceFactory2.a(a0.a.b(PlaylistsTabRoute$PlaylistsRootScreen.class), bw.d.D, y.A, cVar2);
                break;
            case 2:
                p9.d _scopedInstanceFactory3 = (p9.d) obj;
                m.e(_scopedInstanceFactory3, "$this$_scopedInstanceFactory");
                v1.c cVar3 = new v1.c(new d(this.B, 17), -557655062, true);
                _scopedInstanceFactory3.a(a0.a.b(HomeTabRoute$HomeRootScreen.class), ir.c.K, y.A, cVar3);
                break;
            case 3:
                p9.d _scopedInstanceFactory4 = (p9.d) obj;
                m.e(_scopedInstanceFactory4, "$this$_scopedInstanceFactory");
                v1.c cVar4 = new v1.c(new d(this.B, 29), -557655062, true);
                _scopedInstanceFactory4.a(a0.a.b(SettingsRoute$SettingsScreen.class), ny.d.M, y.A, cVar4);
                break;
            case 4:
                p9.d _scopedInstanceFactory5 = (p9.d) obj;
                m.e(_scopedInstanceFactory5, "$this$_scopedInstanceFactory");
                v1.c cVar5 = new v1.c(new ny.f(this.B, 0), -557655062, true);
                _scopedInstanceFactory5.a(a0.a.b(SettingsTabRoute$SettingsScreen.class), ny.d.N, y.A, cVar5);
                break;
            case 5:
                p9.d _scopedInstanceFactory6 = (p9.d) obj;
                m.e(_scopedInstanceFactory6, "$this$_scopedInstanceFactory");
                v1.c cVar6 = new v1.c(new ny.f(this.B, 4), -557655062, true);
                _scopedInstanceFactory6.a(a0.a.b(InsightsTabRoute$InsightsScreen.class), qs.d.E, y.A, cVar6);
                break;
            case 6:
                p9.d _scopedInstanceFactory7 = (p9.d) obj;
                m.e(_scopedInstanceFactory7, "$this$_scopedInstanceFactory");
                v1.c cVar7 = new v1.c(new ny.f(this.B, 5), -557655062, true);
                _scopedInstanceFactory7.a(a0.a.b(cu.d.class), xt.b.B, y.A, cVar7);
                break;
            case 7:
                p9.d _scopedInstanceFactory8 = (p9.d) obj;
                m.e(_scopedInstanceFactory8, "$this$_scopedInstanceFactory");
                v1.c cVar8 = new v1.c(new ny.f(this.B, 6), -557655062, true);
                _scopedInstanceFactory8.a(a0.a.b(cu.b.class), xt.b.C, y.A, cVar8);
                break;
            default:
                p9.d _scopedInstanceFactory9 = (p9.d) obj;
                m.e(_scopedInstanceFactory9, "$this$_scopedInstanceFactory");
                v1.c cVar9 = new v1.c(new ny.f(this.B, 10), -557655062, true);
                _scopedInstanceFactory9.a(a0.a.b(SearchTabRoute$SearchScreen.class), yx.b.E, y.A, cVar9);
                break;
        }
        return b0.a;
    }
}
