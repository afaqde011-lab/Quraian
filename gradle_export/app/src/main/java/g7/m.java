package g7;

import fh.n2;
import fh.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class m extends w implements Map {
    public final Map B;

    public m(Map map) {
        this.B = map;
    }

    @Override
    public final void clear() {
        this.B.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return obj != null && this.B.containsKey(obj);
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((n2) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        return w.l(this.B.entrySet(), new l(0));
    }

    @Override
    public final boolean equals(Object obj) {
        return obj != null && w.j(this, obj);
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.B.get(obj);
    }

    @Override
    public final int hashCode() {
        return w.o(entrySet());
    }

    @Override
    public final Object i() {
        return this.B;
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.B;
        return map.isEmpty() || (map.size() == 1 && map.containsKey(null));
    }

    @Override
    public final Set keySet() {
        return w.l(this.B.keySet(), new l(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.B.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.B.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.B.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.B;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.B.values();
    }
}
