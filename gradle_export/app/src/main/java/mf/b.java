package mf;

import c7.i;
import dh.l;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public final class b extends l implements ListIterator {
    public final int B;
    public int C;
    public final e D;

    public b(e eVar, int i10) {
        super(1);
        int size = eVar.size();
        if (i10 < 0 || i10 > size) {
            throw new IndexOutOfBoundsException(i.d0(i10, "index", size));
        }
        this.B = size;
        this.C = i10;
        this.D = eVar;
    }

    public final Object a(int i10) {
        return this.D.get(i10);
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasNext() {
        return this.C < this.B;
    }

    @Override
    public final boolean hasPrevious() {
        return this.C > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.C;
        this.C = i10 + 1;
        return a(i10);
    }

    @Override
    public final int nextIndex() {
        return this.C;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.C - 1;
        this.C = i10;
        return a(i10);
    }

    @Override
    public final int previousIndex() {
        return this.C - 1;
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
