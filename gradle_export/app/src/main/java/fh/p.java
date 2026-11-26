package fh;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class p extends t implements Serializable {
    public final transient Map E;
    public transient int F;

    public p(Map map) {
        ta.c0.s(map.isEmpty());
        this.E = map;
    }

    @Override
    public final void clear() {
        Map map = this.E;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        map.clear();
        this.F = 0;
    }

    @Override
    public Map e() {
        return new e(this, this.E);
    }

    @Override
    public final Collection f() {
        return this instanceof j0 ? new s(this, 0) : new r(this, 0);
    }

    @Override
    public Set g() {
        return new f(this, this.E);
    }

    @Override
    public Collection get(Object obj) {
        Collection collectionI = (Collection) this.E.get(obj);
        if (collectionI == null) {
            collectionI = i();
        }
        return k(obj, collectionI);
    }

    @Override
    public final Iterator h() {
        return new b(this, 1);
    }

    public abstract Collection i();

    public boolean j(Object obj, Object obj2) {
        Map map = this.E;
        Collection collection = (Collection) map.get(obj);
        if (collection != null) {
            if (!collection.add(obj2)) {
                return false;
            }
            this.F++;
            return true;
        }
        Collection collectionI = i();
        if (!collectionI.add(obj2)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.F++;
        map.put(obj, collectionI);
        return true;
    }

    public abstract Collection k(Object obj, Collection collection);

    @Override
    public final int size() {
        return this.F;
    }
}
