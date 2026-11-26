package fh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class t0 extends o0 implements List, RandomAccess {
    public static final r0 B = new r0(d2.E, 0);

    public static d2 l(int i10, Object[] objArr) {
        return i10 == 0 ? d2.E : new d2(i10, objArr);
    }

    public static q0 m() {
        return new q0(4);
    }

    public static q0 n(int i10) {
        w.g(i10, "expectedSize");
        return new q0(i10);
    }

    public static t0 o(Collection collection) {
        if (!(collection instanceof o0)) {
            Object[] array = collection.toArray();
            w.e(array.length, array);
            return l(array.length, array);
        }
        t0 t0VarA = ((o0) collection).a();
        if (!t0VarA.i()) {
            return t0VarA;
        }
        Object[] array2 = t0VarA.toArray(o0.A);
        return l(array2.length, array2);
    }

    public static d2 p(Object[] objArr) {
        if (objArr.length == 0) {
            return d2.E;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        w.e(objArr2.length, objArr2);
        return l(objArr2.length, objArr2);
    }

    public static d2 r(Long l, Long l10, Long l11, Long l12, Long l13) {
        Object[] objArr = {l, l10, l11, l12, l13};
        w.e(5, objArr);
        return l(5, objArr);
    }

    public static d2 s(Object obj) {
        Object[] objArr = {obj};
        w.e(1, objArr);
        return l(1, objArr);
    }

    public static d2 t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        w.e(2, objArr);
        return l(2, objArr);
    }

    public static d2 u(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Object... objArr) {
        ta.c0.r("the total number of elements must fit in an int", objArr.length <= 2147483635);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = str;
        objArr2[1] = str2;
        objArr2[2] = str3;
        objArr2[3] = str4;
        objArr2[4] = str5;
        objArr2[5] = str6;
        objArr2[6] = str7;
        objArr2[7] = str8;
        objArr2[8] = str9;
        objArr2[9] = str10;
        objArr2[10] = str11;
        objArr2[11] = str12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        w.e(length, objArr2);
        return l(length, objArr2);
    }

    public static d2 v(b2 b2Var, List list) {
        b2Var.getClass();
        if (list == null) {
            Iterator it = list.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            list = arrayList;
        }
        Object[] array = list.toArray();
        w.e(array.length, array);
        Arrays.sort(array, b2Var);
        return l(array.length, array);
    }

    @Override
    public final t0 a() {
        return this;
    }

    @Override
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int b(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && w50.c.A(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (w50.c.A(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final s2 iterator() {
        return listIterator(0);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final r0 listIterator(int i10) {
        ta.c0.x(i10, size());
        return isEmpty() ? B : new r0(this, i10);
    }

    @Override
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public t0 subList(int i10, int i11) {
        ta.c0.y(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        return i12 == 0 ? d2.E : new s0(this, i10, i12);
    }
}
