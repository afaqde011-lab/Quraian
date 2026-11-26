package androidx.fragment.app;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

public final class p extends f2 {

    public final ArrayList f788c;

    public final g2 f789d;

    public final g2 f790e;

    public final b2 f791f;

    public final Object f792g;

    public final ArrayList f793h;

    public final ArrayList f794i;

    public final u.e f795j;

    public final ArrayList f796k;
    public final ArrayList l;
    public final u.e m;

    public final u.e f797n;

    public final boolean f798o;

    public final u4.b f799p = new u4.b();

    public Object f800q;

    public boolean f801r;

    public p(ArrayList arrayList, g2 g2Var, g2 g2Var2, b2 b2Var, Object obj, ArrayList arrayList2, ArrayList arrayList3, u.e eVar, ArrayList arrayList4, ArrayList arrayList5, u.e eVar2, u.e eVar3, boolean z10) {
        this.f788c = arrayList;
        this.f789d = g2Var;
        this.f790e = g2Var2;
        this.f791f = b2Var;
        this.f792g = obj;
        this.f793h = arrayList2;
        this.f794i = arrayList3;
        this.f795j = eVar;
        this.f796k = arrayList4;
        this.l = arrayList5;
        this.m = eVar2;
        this.f797n = eVar3;
        this.f798o = z10;
    }

    public static void f(View view, ArrayList arrayList) {
        if (!(view instanceof ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = z4.k0.f17203a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt.getVisibility() == 0) {
                f(childAt, arrayList);
            }
        }
    }

    @Override
    public final boolean a() {
        Object obj;
        b2 b2Var = this.f791f;
        if (!b2Var.l()) {
            return false;
        }
        ArrayList<q> arrayList = this.f788c;
        if (!arrayList.isEmpty()) {
            for (q qVar : arrayList) {
                if (Build.VERSION.SDK_INT < 34 || (obj = qVar.f804b) == null || !b2Var.m(obj)) {
                    return false;
                }
            }
        }
        Object obj2 = this.f792g;
        return obj2 == null || b2Var.m(obj2);
    }

    @Override
    public final void b(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        this.f799p.a();
    }

    @Override
    public final void c(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList<q> arrayList = this.f788c;
        if (!zIsLaidOut || this.f801r) {
            for (q qVar : arrayList) {
                g2 g2Var = qVar.f774a;
                if (i1.K(2)) {
                    if (this.f801r) {
                        Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + g2Var);
                    } else {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + g2Var);
                    }
                }
                qVar.f774a.c(this);
            }
            this.f801r = false;
            return;
        }
        Object obj = this.f800q;
        b2 b2Var = this.f791f;
        g2 g2Var2 = this.f790e;
        g2 g2Var3 = this.f789d;
        if (obj != null) {
            b2Var.c(obj);
            if (i1.K(2)) {
                Log.v("FragmentManager", "Ending execution of operations from " + g2Var3 + " to " + g2Var2);
                return;
            }
            return;
        }
        g00.k kVarG = g(viewGroup, g2Var2, g2Var3);
        ArrayList arrayList2 = (ArrayList) kVarG.A;
        Object obj2 = kVarG.B;
        ArrayList<g2> arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList3.add(((q) it.next()).f774a);
        }
        for (g2 g2Var4 : arrayList3) {
            b2Var.u(g2Var4.f735c, obj2, this.f799p, new l(g2Var4, this, 1));
        }
        i(arrayList2, viewGroup, new n(this, viewGroup, obj2));
        if (i1.K(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + g2Var3 + " to " + g2Var2);
        }
    }

    @Override
    public final void d(d.b bVar, ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        Object obj = this.f800q;
        if (obj != null) {
            this.f791f.r(obj, bVar.f4377c);
        }
    }

    @Override
    public final void e(ViewGroup viewGroup) {
        Object obj;
        kotlin.jvm.internal.m.e(viewGroup, "container");
        boolean zIsLaidOut = viewGroup.isLaidOut();
        ArrayList arrayList = this.f788c;
        if (!zIsLaidOut) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g2 g2Var = ((q) it.next()).f774a;
                if (i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + g2Var);
                }
            }
            return;
        }
        boolean zH = h();
        g2 g2Var2 = this.f790e;
        g2 g2Var3 = this.f789d;
        if (zH && (obj = this.f792g) != null && !a()) {
            Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + g2Var3 + " and " + g2Var2 + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (a() && h()) {
            kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
            g00.k kVarG = g(viewGroup, g2Var2, g2Var3);
            ArrayList arrayList2 = (ArrayList) kVarG.A;
            Object obj2 = kVarG.B;
            ArrayList<g2> arrayList3 = new ArrayList(h00.r.q0(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((q) it2.next()).f774a);
            }
            for (g2 g2Var4 : arrayList3) {
                y yVar = new y(zVar, 1);
                j0 j0Var = g2Var4.f735c;
                this.f791f.v(obj2, this.f799p, yVar, new l(g2Var4, this, 0));
            }
            i(arrayList2, viewGroup, new o(this, viewGroup, obj2, zVar, 0));
        }
    }

    public final g00.k g(ViewGroup viewGroup, g2 g2Var, g2 g2Var2) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Object obj;
        b2 b2Var;
        Object obj2;
        Object obj3;
        ArrayList arrayList3;
        int i10;
        View view = new View(viewGroup.getContext());
        Rect rect = new Rect();
        ArrayList arrayList4 = this.f788c;
        Iterator it = arrayList4.iterator();
        View view2 = null;
        boolean z10 = false;
        while (true) {
            boolean zHasNext = it.hasNext();
            arrayList = this.f794i;
            arrayList2 = this.f793h;
            obj = this.f792g;
            b2Var = this.f791f;
            if (!zHasNext) {
                break;
            }
            if (((q) it.next()).f806d != null && g2Var2 != null && g2Var != null && !this.f795j.isEmpty() && obj != null) {
                j0 j0Var = g2Var.f735c;
                j0 j0Var2 = g2Var2.f735c;
                z1 z1Var = u1.f846a;
                kotlin.jvm.internal.m.e(j0Var, "inFragment");
                kotlin.jvm.internal.m.e(j0Var2, "outFragment");
                if (this.f798o) {
                    j0Var2.getEnterTransitionCallback();
                } else {
                    j0Var.getEnterTransitionCallback();
                }
                z4.s.a(viewGroup, new ab.e(g2Var, g2Var2, this, 3));
                u.e eVar = this.m;
                arrayList2.addAll(eVar.values());
                ArrayList arrayList5 = this.l;
                if (!arrayList5.isEmpty()) {
                    Object obj4 = arrayList5.get(0);
                    kotlin.jvm.internal.m.d(obj4, "exitingNames[0]");
                    View view3 = (View) eVar.get((String) obj4);
                    b2Var.s(view3, obj);
                    view2 = view3;
                }
                u.e eVar2 = this.f797n;
                arrayList.addAll(eVar2.values());
                ArrayList arrayList6 = this.f796k;
                if (!arrayList6.isEmpty()) {
                    Object obj5 = arrayList6.get(0);
                    kotlin.jvm.internal.m.d(obj5, "enteringNames[0]");
                    View view4 = (View) eVar2.get((String) obj5);
                    if (view4 != null) {
                        z4.s.a(viewGroup, new m(b2Var, view4, rect));
                        z10 = true;
                    }
                }
                b2Var.w(obj, view, arrayList2);
                Object obj6 = this.f792g;
                b2Var.q(obj6, null, null, obj6, arrayList);
            }
            arrayList4 = arrayList4;
        }
        ArrayList arrayList7 = new ArrayList();
        Iterator it2 = arrayList4.iterator();
        Object objO = null;
        Object objO2 = null;
        while (it2.hasNext()) {
            q qVar = (q) it2.next();
            it2 = it2;
            g2 g2Var3 = qVar.f774a;
            z10 = z10;
            Object objH = b2Var.h(qVar.f804b);
            if (objH != null) {
                ArrayList arrayList8 = arrayList2;
                ArrayList arrayList9 = new ArrayList();
                obj2 = obj;
                j0 j0Var3 = g2Var3.f735c;
                Object obj7 = objO2;
                View view5 = j0Var3.mView;
                Object obj8 = objO;
                kotlin.jvm.internal.m.d(view5, "operation.fragment.mView");
                f(view5, arrayList9);
                if (obj2 != null && (g2Var3 == g2Var2 || g2Var3 == g2Var)) {
                    if (g2Var3 == g2Var2) {
                        arrayList9.removeAll(h00.q.r1(arrayList8));
                    } else {
                        arrayList9.removeAll(h00.q.r1(arrayList));
                    }
                }
                if (arrayList9.isEmpty()) {
                    b2Var.a(view, objH);
                    obj3 = objH;
                    arrayList3 = arrayList9;
                } else {
                    b2Var.b(objH, arrayList9);
                    b2Var.q(objH, objH, arrayList9, null, null);
                    obj3 = objH;
                    arrayList3 = arrayList9;
                    if (g2Var3.f733a == 3) {
                        g2Var3.f741i = false;
                        ArrayList arrayList10 = new ArrayList(arrayList3);
                        arrayList10.remove(j0Var3.mView);
                        b2Var.p(obj3, j0Var3.mView, arrayList10);
                        i10 = 2;
                        z4.s.a(viewGroup, new y(arrayList3, i10));
                    }
                    if (g2Var3.f733a == i10) {
                        arrayList7.addAll(arrayList3);
                        if (z10) {
                            b2Var.t(obj3, rect);
                        }
                        if (i1.K(i10)) {
                            Log.v("FragmentManager", "Entering Transition: " + obj3);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object obj9 : arrayList3) {
                                kotlin.jvm.internal.m.d(obj9, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj9));
                            }
                        }
                    } else {
                        b2Var.s(view2, obj3);
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + obj3);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object obj10 : arrayList3) {
                                kotlin.jvm.internal.m.d(obj10, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj10));
                            }
                        }
                    }
                    if (qVar.f805c) {
                        objO = b2Var.o(obj8, obj3);
                        it2 = it2;
                        z10 = z10;
                        arrayList2 = arrayList8;
                        obj = obj2;
                        objO2 = obj7;
                    } else {
                        objO2 = b2Var.o(obj7, obj3);
                        objO = obj8;
                        arrayList2 = arrayList8;
                    }
                }
                i10 = 2;
                if (g2Var3.f733a == i10) {
                    arrayList7.addAll(arrayList3);
                    if (z10) {
                        b2Var.t(obj3, rect);
                    }
                    if (i1.K(i10)) {
                        Log.v("FragmentManager", "Entering Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        while (r6.hasNext()) {
                            kotlin.jvm.internal.m.d(obj9, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) obj9));
                        }
                    }
                } else {
                    b2Var.s(view2, obj3);
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Exiting Transition: " + obj3);
                        Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        while (r6.hasNext()) {
                            kotlin.jvm.internal.m.d(obj10, "transitioningViews");
                            Log.v("FragmentManager", "View: " + ((View) obj10));
                        }
                    }
                }
                if (qVar.f805c) {
                    objO = b2Var.o(obj8, obj3);
                    it2 = it2;
                    z10 = z10;
                    arrayList2 = arrayList8;
                    obj = obj2;
                    objO2 = obj7;
                } else {
                    objO2 = b2Var.o(obj7, obj3);
                    objO = obj8;
                    arrayList2 = arrayList8;
                }
            } else {
                obj2 = obj;
            }
            obj = obj2;
        }
        Object objN = b2Var.n(objO, objO2, obj);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Final merged transition: " + objN + " for container " + viewGroup);
        }
        return new g00.k(arrayList7, objN);
    }

    public final boolean h() {
        ArrayList arrayList = this.f788c;
        if (arrayList.isEmpty()) {
            return true;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((q) it.next()).f774a.f735c.mTransitioning) {
                return false;
            }
        }
        return true;
    }

    public final void i(ArrayList arrayList, ViewGroup viewGroup, u00.a aVar) {
        u1.a(4, arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = this.f794i;
        int size = arrayList3.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view = (View) arrayList3.get(i10);
            WeakHashMap weakHashMap = z4.j0.f17198a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        boolean zK = i1.K(2);
        ArrayList arrayList4 = this.f793h;
        if (zK) {
            Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            for (Object obj : arrayList4) {
                kotlin.jvm.internal.m.d(obj, "sharedElementFirstOutViews");
                View view2 = (View) obj;
                StringBuilder sb2 = new StringBuilder("View: ");
                sb2.append(view2);
                sb2.append(" Name: ");
                WeakHashMap weakHashMap2 = z4.j0.f17198a;
                sb2.append(view2.getTransitionName());
                Log.v("FragmentManager", sb2.toString());
            }
            Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            for (Object obj2 : arrayList3) {
                kotlin.jvm.internal.m.d(obj2, "sharedElementLastInViews");
                View view3 = (View) obj2;
                StringBuilder sb3 = new StringBuilder("View: ");
                sb3.append(view3);
                sb3.append(" Name: ");
                WeakHashMap weakHashMap3 = z4.j0.f17198a;
                sb3.append(view3.getTransitionName());
                Log.v("FragmentManager", sb3.toString());
            }
        }
        aVar.invoke();
        int size2 = arrayList3.size();
        ArrayList arrayList5 = new ArrayList();
        for (int i11 = 0; i11 < size2; i11++) {
            View view4 = (View) arrayList4.get(i11);
            WeakHashMap weakHashMap4 = z4.j0.f17198a;
            String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                String str = (String) this.f795j.get(transitionName);
                for (int i12 = 0; i12 < size2; i12++) {
                    if (str.equals(arrayList2.get(i12))) {
                        ((View) arrayList3.get(i12)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        z4.s.a(viewGroup, new a2(size2, arrayList3, arrayList2, arrayList4, arrayList5));
        u1.a(0, arrayList);
        this.f791f.x(this.f792g, arrayList4, arrayList3);
    }
}
