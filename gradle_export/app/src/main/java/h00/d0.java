package h00;

import com.google.android.gms.internal.measurement.x5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

public abstract class d0 extends w00.a {
    public static Object O(Map map, Object obj) {
        kotlin.jvm.internal.m.e(map, "<this>");
        if (map instanceof c0) {
            return ((c0) map).b();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException(x5.l(obj, "Key ", " is missing in the map."));
    }

    public static int P(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map Q(g00.k pair) {
        kotlin.jvm.internal.m.e(pair, "pair");
        Map mapSingletonMap = Collections.singletonMap(pair.A, pair.B);
        kotlin.jvm.internal.m.d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }

    public static Map R(g00.k... kVarArr) {
        if (kVarArr.length <= 0) {
            return y.A;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(kVarArr.length));
        W(linkedHashMap, kVarArr);
        return linkedHashMap;
    }

    public static Map S(Map map, Iterable keys) {
        kotlin.jvm.internal.m.e(keys, "keys");
        LinkedHashMap linkedHashMapB0 = b0(map);
        Set setKeySet = linkedHashMapB0.keySet();
        kotlin.jvm.internal.m.e(setKeySet, "<this>");
        setKeySet.removeAll(keys instanceof Collection ? (Collection) keys : q.n1(keys));
        return T(linkedHashMapB0);
    }

    public static final Map T(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size != 0) {
            return size != 1 ? linkedHashMap : c0(linkedHashMap);
        }
        return y.A;
    }

    public static LinkedHashMap U(Map map, Map map2) {
        kotlin.jvm.internal.m.e(map, "<this>");
        kotlin.jvm.internal.m.e(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map V(Map map, g00.k kVar) {
        kotlin.jvm.internal.m.e(map, "<this>");
        if (map.isEmpty()) {
            return Q(kVar);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(kVar.A, kVar.B);
        return linkedHashMap;
    }

    public static final void W(HashMap map, g00.k[] pairs) {
        kotlin.jvm.internal.m.e(pairs, "pairs");
        for (g00.k kVar : pairs) {
            map.put(kVar.A, kVar.B);
        }
    }

    public static void X(Map map, ArrayList arrayList) {
        kotlin.jvm.internal.m.e(map, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g00.k kVar = (g00.k) it.next();
            map.put(kVar.A, kVar.B);
        }
    }

    public static Map Y(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return y.A;
        }
        if (size == 1) {
            return Q((g00.k) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(arrayList.size()));
        X(linkedHashMap, arrayList);
        return linkedHashMap;
    }

    public static Map Z(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        int size = map.size();
        if (size != 0) {
            return size != 1 ? b0(map) : c0(map);
        }
        return y.A;
    }

    public static Map a0(q30.r rVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = rVar.a.iterator();
        while (it.hasNext()) {
            g00.k kVar = (g00.k) rVar.b.invoke(it.next());
            linkedHashMap.put(kVar.A, kVar.B);
        }
        return T(linkedHashMap);
    }

    public static LinkedHashMap b0(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static final Map c0(Map map) {
        kotlin.jvm.internal.m.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map mapSingletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.m.d(mapSingletonMap, "with(...)");
        return mapSingletonMap;
    }

    public static TreeMap d0(LinkedHashMap linkedHashMap, Comparator comparator) {
        TreeMap treeMap = new TreeMap(comparator);
        treeMap.putAll(linkedHashMap);
        return treeMap;
    }
}
