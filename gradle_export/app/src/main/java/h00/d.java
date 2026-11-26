package h00;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class d extends g00.s implements ListIterator {
    public final f D;

    public d(f fVar, int i) {
        super(fVar, 4);
        this.D = fVar;
        int iA = fVar.a();
        if (i < 0 || i > iA) {
            throw new IndexOutOfBoundsException(w.c.h(i, iA, "index: ", ", size: "));
        }
        this.B = i;
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean hasPrevious() {
        return this.B > 0;
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
        int i = this.B - 1;
        this.B = i;
        return this.D.get(i);
    }

    @Override
    public final int previousIndex() {
        return this.B - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
