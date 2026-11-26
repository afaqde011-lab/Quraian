package o20;

import java.util.Iterator;

public final class f0 implements Iterator {
    public final int A = 0;
    public Iterator B;

    public f0() {
    }

    public f0(tf.r rVar) {
        this.B = rVar.A.keySet().iterator();
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                break;
        }
        return this.B.hasNext();
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                break;
        }
        return (String) this.B.next();
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException("Remove not supported");
        }
    }
}
