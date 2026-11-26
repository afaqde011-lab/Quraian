package fh;

import java.util.AbstractSet;
import java.util.Collection;

public abstract class p2 extends AbstractSet {
    @Override
    public boolean removeAll(Collection collection) {
        return w.u(this, collection);
    }

    @Override
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
