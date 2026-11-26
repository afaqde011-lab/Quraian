package ax;

import com.mchutov.quranify.home.presentation.navigation.HomeRoute$AudioStoryScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$HomeScreen;
import com.mchutov.quranify.home.presentation.navigation.HomeRoute$PlaylistScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistScreen;
import com.mchutov.quranify.playlist.presentation.navigation.PlaylistsRoute$PlaylistsScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterCollectionScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$SearchScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationBenefitsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$CancellationQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ChangePasswordScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DebugControlsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountCodeScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DeleteAccountQuestionnaireScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DevicesScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$EditDetailsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$NotificationScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import gx.n;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import u00.k;

public final class f implements k {
    public final int A;
    public final LinkedHashMap B;
    public final e60.a C;

    public f(LinkedHashMap linkedHashMap, e60.a aVar, int i) {
        this.A = i;
        this.B = linkedHashMap;
        this.C = aVar;
    }

    @Override
    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                p9.d _scopedInstanceFactory = (p9.d) obj;
                m.e(_scopedInstanceFactory, "$this$_scopedInstanceFactory");
                v1.c cVar = new v1.c(new d(this.C, 0), -557655062, true);
                _scopedInstanceFactory.a(a0.a.b(ReciterRoute$ReciterCollectionScreen.class), e.B, this.B, cVar);
                break;
            case 1:
                p9.d _scopedInstanceFactory2 = (p9.d) obj;
                m.e(_scopedInstanceFactory2, "$this$_scopedInstanceFactory");
                v1.c cVar2 = new v1.c(new d(this.C, 1), -557655062, true);
                _scopedInstanceFactory2.a(a0.a.b(gx.k.class), e.C, this.B, cVar2);
                break;
            case 2:
                p9.d _scopedInstanceFactory3 = (p9.d) obj;
                m.e(_scopedInstanceFactory3, "$this$_scopedInstanceFactory");
                v1.c cVar3 = new v1.c(new d(this.C, 2), -557655062, true);
                _scopedInstanceFactory3.a(a0.a.b(n.class), e.D, this.B, cVar3);
                break;
            case 3:
                p9.d _scopedInstanceFactory4 = (p9.d) obj;
                m.e(_scopedInstanceFactory4, "$this$_scopedInstanceFactory");
                v1.c cVar4 = new v1.c(new d(this.C, 3), -557655062, true);
                _scopedInstanceFactory4.a(a0.a.b(ReciterRoute$ReciterScreen.class), e.E, this.B, cVar4);
                break;
            case 4:
                p9.d _scopedInstanceFactory5 = (p9.d) obj;
                m.e(_scopedInstanceFactory5, "$this$_scopedInstanceFactory");
                v1.c cVar5 = new v1.c(new d(this.C, 5), -557655062, true);
                _scopedInstanceFactory5.a(a0.a.b(PlaylistsRoute$PlaylistsScreen.class), bw.d.B, this.B, cVar5);
                break;
            case 5:
                p9.d _scopedInstanceFactory6 = (p9.d) obj;
                m.e(_scopedInstanceFactory6, "$this$_scopedInstanceFactory");
                v1.c cVar6 = new v1.c(new d(this.C, 6), -557655062, true);
                _scopedInstanceFactory6.a(a0.a.b(PlaylistsRoute$PlaylistScreen.class), bw.d.C, this.B, cVar6);
                break;
            case 6:
                p9.d _scopedInstanceFactory7 = (p9.d) obj;
                m.e(_scopedInstanceFactory7, "$this$_scopedInstanceFactory");
                v1.c cVar7 = new v1.c(new d(this.C, 8), -557655062, true);
                _scopedInstanceFactory7.a(a0.a.b(HomeRoute$HomeScreen.class), ir.c.B, this.B, cVar7);
                break;
            case 7:
                p9.d _scopedInstanceFactory8 = (p9.d) obj;
                m.e(_scopedInstanceFactory8, "$this$_scopedInstanceFactory");
                v1.c cVar8 = new v1.c(new d(this.C, 9), -557655062, true);
                _scopedInstanceFactory8.a(a0.a.b(gx.k.class), ir.c.C, this.B, cVar8);
                break;
            case 8:
                p9.d _scopedInstanceFactory9 = (p9.d) obj;
                m.e(_scopedInstanceFactory9, "$this$_scopedInstanceFactory");
                v1.c cVar9 = new v1.c(new d(this.C, 10), -557655062, true);
                _scopedInstanceFactory9.a(a0.a.b(ReciterRoute$ReciterScreen.class), ir.c.D, this.B, cVar9);
                break;
            case 9:
                p9.d _scopedInstanceFactory10 = (p9.d) obj;
                m.e(_scopedInstanceFactory10, "$this$_scopedInstanceFactory");
                v1.c cVar10 = new v1.c(new d(this.C, 11), -557655062, true);
                _scopedInstanceFactory10.a(a0.a.b(HomeRoute$PlaylistScreen.class), ir.c.E, this.B, cVar10);
                break;
            case 10:
                p9.d _scopedInstanceFactory11 = (p9.d) obj;
                m.e(_scopedInstanceFactory11, "$this$_scopedInstanceFactory");
                v1.c cVar11 = new v1.c(new d(this.C, 12), -557655062, true);
                _scopedInstanceFactory11.a(a0.a.b(HomeRoute$AudioStoryScreen.class), ir.c.F, this.B, cVar11);
                break;
            case 11:
                p9.d _scopedInstanceFactory12 = (p9.d) obj;
                m.e(_scopedInstanceFactory12, "$this$_scopedInstanceFactory");
                v1.c cVar12 = new v1.c(new d(this.C, 13), -557655062, true);
                _scopedInstanceFactory12.a(a0.a.b(rr.f.class), ir.c.G, this.B, cVar12);
                break;
            case 12:
                p9.d _scopedInstanceFactory13 = (p9.d) obj;
                m.e(_scopedInstanceFactory13, "$this$_scopedInstanceFactory");
                v1.c cVar13 = new v1.c(new d(this.C, 14), -557655062, true);
                _scopedInstanceFactory13.a(a0.a.b(rr.i.class), ir.c.H, this.B, cVar13);
                break;
            case 13:
                p9.d _scopedInstanceFactory14 = (p9.d) obj;
                m.e(_scopedInstanceFactory14, "$this$_scopedInstanceFactory");
                v1.c cVar14 = new v1.c(new d(this.C, 15), -557655062, true);
                _scopedInstanceFactory14.a(a0.a.b(InsightsRoute$InsightsScreen.class), ir.c.I, this.B, cVar14);
                break;
            case 14:
                p9.d _scopedInstanceFactory15 = (p9.d) obj;
                m.e(_scopedInstanceFactory15, "$this$_scopedInstanceFactory");
                v1.c cVar15 = new v1.c(new d(this.C, 16), -557655062, true);
                _scopedInstanceFactory15.a(a0.a.b(zs.d.class), ir.c.J, this.B, cVar15);
                break;
            case 15:
                p9.d _scopedInstanceFactory16 = (p9.d) obj;
                m.e(_scopedInstanceFactory16, "$this$_scopedInstanceFactory");
                v1.c cVar16 = new v1.c(new d(this.C, 18), -557655062, true);
                _scopedInstanceFactory16.a(a0.a.b(SettingsRoute$NotificationScreen.class), ny.d.B, this.B, cVar16);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                p9.d _scopedInstanceFactory17 = (p9.d) obj;
                m.e(_scopedInstanceFactory17, "$this$_scopedInstanceFactory");
                v1.c cVar17 = new v1.c(new d(this.C, 19), -557655062, true);
                _scopedInstanceFactory17.a(a0.a.b(SettingsRoute$DeleteAccountQuestionnaireScreen.class), ny.d.C, this.B, cVar17);
                break;
            case 17:
                p9.d _scopedInstanceFactory18 = (p9.d) obj;
                m.e(_scopedInstanceFactory18, "$this$_scopedInstanceFactory");
                v1.c cVar18 = new v1.c(new d(this.C, 20), -557655062, true);
                _scopedInstanceFactory18.a(a0.a.b(SettingsRoute$DeleteAccountCodeScreen.class), ny.d.D, this.B, cVar18);
                break;
            case 18:
                p9.d _scopedInstanceFactory19 = (p9.d) obj;
                m.e(_scopedInstanceFactory19, "$this$_scopedInstanceFactory");
                v1.c cVar19 = new v1.c(new d(this.C, 21), -557655062, true);
                _scopedInstanceFactory19.a(a0.a.b(SettingsRoute$DownloadManagerScreen.class), ny.d.E, this.B, cVar19);
                break;
            case 19:
                p9.d _scopedInstanceFactory20 = (p9.d) obj;
                m.e(_scopedInstanceFactory20, "$this$_scopedInstanceFactory");
                v1.c cVar20 = new v1.c(new d(this.C, 22), -557655062, true);
                _scopedInstanceFactory20.a(a0.a.b(SettingsRoute$DebugControlsScreen.class), ny.d.F, this.B, cVar20);
                break;
            case 20:
                p9.d _scopedInstanceFactory21 = (p9.d) obj;
                m.e(_scopedInstanceFactory21, "$this$_scopedInstanceFactory");
                v1.c cVar21 = new v1.c(new d(this.C, 23), -557655062, true);
                _scopedInstanceFactory21.a(a0.a.b(SettingsRoute$EditDetailsScreen.class), ny.d.G, this.B, cVar21);
                break;
            case 21:
                p9.d _scopedInstanceFactory22 = (p9.d) obj;
                m.e(_scopedInstanceFactory22, "$this$_scopedInstanceFactory");
                v1.c cVar22 = new v1.c(new d(this.C, 24), -557655062, true);
                _scopedInstanceFactory22.a(a0.a.b(SettingsRoute$ChangePasswordScreen.class), ny.d.H, this.B, cVar22);
                break;
            case 22:
                p9.d _scopedInstanceFactory23 = (p9.d) obj;
                m.e(_scopedInstanceFactory23, "$this$_scopedInstanceFactory");
                v1.c cVar23 = new v1.c(new d(this.C, 25), -557655062, true);
                _scopedInstanceFactory23.a(a0.a.b(SettingsRoute$ManageSubscriptionScreen.class), ny.d.I, this.B, cVar23);
                break;
            case 23:
                p9.d _scopedInstanceFactory24 = (p9.d) obj;
                m.e(_scopedInstanceFactory24, "$this$_scopedInstanceFactory");
                v1.c cVar24 = new v1.c(new d(this.C, 26), -557655062, true);
                _scopedInstanceFactory24.a(a0.a.b(SettingsRoute$DevicesScreen.class), ny.d.J, this.B, cVar24);
                break;
            case 24:
                p9.d _scopedInstanceFactory25 = (p9.d) obj;
                m.e(_scopedInstanceFactory25, "$this$_scopedInstanceFactory");
                v1.c cVar25 = new v1.c(new d(this.C, 27), -557655062, true);
                _scopedInstanceFactory25.a(a0.a.b(SettingsRoute$CancellationBenefitsScreen.class), ny.d.K, this.B, cVar25);
                break;
            case 25:
                p9.d _scopedInstanceFactory26 = (p9.d) obj;
                m.e(_scopedInstanceFactory26, "$this$_scopedInstanceFactory");
                v1.c cVar26 = new v1.c(new d(this.C, 28), -557655062, true);
                _scopedInstanceFactory26.a(a0.a.b(SettingsRoute$CancellationQuestionnaireScreen.class), ny.d.L, this.B, cVar26);
                break;
            case 26:
                p9.d _scopedInstanceFactory27 = (p9.d) obj;
                m.e(_scopedInstanceFactory27, "$this$_scopedInstanceFactory");
                v1.c cVar27 = new v1.c(new ny.f(this.C, 1), -557655062, true);
                _scopedInstanceFactory27.a(a0.a.b(InsightsRoute$InsightsScreen.class), qs.d.B, this.B, cVar27);
                break;
            case 27:
                p9.d _scopedInstanceFactory28 = (p9.d) obj;
                m.e(_scopedInstanceFactory28, "$this$_scopedInstanceFactory");
                v1.c cVar28 = new v1.c(new ny.f(this.C, 2), -557655062, true);
                _scopedInstanceFactory28.a(a0.a.b(rr.f.class), qs.d.C, this.B, cVar28);
                break;
            case 28:
                p9.d _scopedInstanceFactory29 = (p9.d) obj;
                m.e(_scopedInstanceFactory29, "$this$_scopedInstanceFactory");
                v1.c cVar29 = new v1.c(new ny.f(this.C, 3), -557655062, true);
                _scopedInstanceFactory29.a(a0.a.b(rr.i.class), qs.d.D, this.B, cVar29);
                break;
            default:
                p9.d _scopedInstanceFactory30 = (p9.d) obj;
                m.e(_scopedInstanceFactory30, "$this$_scopedInstanceFactory");
                v1.c cVar30 = new v1.c(new ny.f(this.C, 7), -557655062, true);
                _scopedInstanceFactory30.a(a0.a.b(SearchRoute$SearchScreen.class), yx.b.B, this.B, cVar30);
                break;
        }
        return b0.a;
    }
}
