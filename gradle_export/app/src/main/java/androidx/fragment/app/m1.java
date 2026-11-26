package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class m1 extends androidx.lifecycle.a1 {

    public static final l1 f781i = new l1(0);

    public final boolean f785f;

    public final HashMap f782c = new HashMap();

    public final HashMap f783d = new HashMap();

    public final HashMap f784e = new HashMap();

    public boolean f786g = false;

    public boolean f787h = false;

    public m1(boolean z10) {
        this.f785f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m1.class == obj.getClass()) {
            m1 m1Var = (m1) obj;
            if (this.f782c.equals(m1Var.f782c) && this.f783d.equals(m1Var.f783d) && this.f784e.equals(m1Var.f784e)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g() {
        if (i1.K(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f786g = true;
    }

    public final void h(j0 j0Var) {
        if (this.f787h) {
            if (i1.K(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
                return;
            }
            return;
        }
        String str = j0Var.mWho;
        HashMap map = this.f782c;
        if (map.containsKey(str)) {
            return;
        }
        map.put(j0Var.mWho, j0Var);
        if (i1.K(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Added " + j0Var);
        }
    }

    public final int hashCode() {
        return this.f784e.hashCode() + ((this.f783d.hashCode() + (this.f782c.hashCode() * 31)) * 31);
    }

    public final void i(j0 j0Var, boolean z10) {
        if (i1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + j0Var);
        }
        k(j0Var.mWho, z10);
    }

    public final void j(String str, boolean z10) {
        if (i1.K(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        k(str, z10);
    }

    public final void k(String str, boolean z10) {
        HashMap map = this.f783d;
        m1 m1Var = (m1) map.get(str);
        if (m1Var != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1Var.f783d.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m1Var.j((String) it.next(), true);
                }
            }
            m1Var.g();
            map.remove(str);
        }
        HashMap map2 = this.f784e;
        androidx.lifecycle.e1 e1Var = (androidx.lifecycle.e1) map2.get(str);
        if (e1Var != null) {
            e1Var.a();
            map2.remove(str);
        }
    }

    public final void l(j0 j0Var) {
        if (this.f787h) {
            if (i1.K(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f782c.remove(j0Var.mWho) == null || !i1.K(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + j0Var);
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f782c.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f783d.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f784e.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
