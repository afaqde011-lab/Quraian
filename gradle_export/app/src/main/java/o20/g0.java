package o20;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class g0 extends AbstractList implements RandomAccess, s {
    public final r A;

    public g0(r rVar) {
        this.A = rVar;
    }

    @Override
    public final Object get(int i) {
        return (String) this.A.get(i);
    }

    @Override
    public final e getByteString(int i) {
        return this.A.getByteString(i);
    }

    @Override
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.A.A);
    }

    @Override
    public final g0 getUnmodifiableView() {
        return this;
    }

    @Override
    public final Iterator iterator() {
        f0 f0Var = new f0();
        f0Var.B = this.A.iterator();
        return f0Var;
    }

    @Override
    public final void j(t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final ListIterator listIterator(int i) {
        e0 e0Var = new e0();
        e0Var.A = this.A.listIterator(i);
        return e0Var;
    }

    @Override
    public final int size() {
        return this.A.size();
    }
}
