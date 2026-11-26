package s9;

import h00.x;
import java.util.List;

public final class f {

    public final List f13921a;

    public final int f13922b;

    public f() {
        this(-1, x.A);
    }

    public f(int i10, List list) {
        this.f13921a = list;
        this.f13922b = i10;
        if (list.isEmpty() && i10 == -1) {
            return;
        }
        if (!list.isEmpty()) {
            int size = list.size();
            if (i10 >= 0 && i10 < size) {
                return;
            }
        }
        StringBuilder sbQ = oi.k.q("Invalid 'NavigationEventHistory' state:  'currentIndex' must be within the bounds of 'mergedHistory' (or -1 if empty). Received: currentIndex = '", i10, "', bounds = '");
        sbQ.append(va.a.L(list));
        sbQ.append("'.");
        throw new IllegalArgumentException(sbQ.toString().toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f13922b == fVar.f13922b && kotlin.jvm.internal.m.a(this.f13921a, fVar.f13921a);
    }

    public final int hashCode() {
        return this.f13921a.hashCode() + (this.f13922b * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavigationEventHistory(currentIndex=");
        sb2.append(this.f13922b);
        sb2.append(", mergedHistory=");
        return oi.k.n(sb2, this.f13921a, ')');
    }
}
