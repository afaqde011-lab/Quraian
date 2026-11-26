package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.protobuf.RuntimeVersion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;

public final class s {

    public final ViewGroup f816a;

    public final ArrayList f817b;

    public final ArrayList f818c;

    public boolean f819d;

    public boolean f820e;

    public boolean f821f;

    public s(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        this.f816a = viewGroup;
        this.f817b = new ArrayList();
        this.f818c = new ArrayList();
    }

    public static void f(u.e eVar, View view) {
        WeakHashMap weakHashMap = z4.j0.f17198a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            eVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    f(eVar, childAt);
                }
            }
        }
    }

    public static final s j(ViewGroup viewGroup, i1 i1Var) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        kotlin.jvm.internal.m.e(i1Var, "fragmentManager");
        kotlin.jvm.internal.m.d(i1Var.I(), "fragmentManager.specialEffectsControllerFactory");
        Object tag = viewGroup.getTag(2131363022);
        if (tag instanceof s) {
            return (s) tag;
        }
        s sVar = new s(viewGroup);
        viewGroup.setTag(2131363022, sVar);
        return sVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z10;
        Iterator it = arrayList.iterator();
        loop0: while (true) {
            z10 = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                g2 g2Var = (g2) it.next();
                if (!g2Var.f743k.isEmpty()) {
                    ArrayList arrayList2 = g2Var.f743k;
                    if (arrayList2 != null && arrayList2.isEmpty()) {
                        break;
                    }
                    Iterator it2 = arrayList2.iterator();
                    do {
                        if (!it2.hasNext()) {
                            break;
                        }
                    } while (((f2) it2.next()).a());
                }
                z10 = false;
            }
        }
        if (z10) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                h00.v.u0(((g2) it3.next()).f743k, arrayList3);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(g2 g2Var) {
        kotlin.jvm.internal.m.e(g2Var, "operation");
        if (g2Var.f741i) {
            int i10 = g2Var.f733a;
            View viewRequireView = g2Var.f735c.requireView();
            kotlin.jvm.internal.m.d(viewRequireView, "operation.fragment.requireView()");
            a1.b.a(i10, viewRequireView, this.f816a);
            g2Var.f741i = false;
        }
    }

    public final void b(ArrayList arrayList, boolean z10) {
        Object next;
        Object objPrevious;
        ArrayList<f> arrayList2;
        int i10;
        boolean z11;
        g00.k kVar;
        ArrayList<f> arrayList3;
        ArrayList arrayList4;
        Iterator it;
        boolean zIsEmpty;
        boolean z12;
        g2 g2Var;
        j0 j0Var;
        g2 g2Var2;
        p0 p0VarB;
        j0 j0Var2;
        int i11 = 2;
        if (i1.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            g2 g2Var3 = (g2) next;
            View view = g2Var3.f735c.mView;
            kotlin.jvm.internal.m.d(view, "operation.fragment.mView");
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    if (g2Var3.f733a != 2) {
                        break;
                    }
                } else {
                    if (visibility != 4 && visibility != 8) {
                        throw new IllegalArgumentException(g4.c.f(visibility, "Unknown visibility "));
                    }
                }
            }
        }
        g2 g2Var4 = (g2) next;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            g2 g2Var5 = (g2) objPrevious;
            View view2 = g2Var5.f735c.mView;
            kotlin.jvm.internal.m.d(view2, "operation.fragment.mView");
            if (view2.getAlpha() != 0.0f || view2.getVisibility() != 0) {
                int visibility2 = view2.getVisibility();
                if (visibility2 == 0) {
                    continue;
                } else if (visibility2 != 4 && visibility2 != 8) {
                    throw new IllegalArgumentException(g4.c.f(visibility2, "Unknown visibility "));
                }
            }
            if (g2Var5.f733a == 2) {
                break;
            }
        }
        g2 g2Var6 = (g2) objPrevious;
        if (i1.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + g2Var4 + " to " + g2Var6);
        }
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        j0 j0Var3 = ((g2) h00.q.T0(arrayList)).f735c;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            g0 g0Var = ((g2) it3.next()).f735c.mAnimationInfo;
            g0 g0Var2 = j0Var3.mAnimationInfo;
            g0Var.f715b = g0Var2.f715b;
            g0Var.f716c = g0Var2.f716c;
            g0Var.f717d = g0Var2.f717d;
            g0Var.f718e = g0Var2.f718e;
        }
        Iterator it4 = arrayList.iterator();
        while (true) {
            boolean z13 = false;
            int i12 = 1;
            if (!it4.hasNext()) {
                break;
            }
            g2 g2Var7 = (g2) it4.next();
            arrayList5.add(new f(g2Var7, z10));
            if (z10) {
                if (g2Var7 == g2Var4) {
                    z13 = true;
                }
            } else if (g2Var7 == g2Var6) {
                z13 = true;
            }
            arrayList6.add(new q(g2Var7, z10, z13));
            g2Var7.f736d.add(new e2(this, g2Var7, i12));
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj : arrayList6) {
            if (!((q) obj).a()) {
                arrayList7.add(obj);
            }
        }
        ArrayList<q> arrayList8 = new ArrayList();
        for (Object obj2 : arrayList7) {
            if (((q) obj2).b() != null) {
                arrayList8.add(obj2);
            }
        }
        b2 b2Var = null;
        for (q qVar : arrayList8) {
            b2 b2VarB = qVar.b();
            if (b2Var != null && b2VarB != b2Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + qVar.f774a.f735c + " returned Transition " + qVar.f804b + " which uses a different Transition type than other Fragments.").toString());
            }
            b2Var = b2VarB;
        }
        if (b2Var != null) {
            ArrayList arrayList9 = new ArrayList();
            ArrayList arrayList10 = new ArrayList();
            u.e eVar = new u.e(0);
            ArrayList<String> arrayList11 = new ArrayList<>();
            ArrayList<String> arrayList12 = new ArrayList<>();
            u.e eVar2 = new u.e(0);
            ArrayList<String> arrayList13 = arrayList11;
            u.e eVar3 = new u.e(0);
            Iterator it5 = arrayList8.iterator();
            loop10: while (true) {
                Object obj3 = null;
                while (true) {
                    if (!it5.hasNext()) {
                        arrayList2 = arrayList5;
                        b2 b2Var2 = b2Var;
                        ArrayList arrayList14 = arrayList9;
                        ArrayList arrayList15 = arrayList10;
                        i10 = i11;
                        if (obj3 == null) {
                            if (!arrayList8.isEmpty()) {
                                Iterator it6 = arrayList8.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        if (((q) it6.next()).f804b == null) {
                                        }
                                    }
                                }
                            }
                            z11 = true;
                        }
                        ArrayList<String> arrayList16 = arrayList12;
                        z11 = true;
                        p pVar = new p(arrayList8, g2Var4, g2Var6, b2Var2, obj3, arrayList14, arrayList15, eVar, arrayList13, arrayList16, eVar2, eVar3, z10);
                        Iterator it7 = arrayList8.iterator();
                        while (it7.hasNext()) {
                            ((q) it7.next()).f774a.f742j.add(pVar);
                        }
                        break loop10;
                    }
                    int i13 = i11;
                    Object obj4 = ((q) it5.next()).f806d;
                    if (obj4 != null && g2Var4 != null) {
                        j0 j0Var4 = g2Var4.f735c;
                        if (g2Var6 != null) {
                            j0 j0Var5 = g2Var6.f735c;
                            Object objY = b2Var.y(b2Var.h(obj4));
                            ArrayList<String> sharedElementSourceNames = j0Var5.getSharedElementSourceNames();
                            arrayList5 = arrayList5;
                            kotlin.jvm.internal.m.d(sharedElementSourceNames, "lastIn.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementSourceNames2 = j0Var4.getSharedElementSourceNames();
                            b2Var = b2Var;
                            kotlin.jvm.internal.m.d(sharedElementSourceNames2, "firstOut.fragment.sharedElementSourceNames");
                            ArrayList<String> sharedElementTargetNames = j0Var4.getSharedElementTargetNames();
                            arrayList9 = arrayList9;
                            kotlin.jvm.internal.m.d(sharedElementTargetNames, "firstOut.fragment.sharedElementTargetNames");
                            int size = sharedElementTargetNames.size();
                            arrayList10 = arrayList10;
                            int i14 = 0;
                            while (i14 < size) {
                                int i15 = size;
                                int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i14));
                                if (iIndexOf != -1) {
                                    sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i14));
                                }
                                i14++;
                                size = i15;
                            }
                            ArrayList<String> sharedElementTargetNames2 = j0Var5.getSharedElementTargetNames();
                            kotlin.jvm.internal.m.d(sharedElementTargetNames2, "lastIn.fragment.sharedElementTargetNames");
                            if (z10) {
                                j0Var4.getEnterTransitionCallback();
                                j0Var5.getExitTransitionCallback();
                                kVar = new g00.k((Object) null, (Object) null);
                            } else {
                                j0Var4.getExitTransitionCallback();
                                j0Var5.getEnterTransitionCallback();
                                kVar = new g00.k((Object) null, (Object) null);
                            }
                            if (kVar.A != null) {
                                throw new ClassCastException();
                            }
                            if (kVar.B != null) {
                                throw new ClassCastException();
                            }
                            int i16 = 0;
                            for (int size2 = sharedElementSourceNames.size(); i16 < size2; size2 = size2) {
                                String str = sharedElementSourceNames.get(i16);
                                kotlin.jvm.internal.m.d(str, "exitingNames[i]");
                                String str2 = sharedElementTargetNames2.get(i16);
                                kotlin.jvm.internal.m.d(str2, "enteringNames[i]");
                                eVar.put(str, str2);
                                i16++;
                            }
                            if (i1.K(i13)) {
                                Log.v("FragmentManager", ">>> entering view names <<<");
                                Iterator<String> it8 = sharedElementTargetNames2.iterator();
                                while (it8.hasNext()) {
                                    Log.v("FragmentManager", "Name: " + it8.next());
                                }
                                Log.v("FragmentManager", ">>> exiting view names <<<");
                                Iterator<String> it9 = sharedElementSourceNames.iterator();
                                while (it9.hasNext()) {
                                    Log.v("FragmentManager", "Name: " + it9.next());
                                }
                            }
                            View view3 = j0Var4.mView;
                            kotlin.jvm.internal.m.d(view3, "firstOut.fragment.mView");
                            f(eVar2, view3);
                            eVar2.m(sharedElementSourceNames);
                            eVar.m(eVar2.keySet());
                            View view4 = j0Var5.mView;
                            kotlin.jvm.internal.m.d(view4, "lastIn.fragment.mView");
                            f(eVar3, view4);
                            eVar3.m(sharedElementTargetNames2);
                            eVar3.m(eVar.values());
                            z1 z1Var = u1.f846a;
                            for (int i17 = eVar.C - 1; -1 < i17; i17--) {
                                if (!eVar3.containsKey((String) eVar.j(i17))) {
                                    eVar.h(i17);
                                }
                            }
                            h00.v.w0(eVar2.entrySet(), new r(0, eVar.keySet()), false);
                            h00.v.w0(eVar3.entrySet(), new r(0, eVar.values()), false);
                            if (eVar.isEmpty()) {
                                Log.i("FragmentManager", "Ignoring shared elements transition " + objY + " between " + g2Var4 + " and " + g2Var6 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                arrayList9.clear();
                                arrayList10.clear();
                                arrayList13 = sharedElementTargetNames2;
                                arrayList12 = sharedElementSourceNames;
                                i11 = i13;
                                arrayList5 = arrayList5;
                                b2Var = b2Var;
                                arrayList9 = arrayList9;
                                arrayList10 = arrayList10;
                            } else {
                                arrayList13 = sharedElementTargetNames2;
                                arrayList12 = sharedElementSourceNames;
                                obj3 = objY;
                            }
                        }
                        i11 = i13;
                        arrayList5 = arrayList5;
                        b2Var = b2Var;
                        arrayList9 = arrayList9;
                        arrayList10 = arrayList10;
                    }
                    i11 = i13;
                    arrayList5 = arrayList5;
                    b2Var = b2Var;
                    arrayList9 = arrayList9;
                    arrayList10 = arrayList10;
                }
            }
            arrayList3 = new ArrayList();
            arrayList4 = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
                h00.v.u0(((f) it.next()).f774a.f743k, arrayList4);
            }
            zIsEmpty = arrayList4.isEmpty();
            z12 = false;
            for (f fVar : arrayList2) {
                Context context = this.f816a.getContext();
                g2Var2 = fVar.f774a;
                kotlin.jvm.internal.m.d(context, "context");
                p0VarB = fVar.b(context);
                if (p0VarB != null) {
                    if (((AnimatorSet) p0VarB.f803b) == null) {
                        arrayList3.add(fVar);
                    } else {
                        j0Var2 = g2Var2.f735c;
                        if (!g2Var2.f743k.isEmpty()) {
                            if (g2Var2.f733a == 3) {
                                g2Var2.f741i = false;
                            }
                            g2Var2.f742j.add(new h(fVar));
                            z12 = z11;
                        } else if (i1.K(i10)) {
                            Log.v("FragmentManager", "Ignoring Animator set on " + j0Var2 + " as this Fragment was involved in a Transition.");
                        }
                    }
                }
            }
            for (f fVar2 : arrayList3) {
                g2Var = fVar2.f774a;
                j0Var = g2Var.f735c;
                if (zIsEmpty) {
                    if (z12) {
                        g2Var.f742j.add(new e(fVar2));
                    } else if (i1.K(i10)) {
                        Log.v(r2, "Ignoring Animation set on " + j0Var + " as Animations cannot run alongside Animators.");
                    }
                } else if (i1.K(i10)) {
                    Log.v(r2, "Ignoring Animation set on " + j0Var + " as Animations cannot run alongside Transitions.");
                }
            }
        }
        arrayList2 = arrayList5;
        z11 = true;
        i10 = 2;
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        it = arrayList2.iterator();
        while (it.hasNext()) {
            h00.v.u0(((f) it.next()).f774a.f743k, arrayList4);
        }
        zIsEmpty = arrayList4.isEmpty();
        z12 = false;
        while (r3.hasNext()) {
            Context context2 = this.f816a.getContext();
            g2Var2 = fVar.f774a;
            kotlin.jvm.internal.m.d(context2, "context");
            p0VarB = fVar.b(context2);
            if (p0VarB != null) {
                if (((AnimatorSet) p0VarB.f803b) == null) {
                    arrayList3.add(fVar);
                } else {
                    j0Var2 = g2Var2.f735c;
                    if (!g2Var2.f743k.isEmpty()) {
                        if (g2Var2.f733a == 3) {
                            g2Var2.f741i = false;
                        }
                        g2Var2.f742j.add(new h(fVar));
                        z12 = z11;
                    } else if (i1.K(i10)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + j0Var2 + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        while (r0.hasNext()) {
            g2Var = fVar2.f774a;
            j0Var = g2Var.f735c;
            if (zIsEmpty) {
                if (i1.K(i10)) {
                    Log.v(r2, "Ignoring Animation set on " + j0Var + " as Animations cannot run alongside Transitions.");
                }
            } else if (z12) {
                g2Var.f742j.add(new e(fVar2));
            } else if (i1.K(i10)) {
                Log.v(r2, "Ignoring Animation set on " + j0Var + " as Animations cannot run alongside Animators.");
            }
        }
    }

    public final void c(List list) {
        kotlin.jvm.internal.m.e(list, "operations");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h00.v.u0(((g2) it.next()).f743k, arrayList);
        }
        List listN1 = h00.q.n1(h00.q.r1(arrayList));
        int size = listN1.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((f2) listN1.get(i10)).c(this.f816a);
        }
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            a((g2) list.get(i11));
        }
        List listN2 = h00.q.n1(list);
        int size3 = listN2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            g2 g2Var = (g2) listN2.get(i12);
            if (g2Var.f743k.isEmpty()) {
                g2Var.b();
            }
        }
    }

    public final void d(int i10, int i11, q1 q1Var) {
        synchronized (this.f817b) {
            try {
                j0 j0Var = q1Var.f809c;
                kotlin.jvm.internal.m.d(j0Var, "fragmentStateManager.fragment");
                g2 g2VarG = g(j0Var);
                if (g2VarG == null) {
                    j0 j0Var2 = q1Var.f809c;
                    g2VarG = (j0Var2.mTransitioning || j0Var2.mRemoving) ? h(j0Var2) : null;
                }
                if (g2VarG != null) {
                    g2VarG.d(i10, i11);
                    return;
                }
                g2 g2Var = new g2(i10, i11, q1Var);
                this.f817b.add(g2Var);
                g2Var.f736d.add(new e2(this, g2Var, 0));
                g2Var.f736d.add(new e2(this, g2Var, 2));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e() {
        boolean z10;
        if (this.f821f) {
            return;
        }
        if (!this.f816a.isAttachedToWindow()) {
            i();
            this.f820e = false;
            return;
        }
        synchronized (this.f817b) {
            try {
                ArrayList<g2> arrayListO1 = h00.q.o1(this.f818c);
                this.f818c.clear();
                Iterator it = arrayListO1.iterator();
                while (true) {
                    z10 = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    g2 g2Var = (g2) it.next();
                    if (this.f817b.isEmpty() || !g2Var.f735c.mTransitioning) {
                        z10 = false;
                    }
                    g2Var.f739g = z10;
                }
                for (g2 g2Var2 : arrayListO1) {
                    if (this.f819d) {
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + g2Var2);
                        }
                        g2Var2.b();
                    } else {
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + g2Var2);
                        }
                        g2Var2.a(this.f816a);
                    }
                    this.f819d = false;
                    if (!g2Var2.f738f) {
                        this.f818c.add(g2Var2);
                    }
                }
                if (!this.f817b.isEmpty()) {
                    n();
                    ArrayList arrayListO2 = h00.q.o1(this.f817b);
                    if (arrayListO2.isEmpty()) {
                        return;
                    }
                    this.f817b.clear();
                    this.f818c.addAll(arrayListO2);
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(arrayListO2, this.f820e);
                    boolean zK = k(arrayListO2);
                    Iterator it2 = arrayListO2.iterator();
                    boolean z11 = true;
                    while (it2.hasNext()) {
                        if (!((g2) it2.next()).f735c.mTransitioning) {
                            z11 = false;
                        }
                    }
                    if (!z11 || zK) {
                        z10 = false;
                    }
                    this.f819d = z10;
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + zK + " \ntransition = " + z11);
                    }
                    if (!z11) {
                        m(arrayListO2);
                        c(arrayListO2);
                    } else if (zK) {
                        m(arrayListO2);
                        int size = arrayListO2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            a((g2) arrayListO2.get(i10));
                        }
                    }
                    this.f820e = false;
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final g2 g(j0 j0Var) {
        Object next;
        Iterator it = this.f817b.iterator();
        while (it.hasNext()) {
            next = it.next();
            g2 g2Var = (g2) next;
            if (kotlin.jvm.internal.m.a(g2Var.f735c, j0Var) && !g2Var.f737e) {
                return (g2) next;
            }
        }
        next = null;
        return (g2) next;
    }

    public final g2 h(j0 j0Var) {
        Object next;
        Iterator it = this.f818c.iterator();
        while (it.hasNext()) {
            next = it.next();
            g2 g2Var = (g2) next;
            if (kotlin.jvm.internal.m.a(g2Var.f735c, j0Var) && !g2Var.f737e) {
                return (g2) next;
            }
        }
        next = null;
        return (g2) next;
    }

    public final void i() {
        if (i1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean zIsAttachedToWindow = this.f816a.isAttachedToWindow();
        synchronized (this.f817b) {
            try {
                n();
                m(this.f817b);
                ArrayList<g2> arrayListO1 = h00.q.o1(this.f818c);
                Iterator it = arrayListO1.iterator();
                while (it.hasNext()) {
                    ((g2) it.next()).f739g = false;
                }
                for (g2 g2Var : arrayListO1) {
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? RuntimeVersion.SUFFIX : "Container " + this.f816a + " is not attached to window. ") + "Cancelling running operation " + g2Var);
                    }
                    g2Var.a(this.f816a);
                }
                ArrayList<g2> arrayListO2 = h00.q.o1(this.f817b);
                Iterator it2 = arrayListO2.iterator();
                while (it2.hasNext()) {
                    ((g2) it2.next()).f739g = false;
                }
                for (g2 g2Var2 : arrayListO2) {
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: " + (zIsAttachedToWindow ? RuntimeVersion.SUFFIX : "Container " + this.f816a + " is not attached to window. ") + "Cancelling pending operation " + g2Var2);
                    }
                    g2Var2.a(this.f816a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        Object objPrevious;
        synchronized (this.f817b) {
            try {
                n();
                ArrayList arrayList = this.f817b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                    g2 g2Var = (g2) objPrevious;
                    View view = g2Var.f735c.mView;
                    kotlin.jvm.internal.m.d(view, "operation.fragment.mView");
                    char c10 = 4;
                    if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                        int visibility = view.getVisibility();
                        if (visibility == 0) {
                            c10 = 2;
                        } else if (visibility != 4) {
                            if (visibility != 8) {
                                throw new IllegalArgumentException("Unknown visibility " + visibility);
                            }
                            c10 = 3;
                        }
                    }
                    if (g2Var.f733a == 2 && c10 != 2) {
                        break;
                    }
                }
                g2 g2Var2 = (g2) objPrevious;
                j0 j0Var = g2Var2 != null ? g2Var2.f735c : null;
                this.f821f = j0Var != null ? j0Var.isPostponed() : false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            g2 g2Var = (g2) list.get(i10);
            q1 q1Var = g2Var.l;
            if (!g2Var.f740h) {
                g2Var.f740h = true;
                int i11 = g2Var.f734b;
                if (i11 == 2) {
                    j0 j0Var = q1Var.f809c;
                    kotlin.jvm.internal.m.d(j0Var, "fragmentStateManager.fragment");
                    View viewFindFocus = j0Var.mView.findFocus();
                    if (viewFindFocus != null) {
                        j0Var.setFocusedView(viewFindFocus);
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + j0Var);
                        }
                    }
                    View viewRequireView = g2Var.f735c.requireView();
                    kotlin.jvm.internal.m.d(viewRequireView, "this.fragment.requireView()");
                    if (viewRequireView.getParent() == null) {
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + j0Var + " view " + viewRequireView + " to container in onStart");
                        }
                        q1Var.b();
                        viewRequireView.setAlpha(0.0f);
                    }
                    if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                        if (i1.K(2)) {
                            Log.v("FragmentManager", "Making view " + viewRequireView + " INVISIBLE in onStart");
                        }
                        viewRequireView.setVisibility(4);
                    }
                    viewRequireView.setAlpha(j0Var.getPostOnViewCreatedAlpha());
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + j0Var.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (i11 == 3) {
                    j0 j0Var2 = q1Var.f809c;
                    kotlin.jvm.internal.m.d(j0Var2, "fragmentStateManager.fragment");
                    View viewRequireView2 = j0Var2.requireView();
                    kotlin.jvm.internal.m.d(viewRequireView2, "fragment.requireView()");
                    if (i1.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + viewRequireView2.findFocus() + " on view " + viewRequireView2 + " for Fragment " + j0Var2);
                    }
                    viewRequireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h00.v.u0(((g2) it.next()).f743k, arrayList);
        }
        List listN1 = h00.q.n1(h00.q.r1(arrayList));
        int size2 = listN1.size();
        for (int i12 = 0; i12 < size2; i12++) {
            f2 f2Var = (f2) listN1.get(i12);
            f2Var.getClass();
            ViewGroup viewGroup = this.f816a;
            kotlin.jvm.internal.m.e(viewGroup, "container");
            if (!f2Var.f707a) {
                f2Var.e(viewGroup);
            }
            f2Var.f707a = true;
        }
    }

    public final void n() {
        for (g2 g2Var : this.f817b) {
            int i10 = 2;
            if (g2Var.f734b == 2) {
                View viewRequireView = g2Var.f735c.requireView();
                kotlin.jvm.internal.m.d(viewRequireView, "fragment.requireView()");
                int visibility = viewRequireView.getVisibility();
                if (visibility != 0) {
                    i10 = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(g4.c.f(visibility, "Unknown visibility "));
                        }
                        i10 = 3;
                    }
                }
                g2Var.d(i10, 1);
            }
        }
    }
}
