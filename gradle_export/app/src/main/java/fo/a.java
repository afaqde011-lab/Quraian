package fo;

import a1.e1;
import android.content.Context;
import androidx.datastore.core.DataStore;
import ca.r;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.audiostories.data.source.local.db.AudioStoriesDatabase;
import com.mchutov.quranify.audiostories.presentation.analytics.AudioStoryAnalytics;
import com.mchutov.quranify.audiostories.presentation.player.AudioStoryPlayerLauncher;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import jo.d;
import jo.h;
import jo.o;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import no.g;
import oo.g1;
import qo.y;
import ri.t1;
import tn.e;
import tn.i;
import tn.j;
import tn.k;
import tn.l;
import u00.n;
import vn.f;
import vn.s;
import vn.u;
import vp.x;

public final class a implements n {
    public final int A;

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it, "it");
                return (DataStore) c.c.a(c.a[0], t1.i(single));
            case 1:
                e60.a factory = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it2, "it");
                return new e();
            case 2:
                e60.a factory2 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it3, "it");
                b0 b0Var = a0.a;
                return new tn.a();
            case 3:
                e60.a factory3 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it4, "it");
                return new i();
            case 4:
                a60.a it5 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it5, "it");
                return new tn.n();
            case 5:
                e60.a factory4 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it6, "it");
                return new tn.m();
            case 6:
                e60.a factory5 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it7, "it");
                return new l();
            case 7:
                a60.a it8 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it8, "it");
                return new k();
            case 8:
                a60.a it9 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it9, "it");
                return new j();
            case 9:
                e60.a factory6 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(factory6, "$this$factory");
                m.e(it10, "it");
                b0 b0Var2 = a0.a;
                return new d((f) factory6.f(b0Var2.b(f.class), null, null), (u) factory6.f(b0Var2.b(u.class), null, null));
            case 10:
                e60.a factory7 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(factory7, "$this$factory");
                m.e(it11, "it");
                b0 b0Var3 = a0.a;
                return new jo.i((io.a) factory7.f(b0Var3.b(io.a.class), null, null), new av.k(0, factory7.f(b0Var3.b(x.class), null, null), x.class, "observeIsPremium", "observeIsPremium()Lkotlinx/coroutines/flow/Flow;", 0, 8));
            case 11:
                a60.a it12 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it12, "it");
                return new tn.c();
            case 12:
                e60.a factory8 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(factory8, "$this$factory");
                m.e(it13, "it");
                b0 b0Var4 = a0.a;
                return new o((f) factory8.f(b0Var4.b(f.class), null, null), (u) factory8.f(b0Var4.b(u.class), null, null), (io.a) factory8.f(b0Var4.b(io.a.class), null, null), new av.k(0, factory8.f(b0Var4.b(x.class), null, null), x.class, "isPremium", "isPremium()Z", 0, 9));
            case 13:
                e60.a factory9 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                m.e(factory9, "$this$factory");
                m.e(it14, "it");
                return new jo.m((vn.b0) factory9.f(a0.a.b(vn.b0.class), null, null));
            case 14:
                e60.a factory10 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(factory10, "$this$factory");
                m.e(it15, "it");
                b0 b0Var5 = a0.a;
                return new h((f) factory10.f(b0Var5.b(f.class), null, null), (u) factory10.f(b0Var5.b(u.class), null, null));
            case 15:
                e60.a factory11 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                m.e(factory11, "$this$factory");
                m.e(it16, "it");
                return new jo.k((f) factory11.f(a0.a.b(f.class), null, null));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a factory12 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                m.e(factory12, "$this$factory");
                m.e(it17, "it");
                return new jo.b((f) factory12.f(a0.a.b(f.class), null, null));
            case 17:
                e60.a single2 = (e60.a) obj;
                a60.a it18 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it18, "it");
                r rVarX = bi.b.x(t1.h(single2), AudioStoriesDatabase.class, "audio_stories_database");
                rVarX.a(new fa.a[]{AudioStoriesDatabase.l, AudioStoriesDatabase.m});
                rVarX.p = false;
                rVarX.q = true;
                rVarX.r = true;
                return (AudioStoriesDatabase) rVarX.b();
            case 18:
                e60.a viewModel = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                m.e(viewModel, "$this$viewModel");
                m.e(it19, "it");
                b0 b0Var6 = a0.a;
                return new g1((go.a) viewModel.f(b0Var6.b(go.a.class), null, null), (d) viewModel.f(b0Var6.b(d.class), null, null), (jo.k) viewModel.f(b0Var6.b(jo.k.class), null, null), (u) viewModel.f(b0Var6.b(u.class), null, null), (io.a) viewModel.f(b0Var6.b(io.a.class), null, null), (jo.i) viewModel.f(b0Var6.b(jo.i.class), null, null), (au.a) viewModel.f(b0Var6.b(au.a.class), null, null), (jo.b) viewModel.f(b0Var6.b(jo.b.class), null, null), (ko.n) viewModel.f(b0Var6.b(ko.n.class), null, null), (x) viewModel.f(b0Var6.b(x.class), null, null), (ko.c) viewModel.f(b0Var6.b(ko.c.class), null, null), (ko.j) viewModel.f(b0Var6.b(ko.j.class), null, null), (gq.a) viewModel.f(b0Var6.b(gq.a.class), null, null), (aq.a) viewModel.f(b0Var6.b(aq.a.class), null, null), (ko.e) viewModel.f(b0Var6.b(ko.e.class), null, null), (AudioStoryAnalytics) viewModel.f(b0Var6.b(AudioStoryAnalytics.class), null, null), (ko.k) viewModel.f(b0Var6.b(ko.k.class), null, null), (oq.b) viewModel.f(b0Var6.b(oq.b.class), null, null), (DeepLinkAnalytics) viewModel.f(b0Var6.b(DeepLinkAnalytics.class), null, null));
            case 19:
                a60.a it20 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it20, "it");
                return new ko.n();
            case 20:
                e60.a viewModel2 = (e60.a) obj;
                a60.a aVar = (a60.a) obj2;
                m.e(viewModel2, "$this$viewModel");
                m.e(aVar, "<destruct>");
                b0 b0Var7 = a0.a;
                return new y(((Number) aVar.a(0, b0Var7.b(Integer.class))).intValue(), (Integer) aVar.a(1, b0Var7.b(Integer.class)), (d) viewModel2.f(b0Var7.b(d.class), null, null), (go.a) viewModel2.f(b0Var7.b(go.a.class), null, null), (ko.h) viewModel2.f(b0Var7.b(ko.h.class), null, null), (AudioStoryPlayerLauncher) viewModel2.f(b0Var7.b(AudioStoryPlayerLauncher.class), null, null), (io.a) viewModel2.f(b0Var7.b(io.a.class), null, null), (jo.i) viewModel2.f(b0Var7.b(jo.i.class), null, null), (au.a) viewModel2.f(b0Var7.b(au.a.class), null, null), (x) viewModel2.f(b0Var7.b(x.class), null, null), (aq.a) viewModel2.f(b0Var7.b(aq.a.class), null, null), (AudioStoryAnalytics) viewModel2.f(b0Var7.b(AudioStoryAnalytics.class), null, null), (oq.b) viewModel2.f(b0Var7.b(oq.b.class), null, null), (DeepLinkAnalytics) viewModel2.f(b0Var7.b(DeepLinkAnalytics.class), null, null));
            case 21:
                e60.a single3 = (e60.a) obj;
                a60.a it21 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it21, "it");
                return new fw.a((cq.a) single3.f(a0.a.b(cq.a.class), null, null), 3);
            case 22:
                e60.a factory13 = (e60.a) obj;
                a60.a it22 = (a60.a) obj2;
                m.e(factory13, "$this$factory");
                m.e(it22, "it");
                b0 b0Var8 = a0.a;
                return new AudioStoryPlayerLauncher((go.a) factory13.f(b0Var8.b(go.a.class), null, null), (aq.a) factory13.f(b0Var8.b(aq.a.class), null, null));
            case 23:
                e60.a single4 = (e60.a) obj;
                a60.a it23 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it23, "it");
                b0 b0Var9 = a0.a;
                return new wn.d((DataStore) single4.f(b0Var9.b(DataStore.class), null, null), (tn.c) single4.f(b0Var9.b(tn.c.class), null, null));
            case 24:
                e60.a factory14 = (e60.a) obj;
                a60.a it24 = (a60.a) obj2;
                m.e(factory14, "$this$factory");
                m.e(it24, "it");
                return new ko.l(new e1(factory14, 17));
            case 25:
                a60.a it25 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it25, "it");
                return new ko.k();
            case 26:
                e60.a factory15 = (e60.a) obj;
                a60.a it26 = (a60.a) obj2;
                m.e(factory15, "$this$factory");
                m.e(it26, "it");
                return new AudioStoryAnalytics((tk.c) factory15.f(a0.a.b(tk.c.class), null, null));
            case 27:
                e60.a single5 = (e60.a) obj;
                a60.a it27 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it27, "it");
                return new no.e(t1.i(single5));
            case 28:
                e60.a single6 = (e60.a) obj;
                a60.a it28 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it28, "it");
                Context contextI = t1.i(single6);
                b0 b0Var10 = a0.a;
                return new no.d(contextI, (s) single6.f(b0Var10.b(s.class), null, null), (au.a) single6.f(b0Var10.b(au.a.class), null, null));
            default:
                e60.a single7 = (e60.a) obj;
                a60.a it29 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it29, "it");
                Context contextI2 = t1.i(single7);
                b0 b0Var11 = a0.a;
                return new no.n(contextI2, (no.e) single7.f(b0Var11.b(no.e.class), null, null), (zu.a) single7.f(b0Var11.b(zu.a.class), null, null), (jo.m) single7.f(b0Var11.b(jo.m.class), null, null), (u) single7.f(b0Var11.b(u.class), null, null), (ko.l) single7.f(b0Var11.b(ko.l.class), null, null), (x) single7.f(b0Var11.b(x.class), null, null), (aq.a) single7.f(b0Var11.b(aq.a.class), null, null), (d) single7.f(b0Var11.b(d.class), null, null), (h) single7.f(b0Var11.b(h.class), null, null), (jo.i) single7.f(b0Var11.b(jo.i.class), null, null), (au.a) single7.f(b0Var11.b(au.a.class), null, null), (no.d) single7.f(b0Var11.b(no.d.class), null, null), (AudioStoryAnalytics) single7.f(b0Var11.b(AudioStoryAnalytics.class), null, null), (ko.k) single7.f(b0Var11.b(ko.k.class), null, null), (g) single7.f(b0Var11.b(g.class), null, null));
        }
    }
}
