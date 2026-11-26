package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class y implements Runnable {
    public final int A;
    public final Object B;

    public y(Object obj, int i10) {
        this.A = i10;
        this.B = obj;
    }

    @Override
    public final void run() {
        int i10 = this.A;
        Object obj = this.B;
        switch (i10) {
            case 0:
                j0 j0Var = (j0) obj;
                c2 c2Var = j0Var.mViewLifecycleOwner;
                c2Var.E.a(j0Var.mSavedViewRegistryState);
                j0Var.mSavedViewRegistryState = null;
                return;
            case 1:
                kotlin.jvm.internal.z zVar = (kotlin.jvm.internal.z) obj;
                kotlin.jvm.internal.m.e(zVar, "$seekCancelLambda");
                u00.a aVar = (u00.a) zVar.A;
                if (aVar != null) {
                    aVar.invoke();
                    return;
                }
                return;
            case 2:
                u1.a(4, (ArrayList) obj);
                return;
            case 3:
                p pVar = (p) obj;
                if (i1.K(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = pVar.f788c.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).f774a.c(pVar);
                }
                return;
            default:
                Iterator it2 = ((i1) obj).f760n.iterator();
                if (it2.hasNext()) {
                    throw a1.b.j(it2);
                }
                return;
        }
    }
}
