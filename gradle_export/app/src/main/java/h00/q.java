package h00;

import c3.y2;
import com.google.android.gms.internal.measurement.g4;
import g1.l0;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import ri.t1;

public abstract class q extends v {
    public static final int A0(int i, List list) {
        if (i >= 0 && i <= va.a.M(list)) {
            return va.a.M(list) - i;
        }
        StringBuilder sbQ = oi.k.q("Element index ", i, " must be in range [");
        sbQ.append(new z00.e(0, va.a.M(list), 1));
        sbQ.append("].");
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public static final int B0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbQ = oi.k.q("Position index ", i, " must be in range [");
        sbQ.append(new z00.e(0, list.size(), 1));
        sbQ.append("].");
        throw new IndexOutOfBoundsException(sbQ.toString());
    }

    public static g0 C0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        return new g0(list);
    }

    public static y2 D0(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return new y2(iterable, 2);
    }

    public static ArrayList E0(Iterable iterable, int i) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        ta.c0.B(i, i);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = iterable.iterator();
            kotlin.jvm.internal.m.e(iterator, "iterator");
            Iterator itF = !iterator.hasNext() ? w.A : t1.F(new k0(i, i, iterator, null));
            while (itF.hasNext()) {
                arrayList.add((List) itF.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i) + (size % i == 0 ? 0 : 1));
        int i2 = 0;
        while (i2 >= 0 && i2 < size) {
            int i3 = size - i2;
            if (i <= i3) {
                i3 = i;
            }
            ArrayList arrayList3 = new ArrayList(i3);
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList3.add(list.get(i4 + i2));
            }
            arrayList2.add(arrayList3);
            i2 += i;
        }
        return arrayList2;
    }

    public static boolean F0(Iterable iterable, Object obj) {
        int iIndexOf;
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            iIndexOf = ((List) iterable).indexOf(obj);
        } else {
            int i = 0;
            for (Object obj2 : iterable) {
                if (i < 0) {
                    va.a.k0();
                    throw null;
                }
                if (kotlin.jvm.internal.m.a(obj, obj2)) {
                    iIndexOf = i;
                } else {
                    i++;
                }
            }
            iIndexOf = -1;
        }
        return iIndexOf >= 0;
    }

    public static List G0(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return n1(q1(iterable));
    }

    public static List H0(Iterable iterable, int i) {
        ArrayList arrayList;
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return n1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return x.A;
            }
            if (size == 1) {
                return va.a.R(S0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return va.a.X(arrayList);
    }

    public static List I0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size() - 1;
        if (size < 0) {
            size = 0;
        }
        return j1(list, size);
    }

    public static ArrayList J0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Object K0(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return L0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static Object L0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static Object M0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Object N0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static Object O0(int i, List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final void P0(Iterable iterable, Appendable buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, CharSequence charSequence, u00.k kVar) throws IOException {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(buffer, "buffer");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        kotlin.jvm.internal.m.e(postfix, "postfix");
        buffer.append(prefix);
        int i = 0;
        for (Object obj : iterable) {
            i++;
            if (i > 1) {
                buffer.append(separator);
            }
            g4.q(buffer, obj, kVar);
        }
        buffer.append(postfix);
    }

    public static void Q0(Iterable iterable, StringBuilder sb, String str, String str2, String str3, u00.k kVar, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            kVar = null;
        }
        P0(iterable, sb, str4, str5, str6, "...", kVar);
    }

    public static String R0(Iterable iterable, CharSequence charSequence, String str, String str2, u00.k kVar, int i) throws IOException {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence separator = charSequence;
        String prefix = (i & 2) != 0 ? "" : str;
        String str3 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            kVar = null;
        }
        kotlin.jvm.internal.m.e(iterable, "<this>");
        kotlin.jvm.internal.m.e(separator, "separator");
        kotlin.jvm.internal.m.e(prefix, "prefix");
        StringBuilder sb = new StringBuilder();
        P0(iterable, sb, separator, prefix, str3, "...", kVar);
        return sb.toString();
    }

    public static Object S0(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return T0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object T0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(va.a.M(list));
    }

    public static Object U0(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static ArrayList V0(List list, Object obj) {
        kotlin.jvm.internal.m.e(list, "<this>");
        ArrayList arrayList = new ArrayList(r.q0(list, 10));
        boolean z = false;
        for (Object obj2 : list) {
            boolean z2 = true;
            if (!z && kotlin.jvm.internal.m.a(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static ArrayList W0(Iterable iterable, Iterable iterable2) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Y0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        v.u0(iterable, arrayList);
        v.u0(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList X0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return Z0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        v.u0(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList Y0(Iterable elements, Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        kotlin.jvm.internal.m.e(elements, "elements");
        if (!(elements instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            v.u0(elements, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) elements;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList Z0(Object obj, Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object a1(ArrayList arrayList) {
        x00.c cVar = x00.d.A;
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        return arrayList.get(x00.d.B.g(arrayList.size()));
    }

    public static List b1(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.size() <= 1) {
            return n1(list);
        }
        List listP1 = p1(list);
        Collections.reverse(listP1);
        return listP1;
    }

    public static Object c1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            return d1((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        Object next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static Object d1(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static Object e1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object f1(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List g1(List list, z00.e indices) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(indices, "indices");
        return indices.isEmpty() ? x.A : n1(list.subList(indices.A, indices.B + 1));
    }

    public static List h1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listP1 = p1(iterable);
            u.s0(listP1);
            return listP1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return n1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        Comparable[] comparableArr = (Comparable[]) array;
        kotlin.jvm.internal.m.e(comparableArr, "<this>");
        if (comparableArr.length > 1) {
            Arrays.sort(comparableArr);
        }
        return n.k0(array);
    }

    public static List i1(Iterable iterable, Comparator comparator) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            List listP1 = p1(iterable);
            u.t0(listP1, comparator);
            return listP1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return n1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        kotlin.jvm.internal.m.e(array, "<this>");
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return n.k0(array);
    }

    public static List j1(Iterable iterable, int i) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return x.A;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return n1(iterable);
            }
            if (i == 1) {
                return va.a.R(K0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return va.a.X(arrayList);
    }

    public static List k1(int i, List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(g4.c.i("Requested element count ", i, " is less than zero.").toString());
        }
        if (i == 0) {
            return x.A;
        }
        int size = list.size();
        if (i >= size) {
            return n1(list);
        }
        if (i == 1) {
            return va.a.R(T0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static final void l1(Iterable iterable, AbstractCollection abstractCollection) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static int[] m1(List list) {
        kotlin.jvm.internal.m.e(list, "<this>");
        int[] iArr = new int[list.size()];
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List n1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return va.a.X(p1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return x.A;
        }
        if (size != 1) {
            return o1(collection);
        }
        return va.a.R(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static ArrayList o1(Collection collection) {
        kotlin.jvm.internal.m.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static final List p1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return o1((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        l1(iterable, arrayList);
        return arrayList;
    }

    public static Set q1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        l1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Set r1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size == 1) {
                    return w50.c.g0(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(d0.P(collection.size()));
                l1(iterable, linkedHashSet);
                return linkedHashSet;
            }
        } else {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            l1(iterable, linkedHashSet2);
            int size2 = linkedHashSet2.size();
            if (size2 != 0) {
                return size2 != 1 ? linkedHashSet2 : w50.c.g0(linkedHashSet2.iterator().next());
            }
        }
        return z.A;
    }

    public static p s1(Iterable iterable) {
        kotlin.jvm.internal.m.e(iterable, "<this>");
        return new p(new l0(iterable, 7), 1);
    }

    public static ArrayList t1(List list, List other) {
        kotlin.jvm.internal.m.e(list, "<this>");
        kotlin.jvm.internal.m.e(other, "other");
        Iterator it = list.iterator();
        Iterator it2 = other.iterator();
        ArrayList arrayList = new ArrayList(Math.min(r.q0(list, 10), r.q0(other, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(new g00.k(it.next(), it2.next()));
        }
        return arrayList;
    }
}
