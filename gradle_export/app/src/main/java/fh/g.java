package fh;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

public final class g extends j implements NavigableMap {
    public final v1 G;

    public g(v1 v1Var, NavigableMap navigableMap) {
        super(v1Var, navigableMap);
        this.G = v1Var;
    }

    @Override
    public final SortedSet c() {
        return new h(this.G, e());
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry entryCeilingEntry = e().ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return a(entryCeilingEntry);
    }

    @Override
    public final Object ceilingKey(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override
    public final SortedSet keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final NavigableMap descendingMap() {
        return new g(this.G, e().descendingMap());
    }

    public final p0 f(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry entry = (Map.Entry) it.next();
        Collection collectionI = this.G.i();
        collectionI.addAll((Collection) entry.getValue());
        it.remove();
        return new p0(entry.getKey(), Collections.unmodifiableList((List) collectionI));
    }

    @Override
    public final Map.Entry firstEntry() {
        Map.Entry entryFirstEntry = e().firstEntry();
        if (entryFirstEntry == null) {
            return null;
        }
        return a(entryFirstEntry);
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry entryFloorEntry = e().floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return a(entryFloorEntry);
    }

    @Override
    public final Object floorKey(Object obj) {
        return e().floorKey(obj);
    }

    @Override
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.C);
    }

    @Override
    public final NavigableMap headMap(Object obj, boolean z10) {
        return new g(this.G, e().headMap(obj, z10));
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry entryHigherEntry = e().higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return a(entryHigherEntry);
    }

    @Override
    public final Object higherKey(Object obj) {
        return e().higherKey(obj);
    }

    @Override
    public final Set keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry lastEntry() {
        Map.Entry entryLastEntry = e().lastEntry();
        if (entryLastEntry == null) {
            return null;
        }
        return a(entryLastEntry);
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry entryLowerEntry = e().lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return a(entryLowerEntry);
    }

    @Override
    public final Object lowerKey(Object obj) {
        return e().lowerKey(obj);
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return (NavigableSet) super.keySet();
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        return f(((c) entrySet()).iterator());
    }

    @Override
    public final Map.Entry pollLastEntry() {
        return f(((c) ((e) descendingMap()).entrySet()).iterator());
    }

    @Override
    public final NavigableMap subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        return new g(this.G, e().subMap(obj, z10, obj2, z11));
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final NavigableMap tailMap(Object obj, boolean z10) {
        return new g(this.G, e().tailMap(obj, z10));
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
