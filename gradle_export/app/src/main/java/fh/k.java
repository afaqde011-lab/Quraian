package fh;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

public class k extends f implements SortedSet {
    public final v1 C;

    public k(v1 v1Var, SortedMap sortedMap) {
        super(v1Var, sortedMap);
        this.C = v1Var;
    }

    public SortedMap a() {
        return (SortedMap) this.A;
    }

    @Override
    public final Comparator comparator() {
        return a().comparator();
    }

    @Override
    public final Object first() {
        return a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new k(this.C, a().headMap(obj));
    }

    @Override
    public final Object last() {
        return a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new k(this.C, a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new k(this.C, a().tailMap(obj));
    }
}
