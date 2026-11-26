package fh;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

public final class v1 extends p implements l1 {
    public transient u1 G;

    @Override
    public final Map e() {
        Map map = this.E;
        if (map instanceof NavigableMap) {
            return new g(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new j(this, (SortedMap) map) : new e(this, map);
    }

    @Override
    public final Set g() {
        Map map = this.E;
        if (map instanceof NavigableMap) {
            return new h(this, (NavigableMap) map);
        }
        return map instanceof SortedMap ? new k(this, (SortedMap) map) : new f(this, map);
    }

    @Override
    public final Collection get(Object obj) {
        return (List) super.get(obj);
    }

    @Override
    public final Collection i() {
        return (List) this.G.get();
    }

    @Override
    public final Collection k(Object obj, Collection collection) {
        List list = (List) collection;
        return list instanceof RandomAccess ? new i(this, obj, list, null) : new n(this, obj, list, null);
    }
}
