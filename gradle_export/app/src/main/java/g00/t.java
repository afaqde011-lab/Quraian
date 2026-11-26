package g00;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class t implements Collection, v00.a {
    public final byte[] A;

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
        if (!(obj instanceof r)) {
            return false;
        }
        byte b = ((r) obj).A;
        byte[] bArr = this.A;
        int length = bArr.length;
        int i = 0;
        while (i < length) {
            if (b == bArr[i]) {
                if (i >= 0) {
                    return true;
                }
                return false;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        Collection collection = elements;
        if (!collection.isEmpty()) {
            for (Object obj : collection) {
                if (obj instanceof r) {
                    byte b = ((r) obj).A;
                    byte[] bArr = this.A;
                    int length = bArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            i = -1;
                            break;
                        }
                        if (b == bArr[i]) {
                            break;
                        }
                        i++;
                    }
                    if (i >= 0) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return kotlin.jvm.internal.m.a(this.A, ((t) obj).A);
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
        return new s(this.A, 0);
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
        return "UByteArray(storage=" + Arrays.toString(this.A) + ')';
    }
}
