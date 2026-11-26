package g00;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class v implements Collection, v00.a {
    public final int[] A;

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
        if (!(obj instanceof u)) {
            return false;
        }
        return h00.n.n0(this.A, ((u) obj).A);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        for (Object obj : collection) {
            if (!(obj instanceof u)) {
                return false;
            }
            if (!h00.n.n0(this.A, ((u) obj).A)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return kotlin.jvm.internal.m.a(this.A, ((v) obj).A);
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return Arrays.hashCode(this.A);
    }

    @Override
    public final boolean isEmpty() {
        return this.A.length == 0;
    }

    @Override
    public final Iterator iterator() {
        return new s(this.A, 1);
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
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] array) {
        kotlin.jvm.internal.m.e(array, "array");
        return kotlin.jvm.internal.l.c(this, array);
    }

    public final String toString() {
        return "UIntArray(storage=" + Arrays.toString(this.A) + ')';
    }
}
