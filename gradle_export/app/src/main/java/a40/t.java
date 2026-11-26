package a40;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import com.mchutov.quranify.reciters.presentation.screen.collection.topreciters.TopRecitersLauncher;
import com.mchutov.quranify.reciters.presentation.screen.detail.main.ReciterLauncher;
import com.mchutov.quranify.reciters.presentation.screen.search.SearchReciterLauncher;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;

public final class t implements u00.n {
    public final int A;

    public t(int i) {
        this.A = 15;
    }

    public t(int i, byte b) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((k00.i) obj).plus((k00.g) obj2);
            case 2:
                return ((k00.i) obj).plus((k00.g) obj2);
            case 3:
                e60.a factory = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory, "$this$factory");
                kotlin.jvm.internal.m.e(it, "it");
                kotlin.jvm.internal.b0 b0Var = kotlin.jvm.internal.a0.a;
                return new jn.a((is.m1) factory.f(b0Var.b(is.m1.class), null, null), (br.i) factory.f(b0Var.b(br.i.class), null, null), (wo.c0) factory.f(b0Var.b(wo.c0.class), null, null), (is.c1) factory.f(b0Var.b(is.c1.class), null, null), (xs.c) factory.f(b0Var.b(xs.c.class), null, null));
            case 4:
                e60.a factory2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory2, "$this$factory");
                kotlin.jvm.internal.m.e(it2, "it");
                kotlin.jvm.internal.b0 b0Var2 = kotlin.jvm.internal.a0.a;
                return new on.d((nn.d) factory2.f(b0Var2.b(nn.d.class), null, null), (zm.b) factory2.f(b0Var2.b(zm.b.class), null, null), (xv.c) factory2.f(b0Var2.b(xv.c.class), null, null), (uu.a) factory2.f(b0Var2.b(uu.a.class), null, null), (dn.c) factory2.f(b0Var2.b(dn.c.class), null, null));
            case 5:
                e60.a single = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single, "$this$single");
                kotlin.jvm.internal.m.e(it3, "it");
                b60.b bVar = new b60.b("default_shared_preferences");
                kotlin.jvm.internal.b0 b0Var3 = kotlin.jvm.internal.a0.a;
                return new zm.b((SharedPreferences) single.f(b0Var3.b(SharedPreferences.class), null, bVar), (bk.m) single.f(b0Var3.b(bk.m.class), null, null));
            case 6:
                e60.a factory3 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory3, "$this$factory");
                kotlin.jvm.internal.m.e(it4, "it");
                kotlin.jvm.internal.b0 b0Var4 = kotlin.jvm.internal.a0.a;
                return new fn.b((nn.d) factory3.f(b0Var4.b(nn.d.class), null, null), (tq.k) factory3.f(b0Var4.b(tq.k.class), null, null), (xw.k) factory3.f(b0Var4.b(xw.k.class), null, null), (uu.a) factory3.f(b0Var4.b(uu.a.class), null, null), (dn.c) factory3.f(b0Var4.b(dn.c.class), null, null));
            case 7:
                e60.a single2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single2, "$this$single");
                kotlin.jvm.internal.m.e(it5, "it");
                return new sn.c(ri.t1.h(single2));
            case 8:
                e60.a single3 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single3, "$this$single");
                kotlin.jvm.internal.m.e(it6, "it");
                return new sn.i(ri.t1.h(single3), (SharedPreferences) single3.f(kotlin.jvm.internal.a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 9:
                e60.a single4 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single4, "$this$single");
                kotlin.jvm.internal.m.e(it7, "it");
                return new sn.e(ri.t1.h(single4));
            case 10:
                a60.a it8 = (a60.a) obj2;
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e(it8, "it");
                return new nn.d();
            case 11:
                e60.a single5 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single5, "$this$single");
                kotlin.jvm.internal.m.e(it9, "it");
                kotlin.jvm.internal.b0 b0Var5 = kotlin.jvm.internal.a0.a;
                return new nn.k((nn.d) single5.f(b0Var5.b(nn.d.class), null, null), (zm.b) single5.f(b0Var5.b(zm.b.class), null, null), (sn.c) single5.f(b0Var5.b(sn.c.class), null, null), (SharedPreferences) single5.f(b0Var5.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 12:
                e60.a factory4 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory4, "$this$factory");
                kotlin.jvm.internal.m.e(it10, "it");
                kotlin.jvm.internal.b0 b0Var6 = kotlin.jvm.internal.a0.a;
                return new nn.j((nn.d) factory4.f(b0Var6.b(nn.d.class), null, null), (xv.c) factory4.f(b0Var6.b(xv.c.class), null, null), (cw.a) factory4.f(b0Var6.b(cw.a.class), null, null), (sn.c) factory4.f(b0Var6.b(sn.c.class), null, null), (uu.a) factory4.f(b0Var6.b(uu.a.class), null, null), (xw.k) factory4.f(b0Var6.b(xw.k.class), null, null), (tq.k) factory4.f(b0Var6.b(tq.k.class), null, null), (zt.a) factory4.f(b0Var6.b(zt.a.class), null, null), (qu.a) factory4.f(b0Var6.b(qu.a.class), null, null), (tk.c) factory4.f(b0Var6.b(tk.c.class), null, null));
            case 13:
                e60.a factory5 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory5, "$this$factory");
                kotlin.jvm.internal.m.e(it11, "it");
                return new dn.c(ri.t1.h(factory5), (lb.f) factory5.f(kotlin.jvm.internal.a0.a.b(lb.f.class), null, null));
            case 14:
                ((Integer) obj).intValue();
                PlayerItem playerItem = (PlayerItem) obj2;
                kotlin.jvm.internal.m.e(playerItem, "playerItem");
                return as.a.e(playerItem);
            case 15:
                ((Integer) obj2).getClass();
                at.a.a((l1.j) obj, l1.q.K(1));
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                a60.a it12 = (a60.a) obj2;
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e(it12, "it");
                return new gx.d();
            case 17:
                a60.a it13 = (a60.a) obj2;
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e(it13, "it");
                return new gx.e();
            case 18:
                e60.a single6 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single6, "$this$single");
                kotlin.jvm.internal.m.e(it14, "it");
                return new fw.a((cq.a) single6.f(kotlin.jvm.internal.a0.a.b(cq.a.class), null, null), 1);
            case 19:
                e60.a single7 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single7, "$this$single");
                kotlin.jvm.internal.m.e(it15, "it");
                return new fw.a((cq.a) single7.f(kotlin.jvm.internal.a0.a.b(cq.a.class), null, null), 2);
            case 20:
                e60.a single8 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single8, "$this$single");
                kotlin.jvm.internal.m.e(it16, "it");
                kotlin.jvm.internal.b0 b0Var7 = kotlin.jvm.internal.a0.a;
                return new gx.c((cq.a) single8.f(b0Var7.b(cq.a.class), null, null), (xw.d) single8.f(b0Var7.b(xw.d.class), null, null), (tq.k) single8.f(b0Var7.b(tq.k.class), null, null));
            case 21:
                e60.a viewModel = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel, "$this$viewModel");
                kotlin.jvm.internal.m.e(it17, "it");
                kotlin.jvm.internal.b0 b0Var8 = kotlin.jvm.internal.a0.a;
                return new hx.e0((xw.k) viewModel.f(b0Var8.b(xw.k.class), null, null), (xw.d) viewModel.f(b0Var8.b(xw.d.class), null, null), (au.a) viewModel.f(b0Var8.b(au.a.class), null, null), (zt.a) viewModel.f(b0Var8.b(zt.a.class), null, null), (tq.k) viewModel.f(b0Var8.b(tq.k.class), null, null), (pm.c) viewModel.f(b0Var8.b(pm.c.class), null, null));
            case 22:
                e60.a single9 = (e60.a) obj;
                a60.a it18 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single9, "$this$single");
                kotlin.jvm.internal.m.e(it18, "it");
                return (DataStore) ax.j.e.a(ax.j.a[1], ri.t1.i(single9));
            case 23:
                e60.a viewModel2 = (e60.a) obj;
                a60.a aVar = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel2, "$this$viewModel");
                kotlin.jvm.internal.m.e(aVar, "<destruct>");
                kotlin.jvm.internal.b0 b0Var9 = kotlin.jvm.internal.a0.a;
                return new qx.t((SearchReciterLauncher) aVar.a(0, b0Var9.b(SearchReciterLauncher.class)), (xw.k) viewModel2.f(b0Var9.b(xw.k.class), null, null), (aq.a) viewModel2.f(b0Var9.b(aq.a.class), null, null), (au.a) viewModel2.f(b0Var9.b(au.a.class), null, null), (zt.a) viewModel2.f(b0Var9.b(zt.a.class), null, null));
            case 24:
                e60.a viewModel3 = (e60.a) obj;
                a60.a aVar2 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel3, "$this$viewModel");
                kotlin.jvm.internal.m.e(aVar2, "<destruct>");
                kotlin.jvm.internal.b0 b0Var10 = kotlin.jvm.internal.a0.a;
                return new jx.x((TopRecitersLauncher) aVar2.a(0, b0Var10.b(TopRecitersLauncher.class)), (xw.k) viewModel3.f(b0Var10.b(xw.k.class), null, null), (aq.a) viewModel3.f(b0Var10.b(aq.a.class), null, null), (au.a) viewModel3.f(b0Var10.b(au.a.class), null, null), (zt.a) viewModel3.f(b0Var10.b(zt.a.class), null, null));
            case 25:
                e60.a viewModel4 = (e60.a) obj;
                a60.a aVar3 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel4, "$this$viewModel");
                kotlin.jvm.internal.m.e(aVar3, "<destruct>");
                kotlin.jvm.internal.b0 b0Var11 = kotlin.jvm.internal.a0.a;
                return new nx.p0((ReciterLauncher) aVar3.a(0, b0Var11.b(ReciterLauncher.class)), (xw.k) viewModel4.f(b0Var11.b(xw.k.class), null, null), (uu.a) viewModel4.f(b0Var11.b(uu.a.class), null, null), (tq.k) viewModel4.f(b0Var11.b(tq.k.class), null, null), (aq.a) viewModel4.f(b0Var11.b(aq.a.class), null, null), (au.a) viewModel4.f(b0Var11.b(au.a.class), null, null), (zt.a) viewModel4.f(b0Var11.b(zt.a.class), null, null), (tt.b) viewModel4.f(b0Var11.b(tt.b.class), null, null), (qu.a) viewModel4.f(b0Var11.b(qu.a.class), null, null), (vp.x) viewModel4.f(b0Var11.b(vp.x.class), null, null), (tx.a) viewModel4.f(b0Var11.b(tx.a.class), null, null), (oq.b) viewModel4.f(b0Var11.b(oq.b.class), null, null), (DeepLinkAnalytics) viewModel4.f(b0Var11.b(DeepLinkAnalytics.class), null, null));
            case 26:
                e60.a single10 = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single10, "$this$single");
                kotlin.jvm.internal.m.e(it19, "it");
                Object objB = ((l60.q0) single10.f(kotlin.jvm.internal.a0.a.b(l60.q0.class), null, null)).b(zw.a.class);
                kotlin.jvm.internal.m.d(objB, "create(...)");
                return (zw.a) objB;
            case 27:
                e60.a single11 = (e60.a) obj;
                a60.a it20 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single11, "$this$single");
                kotlin.jvm.internal.m.e(it20, "it");
                return new ww.a(ri.t1.i(single11));
            case 28:
                e60.a single12 = (e60.a) obj;
                a60.a it21 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single12, "$this$single");
                kotlin.jvm.internal.m.e(it21, "it");
                b60.b bVar2 = new b60.b("default_shared_preferences");
                kotlin.jvm.internal.b0 b0Var12 = kotlin.jvm.internal.a0.a;
                return new xw.e((SharedPreferences) single12.f(b0Var12.b(SharedPreferences.class), null, bVar2), (bk.m) single12.f(b0Var12.b(bk.m.class), null, null), (ww.a) single12.f(b0Var12.b(ww.a.class), null, null));
            default:
                e60.a single13 = (e60.a) obj;
                a60.a it22 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single13, "$this$single");
                kotlin.jvm.internal.m.e(it22, "it");
                kotlin.jvm.internal.b0 b0Var13 = kotlin.jvm.internal.a0.a;
                return new xw.k((uw.c) single13.f(b0Var13.b(uw.c.class), null, null), (uw.e) single13.f(b0Var13.b(uw.e.class), null, null), (uw.h) single13.f(b0Var13.b(uw.h.class), null, null), (zw.a) single13.f(b0Var13.b(zw.a.class), null, null), (DataStore) single13.f(b0Var13.b(DataStore.class), null, new b60.b("RECITER_STORE_SCOPE_KEY")), (xw.e) single13.f(b0Var13.b(xw.e.class), null, null), (LocaleManager) single13.f(b0Var13.b(LocaleManager.class), null, null), (er.j) single13.f(b0Var13.b(er.j.class), null, null), (zt.a) single13.f(b0Var13.b(zt.a.class), null, null), (au.a) single13.f(b0Var13.b(au.a.class), null, null));
        }
    }
}
