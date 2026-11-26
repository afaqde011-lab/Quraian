package ny;

import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import bz.s;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AndroidAutoAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.mchutov.quranify.settings.presentation.analytics.SettingsAnalytics;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import er.j;
import ez.u;
import gz.m1;
import is.y;
import jz.d0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.q;
import l60.q0;
import ri.t1;
import u00.n;
import uu.w;
import uy.l;
import vp.x;
import w.s0;
import w.v;
import wo.c0;
import wy.p;
import xw.k;
import xy.o;

public final class c implements n {
    public final int A;

    public c(int i) {
        this.A = 21;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e60.a viewModel = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(viewModel, "$this$viewModel");
                m.e(it, "it");
                b0 b0Var = a0.a;
                return new s((wo.b0) viewModel.f(b0Var.b(wo.b0.class), null, null), (qy.a) viewModel.f(b0Var.b(qy.a.class), null, null));
            case 1:
                e60.a viewModel2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(viewModel2, "$this$viewModel");
                m.e(it2, "it");
                b0 b0Var2 = a0.a;
                return new d0((x) viewModel2.f(b0Var2.b(x.class), null, null), (wo.b0) viewModel2.f(b0Var2.b(wo.b0.class), null, null), (c0) viewModel2.f(b0Var2.b(c0.class), null, null), (hp.b) viewModel2.f(b0Var2.b(hp.b.class), null, null), (AuthAnalytics) viewModel2.f(b0Var2.b(AuthAnalytics.class), null, null), (LocaleManager) viewModel2.f(b0Var2.b(LocaleManager.class), null, null), (pm.c) viewModel2.f(b0Var2.b(pm.c.class), null, null), (aq.a) viewModel2.f(b0Var2.b(aq.a.class), null, null));
            case 2:
                e60.a viewModel3 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(viewModel3, "$this$viewModel");
                m.e(it3, "it");
                b0 b0Var3 = a0.a;
                return new o((y) viewModel3.f(b0Var3.b(y.class), null, null), (im.a) viewModel3.f(b0Var3.b(im.a.class), null, null), (pq.a) viewModel3.f(b0Var3.b(pq.a.class), null, null), (tx.a) viewModel3.f(b0Var3.b(tx.a.class), null, null), (x) viewModel3.f(b0Var3.b(x.class), null, null), (c0) viewModel3.f(b0Var3.b(c0.class), null, null), (or.b) viewModel3.f(b0Var3.b(or.b.class), null, null));
            case 3:
                e60.a single = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it4, "it");
                return new ty.a(t1.i(single), (ly.a) single.f(a0.a.b(ly.a.class), null, null));
            case 4:
                e60.a single2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it5, "it");
                Object objB = ((q0) single2.f(a0.a.b(q0.class), null, null)).b(my.b.class);
                m.d(objB, "create(...)");
                return (my.b) objB;
            case 5:
                a60.a it6 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it6, "it");
                return new iy.b();
            case 6:
                e60.a factory = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it7, "it");
                b0 b0Var4 = a0.a;
                return new ly.f((my.b) factory.f(b0Var4.b(my.b.class), null, null), (iy.b) factory.f(b0Var4.b(iy.b.class), null, null));
            case 7:
                a60.a it8 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it8, "it");
                return new iy.a();
            case 8:
                e60.a factory2 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it9, "it");
                b0 b0Var5 = a0.a;
                return new ly.d((my.a) factory2.f(b0Var5.b(my.a.class), null, null), (iy.a) factory2.f(b0Var5.b(iy.a.class), null, null), (j) factory2.f(b0Var5.b(j.class), null, null));
            case 9:
                e60.a factory3 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it10, "it");
                b0 b0Var6 = a0.a;
                return new ky.a((ly.a) factory3.f(b0Var6.b(ly.a.class), null, null), (fu.a) factory3.f(b0Var6.b(fu.a.class), null, null));
            case 10:
                e60.a single3 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it11, "it");
                return new sy.c(t1.i(single3));
            case 11:
                e60.a factory4 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it12, "it");
                return new SettingsAnalytics((tk.c) factory4.f(a0.a.b(tk.c.class), null, null));
            case 12:
                e60.a factory5 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it13, "it");
                return new ly.a((SharedPreferences) factory5.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 13:
                v predictivePopTransitionSpec = (v) obj;
                ((Integer) obj2).getClass();
                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                return w.m.d(s0.c((x.y) null, 3), s0.k(new e6.c(4)));
            case 14:
                a60.a it14 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it14, "it");
                return new sy.b();
            case 15:
                e60.a viewModel4 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(viewModel4, "$this$viewModel");
                m.e(it15, "it");
                b0 b0Var7 = a0.a;
                return new m1((pm.c) viewModel4.f(b0Var7.b(pm.c.class), null, null), (LocaleManager) viewModel4.f(b0Var7.b(LocaleManager.class), null, null), (SettingsAnalytics) viewModel4.f(b0Var7.b(SettingsAnalytics.class), null, null), (aq.a) viewModel4.f(b0Var7.b(aq.a.class), null, null), (x) viewModel4.f(b0Var7.b(x.class), null, null), (ly.d) viewModel4.f(b0Var7.b(ly.d.class), null, null), (hr.b) viewModel4.f(b0Var7.b(hr.b.class), null, null), (a00.a) viewModel4.f(b0Var7.b(a00.a.class), null, null), (b00.c) viewModel4.f(b0Var7.b(b00.c.class), null, null), (er.a) viewModel4.f(b0Var7.b(er.a.class), null, null), (wo.b0) viewModel4.f(b0Var7.b(wo.b0.class), null, null), (c0) viewModel4.f(b0Var7.b(c0.class), null, null), (bp.g) viewModel4.f(b0Var7.b(bp.g.class), null, null), (hp.b) viewModel4.f(b0Var7.b(hp.b.class), null, null), (AuthAnalytics) viewModel4.f(b0Var7.b(AuthAnalytics.class), null, null));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a viewModel5 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                m.e(viewModel5, "$this$viewModel");
                m.e(it16, "it");
                b0 b0Var8 = a0.a;
                return new dz.s((zt.a) viewModel5.f(b0Var8.b(zt.a.class), null, null), (k) viewModel5.f(b0Var8.b(k.class), null, null), (xv.c) viewModel5.f(b0Var8.b(xv.c.class), null, null), (io.a) viewModel5.f(b0Var8.b(io.a.class), null, null), (jo.d) viewModel5.f(b0Var8.b(jo.d.class), null, null), (ko.g) viewModel5.f(b0Var8.b(ko.g.class), null, null));
            case 17:
                e60.a viewModel6 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                m.e(viewModel6, "$this$viewModel");
                m.e(it17, "it");
                b0 b0Var9 = a0.a;
                return new nz.n((ty.a) viewModel6.f(b0Var9.b(ty.a.class), null, null), (ly.a) viewModel6.f(b0Var9.b(ly.a.class), null, null));
            case 18:
                e60.a viewModel7 = (e60.a) obj;
                a60.a it18 = (a60.a) obj2;
                m.e(viewModel7, "$this$viewModel");
                m.e(it18, "it");
                b0 b0Var10 = a0.a;
                return new u((wo.b0) viewModel7.f(b0Var10.b(wo.b0.class), null, null), (c0) viewModel7.f(b0Var10.b(c0.class), null, null), (pm.c) viewModel7.f(b0Var10.b(pm.c.class), null, null));
            case 19:
                e60.a viewModel8 = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                m.e(viewModel8, "$this$viewModel");
                m.e(it19, "it");
                b0 b0Var11 = a0.a;
                return new p((wo.b0) viewModel8.f(b0Var11.b(wo.b0.class), null, null), (pm.c) viewModel8.f(b0Var11.b(pm.c.class), null, null));
            case 20:
                a60.a it20 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$viewModel");
                m.e(it20, "it");
                return new l();
            case 21:
                ((Integer) obj2).getClass();
                nz.a.b((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 22:
                e60.a factory6 = (e60.a) obj;
                a60.a it21 = (a60.a) obj2;
                m.e(factory6, "$this$factory");
                m.e(it21, "it");
                return new qu.a((x) factory6.f(a0.a.b(x.class), null, null));
            case 23:
                e60.a factory7 = (e60.a) obj;
                a60.a it22 = (a60.a) obj2;
                m.e(factory7, "$this$factory");
                m.e(it22, "it");
                return new wu.a(t1.i(factory7));
            case 24:
                e60.a single4 = (e60.a) obj;
                a60.a it23 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it23, "it");
                Context contextI = t1.i(single4);
                b0 b0Var12 = a0.a;
                return new ov.g(contextI, (k) single4.f(b0Var12.b(k.class), null, null), (tq.k) single4.f(b0Var12.b(tq.k.class), null, null), (zt.a) single4.f(b0Var12.b(zt.a.class), null, null), (xv.c) single4.f(b0Var12.b(xv.c.class), null, null), (qu.a) single4.f(b0Var12.b(qu.a.class), null, null), (cw.a) single4.f(b0Var12.b(cw.a.class), null, null), (wu.a) single4.f(b0Var12.b(wu.a.class), null, null), (b00.c) single4.f(b0Var12.b(b00.c.class), null, null), (is.c) single4.f(b0Var12.b(is.c.class), null, null), (jo.d) single4.f(b0Var12.b(jo.d.class), null, null), (ko.c) single4.f(b0Var12.b(ko.c.class), null, null));
            case 25:
                e60.a factory8 = (e60.a) obj;
                a60.a it24 = (a60.a) obj2;
                m.e(factory8, "$this$factory");
                m.e(it24, "it");
                return new AudioPlayerAnalytics((tk.c) factory8.f(a0.a.b(tk.c.class), null, null));
            case 26:
                e60.a factory9 = (e60.a) obj;
                a60.a it25 = (a60.a) obj2;
                m.e(factory9, "$this$factory");
                m.e(it25, "it");
                return new AndroidAutoAnalytics((tk.c) factory9.f(a0.a.b(tk.c.class), null, null));
            case 27:
                a60.a it26 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it26, "it");
                return new bq.a();
            case 28:
                e60.a single5 = (e60.a) obj;
                a60.a it27 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it27, "it");
                return new zu.a((SharedPreferences) single5.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            default:
                e60.a single6 = (e60.a) obj;
                a60.a it28 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it28, "it");
                Context contextI2 = t1.i(single6);
                b0 b0Var13 = a0.a;
                return new w(contextI2, (k) single6.f(b0Var13.b(k.class), null, null), (tq.k) single6.f(b0Var13.b(tq.k.class), null, null), (nu.d) single6.f(b0Var13.b(nu.d.class), null, null), (zt.a) single6.f(b0Var13.b(zt.a.class), null, null), (wu.a) single6.f(b0Var13.b(wu.a.class), null, null), (qu.a) single6.f(b0Var13.b(qu.a.class), null, null), (AudioPlayerAnalytics) single6.f(b0Var13.b(AudioPlayerAnalytics.class), null, null), (DownloadAnalytics) single6.f(b0Var13.b(DownloadAnalytics.class), null, null), (x) single6.f(b0Var13.b(x.class), null, null), (hr.b) single6.f(b0Var13.b(hr.b.class), null, null), (tx.a) single6.f(b0Var13.b(tx.a.class), null, null), (zu.a) single6.f(b0Var13.b(zu.a.class), null, null), (xu.f) single6.f(b0Var13.b(xu.f.class), null, null));
        }
    }
}
