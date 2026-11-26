package ax;

import android.app.LocaleManager;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import b6.l;
import b6.t;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.q;
import ri.t1;
import u00.n;
import vp.x;
import w.s0;
import w.v;
import x.y;

public final class c implements n {
    public final int A;

    public c(int i) {
        this.A = i;
    }

    public c(int i, int i2) {
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it, "it");
                b0 b0Var = a0.a;
                return new xw.d((uw.f) single.f(b0Var.b(uw.f.class), null, null), (zw.a) single.f(b0Var.b(zw.a.class), null, null), (DataStore) single.f(b0Var.b(DataStore.class), null, new b60.b("RECENT_SEARCHED_RECITER_STORE_SCOPE_KEY")), (uw.b) single.f(b0Var.b(uw.b.class), null, null), (LocaleManager) single.f(b0Var.b(LocaleManager.class), null, null), (SharedPreferences) single.f(b0Var.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 1:
                e60.a factory = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it2, "it");
                b0 b0Var2 = a0.a;
                return new uw.c((uw.a) factory.f(b0Var2.b(uw.a.class), null, null), (LocaleManager) factory.f(b0Var2.b(LocaleManager.class), null, null));
            case 2:
                a60.a it3 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it3, "it");
                return new uw.f();
            case 3:
                a60.a it4 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it4, "it");
                return new uw.e();
            case 4:
                v predictivePopTransitionSpec = (v) obj;
                ((Integer) obj2).getClass();
                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                return w.m.d(s0.c((y) null, 3), s0.k(new e6.c(4)));
            case 5:
                e60.a single2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it5, "it");
                return (DataStore) j.d.a(j.a[0], t1.i(single2));
            case 6:
                e60.a factory2 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it6, "it");
                b0 b0Var3 = a0.a;
                return new uw.h((bk.m) factory2.f(b0Var3.b(bk.m.class), null, null), t1.i(factory2), (LocaleManager) factory2.f(b0Var3.b(LocaleManager.class), null, null));
            case 7:
                a60.a it7 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it7, "it");
                return new uw.b();
            case 8:
                e60.a factory3 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it8, "it");
                return new uw.a((uw.j) factory3.f(a0.a.b(uw.j.class), null, null));
            case 9:
                e60.a factory4 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it9, "it");
                b0 b0Var4 = a0.a;
                return new uw.j((bk.m) factory4.f(b0Var4.b(bk.m.class), null, null), t1.i(factory4), (LocaleManager) factory4.f(b0Var4.b(LocaleManager.class), null, null));
            case 10:
                ((Integer) obj2).getClass();
                az.a.b((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 11:
                String str = (String) obj;
                l lVar = (l) obj2;
                if (str.length() == 0) {
                    return lVar.toString();
                }
                return str + ", " + lVar;
            case 12:
                ((b6.i) obj).b = (t) obj2;
                return g00.b0.a;
            case 13:
                ((b6.i) obj).a = (b6.m) obj2;
                return g00.b0.a;
            case 14:
                ((b6.i) obj).e = ((j6.h) obj2).a;
                return g00.b0.a;
            case 15:
                b6.e eVar = (b6.e) obj2;
                ((b6.i) obj).c = eVar != null ? eVar.a : null;
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((b6.i) obj).d = (Float) obj2;
                return g00.b0.a;
            case 17:
                ((Integer) obj2).getClass();
                bs.a.d((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 18:
                ((Integer) obj2).getClass();
                bt.a.e((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 19:
                e60.a single3 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it10, "it");
                b0 b0Var5 = a0.a;
                return new xv.c((vv.d) single3.f(b0Var5.b(vv.d.class), null, null), (aw.a) single3.f(b0Var5.b(aw.a.class), null, null), (yv.c) single3.f(b0Var5.b(yv.c.class), null, null), (LocaleManager) single3.f(b0Var5.b(LocaleManager.class), null, null), (au.a) single3.f(b0Var5.b(au.a.class), null, null), (SharedPreferences) single3.f(b0Var5.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 20:
                a60.a it11 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it11, "it");
                return new vv.c();
            case 21:
                e60.a factory5 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it12, "it");
                return new vv.a();
            case 22:
                e60.a factory6 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(factory6, "$this$factory");
                m.e(it13, "it");
                return new vv.d();
            case 23:
                a60.a it14 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it14, "it");
                return new vv.b();
            case 24:
                e60.a factory7 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(factory7, "$this$factory");
                m.e(it15, "it");
                return new cw.a((x) factory7.f(a0.a.b(x.class), null, null));
            case 25:
                a60.a it16 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it16, "it");
                return new fw.b();
            case 26:
                v predictivePopTransitionSpec2 = (v) obj;
                ((Integer) obj2).getClass();
                m.e(predictivePopTransitionSpec2, "$this$predictivePopTransitionSpec");
                return w.m.d(s0.c((y) null, 3), s0.k(new e6.c(4)));
            case 27:
                e60.a single4 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it17, "it");
                return (DataStore) bw.f.d.a(bw.f.a[0], t1.i(single4));
            case 28:
                a60.a it18 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it18, "it");
                return new fw.c();
            default:
                e60.a single5 = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it19, "it");
                return new fw.a((cq.a) single5.f(a0.a.b(cq.a.class), null, null), 0);
        }
    }
}
