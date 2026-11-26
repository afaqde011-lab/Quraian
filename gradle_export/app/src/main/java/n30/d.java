package n30;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class d implements Iterator {
    public static final d A = new d();

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        throw new IllegalStateException();
    }
}
