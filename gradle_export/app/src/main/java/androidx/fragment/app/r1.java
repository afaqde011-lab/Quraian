package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class r1 {

    public final ArrayList f812a = new ArrayList();

    public final HashMap f813b = new HashMap();

    public final HashMap f814c = new HashMap();

    public m1 f815d;

    public final void a(j0 j0Var) {
        if (this.f812a.contains(j0Var)) {
            throw new IllegalStateException("Fragment already added: " + j0Var);
        }
        synchronized (this.f812a) {
            this.f812a.add(j0Var);
        }
        j0Var.mAdded = true;
    }

    public final j0 b(String str) {
        q1 q1Var = (q1) this.f813b.get(str);
        if (q1Var != null) {
            return q1Var.f809c;
        }
        return null;
    }

    public final j0 c(String str) {
        j0 j0VarFindFragmentByWho;
        for (q1 q1Var : this.f813b.values()) {
            if (q1Var != null && (j0VarFindFragmentByWho = q1Var.f809c.findFragmentByWho(str)) != null) {
                return j0VarFindFragmentByWho;
            }
        }
        return null;
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (q1 q1Var : this.f813b.values()) {
            if (q1Var != null) {
                arrayList.add(q1Var);
            }
        }
        return arrayList;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        for (q1 q1Var : this.f813b.values()) {
            if (q1Var != null) {
                arrayList.add(q1Var.f809c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public final List f() {
        ArrayList arrayList;
        if (this.f812a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f812a) {
            arrayList = new ArrayList(this.f812a);
        }
        return arrayList;
    }

    public final void g(q1 q1Var) {
        j0 j0Var = q1Var.f809c;
        String str = j0Var.mWho;
        HashMap map = this.f813b;
        if (map.get(str) != null) {
            return;
        }
        map.put(j0Var.mWho, q1Var);
        if (j0Var.mRetainInstanceChangedWhileDetached) {
            if (j0Var.mRetainInstance) {
                this.f815d.h(j0Var);
            } else {
                this.f815d.l(j0Var);
            }
            j0Var.mRetainInstanceChangedWhileDetached = false;
        }
        if (i1.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + j0Var);
        }
    }

    public final void h(q1 q1Var) {
        j0 j0Var = q1Var.f809c;
        if (j0Var.mRetainInstance) {
            this.f815d.l(j0Var);
        }
        String str = j0Var.mWho;
        HashMap map = this.f813b;
        if (map.get(str) == q1Var && ((q1) map.put(j0Var.mWho, null)) != null && i1.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + j0Var);
        }
    }

    public final Bundle i(String str, Bundle bundle) {
        HashMap map = this.f814c;
        return bundle != null ? (Bundle) map.put(str, bundle) : (Bundle) map.remove(str);
    }
}
