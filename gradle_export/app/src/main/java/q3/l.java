package q3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class l extends i implements List, v00.a {
    public final List F;

    public l(List list) {
        this.F = list;
        if (list.isEmpty()) {
            s3.a.b("At least one font should be passed to FontFamily");
        }
    }

    @Override
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean contains(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        return this.F.contains((a0) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.F.containsAll(collection);
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l) {
            return kotlin.jvm.internal.m.a(this.F, ((l) obj).F);
        }
        return false;
    }

    @Override
    public final Object get(int i10) {
        return (a0) this.F.get(i10);
    }

    @Override
    public final int hashCode() {
        return this.F.hashCode();
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof a0)) {
            return -1;
        }
        return this.F.indexOf((a0) obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.F.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.F.iterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof a0)) {
            return -1;
        }
        return this.F.lastIndexOf((a0) obj);
    }

    @Override
    public final ListIterator listIterator() {
        return this.F.listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return this.F.listIterator(i10);
    }

    @Override
    public final Object remove(int i10) {
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

    public final Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void replaceAll(UnaryOperator unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return this.F.size();
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i10, int i11) {
        return this.F.subList(i10, i11);
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.c(this, objArr);
    }

    public final String toString() {
        return oi.k.n(new StringBuilder("FontListFontFamily(fonts="), this.F, ')');
    }
}
