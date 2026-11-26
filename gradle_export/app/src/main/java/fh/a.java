package fh;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class a extends s2 implements ListIterator {
    public final int A;
    public int B;

    public a(int i10, int i11) {
        ta.c0.x(i11, i10);
        this.A = i10;
        this.B = i11;
    }

    public abstract Object a(int i10);

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
