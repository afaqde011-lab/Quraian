package fh;

import java.io.Serializable;
import java.util.AbstractSequentialList;
import java.util.List;
import java.util.ListIterator;

public final class o1 extends AbstractSequentialList implements Serializable {
    public final List A;
    public final eh.k B;

    public o1(eh.k kVar, List list) {
        list.getClass();
        this.A = list;
        this.B = kVar;
    }

    @Override
    public final boolean isEmpty() {
        return this.A.isEmpty();
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return new m1(this, this.A.listIterator(i10), 1);
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
