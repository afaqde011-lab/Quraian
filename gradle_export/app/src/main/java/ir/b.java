package ir;

import a2.f;
import android.app.LocaleManager;
import android.content.SharedPreferences;
import androidx.datastore.core.DataStore;
import b2.o;
import b2.r;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.gms.internal.measurement.z3;
import com.mchutov.quranify.home.presentation.analytics.HomeAnalytics;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g1.o3;
import g1.z6;
import gs.h;
import h0.c0;
import h0.z1;
import i2.t;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.m;
import l1.g0;
import l1.j;
import l60.q0;
import m3.r0;
import q3.i;
import q3.u;
import ri.t1;
import ss.v;
import u00.n;
import vp.x;
import x3.k;
import x3.l;

public final class b implements n {
    public final int A;

    public b(int i) {
        this.A = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        switch (this.A) {
            case 0:
                e60.a single = (e60.a) obj;
                a60.a it = (a60.a) obj2;
                m.e(single, "$this$single");
                m.e(it, "it");
                return (DataStore) e.c.a(e.a[0], t1.i(single));
            case 1:
                a60.a it2 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it2, "it");
                return new pr.a();
            case 2:
                e60.a factory = (e60.a) obj;
                a60.a it3 = (a60.a) obj2;
                m.e(factory, "$this$factory");
                m.e(it3, "it");
                return new HomeAnalytics((tk.c) factory.f(a0.a.b(tk.c.class), null, null));
            case 3:
                e60.a single2 = (e60.a) obj;
                a60.a it4 = (a60.a) obj2;
                m.e(single2, "$this$single");
                m.e(it4, "it");
                Object objB = ((q0) single2.f(a0.a.b(q0.class), null, null)).b(gr.a.class);
                m.d(objB, "create(...)");
                return (gr.a) objB;
            case 4:
                a60.a it5 = (a60.a) obj2;
                m.e((e60.a) obj, "$this$factory");
                m.e(it5, "it");
                return new cr.b();
            case 5:
                e60.a factory2 = (e60.a) obj;
                a60.a it6 = (a60.a) obj2;
                m.e(factory2, "$this$factory");
                m.e(it6, "it");
                return new cr.a();
            case 6:
                e60.a single3 = (e60.a) obj;
                a60.a it7 = (a60.a) obj2;
                m.e(single3, "$this$single");
                m.e(it7, "it");
                b0 b0Var = a0.a;
                return new er.d((gr.a) single3.f(b0Var.b(gr.a.class), null, null), (cr.a) single3.f(b0Var.b(cr.a.class), null, null), (SharedPreferences) single3.f(b0Var.b(SharedPreferences.class), null, new b60.b("default_shared_preferences")), (LocaleManager) single3.f(b0Var.b(LocaleManager.class), null, null), (x) single3.f(b0Var.b(x.class), null, null));
            case 7:
                e60.a factory3 = (e60.a) obj;
                a60.a it8 = (a60.a) obj2;
                m.e(factory3, "$this$factory");
                m.e(it8, "it");
                return new or.a((er.d) factory3.f(a0.a.b(er.d.class), null, null));
            case 8:
                return Boolean.valueOf(((v) obj) == ((v) obj2));
            case 9:
                h hVar = (h) obj;
                h hVar2 = (h) obj2;
                if (m.a(hVar != null ? Long.valueOf(hVar.c) : null, hVar2 != null ? Long.valueOf(hVar2.c) : null)) {
                    if (m.a(hVar != null ? hVar.b : null, hVar2 != null ? hVar2.b : null)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                g0 g0Var = (j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o3.a(y3.R(2131231375, g0Var, 0), (String) null, z1.m(o.A, 16), t.b(0.6f, dl.a.k), g0Var, 440, 0);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 11:
                ((Integer) obj).intValue();
                bx.c reciter = (bx.c) obj2;
                m.e(reciter, "reciter");
                return Integer.valueOf(reciter.a);
            case 12:
                ((Integer) obj2).getClass();
                g0 g0Var3 = (j) obj;
                g0Var3.c0(-404672126);
                c0 c0VarI = h0.c.i(0, 14);
                g0Var3.r(false);
                return c0VarI;
            case 13:
                ((Integer) obj2).getClass();
                g0 g0Var4 = (j) obj;
                g0Var4.c0(2076754579);
                c0 c0VarI2 = h0.c.i(0, 14);
                g0Var4.r(false);
                return c0VarI2;
            case 14:
                g0 g0Var5 = (j) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                g0 g0Var6 = g0Var5;
                if (g0Var6.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z6.b(z3.U(g0Var5, 2131887130), (r) null, t.b(0.6f, dl.a.k), 0L, (u) null, (i) null, 0L, (l) null, (k) null, 0L, 0, false, 0, 0, (u00.k) null, (r0) null, g0Var5, 0, 0, 262138);
                } else {
                    g0Var6.V();
                }
                return g00.b0.a;
            case 15:
                g0 g0Var7 = (j) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                g0 g0Var8 = g0Var7;
                if (!g0Var8.S(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    g0Var8.V();
                }
                return g00.b0.a;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                g0 g0Var9 = (j) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                g0 g0Var10 = g0Var9;
                if (g0Var10.S(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    h0.c.h(z1.e(o.A, 4), g0Var9);
                    Object objN = g0Var10.N();
                    if (objN == l1.i.a) {
                        objN = new f(24);
                        g0Var10.n0(objN);
                    }
                    iz.d.n((u00.a) objN, null, g0Var9, 54);
                } else {
                    g0Var10.V();
                }
                return g00.b0.a;
            case 17:
                ((Integer) obj2).getClass();
                g0 g0Var11 = (j) obj;
                g0Var11.c0(-598277341);
                c0 c0VarI3 = h0.c.i(0, 14);
                g0Var11.r(false);
                return c0VarI3;
            case 18:
                ((Integer) obj2).getClass();
                g0 g0Var12 = (j) obj;
                g0Var12.c0(-1819685373);
                c0 c0VarI4 = h0.c.i(0, 14);
                g0Var12.r(false);
                return c0VarI4;
            case 19:
                j0.v vVar = (j0.v) obj2;
                return va.a.S(new Integer[]{Integer.valueOf(vVar.e.b.h()), Integer.valueOf(vVar.e.c.h())});
            case 20:
                return (Float) ((j1.r) obj2).a.d();
            case 21:
                ((j6.i) obj).c = (b6.m) obj2;
                return g00.b0.a;
            case 22:
                ((j6.i) obj).d = (j6.c) obj2;
                return g00.b0.a;
            case 23:
                ((j6.j) obj).c = (b6.m) obj2;
                return g00.b0.a;
            case 24:
                ((j6.j) obj).e = ((j6.a) obj2).a;
                return g00.b0.a;
            case 25:
                ((j6.j) obj).d = ((j6.b) obj2).a;
                return g00.b0.a;
            case 26:
                ((j6.k) obj).c = (b6.m) obj2;
                return g00.b0.a;
            case 27:
                ((j6.k) obj).e = ((j6.b) obj2).a;
                return g00.b0.a;
            case 28:
                ((j6.k) obj).d = ((j6.a) obj2).a;
                return g00.b0.a;
            default:
                ((j6.l) obj).a = (b6.m) obj2;
                return g00.b0.a;
        }
    }
}
