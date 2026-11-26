package dh;

import java.util.Iterator;

public abstract class l implements Iterator {
    public final int A;

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
