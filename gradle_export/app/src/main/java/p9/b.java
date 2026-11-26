package p9;

import h00.q;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import l1.y;
import l1.z0;

public final class b implements y {

    public final Set f12457a;

    public final Object f12458b;

    public final Set f12459c;

    public final z0 f12460d;

    public b(Set set, Object obj, Set set2, z0 z0Var) {
        this.f12457a = set;
        this.f12458b = obj;
        this.f12459c = set2;
        this.f12460d = z0Var;
    }

    @Override
    public final void dispose() {
        Set set = this.f12457a;
        Object obj = this.f12458b;
        boolean zRemove = set.remove(obj);
        if (this.f12459c.contains(obj) || !zRemove) {
            return;
        }
        List list = (List) this.f12460d.getValue();
        if (!(list instanceof RandomAccess)) {
            Iterator it = q.b1(list).iterator();
            while (it.hasNext()) {
                ((f) it.next()).f12471a.invoke(obj);
            }
            return;
        }
        int size = list.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i10 = size - 1;
            ((f) list.get(size)).f12471a.invoke(obj);
            if (i10 < 0) {
                return;
            } else {
                size = i10;
            }
        }
    }
}
