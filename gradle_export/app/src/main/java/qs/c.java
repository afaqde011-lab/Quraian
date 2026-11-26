package qs;

import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import bp.g;
import bt.j2;
import c7.i;
import com.google.android.gms.internal.measurement.y3;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.mchutov.quranify.insights.data.source.local.db.InsightsDatabase;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.o3;
import h0.z1;
import i2.t;
import is.g1;
import is.j;
import is.m1;
import is.y;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import ks.o;
import l1.g0;
import l1.q;
import m3.q0;
import r3.w;
import ri.t1;
import u00.n;
import vp.x;
import w.c2;
import w.j0;
import w.s0;
import w.v;
import wo.c0;
import x.q1;
import xw.k;

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
                a60.a it = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it, "it");
                return new zs.b();
            case 1:
                e60.a viewModel = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(viewModel, "$this$viewModel");
                m.e(it2, "it");
                b0 b0Var = a0.a;
                return new j2((j) viewModel.f(b0Var.b(j.class), null, null), (is.c) viewModel.f(b0Var.b(is.c.class), null, null), (is.f) viewModel.f(b0Var.b(is.f.class), null, null), (k) viewModel.f(b0Var.b(k.class), null, null), (m1) viewModel.f(b0Var.b(m1.class), null, null), (pr.c) viewModel.f(b0Var.b(pr.c.class), null, null), (xs.b) viewModel.f(b0Var.b(xs.b.class), null, null), (jr.b) viewModel.f(b0Var.b(jr.b.class), null, null), (y) viewModel.f(b0Var.b(y.class), null, null), (uu.a) viewModel.f(b0Var.b(uu.a.class), null, null), (aq.a) viewModel.f(b0Var.b(aq.a.class), null, null), (x) viewModel.f(b0Var.b(x.class), null, null), (c0) viewModel.f(b0Var.b(c0.class), null, null), (g) viewModel.f(b0Var.b(g.class), null, null), (hp.b) viewModel.f(b0Var.b(hp.b.class), null, null), (pm.c) viewModel.f(b0Var.b(pm.c.class), null, null), (AuthAnalytics) viewModel.f(b0Var.b(AuthAnalytics.class), null, null), (HomeAnalytics) viewModel.f(b0Var.b(HomeAnalytics.class), null, null), (vs.c) viewModel.f(b0Var.b(vs.c.class), null, null), (g1) viewModel.f(b0Var.b(g1.class), null, null), (xs.c) viewModel.f(b0Var.b(xs.c.class), null, null), (os.x) viewModel.f(b0Var.b(os.x.class), null, null));
            case 2:
                e60.a factory = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it3, "it");
                return new fs.b();
            case 3:
                e60.a factory2 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it4, "it");
                return new xs.c();
            case 4:
                e60.a single = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it5, "it");
                return ((InsightsDatabase) single.f(a0.a.b(InsightsDatabase.class), null, null)).u();
            case 5:
                e60.a single2 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it6, "it");
                return ((InsightsDatabase) single2.f(a0.a.b(InsightsDatabase.class), null, null)).v();
            case 6:
                e60.a single3 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it7, "it");
                return ((InsightsDatabase) single3.f(a0.a.b(InsightsDatabase.class), null, null)).w();
            case 7:
                e60.a single4 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it8, "it");
                return ((InsightsDatabase) single4.f(a0.a.b(InsightsDatabase.class), null, null)).x();
            case 8:
                e60.a factory3 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it9, "it");
                return new fs.n();
            case 9:
                v predictivePopTransitionSpec = (v) obj;
                ((Integer) obj2).getClass();
                m.e(predictivePopTransitionSpec, "$this$predictivePopTransitionSpec");
                return w.m.d(s0.c((x.y) null, 3), s0.k(new e6.c(4)));
            case 10:
                e60.a factory4 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it10, "it");
                return new fs.a();
            case 11:
                e60.a factory5 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it11, "it");
                return new fs.d();
            case 12:
                e60.a single5 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it12, "it");
                return new js.k((o) single5.f(a0.a.b(o.class), null, null));
            case 13:
                e60.a single6 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it13, "it");
                return new js.c((ks.g) single6.f(a0.a.b(ks.g.class), null, null));
            case 14:
                e60.a single7 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it14, "it");
                return new js.b((ks.d) single7.f(a0.a.b(ks.d.class), null, null));
            case 15:
                ((Integer) obj2).getClass();
                qt.a.c((l1.j) obj, q.K(1));
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                g0 g0Var = (l1.j) obj;
                g0Var.c0(-2089931744);
                h0.c0 c0VarI = h0.c.i(0, 14);
                g0Var.r(false);
                return c0VarI;
            case 17:
                y1.b bVar = (y1.b) obj;
                w wVar = (w) obj2;
                return va.a.i(new Object[]{m3.g0.a(wVar.a, m3.g0.a, bVar), m3.g0.a(new q0(wVar.b), m3.g0.p, bVar)});
            case 18:
                ((Integer) obj2).getClass();
                return new j0(s0.c(x.c.v(1.0f, 1600.0f, (Object) null, 4), 2), s0.f((q1) null, 0.7f, 5), (c2) null, 12);
            case 19:
                ((Integer) obj2).getClass();
                g0 g0Var2 = (l1.j) obj;
                g0Var2.c0(2030354978);
                h0.c0 c0VarI2 = h0.c.i(0, 14);
                g0Var2.r(false);
                return c0VarI2;
            case 20:
                g0 g0Var3 = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o3.a(y3.R(2131231375, g0Var3, 0), (String) null, z1.m(b2.o.A, 16), t.b(0.6f, dl.a.k), g0Var3, 440, 0);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 21:
                ((Integer) obj2).getClass();
                i.h((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 22:
                tm.e DampedDragAnimation = (tm.e) obj;
                m.e(DampedDragAnimation, "$this$DampedDragAnimation");
                return g00.b0.a;
            case 23:
                tm.e DampedDragAnimation2 = (tm.e) obj;
                m.e(DampedDragAnimation2, "$this$DampedDragAnimation");
                return g00.b0.a;
            case 24:
                tm.e DampedDragAnimation3 = (tm.e) obj;
                m.e(DampedDragAnimation3, "$this$DampedDragAnimation");
                return g00.b0.a;
            case 25:
                ((Integer) obj2).getClass();
                g0 g0Var5 = (l1.j) obj;
                g0Var5.c0(1706830548);
                h0.c0 c0VarI3 = h0.c.i(0, 14);
                g0Var5.r(false);
                return c0VarI3;
            case 26:
                ((Integer) obj2).getClass();
                y3.b((l1.j) obj, q.K(1));
                return g00.b0.a;
            case 27:
                e60.a single8 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(single8, "$this$single");
                m.e(it15, "it");
                Object objB = ((l60.q0) single8.f(a0.a.b(l60.q0.class), null, null)).b(qw.a.class);
                m.d(objB, "create(...)");
                return (qw.a) objB;
            case 28:
                e60.a single9 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                m.e(single9, "$this$single");
                m.e(it16, "it");
                return new pw.a((SharedPreferences) single9.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            default:
                e60.a factory6 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                m.e(factory6, "$this$factory");
                m.e(it17, "it");
                Context contextI = t1.i(factory6);
                b0 b0Var2 = a0.a;
                return new nw.b(contextI, (qw.a) factory6.f(b0Var2.b(qw.a.class), null, null), (LocaleManager) factory6.f(b0Var2.b(LocaleManager.class), null, null), (pw.a) factory6.f(b0Var2.b(pw.a.class), null, null), (c0) factory6.f(b0Var2.b(c0.class), null, null), (x) factory6.f(b0Var2.b(x.class), null, null));
        }
    }
}
