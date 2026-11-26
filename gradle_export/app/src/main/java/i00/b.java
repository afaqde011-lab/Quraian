package i00;

import b3.q;
import h00.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;

public final class b extends h00.h implements RandomAccess, Serializable {
    public static final b D;
    public Object[] A;
    public int B;
    public boolean C;

    static {
        b bVar = new b(0);
        bVar.C = true;
        D = bVar;
    }

    public b(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
        this.A = new Object[i];
    }

    @Override
    public final int a() {
        return this.B;
    }

    @Override
    public final void add(int i, Object obj) {
        k();
        int i2 = this.B;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.A[i] = obj;
    }

    @Override
    public final boolean add(Object obj) {
        k();
        int i = this.B;
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.A[i] = obj;
        return true;
    }

    @Override
    public final boolean addAll(int i, Collection elements) {
        m.e(elements, "elements");
        k();
        int i2 = this.B;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        int size = elements.size();
        h(i, elements, size);
        return size > 0;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        k();
        int size = elements.size();
        h(this.B, elements, size);
        return size > 0;
    }

    @Override
    public final Object c(int i) {
        k();
        int i2 = this.B;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return m(i);
    }

    @Override
    public final void clear() {
        k();
        n(0, this.B);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.A;
            int i = this.B;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (m.a(objArr[i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        int i2 = this.B;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return this.A[i];
    }

    public final void h(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        l(i, i2);
        Iterator it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.A[i + i3] = it.next();
        }
    }

    @Override
    public final int hashCode() {
        Object[] objArr = this.A;
        int i = this.B;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Object obj) {
        ((AbstractList) this).modCount++;
        l(i, 1);
        this.A[i] = obj;
    }

    @Override
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.B; i++) {
            if (m.a(this.A[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return this.B == 0;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (this.C) {
            throw new UnsupportedOperationException();
        }
    }

    public final void l(int i, int i2) {
        int i3 = this.B + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.A;
        if (i3 > objArr.length) {
            int length = objArr.length;
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArrCopyOf = Arrays.copyOf(objArr, i4);
            m.d(objArrCopyOf, "copyOf(...)");
            this.A = objArrCopyOf;
        }
        Object[] objArr2 = this.A;
        n.q0(i + i2, i, this.B, objArr2, objArr2);
        this.B += i2;
    }

    @Override
    public final int lastIndexOf(Object obj) {
        for (int i = this.B - 1; i >= 0; i--) {
            if (m.a(this.A[i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int i) {
        int i2 = this.B;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return new q(this, i);
    }

    public final Object m(int i) {
        ((AbstractList) this).modCount++;
        Object[] objArr = this.A;
        Object obj = objArr[i];
        n.q0(i, i + 1, this.B, objArr, objArr);
        Object[] objArr2 = this.A;
        int i2 = this.B - 1;
        m.e(objArr2, "<this>");
        objArr2[i2] = null;
        this.B--;
        return obj;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        Object[] objArr = this.A;
        n.q0(i, i + i2, this.B, objArr, objArr);
        Object[] objArr2 = this.A;
        int i3 = this.B;
        ze.d.O(objArr2, i3 - i2, i3);
        this.B -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.A[i5]) == z) {
                Object[] objArr = this.A;
                i3++;
                objArr[i4 + i] = objArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        Object[] objArr2 = this.A;
        n.q0(i + i4, i2 + i, this.B, objArr2, objArr2);
        Object[] objArr3 = this.A;
        int i7 = this.B;
        ze.d.O(objArr3, i7 - i6, i7);
        if (i6 > 0) {
            ((AbstractList) this).modCount++;
        }
        this.B -= i6;
        return i6;
    }

    @Override
    public final boolean remove(Object obj) {
        k();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            c(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override
    public final boolean removeAll(Collection elements) {
        m.e(elements, "elements");
        k();
        return o(0, this.B, elements, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        k();
        return o(0, this.B, elements, true) > 0;
    }

    @Override
    public final Object set(int i, Object obj) {
        k();
        int i2 = this.B;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.A;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override
    public final List subList(int i, int i2) {
        rd.a.j(i, i2, this.B);
        return new a(this.A, i, i2 - i, null, this);
    }

    @Override
    public final Object[] toArray() {
        return n.x0(this.A, 0, this.B);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        int length = array.length;
        int i = this.B;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.A, 0, i, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        n.q0(0, 0, i, this.A, array);
        int i2 = this.B;
        if (i2 < array.length) {
            array[i2] = null;
        }
        return array;
    }

    @Override
    public final String toString() {
        return ze.d.g(this.A, 0, this.B, this);
    }
}
