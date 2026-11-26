package ny;

import b2.o;
import b2.r;
import c7.i;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.insights.presentation.navigation.InsightsRoute$InsightsScreen;
import com.mchutov.quranify.insights.presentation.navigation.InsightsTabRoute$InsightsScreen;
import com.mchutov.quranify.reciters.presentation.navigation.ReciterRoute$ReciterScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$PlaylistScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchRoute$SearchScreen;
import com.mchutov.quranify.search.presentation.navigation.SearchTabRoute$SearchScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ChangePasswordScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DebugControlsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$DownloadManagerScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$EditDetailsScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$ManageSubscriptionScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsRoute$NotificationScreen;
import com.mchutov.quranify.settings.presentation.navigation.SettingsTabRoute$SettingsScreen;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import ds.l;
import g00.b0;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.t1;
import h0.v1;
import h0.z1;
import i2.t;
import jz.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l1.p2;
import lo.h;
import lo.s;
import m3.r0;
import mb.x;
import oi.k;
import q3.u;
import u00.p;
import wy.q;
import x.v;

public final class a implements p {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.A) {
            case 0:
                e60.a navigation = (e60.a) obj;
                SettingsTabRoute$SettingsScreen it = (SettingsTabRoute$SettingsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation, "$this$navigation");
                m.e(it, "it");
                i.h((j) obj3, 0);
                break;
            case 1:
                e60.a navigation2 = (e60.a) obj;
                SettingsRoute$NotificationScreen it2 = (SettingsRoute$NotificationScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation2, "$this$navigation");
                m.e(it2, "it");
                nz.a.b((j) obj3, 0);
                break;
            case 2:
                e60.a navigation3 = (e60.a) obj;
                SettingsRoute$DownloadManagerScreen it3 = (SettingsRoute$DownloadManagerScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation3, "$this$navigation");
                m.e(it3, "it");
                dz.m.b((j) obj3, 0);
                break;
            case 3:
                e60.a navigation4 = (e60.a) obj;
                SettingsRoute$DebugControlsScreen it4 = (SettingsRoute$DebugControlsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation4, "$this$navigation");
                m.e(it4, "it");
                xy.a.b((j) obj3, 0);
                break;
            case 4:
                e60.a navigation5 = (e60.a) obj;
                SettingsRoute$EditDetailsScreen it5 = (SettingsRoute$EditDetailsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation5, "$this$navigation");
                m.e(it5, "it");
                ez.a.b((j) obj3, 0);
                break;
            case 5:
                e60.a navigation6 = (e60.a) obj;
                SettingsRoute$ChangePasswordScreen it6 = (SettingsRoute$ChangePasswordScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation6, "$this$navigation");
                m.e(it6, "it");
                q.a((j) obj3, 0);
                break;
            case 6:
                e60.a navigation7 = (e60.a) obj;
                SettingsRoute$ManageSubscriptionScreen it7 = (SettingsRoute$ManageSubscriptionScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation7, "$this$navigation");
                m.e(it7, "it");
                y.b((j) obj3, 0);
                break;
            case 7:
                w.p AnimatedContent = (w.p) obj;
                lo.i shown = (lo.i) obj2;
                g0 g0Var = (j) obj3;
                ((Integer) obj4).getClass();
                m.e(AnimatedContent, "$this$AnimatedContent");
                m.e(shown, "shown");
                boolean zEquals = shown.equals(h.a);
                o oVar = o.A;
                if (zEquals) {
                    g0 g0Var2 = g0Var;
                    g0Var2.c0(-1595419088);
                    o3.a(y3.R(2131231391, g0Var, 0), (String) null, z1.m(oVar, 20), dl.a.n, g0Var, 440, 0);
                    g0Var2.r(false);
                } else if (shown instanceof lo.g) {
                    g0 g0Var3 = g0Var;
                    g0Var3.c0(-1595087791);
                    float f = ((lo.g) shown).a;
                    p2 p2VarB = x.d.b(f >= 0.05f ? f : 0.05f, x.c.w(200, 0, (v) null, 6), (String) null, g0Var, 48, 28);
                    r rVarC = h0.c.C(z1.m(oVar, 20), 1.5f);
                    long j = dl.a.n;
                    long jB = t.b(0.15f, t.c);
                    float f2 = 3;
                    float f3 = 0;
                    boolean zG = g0Var3.g(p2VarB);
                    Object objN = g0Var3.N();
                    if (zG || objN == l1.i.a) {
                        objN = new l(p2VarB, 12);
                        g0Var3.n0(objN);
                    }
                    v5.b((u00.a) objN, rVarC, j, f2, jB, 1, f3, g0Var, 1600560, 0);
                    g0Var3.r(false);
                } else {
                    if (!shown.equals(lo.f.a)) {
                        throw k.r(g0Var, 2026743711, false);
                    }
                    g0 g0Var4 = g0Var;
                    g0Var4.c0(-1594255503);
                    o3.a(y3.R(2131231105, g0Var, 0), (String) null, z1.m(oVar, 20), dl.a.n, g0Var, 440, 0);
                    g0Var4.r(false);
                }
                return b0.a;
            case 8:
                e60.a navigation8 = (e60.a) obj;
                InsightsRoute$InsightsScreen it8 = (InsightsRoute$InsightsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation8, "$this$navigation");
                m.e(it8, "it");
                bt.a.e((j) obj3, 0);
                break;
            case 9:
                e60.a navigation9 = (e60.a) obj;
                rr.f it9 = (rr.f) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation9, "$this$navigation");
                m.e(it9, "it");
                ds.a.a((j) obj3, 0);
                break;
            case 10:
                e60.a navigation10 = (e60.a) obj;
                rr.i it10 = (rr.i) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation10, "$this$navigation");
                m.e(it10, "it");
                cs.a.c((j) obj3, 0);
                break;
            case 11:
                e60.a navigation11 = (e60.a) obj;
                InsightsTabRoute$InsightsScreen it11 = (InsightsTabRoute$InsightsScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation11, "$this$navigation");
                m.e(it11, "it");
                kh.o.b((j) obj3, 0);
                break;
            case 12:
                x SubcomposeAsyncImage = (x) obj;
                mb.e it12 = (mb.e) obj2;
                g0 g0Var5 = (j) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                m.e(SubcomposeAsyncImage, "$this$SubcomposeAsyncImage");
                m.e(it12, "it");
                boolean z = (iIntValue & 129) != 128;
                int i2 = iIntValue & 1;
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(i2, z)) {
                    qt.a.c(g0Var5, 0);
                } else {
                    g0Var6.V();
                }
                return b0.a;
            case 13:
                x SubcomposeAsyncImage2 = (x) obj;
                mb.f it13 = (mb.f) obj2;
                g0 g0Var7 = (j) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                m.e(SubcomposeAsyncImage2, "$this$SubcomposeAsyncImage");
                m.e(it13, "it");
                boolean z2 = (iIntValue2 & 129) != 128;
                int i3 = iIntValue2 & 1;
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(i3, z2)) {
                    v5.a(z1.m(o.A, 16), dl.a.k, 2, 0L, 0, 0.0f, g0Var7, 390, 56);
                } else {
                    g0Var8.V();
                }
                return b0.a;
            case 14:
                x SubcomposeAsyncImage3 = (x) obj;
                mb.e it14 = (mb.e) obj2;
                g0 g0Var9 = (j) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                m.e(SubcomposeAsyncImage3, "$this$SubcomposeAsyncImage");
                m.e(it14, "it");
                boolean z3 = (iIntValue3 & 129) != 128;
                int i4 = iIntValue3 & 1;
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(i4, z3)) {
                    qt.a.c(g0Var9, 0);
                } else {
                    g0Var10.V();
                }
                return b0.a;
            case 15:
                w.p AnimatedContent2 = (w.p) obj;
                s button = (s) obj2;
                g0 g0Var11 = (j) obj3;
                ((Integer) obj4).getClass();
                m.e(AnimatedContent2, "$this$AnimatedContent");
                m.e(button, "button");
                v1 v1VarA = t1.a(h0.i.g(6), b2.b.K, g0Var11, 54);
                g0 g0Var12 = g0Var11;
                int iHashCode = Long.hashCode(g0Var12.T);
                m1 m1VarM = g0Var12.m();
                o oVar2 = o.A;
                r rVarC2 = b2.a.c(oVar2, g0Var11);
                b3.i.c.getClass();
                b3.g gVar = b3.h.b;
                g0Var12.g0();
                if (g0Var12.S) {
                    g0Var12.l(gVar);
                } else {
                    g0Var12.q0();
                }
                l1.q.I(v1VarA, g0Var11, b3.h.f);
                l1.q.I(m1VarM, g0Var11, b3.h.e);
                l1.q.I(Integer.valueOf(iHashCode), g0Var11, b3.h.g);
                l1.q.E(g0Var11, b3.h.h);
                l1.q.I(rVarC2, g0Var11, b3.h.d);
                m2.b bVarR = y3.R(button == s.C ? 2131231354 : 2131231358, g0Var11, 0);
                long j2 = dl.a.L;
                o3.a(bVarR, (String) null, z1.m(oVar2, 14), j2, g0Var11, 440, 0);
                int iOrdinal = button.ordinal();
                if (iOrdinal == 0) {
                    i = 2131886151;
                } else if (iOrdinal == 1) {
                    i = 2131886129;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = 2131886141;
                }
                z6.b(z3.U(g0Var11, i), (r) null, j2, kh.o.z(16), u.K, (q3.i) null, 0L, (x3.l) null, (x3.k) null, 0L, 0, false, 1, 0, (u00.k) null, (r0) null, g0Var11, 1597440, 24576, 245674);
                g0Var12.r(true);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                w.p AnimatedContent3 = (w.p) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                j jVar = (j) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                m.e(AnimatedContent3, "$this$AnimatedContent");
                o3.a(y3.R(iIntValue4, jVar, (iIntValue5 >> 3) & 14), (String) null, z1.m(o.A, 34), dl.a.i, jVar, 440, 0);
                break;
            case 17:
                e60.a navigation12 = (e60.a) obj;
                cu.d it15 = (cu.d) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation12, "$this$navigation");
                m.e(it15, "it");
                lu.y.a((j) obj3, 0);
                break;
            case 18:
                e60.a navigation13 = (e60.a) obj;
                cu.b it16 = (cu.b) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation13, "$this$navigation");
                m.e(it16, "it");
                dq.l.a((j) obj3, 0);
                break;
            case 19:
                e60.a navigation14 = (e60.a) obj;
                SearchRoute$SearchScreen it17 = (SearchRoute$SearchScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation14, "$this$navigation");
                m.e(it17, "it");
                kh.o.h((j) obj3, 0);
                break;
            case 20:
                e60.a navigation15 = (e60.a) obj;
                ReciterRoute$ReciterScreen route = (ReciterRoute$ReciterScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation15, "$this$navigation");
                m.e(route, "route");
                nx.a.b(route.getLauncher(), (j) obj3, 0);
                break;
            case 21:
                e60.a navigation16 = (e60.a) obj;
                SearchRoute$PlaylistScreen route2 = (SearchRoute$PlaylistScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation16, "$this$navigation");
                m.e(route2, "route");
                as.a.b(route2.getLauncher(), (j) obj3, 0);
                break;
            default:
                e60.a navigation17 = (e60.a) obj;
                SearchTabRoute$SearchScreen it18 = (SearchTabRoute$SearchScreen) obj2;
                ((Integer) obj4).intValue();
                m.e(navigation17, "$this$navigation");
                m.e(it18, "it");
                p30.f.T((j) obj3, 0);
                break;
        }
        return b0.a;
    }
}
