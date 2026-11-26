package fh;

import java.util.AbstractList;
import java.util.ListIterator;

public final class m1 extends r2 implements ListIterator {
    public final int B;
    public final AbstractList C;

    public m1(AbstractList abstractList, ListIterator listIterator, int i10) {
        super(listIterator);
        this.B = i10;
        this.C = abstractList;
    }

    @Override
    public final Object a(Object obj) {
        switch (this.B) {
            case 0:
                return ((n1) this.C).B.apply(obj);
            default:
                return ((o1) this.C).B.apply(obj);
        }
    }

    @Override
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean hasPrevious() {
        return ((ListIterator) this.A).hasPrevious();
    }

    @Override
    public final int nextIndex() {
        return ((ListIterator) this.A).nextIndex();
    }

    @Override
    public final Object previous() {
        return a(((ListIterator) this.A).previous());
    }

    @Override
    public final int previousIndex() {
        return ((ListIterator) this.A).previousIndex();
    }

    @Override
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
