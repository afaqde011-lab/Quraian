package fh;

import java.util.Iterator;

public abstract class r2 implements Iterator {
    public final Iterator A;

    public r2(Iterator it) {
        it.getClass();
        this.A = it;
    }

    public abstract Object a(Object obj);

    @Override
    public final boolean hasNext() {
        return this.A.hasNext();
    }

    @Override
    public final Object next() {
        return a(this.A.next());
    }

    @Override
    public final void remove() {
        this.A.remove();
    }
}
