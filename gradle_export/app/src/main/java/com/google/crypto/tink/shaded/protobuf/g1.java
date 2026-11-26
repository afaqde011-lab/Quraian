package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;

public final class g1 implements Iterator {
    public Iterator A;

    @Override
    public final boolean hasNext() {
        return this.A.hasNext();
    }

    @Override
    public final Object next() {
        return (String) this.A.next();
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
