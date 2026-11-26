package nf;

import java.util.NoSuchElementException;

public final class v extends f0 {
    public static final Object B = new Object();
    public Object A;

    public v(Object obj) {
        this.A = obj;
    }

    @Override
    public final boolean hasNext() {
        return this.A != B;
    }

    @Override
    public final Object next() {
        Object obj = this.A;
        Object obj2 = B;
        if (obj == obj2) {
            throw new NoSuchElementException();
        }
        this.A = obj2;
        return obj;
    }
}
