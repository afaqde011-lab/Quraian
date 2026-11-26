package z00;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator, v00.a {
    public final int A;
    public final int B;
    public boolean C;
    public int D;

    public d(int i, int i2, int i3) {
        this.A = i3;
        this.B = i2;
        boolean z = false;
        if (i3 <= 0 ? i >= i2 : i <= i2) {
            z = true;
        }
        this.C = z;
        this.D = z ? i : i2;
    }

    @Override
    public final boolean hasNext() {
        return this.C;
    }

    @Override
    public final Object next() {
        return Integer.valueOf(nextInt());
    }

    public final int nextInt() {
        int i = this.D;
        if (i != this.B) {
            this.D = this.A + i;
            return i;
        }
        if (!this.C) {
            throw new NoSuchElementException();
        }
        this.C = false;
        return i;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
