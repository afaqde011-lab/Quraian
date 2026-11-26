package z00;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class f implements Iterator, v00.a {
    public final long A;
    public final long B;
    public boolean C;
    public long D;

    public f(long j, long j2, long j3) {
        this.A = j3;
        this.B = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.C = z;
        this.D = z ? j : j2;
    }

    @Override
    public final boolean hasNext() {
        return this.C;
    }

    @Override
    public final Object next() {
        long j = this.D;
        if (j != this.B) {
            this.D = this.A + j;
        } else {
            if (!this.C) {
                throw new NoSuchElementException();
            }
            this.C = false;
        }
        return Long.valueOf(j);
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
