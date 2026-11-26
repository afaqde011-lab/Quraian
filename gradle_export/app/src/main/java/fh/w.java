package fh;

import com.google.android.gms.internal.measurement.x5;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;

public abstract class w {
    public final int A = 2;

    public static AbstractList A(eh.k kVar, List list) {
        return list instanceof RandomAccess ? new n1(kVar, list) : new o1(kVar, list);
    }

    public static int d(int i10) {
        if (i10 < 3) {
            g(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static void e(int i10, Object[] objArr) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (objArr[i11] == null) {
                throw new NullPointerException(g4.c.f(i11, "at index "));
            }
        }
    }

    public static void f(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(g4.c.h(obj2, "null key in entry: null="));
        }
        if (obj2 == null) {
            throw new NullPointerException(x5.l(obj, "null value in entry: ", "=null"));
        }
    }

    public static void g(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i10);
    }

    public static Object h(int i10) {
        if (i10 < 2 || i10 > 1073741824 || Integer.highestOneBit(i10) != i10) {
            throw new IllegalArgumentException(g4.c.f(i10, "must be power of 2 between 2^1 and 2^30: "));
        }
        if (i10 <= 256) {
            return new byte[i10];
        }
        return i10 <= 65536 ? new short[i10] : new int[i10];
    }

    public static boolean j(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static n2 l(Set set, eh.n nVar) {
        if (set instanceof SortedSet) {
            Set set2 = (SortedSet) set;
            if (!(set2 instanceof n2)) {
                return new o2(set2, nVar);
            }
            n2 n2Var = (n2) set2;
            eh.n nVar2 = n2Var.B;
            nVar2.getClass();
            return new o2((SortedSet) n2Var.A, new eh.o(Arrays.asList(nVar2, nVar)));
        }
        if (!(set instanceof n2)) {
            set.getClass();
            return new n2(set, nVar);
        }
        n2 n2Var2 = (n2) set;
        eh.n nVar3 = n2Var2.B;
        nVar3.getClass();
        return new n2(n2Var2.A, new eh.o(Arrays.asList(nVar3, nVar)));
    }

    public static Object m(AbstractCollection abstractCollection, String str) {
        Iterator it = abstractCollection.iterator();
        return it.hasNext() ? it.next() : str;
    }

    public static Object n(Iterable iterable) {
        Object next;
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                throw new NoSuchElementException();
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    public static int o(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    public static m2 p(Set set, e1 e1Var) {
        ta.c0.w(set, "set1");
        ta.c0.w(e1Var, "set2");
        return new m2(set, e1Var);
    }

    public static int q(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static ArrayList r(Object... objArr) {
        int length = objArr.length;
        g(length, "arraySize");
        ArrayList arrayList = new ArrayList(bi.b.P(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }

    public static int s(int i10) {
        return (i10 + 1) * (i10 < 32 ? 4 : 2);
    }

    public static int t(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iX = x(obj);
        int i11 = iX & i10;
        int iY = y(i11, obj3);
        if (iY != 0) {
            int i12 = ~i10;
            int i13 = iX & i12;
            int i14 = -1;
            while (true) {
                int i15 = iY - 1;
                int i16 = iArr[i15];
                if ((i16 & i12) == i13 && w50.c.A(obj, objArr[i15]) && (objArr2 == null || w50.c.A(obj2, objArr2[i15]))) {
                    int i17 = i16 & i10;
                    if (i14 == -1) {
                        z(i11, i17, obj3);
                        return i15;
                    }
                    iArr[i14] = q(iArr[i14], i17, i10);
                    return i15;
                }
                int i18 = i16 & i10;
                if (i18 == 0) {
                    break;
                }
                i14 = i15;
                iY = i18;
            }
        }
        return -1;
    }

    public static boolean u(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof x1) {
            collection = ((j2) ((x1) collection)).l();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void v(List list, eh.n nVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    public static int w(int i10) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i10) * (-862048943)), 15)) * 461845907);
    }

    public static int x(Object obj) {
        return w(obj == null ? 0 : obj.hashCode());
    }

    public static int y(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        return obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void z(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public abstract Object i();

    public String toString() {
        switch (this.A) {
            case 2:
                return i().toString();
            default:
                return super.toString();
        }
    }
}
