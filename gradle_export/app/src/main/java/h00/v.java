package h00;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

public abstract class v extends u {
    public static void u0(Iterable elements, Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (elements instanceof Collection) {
            collection.addAll((Collection) elements);
            return;
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void v0(AbstractList abstractList, Object[] elements) {
        kotlin.jvm.internal.m.e(abstractList, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        abstractList.addAll(n.k0(elements));
    }

    public static final boolean w0(Iterable iterable, u00.k kVar, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) kVar.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static void x0(u00.k predicate, List list) {
        int iM;
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(predicate, "predicate");
        if (!(list instanceof RandomAccess)) {
            if (!(list instanceof v00.a) || (list instanceof v00.b)) {
                w0(list, predicate, true);
                return;
            } else {
                kotlin.jvm.internal.d0.h(list, "kotlin.collections.MutableIterable");
                throw null;
            }
        }
        int iM2 = va.a.M(list);
        int i = 0;
        if (iM2 >= 0) {
            int i2 = 0;
            while (true) {
                Object obj = list.get(i);
                if (!((Boolean) predicate.invoke(obj)).booleanValue()) {
                    if (i2 != i) {
                        list.set(i2, obj);
                    }
                    i2++;
                }
                if (i == iM2) {
                    break;
                } else {
                    i++;
                }
            }
            i = i2;
        }
        if (i >= list.size() || i > (iM = va.a.M(list))) {
            return;
        }
        while (true) {
            list.remove(iM);
            if (iM == i) {
                return;
            } else {
                iM--;
            }
        }
    }

    public static Object y0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.remove(va.a.M(list));
    }

    public static Object z0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(va.a.M(list));
    }
}
