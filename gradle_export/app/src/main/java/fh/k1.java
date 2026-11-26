package fh;

import java.util.NoSuchElementException;

public final class k1 extends s2 {
    public final Object A;
    public boolean B;

    public k1(Object obj) {
        this.A = obj;
    }

    @Override
    public final boolean hasNext() {
        return !this.B;
    }

    @Override
    public final Object next() {
        if (this.B) {
            throw new NoSuchElementException();
        }
        this.B = true;
        return this.A;
    }
}
