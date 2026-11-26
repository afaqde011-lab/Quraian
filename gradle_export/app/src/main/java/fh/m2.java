package fh;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

public final class m2 extends AbstractSet {
    public final Set A;
    public final Set B;

    public m2(Set set, Set set2) {
        this.A = set;
        this.B = set2;
    }

    @Override
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean contains(Object obj) {
        return this.A.contains(obj) && this.B.contains(obj);
    }

    @Override
    public final boolean containsAll(Collection collection) {
        return this.A.containsAll(collection) && this.B.containsAll(collection);
    }

    @Override
    public final boolean isEmpty() {
        return Collections.disjoint(this.B, this.A);
    }

    @Override
    public final Iterator iterator() {
        return new g1(this);
    }

    @Override
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int size() {
        Iterator it = this.A.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.B.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
