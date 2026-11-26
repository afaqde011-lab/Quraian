package fh;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class j1 implements Iterator {
    public static final j1 A;
    public static final j1[] B;

    static {
        j1 j1Var = new j1("INSTANCE", 0);
        A = j1Var;
        B = new j1[]{j1Var};
    }

    public static j1 valueOf(String str) {
        return (j1) Enum.valueOf(j1.class, str);
    }

    public static j1[] values() {
        return (j1[]) B.clone();
    }

    @Override
    public final boolean hasNext() {
        return false;
    }

    @Override
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public final void remove() {
        ta.c0.z("no calls to next() since the last call to remove()", false);
    }
}
