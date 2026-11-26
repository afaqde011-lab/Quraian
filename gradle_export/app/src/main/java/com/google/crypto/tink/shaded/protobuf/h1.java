package com.google.crypto.tink.shaded.protobuf;

import java.util.AbstractList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class h1 extends AbstractList implements e0, RandomAccess {
    public final d0 A;

    public h1(d0 d0Var) {
        this.A = d0Var;
    }

    @Override
    public final void g(i iVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final Object get(int i10) {
        return (String) this.A.get(i10);
    }

    @Override
    public final Object getRaw(int i10) {
        return this.A.B.get(i10);
    }

    @Override
    public final List getUnderlyingElements() {
        return Collections.unmodifiableList(this.A.B);
    }

    @Override
    public final e0 getUnmodifiableView() {
        return this;
    }

    @Override
    public final Iterator iterator() {
        g1 g1Var = new g1();
        g1Var.A = this.A.iterator();
        return g1Var;
    }

    @Override
    public final ListIterator listIterator(int i10) {
        f1 f1Var = new f1();
        f1Var.A = this.A.listIterator(i10);
        return f1Var;
    }

    @Override
    public final int size() {
        return this.A.size();
    }
}
