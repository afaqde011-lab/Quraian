package h00;

import java.util.Iterator;
import java.util.NoSuchElementException;

public abstract class c implements Iterator, v00.a {
    public int A;
    public Object B;

    public abstract void a();

    @Override
    public final boolean hasNext() {
        int i = this.A;
        if (i == 0) {
            this.A = 3;
            a();
            return this.A == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override
    public final Object next() {
        int i = this.A;
        if (i == 1) {
            this.A = 0;
            return this.B;
        }
        if (i != 2) {
            this.A = 3;
            a();
            if (this.A == 1) {
                this.A = 0;
                return this.B;
            }
        }
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
