package wy;

import a30.x;
import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import b2.r;
import ca.v;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.mchutov.quranify.main.presentation.analytics.DownloadAnalytics;
import com.mchutov.quranify.main.presentation.analytics.PaywallAnalytics;
import com.mchutov.quranify.player.presentation.analytics.AudioPlayerAnalytics;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import dq.u;
import du.t0;
import g00.b0;
import h0.z1;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.a0;
import l1.g0;
import l1.i1;
import l1.k2;
import l1.m1;
import l1.z0;
import l60.q0;
import org.koin.core.error.DefinitionParameterException;
import ri.t1;
import u.i0;
import wo.c0;
import x40.w;
import z2.w0;

public final class k implements u00.n {
    public final int A;

    public k(int i) {
        this.A = i;
    }

    public k(int i, int i2) {
        this.A = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) throws DefinitionParameterException {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                q.a((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 1:
                g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                boolean z = (iIntValue & 3) != 2;
                g0 g0Var2 = g0Var;
                x xVar = g0Var2.a;
                if (g0Var2.S(iIntValue & 1, z)) {
                    r rVarM = h0.c.M(z1.c, h0.c.f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    r rVarC = b2.a.c(rVarM, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(w0VarD, g0Var, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM, g0Var, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var, fVar3);
                    b3.e eVar = b3.h.h;
                    l1.q.E(g0Var, eVar);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC, g0Var, fVar4);
                    b2.o oVar = b2.o.A;
                    float f = 640;
                    float f2 = 24;
                    r rVarG = z.n.g(z.n.f(f2.h.c(z1.g(z1.q(oVar, 560), 0.0f, f, 1), p0.f.a(f2)), dl.a.L, i2.b0.b), 1, dl.a.Y, p0.f.a(f2));
                    b2.i iVar = b2.b.A;
                    w0 w0VarD2 = h0.o.d(iVar, false);
                    int iHashCode2 = Long.hashCode(g0Var2.T);
                    m1 m1VarM2 = g0Var2.m();
                    r rVarC2 = b2.a.c(rVarG, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD2, g0Var, fVar);
                    l1.q.I(m1VarM2, g0Var, fVar2);
                    x5.u(iHashCode2, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC2, g0Var, fVar4);
                    r rVarG2 = z1.g(z1.d(oVar, 1.0f), 0.0f, f, 1);
                    w0 w0VarD3 = h0.o.d(iVar, false);
                    int iHashCode3 = Long.hashCode(g0Var2.T);
                    m1 m1VarM3 = g0Var2.m();
                    r rVarC3 = b2.a.c(rVarG2, g0Var);
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD3, g0Var, fVar);
                    l1.q.I(m1VarM3, g0Var, fVar2);
                    x5.u(iHashCode3, g0Var, fVar3, g0Var, eVar);
                    l1.q.I(rVarC3, g0Var, fVar4);
                    q.a(g0Var, 0);
                    g0Var2.r(true);
                    g0Var2.r(true);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return b0.a;
            case 2:
                ((Integer) obj2).getClass();
                v.b((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 3:
                a60.a isOnboardingFinished = (a60.a) obj2;
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e(isOnboardingFinished, "isOnboardingFinished");
                kotlin.jvm.internal.b0 b0Var = a0.a;
                Object objB = isOnboardingFinished.b(b0Var.b(Boolean.class));
                if (objB != null) {
                    return new cu.a(((Boolean) objB).booleanValue());
                }
                throw new DefinitionParameterException("No value found for type '" + g60.a.a(b0Var.b(Boolean.class)) + '\'');
            case 4:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single, "$this$single");
                kotlin.jvm.internal.m.e(it, "it");
                return new au.a(t1.i(single));
            case 5:
                e60.a factory = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory, "$this$factory");
                kotlin.jvm.internal.m.e(it2, "it");
                return new tt.b();
            case 6:
                e60.a single2 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single2, "$this$single");
                kotlin.jvm.internal.m.e(it3, "it");
                return (DataStore) xt.d.c.a(xt.d.a[0], t1.i(single2));
            case 7:
                e60.a factory2 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory2, "$this$factory");
                kotlin.jvm.internal.m.e(it4, "it");
                return new tt.a();
            case 8:
                e60.a factory3 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory3, "$this$factory");
                kotlin.jvm.internal.m.e(it5, "it");
                return new fu.a(t1.i(factory3));
            case 9:
                e60.a factory4 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory4, "$this$factory");
                kotlin.jvm.internal.m.e(it6, "it");
                return new DownloadAnalytics((tk.c) factory4.f(a0.a.b(tk.c.class), null, null));
            case 10:
                e60.a factory5 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory5, "$this$factory");
                kotlin.jvm.internal.m.e(it7, "it");
                return new PaywallAnalytics((tk.c) factory5.f(a0.a.b(tk.c.class), null, null));
            case 11:
                e60.a single3 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single3, "$this$single");
                kotlin.jvm.internal.m.e(it8, "it");
                Context contextI = t1.i(single3);
                b60.b bVar = new b60.b("LOCAL_SURAH_STORE_SCOPE_KEY");
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                return new ut.p(contextI, (DataStore) single3.f(b0Var2.b(DataStore.class), null, bVar), (tt.a) single3.f(b0Var2.b(tt.a.class), null, null), (vp.x) single3.f(b0Var2.b(vp.x.class), null, null), (tx.a) single3.f(b0Var2.b(tx.a.class), null, null), (DownloadAnalytics) single3.f(b0Var2.b(DownloadAnalytics.class), null, null));
            case 12:
                e60.a single4 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single4, "$this$single");
                kotlin.jvm.internal.m.e(it9, "it");
                x40.v vVar = new x40.v();
                v.o(vVar, (im.a) single4.f(a0.a.b(im.a.class), null, null));
                TimeUnit unit = TimeUnit.SECONDS;
                kotlin.jvm.internal.m.e(unit, "unit");
                vVar.r = y40.b.b(30L, unit);
                vVar.s = y40.b.b(30L, unit);
                return new w(vVar);
            case 13:
                e60.a viewModel = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel, "$this$viewModel");
                kotlin.jvm.internal.m.e(it10, "it");
                kotlin.jvm.internal.b0 b0Var3 = a0.a;
                return new t0((uu.a) viewModel.f(b0Var3.b(uu.a.class), null, null), (b00.c) viewModel.f(b0Var3.b(b00.c.class), null, null), (gu.a) viewModel.f(b0Var3.b(gu.a.class), null, null), (tx.a) viewModel.f(b0Var3.b(tx.a.class), null, null), (a00.a) viewModel.f(b0Var3.b(a00.a.class), null, null), (cm.b) viewModel.f(b0Var3.b(cm.b.class), null, null), (ah.e) viewModel.f(b0Var3.b(ah.e.class), null, null), (pm.c) viewModel.f(b0Var3.b(pm.c.class), null, null), (LocaleManager) viewModel.f(b0Var3.b(LocaleManager.class), null, null), (tk.d) viewModel.f(b0Var3.b(tk.d.class), null, null), (AudioPlayerAnalytics) viewModel.f(b0Var3.b(AudioPlayerAnalytics.class), null, null), (au.a) viewModel.f(b0Var3.b(au.a.class), null, null), (sl.a) viewModel.f(b0Var3.b(sl.a.class), null, null), (aq.a) viewModel.f(b0Var3.b(aq.a.class), null, null), (vp.x) viewModel.f(b0Var3.b(vp.x.class), null, null), (wo.b0) viewModel.f(b0Var3.b(wo.b0.class), null, null), (c0) viewModel.f(b0Var3.b(c0.class), null, null), (hp.b) viewModel.f(b0Var3.b(hp.b.class), null, null), (AuthAnalytics) viewModel.f(b0Var3.b(AuthAnalytics.class), null, null), (PaywallAnalytics) viewModel.f(b0Var3.b(PaywallAnalytics.class), null, null), (xw.e) viewModel.f(b0Var3.b(xw.e.class), null, null), (os.x) viewModel.f(b0Var3.b(os.x.class), null, null));
            case 14:
                ((Integer) obj2).getClass();
                xy.a.b((l1.j) obj, l1.q.K(1));
                return b0.a;
            case 15:
                e60.a single5 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single5, "$this$single");
                kotlin.jvm.internal.m.e(it11, "it");
                Object objB2 = ((q0) single5.f(a0.a.b(q0.class), null, null)).b(wz.a.class);
                kotlin.jvm.internal.m.d(objB2, "create(...)");
                return (wz.a) objB2;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                e60.a single6 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single6, "$this$single");
                kotlin.jvm.internal.m.e(it12, "it");
                return new vz.c(t1.i(single6), (w) single6.f(a0.a.b(w.class), null, new b60.b("DEFAULT_OK_HTTP_CLIENT")));
            case 17:
                e60.a factory6 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory6, "$this$factory");
                kotlin.jvm.internal.m.e(it13, "it");
                return new sz.a();
            case 18:
                e60.a single7 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single7, "$this$single");
                kotlin.jvm.internal.m.e(it14, "it");
                b60.b bVar2 = new b60.b("default_shared_preferences");
                kotlin.jvm.internal.b0 b0Var4 = a0.a;
                return new uz.f((SharedPreferences) single7.f(b0Var4.b(SharedPreferences.class), null, bVar2), (bk.m) single7.f(b0Var4.b(bk.m.class), null, null), (vz.c) single7.f(b0Var4.b(vz.c.class), null, null), (wz.a) single7.f(b0Var4.b(wz.a.class), null, null), (sz.a) single7.f(b0Var4.b(sz.a.class), null, null), (au.a) single7.f(b0Var4.b(au.a.class), null, null), (LocaleManager) single7.f(b0Var4.b(LocaleManager.class), null, null));
            case 19:
                e60.a single8 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single8, "$this$single");
                kotlin.jvm.internal.m.e(it15, "it");
                Context contextI2 = t1.i(single8);
                kotlin.jvm.internal.b0 b0Var5 = a0.a;
                return new b00.c(contextI2, (uu.a) single8.f(b0Var5.b(uu.a.class), null, null), (a00.a) single8.f(b0Var5.b(a00.a.class), null, null));
            case 20:
                e60.a viewModel2 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel2, "$this$viewModel");
                kotlin.jvm.internal.m.e(it16, "it");
                kotlin.jvm.internal.b0 b0Var6 = a0.a;
                return new c00.x((pm.c) viewModel2.f(b0Var6.b(pm.c.class), null, null), (a00.a) viewModel2.f(b0Var6.b(a00.a.class), null, null), (b00.c) viewModel2.f(b0Var6.b(b00.c.class), null, null), (vp.x) viewModel2.f(b0Var6.b(vp.x.class), null, null), (aq.a) viewModel2.f(b0Var6.b(aq.a.class), null, null), (AudioPlayerAnalytics) viewModel2.f(b0Var6.b(AudioPlayerAnalytics.class), null, null), (vz.c) viewModel2.f(b0Var6.b(vz.c.class), null, null));
            case 21:
                y1.b bVar3 = (y1.b) obj;
                z1.n nVar = (z0) obj2;
                if (!(nVar instanceof z1.n)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                z1.n nVar2 = nVar;
                Object objInvoke = ((u00.n) r3.w.d.B).invoke(bVar3, nVar2.getValue());
                if (objInvoke == null) {
                    return null;
                }
                k2 k2VarD = nVar2.d();
                kotlin.jvm.internal.m.c(k2VarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return new i1(objInvoke, k2VarD);
            case 22:
                y1.d dVar = (y1.d) obj2;
                Map map = dVar.A;
                i0 i0Var = dVar.B;
                Object[] objArr = i0Var.b;
                Object[] objArr2 = i0Var.c;
                long[] jArr = i0Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj3 = objArr[i4];
                                    Map mapB = ((y1.f) objArr2[i4]).b();
                                    if (mapB.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, mapB);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 == 8) {
                                if (i != length) {
                                    i++;
                                }
                            }
                        } else if (i != length) {
                            i++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 23:
                return obj2;
            case 24:
                e60.a viewModel3 = (e60.a) obj;
                a60.a it17 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(viewModel3, "$this$viewModel");
                kotlin.jvm.internal.m.e(it17, "it");
                kotlin.jvm.internal.b0 b0Var7 = a0.a;
                return new u((aq.a) viewModel3.f(b0Var7.b(aq.a.class), null, null), (tq.k) viewModel3.f(b0Var7.b(tq.k.class), null, null), (xw.k) viewModel3.f(b0Var7.b(xw.k.class), null, null), (xw.e) viewModel3.f(b0Var7.b(xw.e.class), null, null), (uu.a) viewModel3.f(b0Var7.b(uu.a.class), null, null), (au.a) viewModel3.f(b0Var7.b(au.a.class), null, null));
            case 25:
                a60.a it18 = (a60.a) obj2;
                kotlin.jvm.internal.m.e((e60.a) obj, "$this$single");
                kotlin.jvm.internal.m.e(it18, "it");
                return new cq.b();
            case 26:
                e60.a single9 = (e60.a) obj;
                a60.a it19 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single9, "$this$single");
                kotlin.jvm.internal.m.e(it19, "it");
                kotlin.jvm.internal.b0 b0Var8 = a0.a;
                return new cq.a((cq.b) single9.f(b0Var8.b(cq.b.class), null, null), (rr.b) single9.f(b0Var8.b(rr.b.class), null, null), (gx.e) single9.f(b0Var8.b(gx.e.class), null, null), (fw.c) single9.f(b0Var8.b(fw.c.class), null, null), (zs.b) single9.f(b0Var8.b(zs.b.class), null, null), (sy.c) single9.f(b0Var8.b(sy.c.class), null, null), (ey.b) single9.f(b0Var8.b(ey.b.class), null, null));
            case 27:
                e60.a single10 = (e60.a) obj;
                a60.a it20 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(single10, "$this$single");
                kotlin.jvm.internal.m.e(it20, "it");
                return (DataStore) yq.b.c.a(yq.b.a[0], t1.i(single10));
            case 28:
                e60.a factory7 = (e60.a) obj;
                a60.a it21 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory7, "$this$factory");
                kotlin.jvm.internal.m.e(it21, "it");
                return new rq.b();
            default:
                e60.a factory8 = (e60.a) obj;
                a60.a it22 = (a60.a) obj2;
                kotlin.jvm.internal.m.e(factory8, "$this$factory");
                kotlin.jvm.internal.m.e(it22, "it");
                return new rq.a();
        }
    }
}
