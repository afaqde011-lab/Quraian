package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class f extends p2 {
    public final Map A;
    public final p B;

    public f(p pVar, Map map) {
        this.B = pVar;
        map.getClass();
        this.A = map;
    }

    @Override
    public final void clear() {
        Iterator it = iterator();
        while (true) {
            d dVar = (d) it;
            if (!dVar.hasNext()) {
                return;
            }
            dVar.next();
            dVar.remove();
        }
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.containsKey(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.A.keySet().containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.A.keySet().equals(obj);
    }

    @Override
    public final int hashCode() {
        return this.A.keySet().hashCode();
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return new d(this, this.A.entrySet().iterator());
    }

    @Override
    public final boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.A.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            this.B.F -= size;
        } else {
            size = 0;
        }
        return size > 0;
    }

    @Override
    public final int size() {
        return this.A.size();
    }
}
