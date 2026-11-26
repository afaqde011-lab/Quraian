package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

public final class g2 {

    public int f733a;

    public int f734b;

    public final j0 f735c;

    public final ArrayList f736d;

    public boolean f737e;

    public boolean f738f;

    public boolean f739g;

    public boolean f740h;

    public boolean f741i;

    public final ArrayList f742j;

    public final ArrayList f743k;
    public final q1 l;

    public g2(int i10, int i11, q1 q1Var) {
        g4.c.q(i10, "finalState");
        g4.c.q(i11, "lifecycleImpact");
        j0 j0Var = q1Var.f809c;
        kotlin.jvm.internal.m.d(j0Var, "fragmentStateManager.fragment");
        g4.c.q(i10, "finalState");
        g4.c.q(i11, "lifecycleImpact");
        kotlin.jvm.internal.m.e(j0Var, "fragment");
        this.f733a = i10;
        this.f734b = i11;
        this.f735c = j0Var;
        this.f736d = new ArrayList();
        this.f741i = true;
        ArrayList arrayList = new ArrayList();
        this.f742j = arrayList;
        this.f743k = arrayList;
        this.l = q1Var;
    }

    public final void a(ViewGroup viewGroup) {
        kotlin.jvm.internal.m.e(viewGroup, "container");
        this.f740h = false;
        if (this.f737e) {
            return;
        }
        this.f737e = true;
        if (this.f742j.isEmpty()) {
            b();
            return;
        }
        for (f2 f2Var : h00.q.n1(this.f743k)) {
            f2Var.getClass();
            if (!f2Var.f708b) {
                f2Var.b(viewGroup);
            }
            f2Var.f708b = true;
        }
    }

    public final void b() {
        this.f740h = false;
        if (!this.f738f) {
            if (i1.K(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f738f = true;
            Iterator it = this.f736d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f735c.mTransitioning = false;
        this.l.k();
    }

    public final void c(f2 f2Var) {
        kotlin.jvm.internal.m.e(f2Var, "effect");
        ArrayList arrayList = this.f742j;
        if (arrayList.remove(f2Var) && arrayList.isEmpty()) {
            b();
        }
    }

    public final void d(int i10, int i11) {
        g4.c.q(i10, "finalState");
        g4.c.q(i11, "lifecycleImpact");
        int iB = e4.f.b(i11);
        j0 j0Var = this.f735c;
        if (iB == 0) {
            if (this.f733a != 1) {
                if (i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = " + a1.b.E(this.f733a) + " -> " + a1.b.E(i10) + '.');
                }
                this.f733a = i10;
                return;
            }
            return;
        }
        if (iB == 1) {
            if (this.f733a == 1) {
                if (i1.K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a1.b.D(this.f734b) + " to ADDING.");
                }
                this.f733a = 2;
                this.f734b = 2;
                this.f741i = true;
                return;
            }
            return;
        }
        if (iB != 2) {
            return;
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + j0Var + " mFinalState = " + a1.b.E(this.f733a) + " -> REMOVED. mLifecycleImpact  = " + a1.b.D(this.f734b) + " to REMOVING.");
        }
        this.f733a = 1;
        this.f734b = 3;
        this.f741i = true;
    }

    public final String toString() {
        StringBuilder sbN = g4.c.n("Operation {", Integer.toHexString(System.identityHashCode(this)), "} {finalState = ");
        sbN.append(a1.b.E(this.f733a));
        sbN.append(" lifecycleImpact = ");
        sbN.append(a1.b.D(this.f734b));
        sbN.append(" fragment = ");
        sbN.append(this.f735c);
        sbN.append('}');
        return sbN.toString();
    }
}
