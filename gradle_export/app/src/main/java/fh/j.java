package fh;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class j extends e implements SortedMap {
    public SortedSet E;
    public final v1 F;

    public j(v1 v1Var, SortedMap sortedMap) {
        super(v1Var, sortedMap);
        this.F = v1Var;
    }

    public SortedSet c() {
        return new k(this.F, e());
    }

    @Override
    public final Comparator comparator() {
        return e().comparator();
    }

    @Override
    public SortedSet keySet() {
        SortedSet sortedSet = this.E;
        if (sortedSet != null) {
            return sortedSet;
        }
        SortedSet sortedSetC = c();
        this.E = sortedSetC;
        return sortedSetC;
    }

    public SortedMap e() {
        return (SortedMap) this.C;
    }

    @Override
    public final Object firstKey() {
        return e().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new j(this.F, e().headMap(obj));
    }

    @Override
    public final Object lastKey() {
        return e().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new j(this.F, e().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new j(this.F, e().tailMap(obj));
    }
}
