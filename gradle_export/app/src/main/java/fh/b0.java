package fh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b0 implements Iterator {
    public int A;
    public int B;
    public int C;
    public final c0 D;

    public b0(c0 c0Var) {
        this.D = c0Var;
        this.A = c0Var.D;
        this.B = c0Var.isEmpty() ? -1 : 0;
        this.C = -1;
    }

    @Override
    public final boolean hasNext() {
        return this.B >= 0;
    }

    @Override
    public final Object next() {
        c0 c0Var = this.D;
        if (c0Var.D != this.A) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        this.C = i10;
        Object obj = c0Var.e()[i10];
        int i11 = this.B + 1;
        if (i11 >= c0Var.E) {
            i11 = -1;
        }
        this.B = i11;
        return obj;
    }

    @Override
    public final void remove() {
        c0 c0Var = this.D;
        if (c0Var.D != this.A) {
            throw new ConcurrentModificationException();
        }
        ta.c0.z("no calls to next() since the last call to remove()", this.C >= 0);
        this.A += 32;
        c0Var.remove(c0Var.e()[this.C]);
        this.B--;
        this.C = -1;
    }
}
