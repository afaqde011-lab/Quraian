package x10;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class j {
    public static final LinkedHashMap a;
    public static final Map b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a = linkedHashMap;
        b(n20.h.x, a("java.util.ArrayList", "java.util.LinkedList"));
        b(n20.h.y, a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        b(n20.h.z, a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        n20.c cVar = new n20.c("java.util.function.Function");
        b(new n20.b(cVar.b(), cVar.a.g()), a("java.util.function.UnaryOperator"));
        n20.c cVar2 = new n20.c("java.util.function.BiFunction");
        b(new n20.b(cVar2.b(), cVar2.a.g()), a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new g00.k(((n20.b) entry.getKey()).a(), ((n20.b) entry.getValue()).a()));
        }
        b = h00.d0.Y(arrayList);
    }

    public static ArrayList a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            n20.c cVar = new n20.c(str);
            arrayList.add(new n20.b(cVar.b(), cVar.a.g()));
        }
        return arrayList;
    }

    public static void b(n20.b bVar, ArrayList arrayList) {
        for (Object obj : arrayList) {
            a.put(obj, bVar);
        }
    }
}
