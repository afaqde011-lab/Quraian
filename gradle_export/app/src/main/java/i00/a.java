package i00;

import b3.q;
import h00.n;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.m;

public final class a extends h00.h implements RandomAccess, Serializable {
    public Object[] A;
    public final int B;
    public int C;
    public final a D;
    public final b E;

    public a(Object[] backing, int i, int i2, a aVar, b root) {
        m.e(backing, "backing");
        m.e(root, "root");
        this.A = backing;
        this.B = i;
        this.C = i2;
        this.D = aVar;
        this.E = root;
        ((AbstractList) this).modCount = ((AbstractList) root).modCount;
    }

    @Override
    public final int a() {
        k();
        return this.C;
    }

    @Override
    public final void add(int i, Object obj) {
        l();
        k();
        int i2 = this.C;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        i(this.B + i, obj);
    }

    @Override
    public final boolean add(Object obj) {
        l();
        k();
        i(this.B + this.C, obj);
        return true;
    }

    @Override
    public final boolean addAll(int i, Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        int i2 = this.C;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        int size = elements.size();
        h(this.B + i, elements, size);
        return size > 0;
    }

    @Override
    public final boolean addAll(Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        int size = elements.size();
        h(this.B + this.C, elements, size);
        return size > 0;
    }

    @Override
    public final Object c(int i) {
        l();
        k();
        int i2 = this.C;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return m(this.B + i);
    }

    @Override
    public final void clear() {
        l();
        k();
        n(this.B, this.C);
    }

    @Override
    public final boolean equals(Object obj) {
        k();
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            Object[] objArr = this.A;
            int i = this.C;
            if (i == list.size()) {
                for (int i2 = 0; i2 < i; i2++) {
                    if (m.a(objArr[this.B + i2], list.get(i2))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object get(int i) {
        k();
        int i2 = this.C;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return this.A[this.B + i];
    }

    public final void h(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        b bVar = this.E;
        a aVar = this.D;
        if (aVar != null) {
            aVar.h(i, collection, i2);
        } else {
            b bVar2 = b.D;
            bVar.h(i, collection, i2);
        }
        this.A = bVar.A;
        this.C += i2;
    }

    @Override
    public final int hashCode() {
        k();
        Object[] objArr = this.A;
        int i = this.C;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.B + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public final void i(int i, Object obj) {
        ((AbstractList) this).modCount++;
        b bVar = this.E;
        a aVar = this.D;
        if (aVar != null) {
            aVar.i(i, obj);
        } else {
            b bVar2 = b.D;
            bVar.i(i, obj);
        }
        this.A = bVar.A;
        this.C++;
    }

    @Override
    public final int indexOf(Object obj) {
        k();
        for (int i = 0; i < this.C; i++) {
            if (m.a(this.A[this.B + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        k();
        return this.C == 0;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    public final void k() {
        if (((AbstractList) this.E).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    public final void l() {
        if (this.E.C) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public final int lastIndexOf(Object obj) {
        k();
        for (int i = this.C - 1; i >= 0; i--) {
            if (m.a(this.A[this.B + i], obj)) {
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
        k();
        int i2 = this.C;
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        return new q(this, i);
    }

    public final Object m(int i) {
        Object objM;
        ((AbstractList) this).modCount++;
        a aVar = this.D;
        if (aVar != null) {
            objM = aVar.m(i);
        } else {
            b bVar = b.D;
            objM = this.E.m(i);
        }
        this.C--;
        return objM;
    }

    public final void n(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        a aVar = this.D;
        if (aVar != null) {
            aVar.n(i, i2);
        } else {
            b bVar = b.D;
            this.E.n(i, i2);
        }
        this.C -= i2;
    }

    public final int o(int i, int i2, Collection collection, boolean z) {
        int iO;
        a aVar = this.D;
        if (aVar != null) {
            iO = aVar.o(i, i2, collection, z);
        } else {
            b bVar = b.D;
            iO = this.E.o(i, i2, collection, z);
        }
        if (iO > 0) {
            ((AbstractList) this).modCount++;
        }
        this.C -= iO;
        return iO;
    }

    @Override
    public final boolean remove(Object obj) {
        l();
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
        l();
        k();
        return o(this.B, this.C, elements, false) > 0;
    }

    @Override
    public final boolean retainAll(Collection elements) {
        m.e(elements, "elements");
        l();
        k();
        return o(this.B, this.C, elements, true) > 0;
    }

    @Override
    public final Object set(int i, Object obj) {
        l();
        k();
        int i2 = this.C;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(w.c.h(i, i2, "index: ", ", size: "));
        }
        Object[] objArr = this.A;
        int i3 = this.B;
        Object obj2 = objArr[i3 + i];
        objArr[i3 + i] = obj;
        return obj2;
    }

    @Override
    public final List subList(int i, int i2) {
        rd.a.j(i, i2, this.C);
        return new a(this.A, this.B + i, i2 - i, this, this.E);
    }

    @Override
    public final Object[] toArray() {
        k();
        Object[] objArr = this.A;
        int i = this.C;
        int i2 = this.B;
        return n.x0(objArr, i2, i + i2);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        m.e(array, "array");
        k();
        int length = array.length;
        int i = this.C;
        int i2 = this.B;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.A, i2, i + i2, array.getClass());
            m.d(objArrCopyOfRange, "copyOfRange(...)");
            return objArrCopyOfRange;
        }
        n.q0(0, i2, i + i2, this.A, array);
        int i3 = this.C;
        if (i3 < array.length) {
            array[i3] = null;
        }
        return array;
    }

    @Override
    public final String toString() {
        k();
        return ze.d.g(this.A, this.B, this.C, this);
    }
}
