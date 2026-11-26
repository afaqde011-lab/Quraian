package fh;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class n1 extends AbstractList implements RandomAccess, Serializable {
    public final List A;
    public final eh.k B;

    public n1(eh.k kVar, List list) {
        list.getClass();
        this.A = list;
        this.B = kVar;
    }

    @Override
    public final Object get(int i10) {
        return this.B.apply(this.A.get(i10));
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final Iterator iterator() {
        return listIterator();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new m1(this, this.A.listIterator(i10), 0);
    }

    @Override
    public final Object remove(int i10) {
        return this.B.apply(this.A.remove(i10));
    }

    @Override
    public final void removeRange(int i10, int i11) {
        this.A.subList(i10, i11).clear();
    }

    @Override
    public final int size() {
        return this.A.size();
    }
}
