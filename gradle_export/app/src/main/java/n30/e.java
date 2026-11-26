package n30;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator {
    public boolean A;
    public final int B;
    public final f C;

    public e(f fVar) {
        this.C = fVar;
        this.B = ((AbstractList) fVar).modCount;
    }

    public final void a() {
        f fVar = this.C;
        int i = ((AbstractList) fVar).modCount;
        int i2 = this.B;
        if (i == i2) {
            return;
        }
        throw new ConcurrentModificationException("ModCount: " + ((AbstractList) fVar).modCount + "; expected: " + i2);
    }

    @Override
    public final boolean hasNext() {
        return !this.A;
    }

    @Override
    public final Object next() {
        if (this.A) {
            throw new NoSuchElementException();
        }
        this.A = true;
        a();
        return this.C.B;
    }

    @Override
    public final void remove() {
        a();
        this.C.clear();
    }
}
