package q40;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class e extends l implements List<l>, v00.a {
    public static final d Companion = new d();
    public final List A;

    public e(List content) {
        kotlin.jvm.internal.m.e(content, "content");
        this.A = content;
    }

    @Override
    public final void add(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i, Collection<? extends l> collection) {
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
        if (!(obj instanceof l)) {
            return false;
        }
        return this.A.contains((l) obj);
    }

    @Override
    public final boolean containsAll(Collection elements) {
        kotlin.jvm.internal.m.e(elements, "elements");
        return this.A.containsAll(elements);
    }

    @Override
    public final boolean equals(Object obj) {
        return kotlin.jvm.internal.m.a(this.A, obj);
    }

    @Override
    public final l get(int i) {
        return (l) this.A.get(i);
    }

    @Override
    public final int hashCode() {
        return this.A.hashCode();
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return this.A.indexOf((l) obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.A.iterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof l)) {
            return -1;
        }
        return this.A.lastIndexOf((l) obj);
    }

    @Override
    public final ListIterator<l> listIterator() {
        return this.A.listIterator();
    }

    @Override
    public final ListIterator<l> listIterator(int i) {
        return this.A.listIterator(i);
    }

    @Override
    public final l remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
    public final void replaceAll(UnaryOperator<l> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final l set(int i, l lVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.A.size();
    }

    @Override
    public final void sort(Comparator<? super l> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List<l> subList(int i, int i2) {
        return this.A.subList(i, i2);
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
        return h00.q.R0(this.A, ",", "[", "]", null, 56);
    }
}
