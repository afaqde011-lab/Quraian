package fh;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public final class s1 extends AbstractMap {
    public final Map A;
    public final r1 B;

    public s1(Map map, r1 r1Var) {
        map.getClass();
        this.A = map;
        this.B = r1Var;
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.A.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.A;
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return this.B.c(obj, obj2);
        }
        return null;
    }

    @Override
    public final Set keySet() {
        return this.A.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.A;
        if (map.containsKey(obj)) {
            return this.B.c(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.A.size();
    }

    @Override
    public final Collection values() {
        return new r(this);
    }
}
