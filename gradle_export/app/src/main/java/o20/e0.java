package o20;

import java.util.ListIterator;

public final class e0 implements ListIterator {
    public ListIterator A;

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.A.hasNext();
    }

    @Override
    public final boolean hasPrevious() {
        return this.A.hasPrevious();
    }

    @Override
    public final Object next() {
        return (String) this.A.next();
    }

    @Override
    public final int nextIndex() {
        return this.A.nextIndex();
    }

    @Override
    public final Object previous() {
        return (String) this.A.previous();
    }

    @Override
    public final int previousIndex() {
        return this.A.previousIndex();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
