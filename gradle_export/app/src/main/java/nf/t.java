package nf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public final class t extends p implements NavigableMap {
    public static final t F;
    public final transient b0 C;
    public final transient o D;
    public final transient t E;

    static {
        b0 b0VarP = u.p(x.B);
        k kVar = o.B;
        F = new t(b0VarP, z.E, null);
    }

    public t(b0 b0Var, o oVar, t tVar) {
        this.C = b0Var;
        this.D = oVar;
        this.E = tVar;
    }

    public static t c(TreeMap treeMap) {
        x xVar = x.B;
        Comparator comparator = treeMap.comparator();
        int i10 = 1;
        boolean zEquals = comparator == null ? true : xVar.equals(comparator);
        Collection collectionEntrySet = treeMap.entrySet();
        if (!(collectionEntrySet instanceof Collection)) {
            Iterator it = collectionEntrySet.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collectionEntrySet = arrayList;
        }
        Map.Entry[] entryArr = (Map.Entry[]) collectionEntrySet.toArray(p.B);
        int length = entryArr.length;
        if (length == 0) {
            return d(xVar);
        }
        int i11 = 0;
        if (length == 1) {
            Map.Entry entry = entryArr[0];
            Objects.requireNonNull(entry);
            Object key = entry.getKey();
            Object value = entry.getValue();
            Object[] objArr = {key};
            for (int i12 = 0; i12 < 1; i12++) {
                if (objArr[i12] == null) {
                    throw new NullPointerException(g4.c.f(i12, "at index "));
                }
            }
            b0 b0Var = new b0(o.l(1, objArr), xVar);
            Object[] objArr2 = {value};
            while (i11 < 1) {
                if (objArr2[i11] == null) {
                    throw new NullPointerException(g4.c.f(i11, "at index "));
                }
                i11++;
            }
            return new t(b0Var, o.l(1, objArr2), null);
        }
        Object[] objArr3 = new Object[length];
        Object[] objArr4 = new Object[length];
        if (zEquals) {
            while (i11 < length) {
                Map.Entry entry2 = entryArr[i11];
                Objects.requireNonNull(entry2);
                Object key2 = entry2.getKey();
                Object value2 = entry2.getValue();
                b.f(key2, value2);
                objArr3[i11] = key2;
                objArr4[i11] = value2;
                i11++;
            }
        } else {
            Arrays.sort(entryArr, 0, length, new ba.m(13));
            Map.Entry entry3 = entryArr[0];
            Objects.requireNonNull(entry3);
            Object key3 = entry3.getKey();
            objArr3[0] = key3;
            Object value3 = entry3.getValue();
            objArr4[0] = value3;
            b.f(objArr3[0], value3);
            while (i10 < length) {
                Map.Entry entry4 = entryArr[i10 - 1];
                Objects.requireNonNull(entry4);
                Map.Entry entry5 = entryArr[i10];
                Objects.requireNonNull(entry5);
                Object key4 = entry5.getKey();
                Object value4 = entry5.getValue();
                b.f(key4, value4);
                objArr3[i10] = key4;
                objArr4[i10] = value4;
                if (xVar.compare(key3, key4) == 0) {
                    throw new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(entry4) + " and " + String.valueOf(entry5));
                }
                i10++;
                key3 = key4;
            }
        }
        return new t(new b0(o.l(length, objArr3), xVar), o.l(length, objArr4), null);
    }

    public static t d(Comparator comparator) {
        if (x.B.equals(comparator)) {
            return F;
        }
        b0 b0VarP = u.p(comparator);
        k kVar = o.B;
        return new t(b0VarP, z.E, null);
    }

    @Override
    public final Map.Entry ceilingEntry(Object obj) {
        return tailMap(obj, true).firstEntry();
    }

    @Override
    public final Object ceilingKey(Object obj) {
        Map.Entry entryCeilingEntry = ceilingEntry(obj);
        if (entryCeilingEntry == null) {
            return null;
        }
        return entryCeilingEntry.getKey();
    }

    @Override
    public final Comparator comparator() {
        return this.C.D;
    }

    @Override
    public final NavigableSet descendingKeySet() {
        return this.C.descendingSet();
    }

    @Override
    public final NavigableMap descendingMap() {
        t tVar = this.E;
        if (tVar != null) {
            return tVar;
        }
        boolean zIsEmpty = isEmpty();
        b0 b0Var = this.C;
        if (!zIsEmpty) {
            return new t((b0) b0Var.descendingSet(), this.D.i(), this);
        }
        Comparator comparator = b0Var.D;
        return d((comparator instanceof y ? (y) comparator : new i(comparator)).a());
    }

    @Override
    public final t headMap(Object obj, boolean z10) {
        obj.getClass();
        return h(0, this.C.q(obj, z10));
    }

    @Override
    public final t subMap(Object obj, boolean z10, Object obj2, boolean z11) {
        obj.getClass();
        obj2.getClass();
        if (this.C.D.compare(obj, obj2) <= 0) {
            return headMap(obj2, z11).tailMap(obj, z10);
        }
        throw new IllegalArgumentException(b.c("expected fromKey <= toKey but %s > %s", obj, obj2));
    }

    @Override
    public final Map.Entry firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().l().get(0);
    }

    @Override
    public final Object firstKey() {
        return this.C.first();
    }

    @Override
    public final Map.Entry floorEntry(Object obj) {
        return headMap(obj, true).lastEntry();
    }

    @Override
    public final Object floorKey(Object obj) {
        Map.Entry entryFloorEntry = floorEntry(obj);
        if (entryFloorEntry == null) {
            return null;
        }
        return entryFloorEntry.getKey();
    }

    @Override
    public final t tailMap(Object obj, boolean z10) {
        obj.getClass();
        return h(this.C.r(obj, z10), this.D.size());
    }

    @Override
    public final Object get(Object obj) {
        int iBinarySearch;
        b0 b0Var = this.C;
        if (obj == null) {
            iBinarySearch = -1;
        } else {
            try {
                iBinarySearch = Collections.binarySearch(b0Var.F, obj, b0Var.D);
                if (iBinarySearch < 0) {
                    iBinarySearch = -1;
                }
            } catch (ClassCastException unused) {
            }
        }
        if (iBinarySearch == -1) {
            return null;
        }
        return this.D.get(iBinarySearch);
    }

    public final t h(int i10, int i11) {
        o oVar = this.D;
        if (i10 == 0) {
            if (i11 == oVar.size()) {
                return this;
            }
            i10 = 0;
        }
        b0 b0Var = this.C;
        return i10 == i11 ? d(b0Var.D) : new t(b0Var.s(i10, i11), oVar.subList(i10, i11), null);
    }

    @Override
    public final SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override
    public final Map.Entry higherEntry(Object obj) {
        return tailMap(obj, false).firstEntry();
    }

    @Override
    public final Object higherKey(Object obj) {
        Map.Entry entryHigherEntry = higherEntry(obj);
        if (entryHigherEntry == null) {
            return null;
        }
        return entryHigherEntry.getKey();
    }

    @Override
    public final Set keySet() {
        return this.C;
    }

    @Override
    public final Map.Entry lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return (Map.Entry) entrySet().l().get(this.D.size() - 1);
    }

    @Override
    public final Object lastKey() {
        return this.C.last();
    }

    @Override
    public final Map.Entry lowerEntry(Object obj) {
        return headMap(obj, false).lastEntry();
    }

    @Override
    public final Object lowerKey(Object obj) {
        Map.Entry entryLowerEntry = lowerEntry(obj);
        if (entryLowerEntry == null) {
            return null;
        }
        return entryLowerEntry.getKey();
    }

    @Override
    public final NavigableSet navigableKeySet() {
        return this.C;
    }

    @Override
    public final Map.Entry pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Map.Entry pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        return this.D.size();
    }

    @Override
    public final SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override
    public final SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }

    @Override
    public final Collection values() {
        return this.D;
    }
}
