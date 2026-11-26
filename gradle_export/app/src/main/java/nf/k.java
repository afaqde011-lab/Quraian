package nf;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class k extends f0 implements ListIterator {
    public final int A;
    public int B;
    public final o C;

    public k(o oVar, int i10) {
        int size = oVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(b.n(i10, "index", size));
        }
        this.A = size;
        this.B = i10;
        this.C = oVar;
    }

    public final Object a(int i10) {
        return this.C.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.B < this.A;
    }

    @Override
    public final boolean hasPrevious() {
        return this.B > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        this.B = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.B;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B - 1;
        this.B = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.B - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
