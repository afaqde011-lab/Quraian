package h00;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class j0 extends w50.c {
    public static LinkedHashSet o0(Set set, Object obj) {
        kotlin.jvm.internal.m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(set.size()));
        boolean z = false;
        for (Object obj2 : set) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.m.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(obj2);
            }
        }
        return linkedHashSet;
    }

    public static Set p0(Set set, Iterable elements) {
        kotlin.jvm.internal.m.e(set, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        Collection<?> collectionN1 = elements instanceof Collection ? (Collection) elements : q.n1(elements);
        if (collectionN1.isEmpty()) {
            return q.r1(set);
        }
        if (!(collectionN1 instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionN1);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (Object obj : set) {
            if (!((Set) collectionN1).contains(obj)) {
                linkedHashSet2.add(obj);
            }
        }
        return linkedHashSet2;
    }

    public static LinkedHashSet q0(Set set, Iterable elements) {
        int size;
        kotlin.jvm.internal.m.e(set, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        Integer numValueOf = elements instanceof Collection ? Integer.valueOf(((Collection) elements).size()) : null;
        if (numValueOf != null) {
            size = set.size() + numValueOf.intValue();
        } else {
            size = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(size));
        linkedHashSet.addAll(set);
        v.u0(elements, linkedHashSet);
        return linkedHashSet;
    }

    public static LinkedHashSet r0(Set set, Object obj) {
        kotlin.jvm.internal.m.e(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(obj);
        return linkedHashSet;
    }
}
