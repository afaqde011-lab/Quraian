package fh;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class x implements Iterator {
    public int A;
    public int B;
    public int C;
    public final a0 D;
    public final int E;
    public final a0 F;

    public x(a0 a0Var, int i10) {
        this.E = i10;
        this.F = a0Var;
        this.D = a0Var;
        this.A = a0Var.E;
        this.B = a0Var.isEmpty() ? -1 : 0;
        this.C = -1;
    }

    @Override
    public final boolean hasNext() {
        return this.B >= 0;
    }

    @Override
    public final Object next() {
        Object zVar;
        a0 a0Var = this.D;
        if (a0Var.E != this.A) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.B;
        this.C = i10;
        switch (this.E) {
            case 0:
                zVar = this.F.k()[i10];
                break;
            case 1:
                zVar = new z(this.F, i10);
                break;
            default:
                zVar = this.F.l()[i10];
                break;
        }
        int i11 = this.B + 1;
        if (i11 >= a0Var.F) {
            i11 = -1;
        }
        this.B = i11;
        return zVar;
    }

    @Override
    public final void remove() {
        a0 a0Var = this.D;
        if (a0Var.E != this.A) {
            throw new ConcurrentModificationException();
        }
        ta.c0.z("no calls to next() since the last call to remove()", this.C >= 0);
        this.A += 32;
        a0Var.remove(a0Var.k()[this.C]);
        this.B--;
        this.C = -1;
    }
}
