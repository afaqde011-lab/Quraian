package fh;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

public final class h extends k implements NavigableSet {
    public final v1 D;

    public h(v1 v1Var, NavigableMap navigableMap) {
        super(v1Var, navigableMap);
        this.D = v1Var;
    }

    @Override
    public final NavigableMap a() {
        return (NavigableMap) ((SortedMap) this.A);
    }

    @Override
    public final Object ceiling(Object obj) {
        return a().ceilingKey(obj);
    }

    @Override
    public final Iterator descendingIterator() {
        return ((f) descendingSet()).iterator();
    }

    @Override
    public final NavigableSet descendingSet() {
        return new h(this.D, a().descendingMap());
    }

    @Override
    public final Object floor(Object obj) {
        return a().floorKey(obj);
    }

    @Override
    public final NavigableSet headSet(Object obj, boolean z10) {
        return new h(this.D, a().headMap(obj, z10));
    }

    @Override
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override
    public final Object higher(Object obj) {
        return a().higherKey(obj);
    }

    @Override
    public final Object lower(Object obj) {
        return a().lowerKey(obj);
    }

    @Override
    public final Object pollFirst() {
        d dVar = (d) iterator();
        if (!dVar.hasNext()) {
            return null;
        }
        Object next = dVar.next();
        dVar.remove();
        return next;
    }

    @Override
    public final Object pollLast() {
        Iterator itDescendingIterator = descendingIterator();
        if (!itDescendingIterator.hasNext()) {
            return null;
        }
        Object next = itDescendingIterator.next();
        itDescendingIterator.remove();
        return next;
    }

    @Override
    public final NavigableSet subSet(Object obj, boolean z10, Object obj2, boolean z11) {
        return new h(this.D, a().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override
    public final NavigableSet tailSet(Object obj, boolean z10) {
        return new h(this.D, a().tailMap(obj, z10));
    }

    @Override
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
