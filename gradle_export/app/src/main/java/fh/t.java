package fh;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class t implements t1 {
    public transient Collection A;
    public transient Set B;
    public transient Collection C;
    public transient Map D;

    @Override
    public Collection a() {
        Collection collection = this.A;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.A = collectionF;
        return collectionF;
    }

    @Override
    public Map b() {
        Map map = this.D;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.D = mapE;
        return mapE;
    }

    public final boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map e();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t1) {
            return b().equals(((t1) obj).b());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Set g();

    public abstract Iterator h();

    public final int hashCode() {
        return b().hashCode();
    }

    @Override
    public Set keySet() {
        Set set = this.B;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.B = setG;
        return setG;
    }

    @Override
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return b().toString();
    }
}
