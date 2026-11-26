package ta;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

public final class a0 {

    public final View f14426b;

    public final HashMap f14425a = new HashMap();

    public final ArrayList f14427c = new ArrayList();

    public a0(View view) {
        this.f14426b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f14426b == a0Var.f14426b && this.f14425a.equals(a0Var.f14425a);
    }

    public final int hashCode() {
        return this.f14425a.hashCode() + (this.f14426b.hashCode() * 31);
    }

    public final String toString() {
        String strJ = w.c.j(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f14426b + "\n", "    values:");
        HashMap map = this.f14425a;
        for (String str : map.keySet()) {
            strJ = strJ + "    " + str + ": " + map.get(str) + "\n";
        }
        return strJ;
    }
}
