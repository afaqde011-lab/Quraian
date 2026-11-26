package androidx.lifecycle;

import a40.w1;
import android.os.Bundle;
import android.view.View;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public abstract class u0 {

    public static final hb.f f1003a = new hb.f();

    public static final sg.f f1004b = new sg.f();

    public static final gj.e f1005c = new gj.e(5);

    public static final tf.y f1006d = new tf.y(14);

    public static final sg.f f1007e = new sg.f();

    public static final void a(a1 a1Var, ia.e eVar, q qVar) {
        kotlin.jvm.internal.m.e(eVar, "registry");
        kotlin.jvm.internal.m.e(qVar, "lifecycle");
        s0 s0Var = (s0) a1Var.f("androidx.lifecycle.savedstate.vm.tag");
        if (s0Var == null || s0Var.C) {
            return;
        }
        s0Var.i(qVar, eVar);
        p pVarB = qVar.b();
        if (pVarB == p.B || pVarB.compareTo(p.D) >= 0) {
            eVar.d();
        } else {
            qVar.a(new f(qVar, eVar));
        }
    }

    public static r0 b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            r0 r0Var = new r0();
            new LinkedHashMap();
            r0Var.f1001a = new ce.c((Map) h00.y.A);
            return r0Var;
        }
        ClassLoader classLoader = r0.class.getClassLoader();
        kotlin.jvm.internal.m.b(classLoader);
        bundle.setClassLoader(classLoader);
        i00.f fVar = new i00.f(bundle.size());
        for (String str : bundle.keySet()) {
            kotlin.jvm.internal.m.b(str);
            fVar.put(str, bundle.get(str));
        }
        i00.f fVarC = fVar.c();
        r0 r0Var2 = new r0();
        new LinkedHashMap();
        r0Var2.f1001a = new ce.c((Map) fVarC);
        return r0Var2;
    }

    public static final r0 c(t6.d dVar) {
        kotlin.jvm.internal.m.e(dVar, "<this>");
        LinkedHashMap linkedHashMap = dVar.f14360a;
        ia.g gVar = (ia.g) linkedHashMap.get(f1003a);
        if (gVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        f1 f1Var = (f1) linkedHashMap.get(f1004b);
        if (f1Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) linkedHashMap.get(f1005c);
        String str = (String) linkedHashMap.get(f1007e);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        ia.d dVarB = gVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundle2 = null;
        v0 v0Var = dVarB instanceof v0 ? (v0) dVarB : null;
        if (v0Var == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap2 = h(f1Var).f1012c;
        r0 r0Var = (r0) linkedHashMap2.get(str);
        if (r0Var != null) {
            return r0Var;
        }
        v0Var.b();
        Bundle bundle3 = v0Var.f1010c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = f50.c.n((g00.k[]) Arrays.copyOf(new g00.k[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                v0Var.f1010c = null;
            }
            bundle2 = bundle4;
        }
        r0 r0VarB = b(bundle2, bundle);
        linkedHashMap2.put(str, r0VarB);
        return r0VarB;
    }

    public static final void d(ia.g gVar) {
        p pVarB = gVar.getLifecycle().b();
        if (pVarB != p.B && pVarB != p.C) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gVar.getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            v0 v0Var = new v0(gVar.getSavedStateRegistry(), (f1) gVar);
            gVar.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", v0Var);
            gVar.getLifecycle().a(new ia.b(v0Var, 2));
        }
    }

    public static final w e(View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(2131363128);
            w wVar = tag instanceof w ? (w) tag : null;
            if (wVar != null) {
                return wVar;
            }
            Object objE = bi.b.E(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return null;
    }

    public static final f1 f(View view) {
        kotlin.jvm.internal.m.e(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(2131363132);
            f1 f1Var = tag instanceof f1 ? (f1) tag : null;
            if (f1Var != null) {
                return f1Var;
            }
            Object objE = bi.b.E(view);
            view = objE instanceof View ? (View) objE : null;
        }
        return null;
    }

    public static final r g(w wVar) {
        r rVar;
        b40.c cVar;
        k00.c cVar2;
        kotlin.jvm.internal.m.e(wVar, "<this>");
        q lifecycle = wVar.getLifecycle();
        kotlin.jvm.internal.m.e(lifecycle, "<this>");
        qj.c cVar3 = lifecycle.f1000a;
        do {
            r rVar2 = (r) ((AtomicReference) cVar3.B).get();
            if (rVar2 != null) {
                return rVar2;
            }
            w1 w1VarE = a40.c0.e();
            h40.e eVar = a40.m0.a;
            cVar = f40.m.a;
            rVar = new r(lifecycle, rd.a.P(w1VarE, cVar.F));
            cVar2 = null;
        } while (!((AtomicReference) cVar3.B).compareAndSet(null, rVar));
        a40.c0.y(rVar, cVar.F, (a40.a0) null, new a1.c0(rVar, cVar2, 2), 2);
        return rVar;
    }

    public static final w0 h(f1 f1Var) {
        t0 t0Var = new t0();
        t6.b defaultViewModelCreationExtras = f1Var instanceof j ? ((j) f1Var).getDefaultViewModelCreationExtras() : t6.a.f14359b;
        kotlin.jvm.internal.m.e(defaultViewModelCreationExtras, "extras");
        e1 viewModelStore = f1Var.getViewModelStore();
        kotlin.jvm.internal.m.e(viewModelStore, "store");
        return (w0) new p10.a(viewModelStore, t0Var, defaultViewModelCreationExtras).o(kotlin.jvm.internal.a0.a.b(w0.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static final v6.a i(a1 a1Var) {
        v6.a aVar;
        kotlin.jvm.internal.m.e(a1Var, "<this>");
        synchronized (f1006d) {
            aVar = (v6.a) a1Var.f("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (aVar == null) {
                b40.c cVar = k00.j.A;
                try {
                    h40.e eVar = a40.m0.a;
                    cVar = f40.m.a.F;
                } catch (g00.j | IllegalStateException unused) {
                }
                v6.a aVar2 = new v6.a(cVar.plus(a40.c0.e()));
                a1Var.d("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", aVar2);
                aVar = aVar2;
            }
        }
        return aVar;
    }

    public static final Object j(q qVar, p pVar, u00.n nVar, m00.i iVar) {
        Object objK;
        if (pVar != p.B) {
            return (qVar.b() != p.A && (objK = a40.c0.k(new a1.g(qVar, pVar, nVar, (k00.c) null), iVar)) == l00.a.A) ? objK : g00.b0.a;
        }
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final void k(View view, w wVar) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(2131363128, wVar);
    }

    public static final void l(View view, f1 f1Var) {
        kotlin.jvm.internal.m.e(view, "<this>");
        view.setTag(2131363132, f1Var);
    }
}
