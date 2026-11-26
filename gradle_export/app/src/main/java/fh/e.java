package fh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class e extends AbstractMap {
    public transient c A;
    public transient r B;
    public final transient Map C;
    public final p D;

    public e(p pVar, Map map) {
        this.D = pVar;
        this.C = map;
    }

    public final p0 a(Map.Entry entry) {
        Object key = entry.getKey();
        return new p0(key, this.D.k(key, (Collection) entry.getValue()));
    }

    @Override
    public final void clear() {
        p pVar = this.D;
        if (this.C == pVar.E) {
            pVar.clear();
            return;
        }
        d dVar = new d(this);
        while (dVar.hasNext()) {
            dVar.next();
            dVar.remove();
        }
    }

    @Override
    public final boolean containsKey(Object obj) {
        Map map = this.C;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    public final Set entrySet() {
        c cVar = this.A;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this, 0);
        this.A = cVar2;
        return cVar2;
    }

    @Override
    public final boolean equals(Object obj) {
        return this == obj || this.C.equals(obj);
    }

    @Override
    public final Object get(Object obj) {
        Object obj2;
        Map map = this.C;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        return this.D.k(obj, collection);
    }

    @Override
    public final int hashCode() {
        return this.C.hashCode();
    }

    @Override
    public Set keySet() {
        return this.D.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.C.remove(obj);
        if (collection == null) {
            return null;
        }
        p pVar = this.D;
        Collection collectionI = pVar.i();
        collectionI.addAll(collection);
        pVar.F -= collection.size();
        collection.clear();
        return collectionI;
    }

    @Override
    public final int size() {
        return this.C.size();
    }

    @Override
    public final String toString() {
        return this.C.toString();
    }

    @Override
    public final Collection values() {
        r rVar = this.B;
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(this);
        this.B = rVar2;
        return rVar2;
    }
}
