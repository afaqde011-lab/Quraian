package ou;

import android.content.Context;
import android.content.SharedPreferences;
import b00.c;
import b2.o;
import b2.r;
import bv.e3;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.quranify.insights.data.source.local.db.InsightsDatabase;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import d0.q1;
import ev.c0;
import g1.o3;
import g1.v5;
import g1.z6;
import h0.z1;
import ht.e;
import ht.k;
import i2.t;
import is.p0;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.q;
import l60.q0;
import lo.v;
import m3.r0;
import no.g;
import nu.d;
import q0.b2;
import q3.i;
import q3.u;
import ri.t1;
import rt.f;
import rt.h;
import u00.n;
import vp.x;
import x3.l;

public final class a implements n {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    public a(int i, int i2) {
        this.A = i2;
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
                return new e3((uu.a) viewModel.f(b0Var.b(uu.a.class), null, null), (c) viewModel.f(b0Var.b(c.class), null, null), (e) viewModel.f(b0Var.b(e.class), null, null), (ht.b) viewModel.f(b0Var.b(ht.b.class), null, null), (k) viewModel.f(b0Var.b(k.class), null, null), (rt.b) viewModel.f(b0Var.b(rt.b.class), null, null), (f) viewModel.f(b0Var.b(f.class), null, null), (h) viewModel.f(b0Var.b(h.class), null, null), (jt.a) viewModel.f(b0Var.b(jt.a.class), null, null), (aq.a) viewModel.f(b0Var.b(aq.a.class), null, null), (tq.k) viewModel.f(b0Var.b(tq.k.class), null, null), (tx.a) viewModel.f(b0Var.b(tx.a.class), null, null), (xw.k) viewModel.f(b0Var.b(xw.k.class), null, null), (zt.a) viewModel.f(b0Var.b(zt.a.class), null, null), (tt.b) viewModel.f(b0Var.b(tt.b.class), null, null), (au.a) viewModel.f(b0Var.b(au.a.class), null, null), (x) viewModel.f(b0Var.b(x.class), null, null), (gq.a) viewModel.f(b0Var.b(gq.a.class), null, null), (xx.c) viewModel.f(b0Var.b(xx.c.class), null, null), (oq.b) viewModel.f(b0Var.b(oq.b.class), null, null), (DeepLinkAnalytics) viewModel.f(b0Var.b(DeepLinkAnalytics.class), null, null), (xu.f) viewModel.f(b0Var.b(xu.f.class), null, null), (g) viewModel.f(b0Var.b(g.class), null, null));
            case 1:
                e60.a viewModel2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(viewModel2, "$this$viewModel");
                m.e(it2, "it");
                b0 b0Var2 = a0.a;
                return new c0((uu.a) viewModel2.f(b0Var2.b(uu.a.class), null, null), (xw.k) viewModel2.f(b0Var2.b(xw.k.class), null, null), (xu.f) viewModel2.f(b0Var2.b(xu.f.class), null, null), (zt.a) viewModel2.f(b0Var2.b(zt.a.class), null, null), (au.a) viewModel2.f(b0Var2.b(au.a.class), null, null));
            case 2:
                e60.a single = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it3, "it");
                return new nu.a((SharedPreferences) single.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 3:
                a60.a it4 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it4, "it");
                return new mv.b();
            case 4:
                e60.a single2 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it5, "it");
                b0 b0Var3 = a0.a;
                return new xu.f((nu.a) single2.f(b0Var3.b(nu.a.class), null, null), (e) single2.f(b0Var3.b(e.class), null, null), (x) single2.f(b0Var3.b(x.class), null, null), (zu.a) single2.f(b0Var3.b(zu.a.class), null, null));
            case 5:
                e60.a single3 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it6, "it");
                b60.b bVar = new b60.b("default_shared_preferences");
                b0 b0Var4 = a0.a;
                return new d((SharedPreferences) single3.f(b0Var4.b(SharedPreferences.class), null, bVar), (bk.m) single3.f(b0Var4.b(bk.m.class), null, null));
            case 6:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o3.a(y3.R(2131231375, g0Var, 0), (String) null, z1.m(o.A, 16), t.b(0.3f, dl.a.k), g0Var, 440, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 7:
                ((Integer) obj2).getClass();
                ox.g.b((j) obj, q.K(1));
                return g00.b0.a;
            case 8:
                ((Integer) obj2).getClass();
                ox.g.a((j) obj, q.K(1));
                return g00.b0.a;
            case 9:
                g0 g0Var3 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var4 = g0Var3;
                if (g0Var4.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String string = ((Context) g0Var4.k(b6.g.b)).getString(2131887378);
                    m.d(string, "getString(...)");
                    float f = 20;
                    float f2 = 0;
                    ze.d.e(string, new j6.o(w50.c.i0(f), w50.c.i0(f2), w50.c.i0(f), w50.c.i0(f2)), new n6.e(dn.d.a, new y3.o(kh.o.z(14)), (n6.b) null, new n6.c(), 108), 2, g0Var3, 3072, 0);
                } else {
                    g0Var4.V();
                }
                return g00.b0.a;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                m.e((v) obj2, "<unused var>");
                return num;
            case 11:
                g0 g0Var5 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    v5.a(z1.m(o.A, 14), dl.a.n, (float) 1.5d, 0L, 0, 0.0f, g0Var5, 390, 56);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 12:
                g0 g0Var7 = (j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (g0Var8.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    o3.a(y3.R(2131231094, g0Var7, 0), (String) null, z1.m(o.A, 14), dl.a.n, g0Var7, 440, 0);
                } else {
                    g0Var8.V();
                }
                return g00.b0.a;
            case 13:
                g0 g0Var9 = (j) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    float f3 = 16;
                    z6.b(z3.U(g0Var9, 2131886217), h0.c.G(o.A, f3, f3, 0.0f, 0.0f, 12), 0L, 0L, (u) null, (i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var9, 0, 0, 262140);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 14:
                g0 g0Var11 = (j) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                g0 g0Var12 = g0Var11;
                if (g0Var12.S(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    o3.a(y3.R(2131231074, g0Var11, 0), (String) null, z1.m(o.A, 16), t.b(0.5f, dl.a.k), g0Var11, 440, 0);
                } else {
                    g0Var12.V();
                }
                return g00.b0.a;
            case 15:
                ((Integer) obj2).getClass();
                f50.k.c((j) obj, q.K(1));
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                pz.n.b((j) obj, q.K(1));
                return g00.b0.a;
            case 17:
                b2 b2Var = (b2) obj2;
                return va.a.S(new Object[]{Float.valueOf(b2Var.a.h()), Boolean.valueOf(((q1) b2Var.f.getValue()) == q1.A)});
            case 18:
                g0 g0Var13 = (j) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                g0 g0Var14 = g0Var13;
                if (g0Var14.S(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    z6.b(z3.U(g0Var13, 2131886166), (r) null, t.b(0.5f, dl.a.k), 0L, (u) null, (i) null, 0L, (l) null, (x3.k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var13, 0, 0, 262138);
                } else {
                    g0Var14.V();
                }
                return g00.b0.a;
            case 19:
                e60.a factory = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it7, "it");
                t1.i(factory);
                return new pq.a();
            case 20:
                e60.a single4 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it8, "it");
                return new js.a((ks.b) single4.f(a0.a.b(ks.b.class), null, null));
            case 21:
                e60.a single5 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it9, "it");
                return new js.d((ks.i) single5.f(a0.a.b(ks.i.class), null, null));
            case 22:
                e60.a single6 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it10, "it");
                Object objB = ((q0) single6.f(a0.a.b(q0.class), null, null)).b(ms.b.class);
                m.d(objB, "create(...)");
                return (ms.b) objB;
            case 23:
                e60.a single7 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it11, "it");
                return ((InsightsDatabase) single7.f(a0.a.b(InsightsDatabase.class), null, null)).y();
            case 24:
                a60.a it12 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it12, "it");
                return new fs.j();
            case 25:
                e60.a factory2 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it13, "it");
                return new fs.k();
            case 26:
                a60.a it14 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it14, "it");
                return new fs.e();
            case 27:
                a60.a it15 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it15, "it");
                return new fs.h();
            case 28:
                a60.a it16 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it16, "it");
                return new fs.g();
            default:
                e60.a single8 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                m.e(single8, "$this$single");
                m.e(it17, "it");
                Context contextI = t1.i(single8);
                b0 b0Var5 = a0.a;
                return new p0(contextI, (ms.b) single8.f(b0Var5.b(ms.b.class), null, null), (fs.k) single8.f(b0Var5.b(fs.k.class), null, null), (fs.e) single8.f(b0Var5.b(fs.e.class), null, null));
        }
    }
}
