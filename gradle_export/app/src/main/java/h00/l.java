package h00;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class l implements Collection, v00.a {
    public final Object[] A;
    public final boolean B;

    public l(Object[] values, boolean z) {
        kotlin.jvm.internal.m.e(values, "values");
        this.A = values;
        this.B = z;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        return n.m0(obj, this.A);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!n.m0(it.next(), this.A)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean isEmpty() {
        return this.A.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return kotlin.jvm.internal.m.i(this.A);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.A.length;
    }

    @Override
    public final Object[] toArray() {
        Object[] objArr = this.A;
        kotlin.jvm.internal.m.e(objArr, "<this>");
        if (this.B && objArr.getClass().equals(Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        kotlin.jvm.internal.m.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.c(this, array);
    }
}
