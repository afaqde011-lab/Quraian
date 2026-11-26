package dm;

import a10.h0;
import a40.c0;
import a40.m0;
import a40.y0;
import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.os.StatFs;
import bi.g;
import com.google.android.gms.internal.measurement.x5;
import com.mchutov.core.deeplink.presentation.analytics.DeepLinkAnalytics;
import com.mchutov.core.security.Obfuscated;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import dq.l;
import f40.t;
import g1.v5;
import h0.z1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import k50.z;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.m1;
import l60.j0;
import l60.q0;
import nb.s;
import ob.h;
import p0.f;
import r00.i;
import ri.t1;
import rj.e;
import sg.x;
import th.o;
import u00.n;
import vn.u;
import wj.p;
import x40.q;
import x40.r;
import x40.v;
import x40.w;
import z2.w0;

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
        wi.b bVar;
        switch (this.A) {
            case 0:
                e60.a factory = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it, "it");
                return new jm.a((im.a) factory.f(a0.a.b(im.a.class), null, null));
            case 1:
                e60.a single = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it2, "it");
                t1.i(single);
                v vVar = new v();
                TimeUnit unit = TimeUnit.MILLISECONDS;
                m.e(unit, "unit");
                vVar.r = y40.b.b(60000L, unit);
                vVar.s = y40.b.b(60000L, unit);
                b0 b0Var = a0.a;
                ca.v.o(vVar, (im.a) single.f(b0Var.b(im.a.class), null, null));
                c50.b bVar2 = new c50.b(1);
                ArrayList arrayList = vVar.c;
                arrayList.add(bVar2);
                r rVar = (r) single.c(b0Var.b(r.class), new b60.b("AUTH_TOKEN_INTERCEPTOR"));
                x40.c cVar = (x40.c) single.c(b0Var.b(x40.c.class), null);
                if (rVar != null) {
                    arrayList.add(rVar);
                }
                if (cVar != null) {
                    vVar.g = cVar;
                }
                return new w(vVar);
            case 2:
                a60.a it3 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it3, "it");
                rj.b bVarA = ((e) g.c().b(e.class)).a();
                m.d(bVarA, "getInstance(...)");
                return bVarA;
            case 3:
                e60.a single2 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it4, "it");
                return new sl.a((rj.b) single2.f(a0.a.b(rj.b.class), null, null));
            case 4:
                e60.a single3 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it5, "it");
                final Context contextI = t1.i(single3);
                o oVar = new o(contextI);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new s());
                oVar.F = new lb.b(h0.P(arrayList2), h0.P(arrayList3), h0.P(arrayList4), h0.P(arrayList5), h0.P(arrayList6));
                final int i = 0;
                oVar.D = rd.a.J(new u00.a() {
                    @Override
                    public final Object invoke() {
                        long jA;
                        int i2 = i;
                        Context context = contextI;
                        switch (i2) {
                            case 0:
                                ub.a aVar = new ub.a(context);
                                aVar.b = 0.3d;
                                return aVar.a();
                            case 1:
                                k50.v vVar2 = k50.o.a;
                                h40.e eVar = m0.a;
                                h40.d dVar = h40.d.C;
                                File cacheDir = context.getCacheDir();
                                m.d(cacheDir, "getCacheDir(...)");
                                File fileC0 = i.c0(cacheDir, "image_cache");
                                String str = z.B;
                                z zVarJ = gj.e.j(fileC0);
                                if (0.1d > 0.0d) {
                                    jA = 10485760;
                                    try {
                                        File file = zVarJ.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jA = ab.a0.A((long) (0.1d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    jA = 0;
                                }
                                return new h(jA, dVar, vVar2, zVarJ);
                            case 2:
                                File fileR = h0.r(context, "firebaseSessions/sessionConfigsDataStore.data");
                                p.c(fileR);
                                return fileR;
                            default:
                                File fileR2 = h0.r(context, "firebaseSessions/sessionDataStore.data");
                                p.c(fileR2);
                                return fileR2;
                        }
                    }
                });
                final int i2 = 1;
                oVar.E = rd.a.J(new u00.a() {
                    @Override
                    public final Object invoke() {
                        long jA;
                        int i3 = i2;
                        Context context = contextI;
                        switch (i3) {
                            case 0:
                                ub.a aVar = new ub.a(context);
                                aVar.b = 0.3d;
                                return aVar.a();
                            case 1:
                                k50.v vVar2 = k50.o.a;
                                h40.e eVar = m0.a;
                                h40.d dVar = h40.d.C;
                                File cacheDir = context.getCacheDir();
                                m.d(cacheDir, "getCacheDir(...)");
                                File fileC0 = i.c0(cacheDir, "image_cache");
                                String str = z.B;
                                z zVarJ = gj.e.j(fileC0);
                                if (0.1d > 0.0d) {
                                    jA = 10485760;
                                    try {
                                        File file = zVarJ.toFile();
                                        file.mkdir();
                                        StatFs statFs = new StatFs(file.getAbsolutePath());
                                        jA = ab.a0.A((long) (0.1d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                        break;
                                    } catch (Exception unused) {
                                    }
                                } else {
                                    jA = 0;
                                }
                                return new h(jA, dVar, vVar2, zVarJ);
                            case 2:
                                File fileR = h0.r(context, "firebaseSessions/sessionConfigsDataStore.data");
                                p.c(fileR);
                                return fileR;
                            default:
                                File fileR2 = h0.r(context, "firebaseSessions/sessionDataStore.data");
                                p.c(fileR2);
                                return fileR2;
                        }
                    }
                });
                bc.e eVar = (bc.e) oVar.G;
                oVar.G = new bc.e(eVar.a, eVar.b, false, eVar.d, eVar.e);
                return oVar.p();
            case 5:
                e60.a single4 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it6, "it");
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                b60.b bVar3 = new b60.b("DEFAULT_OK_HTTP_CLIENT");
                b0 b0Var2 = a0.a;
                w wVar = (w) single4.f(b0Var2.b(w.class), null, bVar3);
                String str = ((jm.a) single4.f(b0Var2.b(jm.a.class), null, null)).a.a.a;
                Objects.requireNonNull(str, "baseUrl == null");
                x xVar = new x(1);
                xVar.e((q) null, str);
                q qVarB = xVar.b();
                ArrayList arrayList9 = qVarB.f;
                if (!"".equals(arrayList9.get(arrayList9.size() - 1))) {
                    throw new IllegalArgumentException("baseUrl must end in /: " + qVarB);
                }
                arrayList7.add(new m60.a(new bk.m()));
                Executor executor = j0.a;
                l60.a aVar = j0.c;
                ArrayList arrayList10 = new ArrayList(arrayList8);
                List listA = aVar.a(executor);
                arrayList10.addAll(listA);
                List listB = aVar.b();
                ArrayList arrayList11 = new ArrayList(arrayList7.size() + 1 + listB.size());
                arrayList11.add(new l60.b(0));
                arrayList11.addAll(arrayList7);
                arrayList11.addAll(listB);
                List listUnmodifiableList = Collections.unmodifiableList(arrayList11);
                List listUnmodifiableList2 = Collections.unmodifiableList(arrayList10);
                listA.size();
                return new q0(wVar, qVarB, listUnmodifiableList, listUnmodifiableList2);
            case 6:
                e60.a single5 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it7, "it");
                Context contextI2 = t1.i(single5);
                synchronized (yg.a.class) {
                    try {
                        if (yg.a.a == null) {
                            Context applicationContext = contextI2.getApplicationContext();
                            if (applicationContext != null) {
                                contextI2 = applicationContext;
                            }
                            yg.a.a = new wi.b(contextI2);
                        }
                        bVar = yg.a.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (yg.b) ((dh.m) bVar.B).e();
            case 7:
                e60.a factory2 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it8, "it");
                Resources resources = t1.i(factory2).getResources();
                m.d(resources, "getResources(...)");
                return new pm.c(resources);
            case 8:
                e60.a factory3 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it9, "it");
                return new xm.a(t1.i(factory3));
            case 9:
                e60.a factory4 = (e60.a) obj;
                a60.a it10 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it10, "it");
                Object systemService = t1.i(factory4).getSystemService((Class<Object>) LocaleManager.class);
                m.d(systemService, "getSystemService(...)");
                return (LocaleManager) systemService;
            case 10:
                e60.a single6 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it11, "it");
                rc.g gVar = new rc.g(t1.i(single6), Obfuscated.INSTANCE.decode("7793497cd466ab5a4bce25e4d50d56fb666f9a40ecf05eea70dc600ea57a9d41"));
                a1.i iVar = new a1.i(17);
                f40.c cVarC = c0.c(c0.e());
                ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
                m.d(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
                y0 y0Var = new y0(executorServiceNewCachedThreadPool);
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                m.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
                y0 y0Var2 = new y0(executorServiceNewSingleThreadExecutor);
                ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
                m.d(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor(...)");
                rc.c cVar2 = new rc.c(gVar, iVar, cVarC, y0Var, y0Var2, new y0(executorServiceNewSingleThreadExecutor2));
                Runtime.getRuntime().addShutdownHook(new h7.g(cVar2, 3));
                Set<rc.e> set = gVar.t;
                if (!(set instanceof Collection) || !set.isEmpty()) {
                    for (rc.e eVar2 : set) {
                        rc.e.A.getClass();
                        if (rc.e.B.contains(eVar2)) {
                            Context context = gVar.b;
                            m.c(context, "null cannot be cast to non-null type android.app.Application");
                            Application application = (Application) context;
                            bd.c cVar3 = cVar2.p;
                            if (cVar3 == null) {
                                m.k("activityLifecycleCallbacks");
                                throw null;
                            }
                            application.registerActivityLifecycleCallbacks(cVar3);
                        }
                    }
                }
                return cVar2;
            case 11:
                e60.a single7 = (e60.a) obj;
                a60.a it12 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it12, "it");
                return new ul.a((SharedPreferences) single7.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
            case 12:
                e60.a factory5 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it13, "it");
                return new DeepLinkAnalytics((tk.c) factory5.f(a0.a.b(tk.c.class), null, null));
            case 13:
                e60.a single8 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                m.e(single8, "$this$single");
                m.e(it14, "it");
                b0 b0Var3 = a0.a;
                return new am.c((ul.a) single8.f(b0Var3.b(ul.a.class), null, null), (yl.a) single8.f(b0Var3.b(yl.a.class), null, null), single8.b(b0Var3.b(bm.a.class)), (nq.b) single8.f(b0Var3.b(nq.b.class), null, null), (DeepLinkAnalytics) single8.f(b0Var3.b(DeepLinkAnalytics.class), null, null));
            case 14:
                ((Integer) obj2).getClass();
                l.a((j) obj, l1.q.K(1));
                return g00.b0.a;
            case 15:
                ((Integer) obj2).getClass();
                ds.a.a((j) obj, l1.q.K(1));
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((Integer) obj2).getClass();
                kh.o.b((j) obj, l1.q.K(1));
                return g00.b0.a;
            case 17:
                ((Integer) obj2).getClass();
                dz.m.b((j) obj, l1.q.K(1));
                return g00.b0.a;
            case 18:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 19:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 28;
                    b2.r rVarC = h0.c.C(z.n.f(b2.o.A, dl.a.M, f.a(f)), f);
                    w0 w0VarD = h0.o.d(b2.b.E, false);
                    int iHashCode = Long.hashCode(g0Var2.T);
                    m1 m1VarM = g0Var2.m();
                    b2.r rVarC2 = b2.a.c(rVarC, g0Var);
                    b3.i.c.getClass();
                    b3.g gVar2 = b3.h.b;
                    g0Var2.g0();
                    if (g0Var2.S) {
                        g0Var2.l(gVar2);
                    } else {
                        g0Var2.q0();
                    }
                    l1.q.I(w0VarD, g0Var, b3.h.f);
                    l1.q.I(m1VarM, g0Var, b3.h.e);
                    l1.q.I(Integer.valueOf(iHashCode), g0Var, b3.h.g);
                    l1.q.E(g0Var, b3.h.h);
                    l1.q.I(rVarC2, g0Var, b3.h.d);
                    v5.a((b2.r) null, dl.a.i, 3, 0L, 0, 0.0f, g0Var, 384, 57);
                    g0Var2.r(true);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 20:
                ((Integer) obj2).getClass();
                eu.a.j((j) obj, l1.q.K(1));
                return g00.b0.a;
            case 21:
                ((Integer) obj2).getClass();
                g0 g0Var3 = (j) obj;
                g0Var3.c0(896543148);
                h0.c0 c0VarI = h0.c.i(0, 14);
                g0Var3.r(false);
                return c0VarI;
            case 22:
                g0 g0Var4 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = (iIntValue2 & 3) != 2;
                g0 g0Var5 = g0Var4;
                a30.x xVar2 = g0Var5.a;
                if (g0Var5.S(iIntValue2 & 1, z)) {
                    b2.o oVar2 = b2.o.A;
                    b2.r rVarM = h0.c.M(z1.c, h0.c.f);
                    w0 w0VarD2 = h0.o.d(b2.b.E, false);
                    int iHashCode2 = Long.hashCode(g0Var5.T);
                    m1 m1VarM2 = g0Var5.m();
                    b2.r rVarC3 = b2.a.c(rVarM, g0Var4);
                    b3.i.c.getClass();
                    b3.g gVar3 = b3.h.b;
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    b3.f fVar = b3.h.f;
                    l1.q.I(w0VarD2, g0Var4, fVar);
                    b3.f fVar2 = b3.h.e;
                    l1.q.I(m1VarM2, g0Var4, fVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    b3.f fVar3 = b3.h.g;
                    l1.q.I(numValueOf, g0Var4, fVar3);
                    b3.e eVar3 = b3.h.h;
                    l1.q.E(g0Var4, eVar3);
                    b3.f fVar4 = b3.h.d;
                    l1.q.I(rVarC3, g0Var4, fVar4);
                    float f2 = 640;
                    float f3 = 24;
                    b2.r rVarG = z.n.g(z.n.f(f2.h.c(z1.g(z1.q(oVar2, 560), 0.0f, f2, 1), f.a(f3)), dl.a.L, i2.b0.b), 1, dl.a.Y, f.a(f3));
                    b2.i iVar2 = b2.b.A;
                    w0 w0VarD3 = h0.o.d(iVar2, false);
                    int iHashCode3 = Long.hashCode(g0Var5.T);
                    m1 m1VarM3 = g0Var5.m();
                    b2.r rVarC4 = b2.a.c(rVarG, g0Var4);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    l1.q.I(w0VarD3, g0Var4, fVar);
                    l1.q.I(m1VarM3, g0Var4, fVar2);
                    x5.u(iHashCode3, g0Var4, fVar3, g0Var4, eVar3);
                    l1.q.I(rVarC4, g0Var4, fVar4);
                    b2.r rVarG2 = z1.g(z1.d(oVar2, 1.0f), 0.0f, f2, 1);
                    w0 w0VarD4 = h0.o.d(iVar2, false);
                    int iHashCode4 = Long.hashCode(g0Var5.T);
                    m1 m1VarM4 = g0Var5.m();
                    b2.r rVarC5 = b2.a.c(rVarG2, g0Var4);
                    g0Var5.g0();
                    if (g0Var5.S) {
                        g0Var5.l(gVar3);
                    } else {
                        g0Var5.q0();
                    }
                    l1.q.I(w0VarD4, g0Var4, fVar);
                    l1.q.I(m1VarM4, g0Var4, fVar2);
                    x5.u(iHashCode4, g0Var4, fVar3, g0Var4, eVar3);
                    l1.q.I(rVarC5, g0Var4, fVar4);
                    ez.a.b(g0Var4, 0);
                    g0Var5.r(true);
                    g0Var5.r(true);
                    g0Var5.r(true);
                } else {
                    g0Var5.V();
                }
                return g00.b0.a;
            case 23:
                ((Integer) obj2).getClass();
                ez.a.b((j) obj, l1.q.K(1));
                return g00.b0.a;
            case 24:
                k00.g gVar4 = (k00.g) obj2;
                if (!(gVar4 instanceof t)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue3 = num != null ? num.intValue() : 1;
                return iIntValue3 == 0 ? gVar4 : Integer.valueOf(iIntValue3 + 1);
            case 25:
                t tVar = (t) obj;
                k00.g gVar5 = (k00.g) obj2;
                if (tVar != null) {
                    return tVar;
                }
                if (gVar5 instanceof t) {
                    return (t) gVar5;
                }
                return null;
            case 26:
                f40.w wVar2 = (f40.w) obj;
                k00.g gVar6 = (k00.g) obj2;
                if (gVar6 instanceof t) {
                    t tVar2 = (t) gVar6;
                    Object objC = tVar2.c(wVar2.a);
                    Object[] objArr = wVar2.b;
                    int i3 = wVar2.d;
                    objArr[i3] = objC;
                    t[] tVarArr = wVar2.c;
                    wVar2.d = i3 + 1;
                    tVarArr[i3] = tVar2;
                }
                return wVar2;
            case 27:
                e60.a single9 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(single9, "$this$single");
                m.e(it15, "it");
                b60.b bVar4 = new b60.b("default_shared_preferences");
                b0 b0Var4 = a0.a;
                return new u((SharedPreferences) single9.f(b0Var4.b(SharedPreferences.class), null, bVar4), (LocaleManager) single9.f(b0Var4.b(LocaleManager.class), null, null));
            case 28:
                a60.a it16 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it16, "it");
                return new tn.h();
            default:
                a60.a it17 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it17, "it");
                return new tn.b();
        }
    }
}
