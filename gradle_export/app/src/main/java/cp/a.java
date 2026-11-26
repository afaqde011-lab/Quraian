package cp;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.util.Log;
import b6.l;
import bk.u;
import bk.v;
import com.google.gson.reflect.TypeToken;
import com.mchutov.core.compose.widgets.lce.ResourceText;
import com.mchutov.core.compose.widgets.lce.ResourceTextAdapter;
import com.mchutov.quranify.auth.data.source.local.AuthLocalDataSource;
import com.mchutov.quranify.auth.presentation.analytics.AuthAnalytics;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import ct.i;
import d6.f0;
import d6.f2;
import d6.h0;
import d6.w;
import ek.y;
import g00.b0;
import j6.s;
import java.security.KeyStore;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l1.q;
import la.d;
import ri.t1;
import u00.n;
import uo.c;
import uo.e;
import uo.f;
import uo.g;
import uo.h;
import vp.x;
import wo.c0;

public final class a implements n {
    public final int A;

    public a(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        d dVarS;
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it, "it");
                return new AuthLocalDataSource((SharedPreferences) single.f(a0.a.b(SharedPreferences.class), null, new b60.b("s_shared_preferences")));
            case 1:
                e60.a single2 = (e60.a) obj;
                a60.a it2 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it2, "it");
                kotlin.jvm.internal.b0 b0Var2 = a0.a;
                return new c0((AuthLocalDataSource) single2.f(b0Var2.b(AuthLocalDataSource.class), null, null), (AuthAnalytics) single2.f(b0Var2.b(AuthAnalytics.class), null, null));
            case 2:
                e60.a single3 = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it3, "it");
                Context contextI = t1.i(single3);
                kotlin.jvm.internal.b0 b0Var3 = a0.a;
                return new wo.b0(contextI, (ap.a) single3.f(b0Var3.b(ap.a.class), null, null), (c0) single3.f(b0Var3.b(c0.class), null, null), (uo.b) single3.f(b0Var3.b(uo.b.class), null, null), (c) single3.f(b0Var3.b(c.class), null, null), (g) single3.f(b0Var3.b(g.class), null, null), (f) single3.f(b0Var3.b(f.class), null, null), (e) single3.f(b0Var3.b(e.class), null, null), (h) single3.f(b0Var3.b(h.class), null, null), (uo.d) single3.f(b0Var3.b(uo.d.class), null, null), (x) single3.f(b0Var3.b(x.class), null, null), (bp.a) single3.f(b0Var3.b(bp.a.class), null, null), (rw.a) single3.f(b0Var3.b(rw.a.class), null, null));
            case 3:
                e60.a factory = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it4, "it");
                return new bp.g((wo.b0) factory.f(a0.a.b(wo.b0.class), null, null));
            case 4:
                ((Integer) obj2).getClass();
                cs.a.c((j) obj, q.K(1));
                return b0Var;
            case 5:
                ((Integer) obj2).getClass();
                i.f((j) obj, q.K(1));
                return b0Var;
            case 6:
                ((Integer) obj2).getClass();
                g0 g0Var = (j) obj;
                g0Var.c0(961245771);
                h0.c0 c0VarI = h0.c.i(0, 14);
                g0Var.r(false);
                return c0VarI;
            case 7:
                ((Integer) obj2).getClass();
                cz.a.f((j) obj, q.K(1));
                return b0Var;
            case 8:
                ((Integer) obj2).getClass();
                cz.a.b((j) obj, q.K(1));
                return b0Var;
            case 9:
                ((Integer) obj2).getClass();
                cz.a.h((j) obj, q.K(7));
                return b0Var;
            case 10:
                ((Integer) obj2).getClass();
                g0 g0Var2 = (j) obj;
                g0Var2.c0(1233742604);
                h0.c0 c0VarI2 = h0.c.i(0, 14);
                g0Var2.r(false);
                return c0VarI2;
            case 11:
                return Boolean.valueOf(m.a(obj, obj2));
            case 12:
                g0 g0Var3 = (j) obj;
                if ((((Integer) obj2).intValue() & 3) == 2) {
                    g0 g0Var4 = g0Var3;
                    if (g0Var4.C()) {
                        g0Var4.V();
                    }
                }
                return b0Var;
            case 13:
                ((Integer) obj2).getClass();
                w.b((j) obj, q.K(1));
                return b0Var;
            case 14:
                int iIntValue = ((Integer) obj).intValue();
                if (((l) obj2) instanceof c6.b) {
                    iIntValue++;
                }
                return Integer.valueOf(iIntValue);
            case 15:
                h0 h0Var = (h0) obj;
                l lVar = (l) obj2;
                if ((lVar instanceof s) || (lVar instanceof j6.m) || (lVar instanceof d6.c0)) {
                    return new h0(h0Var.a.d(lVar), h0Var.b);
                }
                return new h0(h0Var.a, h0Var.b.d(lVar));
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                ((f0) obj).c = ((y3.h) obj2).a;
                return b0Var;
            case 17:
                ((f0) obj).d = (f2) obj2;
                return b0Var;
            case 18:
                e60.a single4 = (e60.a) obj;
                a60.a it5 = (a60.a) obj2;
                m.e(single4, "$this$single");
                m.e(it5, "it");
                return new sk.a((rc.c) single4.f(a0.a.b(rc.c.class), null, null));
            case 19:
                e60.a single5 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(single5, "$this$single");
                m.e(it6, "it");
                return new uk.a(single5.b(a0.a.b(sk.a.class)));
            case 20:
                e60.a single6 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single6, "$this$single");
                m.e(it7, "it");
                SharedPreferences sharedPreferences = t1.i(single6).getSharedPreferences("shared_preferences_source", 0);
                m.d(sharedPreferences, "getSharedPreferences(...)");
                return sharedPreferences;
            case 21:
                e60.a factory2 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it8, "it");
                return new tk.b((uk.a) factory2.f(a0.a.b(uk.a.class), null, null));
            case 22:
                e60.a factory3 = (e60.a) obj;
                a60.a it9 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it9, "it");
                return new tk.a((uk.a) factory3.f(a0.a.b(uk.a.class), null, null));
            case 23:
                a60.a it10 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$single");
                m.e(it10, "it");
                return new nm.b();
            case 24:
                e60.a single7 = (e60.a) obj;
                a60.a it11 = (a60.a) obj2;
                m.e(single7, "$this$single");
                m.e(it11, "it");
                String str = tl.a.a;
                Context contextI2 = t1.i(single7);
                try {
                    dVarS = tl.a.a(contextI2);
                    break;
                } catch (Throwable th) {
                    dVarS = t1.s(th);
                }
                Throwable thA = g00.n.a(dVarS);
                if (thA != null) {
                    try {
                        Log.w("EncryptedPreferences", "Encrypted preferences unavailable, resetting", thA);
                        contextI2.deleteSharedPreferences(tl.a.a);
                        try {
                            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                            keyStore.load(null);
                            keyStore.deleteEntry("_androidx_security_master_key_");
                        } catch (Throwable th2) {
                            t1.s(th2);
                        }
                        dVarS = tl.a.a(contextI2);
                    } catch (Throwable th3) {
                        dVarS = t1.s(th3);
                    }
                    break;
                }
                Throwable thA2 = g00.n.a(dVarS);
                if (thA2 != null) {
                    Log.e("EncryptedPreferences", "Keystore is broken, using fallback preferences", thA2);
                    dVarS = contextI2.getSharedPreferences(tl.a.b, 0);
                    m.d(dVarS, "getSharedPreferences(...)");
                }
                return (SharedPreferences) dVarS;
            case 25:
                a60.a it12 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it12, "it");
                dk.d dVar = dk.d.C;
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                bk.i iVar = bk.m.k;
                u uVar = bk.m.m;
                v vVar = bk.m.n;
                ArrayDeque arrayDeque = new ArrayDeque();
                ResourceTextAdapter resourceTextAdapter = new ResourceTextAdapter();
                TypeToken typeToken = TypeToken.get(ResourceText.class);
                arrayList.add(new y(resourceTextAdapter, typeToken, typeToken.getType() == typeToken.getRawType()));
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = hk.f.a;
                return new bk.m(dVar, bk.h.A, new HashMap(map), iVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, uVar, vVar, new ArrayList(arrayDeque));
            case 26:
                e60.a single8 = (e60.a) obj;
                a60.a it13 = (a60.a) obj2;
                m.e(single8, "$this$single");
                m.e(it13, "it");
                sg.f fVar = cm.a.A;
                Configuration configuration = t1.i(single8).getResources().getConfiguration();
                m.d(configuration, "getConfiguration(...)");
                fVar.getClass();
                return sg.f.J(configuration);
            case 27:
                e60.a factory4 = (e60.a) obj;
                a60.a it14 = (a60.a) obj2;
                m.e(factory4, "$this$factory");
                m.e(it14, "it");
                return new cm.b(t1.i(factory4));
            case 28:
                e60.a single9 = (e60.a) obj;
                a60.a it15 = (a60.a) obj2;
                m.e(single9, "$this$single");
                m.e(it15, "it");
                Context contextI3 = t1.i(single9);
                Context applicationContext = contextI3.getApplicationContext();
                if (applicationContext != null) {
                    contextI3 = applicationContext;
                }
                return new ah.e(new ah.h(contextI3));
            default:
                e60.a factory5 = (e60.a) obj;
                a60.a it16 = (a60.a) obj2;
                m.e(factory5, "$this$factory");
                m.e(it16, "it");
                return new im.a((SharedPreferences) factory5.f(a0.a.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")));
        }
    }
}
