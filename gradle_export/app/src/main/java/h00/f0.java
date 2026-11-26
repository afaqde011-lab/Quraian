package h00;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class f0 extends h {
    public final List A;

    public f0(List delegate) {
        kotlin.jvm.internal.m.e(delegate, "delegate");
        this.A = delegate;
    }

    @Override
    public final int a() {
        return this.A.size();
    }

    @Override
    public final void add(int i, Object obj) {
        this.A.add(q.B0(i, this), obj);
    }

    @Override
    public final Object c(int i) {
        return this.A.remove(q.A0(i, this));
    }

    @Override
    public final void clear() {
        this.A.clear();
    }

    @Override
    public final Object get(int i) {
        return this.A.get(q.A0(i, this));
    }

    @Override
    public final Iterator iterator() {
        return new e0(this, 0);
    }

    @Override
    public final ListIterator listIterator() {
        return new e0(this, 0);
    }

    @Override
    public final ListIterator listIterator(int i) {
        return new e0(this, i);
    }

    @Override
    public final Object set(int i, Object obj) {
        return this.A.set(q.A0(i, this), obj);
    }
}
