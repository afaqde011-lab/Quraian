package o9;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class u {

    public static final u f11876c = new u(new Bundle(), null);

    public final Bundle f11877a;

    public List f11878b;

    public u(Bundle bundle, ArrayList arrayList) {
        this.f11877a = bundle;
        this.f11878b = arrayList;
    }

    public static u b(Bundle bundle) {
        if (bundle != null) {
            return new u(bundle, null);
        }
        return null;
    }

    public final void a() {
        if (this.f11878b == null) {
            ArrayList<String> stringArrayList = this.f11877a.getStringArrayList("controlCategories");
            this.f11878b = stringArrayList;
            if (stringArrayList == null || stringArrayList.isEmpty()) {
                this.f11878b = Collections.EMPTY_LIST;
            }
        }
    }

    public final ArrayList c() {
        a();
        return new ArrayList(this.f11878b);
    }

    public final boolean d() {
        a();
        return this.f11878b.isEmpty();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        a();
        uVar.a();
        return this.f11878b.equals(uVar.f11878b);
    }

    public final int hashCode() {
        a();
        return this.f11878b.hashCode();
    }

    public final String toString() {
        return "MediaRouteSelector{ controlCategories=" + Arrays.toString(c().toArray()) + " }";
    }
}
