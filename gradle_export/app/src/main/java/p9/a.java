package p9;

import h00.q;
import h00.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import l1.y;
import l1.z0;

public final class a implements y {

    public final Object f12452a;

    public final Set f12453b;

    public final Set f12454c;

    public final z0 f12455d;

    public final z0 f12456e;

    public a(Object obj, Set set, Set set2, z0 z0Var, z0 z0Var2) {
        this.f12452a = obj;
        this.f12453b = set;
        this.f12454c = set2;
        this.f12455d = z0Var;
        this.f12456e = z0Var2;
    }

    @Override
    public final void dispose() {
        ArrayList arrayList;
        List list = (List) this.f12455d.getValue();
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(((e) list.get(i10)).f12468b);
            }
        } else {
            arrayList = new ArrayList(r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((e) it.next()).f12468b);
            }
        }
        Object obj = this.f12452a;
        if (!(arrayList.contains(obj) ? false : this.f12453b.remove(obj)) || this.f12454c.contains(obj)) {
            return;
        }
        List list2 = (List) this.f12456e.getValue();
        if (!(list2 instanceof RandomAccess)) {
            Iterator it2 = q.b1(list2).iterator();
            while (it2.hasNext()) {
                ((f) it2.next()).f12471a.invoke(obj);
            }
            return;
        }
        int size2 = list2.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i11 = size2 - 1;
            ((f) list2.get(size2)).f12471a.invoke(obj);
            if (i11 < 0) {
                return;
            } else {
                size2 = i11;
            }
        }
    }
}
