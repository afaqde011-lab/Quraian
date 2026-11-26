package l0;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class s0 implements List, v00.a {
    public final z1.p A = new z1.p();

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
        if (!(obj instanceof r0)) {
            return false;
        }
        return this.A.contains((r0) obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.A.containsAll(collection);
    }

    @Override
    public final Object get(int i10) {
        return (r0) this.A.get(i10);
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof r0)) {
            return -1;
        }
        return this.A.indexOf((r0) obj);
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return this.A.listIterator();
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof r0)) {
            return -1;
        }
        return this.A.lastIndexOf((r0) obj);
    }

    @Override
    public final ListIterator listIterator() {
        return this.A.listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        z1.p pVar = this.A;
        pVar.getClass();
        return new b3.q(pVar, i10);
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
        return this.A.size();
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i10, int i11) {
        return this.A.subList(i10, i11);
    }

    @Override
    public final Object[] toArray() {
        return kotlin.jvm.internal.l.b(this);
    }

    @Override
    public final Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.l.c(this, objArr);
    }
}
