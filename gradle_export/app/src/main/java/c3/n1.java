package c3;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.cast.Cast;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class n1 {

    public final View f2700a;

    public final l1.n f2701b;

    public final androidx.lifecycle.w f2702c;

    public final ia.g f2703d;

    public final androidx.lifecycle.f1 f2704e;

    public final h3.c f2705f;

    public final h3.d f2706g;

    public final Configuration f2707h;

    public final l1.z0 f2708i;

    public final h f2709j;

    public final x0 f2710k;
    public final j l;
    public final i m;

    public final q3.g f2711n;

    public final l1.z0 f2712o;

    public final q2.a f2713p;

    public final y0 f2714q;

    public final b3.o0 f2715r;

    public final f2 f2716s;

    public final hf.c f2717t;

    public int f2718u;

    public final b3.j0 f2719v;

    public final m1 f2720w;

    public n1(n1 n1Var, View view, l1.n nVar, androidx.lifecycle.w wVar, ia.g gVar, androidx.lifecycle.f1 f1Var) {
        h3.c cVar;
        Configuration configuration;
        l1.z0 z0VarZ;
        h hVar;
        x0 x0Var;
        j jVar;
        i iVar;
        q3.g y1Var;
        l1.z0 i1Var;
        y0 y0Var;
        hf.c cVar2;
        b3.o0 o0Var;
        h3.d dVar;
        View view2;
        boolean zA = kotlin.jvm.internal.m.a((n1Var == null || (view2 = n1Var.f2700a) == null) ? null : view2.getContext(), view.getContext());
        this.f2700a = view;
        this.f2701b = nVar;
        this.f2702c = wVar;
        this.f2703d = gVar;
        this.f2704e = f1Var;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            cVar = n1Var.f2705f;
        } else {
            cVar = new h3.c();
        }
        this.f2705f = cVar;
        this.f2706g = (n1Var == null || (dVar = n1Var.f2706g) == null) ? new h3.d() : dVar;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            configuration = n1Var.f2707h;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.f2707h = configuration;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            z0VarZ = n1Var.f2708i;
        } else {
            z0VarZ = l1.q.z(new Configuration(configuration));
        }
        this.f2708i = z0VarZ;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            hVar = n1Var.f2709j;
        } else {
            Context context = view.getContext();
            hVar = new h();
            Object systemService = context.getSystemService("accessibility");
            kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f2709j = hVar;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            x0Var = n1Var.f2710k;
        } else {
            x0Var = new x0(view.getContext());
        }
        this.f2710k = x0Var;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            jVar = n1Var.l;
        } else {
            jVar = new j(view.getContext());
        }
        this.l = jVar;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            iVar = n1Var.m;
        } else {
            iVar = new i(jVar);
        }
        this.m = iVar;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            y1Var = n1Var.f2711n;
        } else {
            view.getContext();
            y1Var = new y1();
        }
        this.f2711n = y1Var;
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            i1Var = n1Var.f2712o;
        } else {
            Context context2 = view.getContext();
            i1Var = new l1.i1(new q3.j(new dh.o(context2, 3), new q3.a(q3.v.f12751a.a(context2))), l1.c.E);
        }
        this.f2712o = i1Var;
        this.f2713p = view == (n1Var != null ? n1Var.f2700a : null) ? n1Var.f2713p : new q2.c(view);
        if (zA) {
            kotlin.jvm.internal.m.b(n1Var);
            y0Var = n1Var.f2714q;
        } else {
            y0Var = new y0(ViewConfiguration.get(view.getContext()));
        }
        this.f2714q = y0Var;
        this.f2715r = (n1Var == null || (o0Var = n1Var.f2715r) == null) ? new b3.o0() : o0Var;
        this.f2716s = new f2();
        this.f2717t = (n1Var == null || (cVar2 = n1Var.f2717t) == null) ? new hf.c(2) : cVar2;
        this.f2719v = new b3.j0(this, 6);
        this.f2720w = new m1(this);
    }

    public final void a(z zVar, u00.n nVar, l1.j jVar, int i10) {
        boolean z10;
        boolean z11;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(123858079);
        int i11 = (g0Var.i(zVar) ? 4 : 2) | i10 | (g0Var.i(nVar) ? 32 : 16) | (g0Var.i(this) ? 256 : Cast.MAX_NAMESPACE_LENGTH);
        if (g0Var.S(i11 & 1, (i11 & 147) != 146)) {
            Object tag = zVar.getTag(2131362746);
            LinkedHashMap linkedHashMap = null;
            Set set = (!(tag instanceof Set) || ((tag instanceof v00.a) && !(tag instanceof v00.f))) ? null : (Set) tag;
            if (set == null) {
                Object parent = zVar.getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(2131362746) : null;
                set = (!(tag2 instanceof Set) || ((tag2 instanceof v00.a) && !(tag2 instanceof v00.f))) ? null : (Set) tag2;
            }
            if (set != null) {
                set.add(g0Var.y());
                g0Var.f9856q = true;
                g0Var.C = true;
                g0Var.f9844c.c();
                g0Var.H.c();
                o1.k kVar = g0Var.I;
                o1.h hVar = kVar.f11490a;
                kVar.f11494e = hVar.J;
                kVar.f11495f = hVar.K;
            }
            Object objN = g0Var.N();
            ia.g gVar = this.f2703d;
            l1.c cVar = l1.i.f9868a;
            if (objN == cVar) {
                Object parent2 = zVar.getParent();
                kotlin.jvm.internal.m.c(parent2, "null cannot be cast to non-null type android.view.View");
                View view2 = (View) parent2;
                Object tag3 = view2.getTag(2131362061);
                String strValueOf = tag3 instanceof String ? (String) tag3 : null;
                if (strValueOf == null) {
                    strValueOf = String.valueOf(view2.getId());
                }
                String strO = a1.b.o("SaveableStateRegistry:", strValueOf);
                ia.e savedStateRegistry = gVar.getSavedStateRegistry();
                Bundle bundleA = savedStateRegistry.a(strO);
                if (bundleA != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (String str : bundleA.keySet()) {
                        ArrayList parcelableArrayList = bundleA.getParcelableArrayList(str);
                        kotlin.jvm.internal.m.c(parcelableArrayList, "null cannot be cast to non-null type java.util.ArrayList<kotlin.Any?>");
                        linkedHashMap.put(str, parcelableArrayList);
                    }
                }
                t tVar = t.E;
                l1.q2 q2Var = y1.h.f16584a;
                y1.g gVar2 = new y1.g(linkedHashMap, tVar);
                if (savedStateRegistry.b(strO) != null) {
                    z11 = false;
                } else {
                    try {
                        z10 = false;
                        try {
                            savedStateRegistry.c(strO, new s1(gVar2, 0));
                            z11 = true;
                        } catch (IllegalArgumentException unused) {
                            z11 = z10;
                        }
                    } catch (IllegalArgumentException unused2) {
                        z10 = false;
                    }
                }
                r1 r1Var = new r1(gVar2, new t1(z11, savedStateRegistry, strO));
                g0Var.n0(r1Var);
                objN = r1Var;
            }
            r1 r1Var2 = (r1) objN;
            boolean zI = g0Var.i(r1Var2);
            Object objN2 = g0Var.N();
            if (zI || objN2 == cVar) {
                objN2 = new b3.a(r1Var2, 8);
                g0Var.n0(objN2);
            }
            l1.q.e(g00.b0.a, (u00.k) objN2, g0Var);
            l1.t tVar2 = o1.f2747w;
            boolean zBooleanValue = ((Boolean) g0Var.k(tVar2)).booleanValue() | zVar.getScrollCaptureInProgress$ui();
            boolean zG = g0Var.g(zVar.getView());
            Object objN3 = g0Var.N();
            if (zG || objN3 == cVar) {
                objN3 = new f3(zVar.getView());
                g0Var.n0(objN3);
            }
            l1.q.b(new l1.q1[]{r6.d.f13126a.a(this.f2702c), ja.a.f8257a.a(gVar), o0.f2724d.a(this.f2705f), o0.f2725e.a(this.f2706g), o0.f2722b.a(zVar.getContext()), a2.h.f161a.a(set), o0.f2721a.a(zVar.getConfiguration()), y1.h.f16584a.a(r1Var2), o0.f2726f.a(zVar.getView()), tVar2.a(Boolean.valueOf(zBooleanValue)), o1.f2744t.a(zVar.getViewConfiguration()), l1.k0.f9879a.a((f3) objN3)}, v1.d.d(1317454175, new l1(zVar, this, nVar), g0Var), g0Var, 56);
        } else {
            g0Var.V();
        }
        l1.r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.f9921d = new l1(this, zVar, nVar, i10);
        }
    }

    public final void b() {
        int i10 = this.f2718u - 1;
        this.f2718u = i10;
        if (i10 < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            this.f2718u = 0;
        }
        if (this.f2718u == 0) {
            View view = this.f2700a;
            Context context = view.getContext();
            m1 m1Var = this.f2720w;
            context.unregisterComponentCallbacks(m1Var);
            f2 f2Var = this.f2716s;
            if (f2Var.f2670b == null) {
                f2Var.f2669a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(m1Var);
        }
    }

    public final void c() {
        int i10 = this.f2718u + 1;
        this.f2718u = i10;
        if (i10 == 1) {
            View view = this.f2700a;
            Context context = view.getContext();
            m1 m1Var = this.f2720w;
            context.registerComponentCallbacks(m1Var);
            d(view.getResources().getConfiguration());
            boolean zHasWindowFocus = view.hasWindowFocus();
            f2 f2Var = this.f2716s;
            f2Var.f2671c.setValue(Boolean.valueOf(zHasWindowFocus));
            l1.i1 i1Var = f2Var.f2670b;
            b3.j0 j0Var = this.f2719v;
            if (i1Var == null) {
                f2Var.f2669a = j0Var;
            }
            if (i1Var != null) {
                i1Var.setValue(j0Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(m1Var);
        }
    }

    public final void d(Configuration configuration) {
        int iUpdateFrom = this.f2707h.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            Iterator it = this.f2705f.f6563a.entrySet().iterator();
            while (it.hasNext()) {
                h3.a aVar = (h3.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f6560b)) {
                    it.remove();
                }
            }
            this.f2708i.setValue(new Configuration(configuration));
            h3.d dVar = this.f2706g;
            synchronized (dVar) {
                dVar.f6564a.c();
            }
            if ((268435456 & iUpdateFrom) != 0) {
                l1.z0 z0Var = this.f2712o;
                Context context = this.f2700a.getContext();
                z0Var.setValue(new q3.j(new dh.o(context, 3), new q3.a(q3.v.f12751a.a(context))));
            }
            if (((-1342235264) & iUpdateFrom) != 0) {
                f2 f2Var = this.f2716s;
                b3.j0 j0Var = this.f2719v;
                l1.i1 i1Var = f2Var.f2670b;
                if (i1Var != null) {
                    i1Var.setValue(j0Var.invoke());
                }
            }
        }
    }
}
