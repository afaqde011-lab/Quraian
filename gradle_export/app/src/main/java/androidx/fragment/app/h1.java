package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

public final class h1 implements f1 {

    public final i1 f746a;

    public h1(i1 i1Var) {
        this.f746a = i1Var;
    }

    @Override
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        i1 i1Var = this.f746a;
        ArrayList arrayList3 = i1Var.f760n;
        if (i1.K(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + i1Var.f749a);
        }
        boolean zT = false;
        if (i1Var.f752d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
        } else {
            a aVar = (a) g4.c.d(1, i1Var.f752d);
            i1Var.f756h = aVar;
            Iterator it = aVar.f832a.iterator();
            while (it.hasNext()) {
                j0 j0Var = ((s1) it.next()).f824b;
                if (j0Var != null) {
                    j0Var.mTransitioning = true;
                }
            }
            zT = i1Var.T(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(i1.F((a) it2.next()));
            }
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw null;
                }
            }
        }
        return zT;
    }
}
