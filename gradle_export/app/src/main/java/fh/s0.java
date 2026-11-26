package fh;

import java.util.Iterator;
import java.util.ListIterator;

public final class s0 extends t0 {
    public final transient int C;
    public final transient int D;
    public final t0 E;

    public s0(t0 t0Var, int i10, int i11) {
        this.E = t0Var;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final Object[] c() {
        return this.E.c();
    }

    @Override
    public final int e() {
        return this.E.h() + this.C + this.D;
    }

    @Override
    public final Object get(int i10) {
        ta.c0.u(i10, this.D);
        return this.E.get(i10 + this.C);
    }

    @Override
    public final int h() {
        return this.E.h() + this.C;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override
    public final ListIterator listIterator(int i10) {
        return listIterator(i10);
    }

    @Override
    public final int size() {
        return this.D;
    }

    @Override
    public final t0 subList(int i10, int i11) {
        ta.c0.y(i10, i11, this.D);
        int i12 = this.C;
        return this.E.subList(i10 + i12, i11 + i12);
    }
}
