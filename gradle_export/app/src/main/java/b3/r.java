package b3;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public final class r implements List, v00.a {
    public final int A;
    public final int B;
    public final s C;

    public r(s sVar, int i10, int i11) {
        this.C = sVar;
        this.A = i10;
        this.B = i11;
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
        return (obj instanceof b2.q) && indexOf((b2.q) obj) != -1;
    }

    @Override
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains((b2.q) it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object get(int i10) {
        Object objF = this.C.A.f(i10 + this.A);
        kotlin.jvm.internal.m.c(objF, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
        return (b2.q) objF;
    }

    @Override
    public final int indexOf(Object obj) {
        if (!(obj instanceof b2.q)) {
            return -1;
        }
        b2.q qVar = (b2.q) obj;
        int i10 = this.A;
        int i11 = this.B;
        if (i10 <= i11) {
            int i12 = i10;
            while (!kotlin.jvm.internal.m.a(this.C.A.f(i12), qVar)) {
                if (i12 != i11) {
                    i12++;
                }
            }
            return i12 - i10;
        }
        return -1;
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Iterator iterator() {
        int i10 = this.A;
        return new q(this.C, i10, i10, this.B);
    }

    @Override
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof b2.q)) {
            return -1;
        }
        b2.q qVar = (b2.q) obj;
        int i10 = this.B;
        int i11 = this.A;
        if (i11 <= i10) {
            while (!kotlin.jvm.internal.m.a(this.C.A.f(i10), qVar)) {
                if (i10 != i11) {
                    i10--;
                }
            }
            return i10 - i11;
        }
        return -1;
    }

    @Override
    public final ListIterator listIterator() {
        int i10 = this.A;
        return new q(this.C, i10, i10, this.B);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        int i11 = this.A;
        int i12 = this.B;
        return new q(this.C, i10 + i11, i11, i12);
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
        return this.B - this.A;
    }

    @Override
    public final void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final List subList(int i10, int i11) {
        int i12 = this.A;
        return new r(this.C, i10 + i12, i12 + i11);
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
