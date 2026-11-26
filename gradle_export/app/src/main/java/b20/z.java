package b20;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class z {
    public final int a = 2;
    public List b;
    public boolean c;

    public z() {
    }

    public z(ArrayList arrayList, boolean z) {
        if (arrayList.isEmpty()) {
            this.b = Collections.EMPTY_LIST;
        } else {
            this.b = Collections.unmodifiableList(new ArrayList(arrayList));
        }
        this.c = z;
    }

    public z(List list, boolean z) {
        this.b = list;
        this.c = z;
    }

    public static z a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("routes");
        if (parcelableArrayList != null) {
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                arrayList.add(bundle2 != null ? new o9.m(bundle2) : null);
            }
        }
        return new z(arrayList, bundle.getBoolean("supportsDynamicGroupRoute", false));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("MediaRouteProviderDescriptor{ routes=");
                List list = this.b;
                sb.append(Arrays.toString(list.toArray()));
                sb.append(", isValid=");
                int size = list.size();
                boolean z = false;
                for (int i = 0; i < size; i++) {
                    o9.m mVar = (o9.m) list.get(i);
                    if (mVar == null || !mVar.e()) {
                        return g4.c.l(sb, z, " }");
                    }
                }
                z = true;
                return g4.c.l(sb, z, " }");
            default:
                return super.toString();
        }
    }
}
