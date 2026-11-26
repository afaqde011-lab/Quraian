package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class z0 extends d.z {

    public final i1 f863d;

    public z0(i1 i1Var) {
        super(false);
        this.f863d = i1Var;
    }

    @Override
    public final void a() {
        boolean zK = i1.K(3);
        i1 i1Var = this.f863d;
        if (zK) {
            Log.d("FragmentManager", "handleOnBackCancelled. PREDICTIVE_BACK = true fragment manager " + i1Var);
        }
        if (i1.K(3)) {
            Log.d("FragmentManager", "cancelBackStackTransition for transition " + i1Var.f756h);
        }
        a aVar = i1Var.f756h;
        if (aVar != null) {
            aVar.f687r = false;
            aVar.e();
            a aVar2 = i1Var.f756h;
            y yVar = new y(i1Var, 4);
            if (aVar2.f845p == null) {
                aVar2.f845p = new ArrayList();
            }
            aVar2.f845p.add(yVar);
            i1Var.f756h.f(false, true);
            i1Var.f757i = true;
            i1Var.z(true);
            i1Var.E();
            i1Var.f757i = false;
            i1Var.f756h = null;
        }
    }

    @Override
    public final void b() {
        boolean zK = i1.K(3);
        i1 i1Var = this.f863d;
        if (zK) {
            Log.d("FragmentManager", "handleOnBackPressed. PREDICTIVE_BACK = true fragment manager " + i1Var);
        }
        z0 z0Var = i1Var.f758j;
        ArrayList arrayList = i1Var.f760n;
        i1Var.f757i = true;
        i1Var.z(true);
        i1Var.f757i = false;
        if (i1Var.f756h == null) {
            if (z0Var.f4400b) {
                if (i1.K(3)) {
                    Log.d("FragmentManager", "Calling popBackStackImmediate via onBackPressed callback");
                }
                i1Var.R();
                return;
            } else {
                if (i1.K(3)) {
                    Log.d("FragmentManager", "Calling onBackPressed via onBackPressed callback");
                }
                i1Var.f755g.b().a();
                return;
            }
        }
        if (!arrayList.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(i1.F(i1Var.f756h));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it2 = linkedHashSet.iterator();
                if (it2.hasNext()) {
                    throw null;
                }
            }
        }
        Iterator it3 = i1Var.f756h.f832a.iterator();
        while (it3.hasNext()) {
            j0 j0Var = ((s1) it3.next()).f824b;
            if (j0Var != null) {
                j0Var.mTransitioning = false;
            }
        }
        for (s sVar : i1Var.f(new ArrayList(Collections.singletonList(i1Var.f756h)), 0, 1)) {
            ArrayList arrayList2 = sVar.f818c;
            if (i1.K(3)) {
                Log.d("FragmentManager", "SpecialEffectsController: Completing Back ");
            }
            sVar.m(arrayList2);
            sVar.c(arrayList2);
        }
        Iterator it4 = i1Var.f756h.f832a.iterator();
        while (it4.hasNext()) {
            j0 j0Var2 = ((s1) it4.next()).f824b;
            if (j0Var2 != null && j0Var2.mContainer == null) {
                i1Var.g(j0Var2).k();
            }
        }
        i1Var.f756h = null;
        i1Var.f0();
        if (i1.K(3)) {
            Log.d("FragmentManager", "Op is being set to null");
            Log.d("FragmentManager", "OnBackPressedCallback enabled=" + z0Var.f4400b + " for  FragmentManager " + i1Var);
        }
    }

    @Override
    public final void c(d.b bVar) {
        boolean zK = i1.K(2);
        i1 i1Var = this.f863d;
        if (zK) {
            Log.v("FragmentManager", "handleOnBackProgressed. PREDICTIVE_BACK = true fragment manager " + i1Var);
        }
        if (i1Var.f756h != null) {
            for (s sVar : i1Var.f(new ArrayList(Collections.singletonList(i1Var.f756h)), 0, 1)) {
                sVar.getClass();
                if (i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Processing Progress " + bVar.f4377c);
                }
                ArrayList arrayList = sVar.f818c;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    h00.v.u0(((g2) it.next()).f743k, arrayList2);
                }
                List listN1 = h00.q.n1(h00.q.r1(arrayList2));
                int size = listN1.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((f2) listN1.get(i10)).d(bVar, sVar.f816a);
                }
            }
            Iterator it2 = i1Var.f760n.iterator();
            if (it2.hasNext()) {
                throw a1.b.j(it2);
            }
        }
    }

    @Override
    public final void d(d.b bVar) {
        boolean zK = i1.K(3);
        i1 i1Var = this.f863d;
        if (zK) {
            Log.d("FragmentManager", "handleOnBackStarted. PREDICTIVE_BACK = true fragment manager " + i1Var);
        }
        i1Var.w();
        i1Var.x(new h1(i1Var), false);
    }
}
