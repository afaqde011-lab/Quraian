package n30;

import java.util.Iterator;
import java.util.NoSuchElementException;
import k30.p;

public final class h implements Iterator, v00.a {
    public final int A;
    public boolean B = true;
    public final Object C;

    public h(Object obj, int i) {
        this.A = i;
        this.C = obj;
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.B;
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                if (!this.B) {
                    throw new NoSuchElementException();
                }
                this.B = false;
                return this.C;
            case 1:
                if (!this.B) {
                    throw new NoSuchElementException();
                }
                this.B = false;
                return this.C;
            default:
                if (!this.B) {
                    throw new NoSuchElementException();
                }
                this.B = false;
                return ((p) this.C).A;
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
