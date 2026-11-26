package bw;

import android.app.LocaleManager;
import androidx.datastore.core.DataStore;
import b2.o;
import b2.r;
import bp.g;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import f5.h;
import g1.o3;
import g1.z6;
import h0.z1;
import hw.j;
import i2.t;
import jp.e0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.q;
import l60.q0;
import m3.r0;
import q3.i;
import q3.u;
import ri.t1;
import tq.k;
import u00.n;
import vp.x;
import wo.c0;
import x3.l;

public final class c implements n {
    public final int A;

    public c(int i) {
        this.A = 3;
    }

    public c(int i, byte b) {
        this.A = i;
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
                return new j((xv.c) viewModel.f(b0Var.b(xv.c.class), null, null), (k) viewModel.f(b0Var.b(k.class), null, null), (au.a) viewModel.f(b0Var.b(au.a.class), null, null), (pm.c) viewModel.f(b0Var.b(pm.c.class), null, null));
            case 1:
                e60.a single = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it2, "it");
                Object objB = ((q0) single.f(a0.a.b(q0.class), null, null)).b(aw.a.class);
                m.d(objB, "create(...)");
                return (aw.a) objB;
            case 2:
                e60.a single2 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it3, "it");
                b60.b bVar = new b60.b("PLAYLIST_STORE_SCOPE_KEY");
                b0 b0Var2 = a0.a;
                return new yv.c((DataStore) single2.f(b0Var2.b(DataStore.class), null, bVar), (vv.b) single2.f(b0Var2.b(vv.b.class), null, null));
            case 3:
                ((Integer) obj2).getClass();
                bz.a.a((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 4:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o3.a(y3.R(2131231104, g0Var, 0), (String) null, z1.m(o.A, 14), dl.a.k, g0Var, 440, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 5:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o3.a(y3.R(2131231094, g0Var3, 0), (String) null, z1.m(o.A, 14), t.b, g0Var3, 3512, 0);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 6:
                g0 g0Var5 = (l1.j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    z6.b(z3.U(g0Var5, 2131887064), (r) null, 0L, 0L, (u) null, (i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 0, 0, 262142);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 7:
                g0 g0Var7 = (l1.j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o3.a(y3.R(2131231375, g0Var7, 0), (String) null, z1.m(o.A, 16), t.b(0.65f, dl.a.k), g0Var7, 440, 0);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 8:
                e60.a factory = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it4, "it");
                b0 b0Var3 = a0.a;
                return new bp.a((c0) factory.f(b0Var3.b(c0.class), null, null), (x) factory.f(b0Var3.b(x.class), null, null));
            case 9:
                e60.a factory2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it5, "it");
                b0 b0Var4 = a0.a;
                return new bp.c((c0) factory2.f(b0Var4.b(c0.class), null, null), (bp.a) factory2.f(b0Var4.b(bp.a.class), null, null), (nm.b) factory2.f(b0Var4.b(nm.b.class), null, null), (rw.a) factory2.f(b0Var4.b(rw.a.class), null, null));
            case 10:
                e60.a single3 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it6, "it");
                t1.i(single3);
                return new h();
            case 11:
                e60.a single4 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it7, "it");
                b0 b0Var5 = a0.a;
                return new bp.b((ap.a) single4.f(b0Var5.b(ap.a.class), null, null), (c0) single4.f(b0Var5.b(c0.class), null, null), (uo.f) single4.f(b0Var5.b(uo.f.class), null, null), (bp.a) single4.f(b0Var5.b(bp.a.class), null, null), (bp.c) single4.f(b0Var5.b(bp.c.class), null, null));
            case 12:
                a60.a it8 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it8, "it");
                return new hp.b();
            case 13:
                e60.a single5 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it9, "it");
                b0 b0Var6 = a0.a;
                return new AuthAnalytics((tk.c) single5.f(b0Var6.b(tk.c.class), null, null), (tk.d) single5.f(b0Var6.b(tk.d.class), null, null));
            case 14:
                e60.a viewModel2 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(viewModel2, "$this$viewModel");
                m.e(it10, "it");
                b0 b0Var7 = a0.a;
                return new rp.o((g) viewModel2.f(b0Var7.b(g.class), null, null), (pm.c) viewModel2.f(b0Var7.b(pm.c.class), null, null), (hp.b) viewModel2.f(b0Var7.b(hp.b.class), null, null), (AuthAnalytics) viewModel2.f(b0Var7.b(AuthAnalytics.class), null, null));
            case 15:
                e60.a scoped = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(scoped, "$this$scoped");
                m.e(it11, "it");
                return new kp.b();
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a viewModel3 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                m.e(viewModel3, "$this$viewModel");
                m.e(it12, "it");
                b0 b0Var8 = a0.a;
                return new e0((pm.c) viewModel3.f(b0Var8.b(pm.c.class), null, null), (wo.b0) viewModel3.f(b0Var8.b(wo.b0.class), null, null), (hp.b) viewModel3.f(b0Var8.b(hp.b.class), null, null), (AuthAnalytics) viewModel3.f(b0Var8.b(AuthAnalytics.class), null, null));
            case 17:
                e60.a single6 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it13, "it");
                return new xo.e();
            case 18:
                e60.a single7 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it14, "it");
                Object objB2 = ((q0) single7.f(a0.a.b(q0.class), null, null)).b(ap.a.class);
                m.d(objB2, "create(...)");
                return (ap.a) objB2;
            case 19:
                a60.a it15 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it15, "it");
                return new xo.a();
            case 20:
                a60.a it16 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it16, "it");
                return new zo.a();
            case 21:
                a60.a it17 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it17, "it");
                return new yo.a();
            case 22:
                e60.a factory3 = (e60.a) obj;
                a60.a it18 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it18, "it");
                return new uo.a((LocaleManager) factory3.f(a0.a.b(LocaleManager.class), null, null));
            case 23:
                e60.a factory4 = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it19, "it");
                return new uo.b((uo.a) factory4.f(a0.a.b(uo.a.class), null, null));
            case 24:
                a60.a it20 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it20, "it");
                return new uo.c();
            case 25:
                a60.a it21 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it21, "it");
                return new uo.g();
            case 26:
                a60.a it22 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it22, "it");
                return new uo.f();
            case 27:
                a60.a it23 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it23, "it");
                return new uo.e();
            case 28:
                a60.a it24 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it24, "it");
                return new uo.h();
            default:
                a60.a it25 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it25, "it");
                return new uo.d();
        }
    }
}
