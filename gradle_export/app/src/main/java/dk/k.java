package dk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class k implements Iterator {
    public m A;
    public m B = null;
    public int C;
    public final n D;
    public final int E;

    public k(n nVar, int i10) {
        this.E = i10;
        this.D = nVar;
        this.A = nVar.F.D;
        this.C = nVar.E;
    }

    public final Object a() {
        return b();
    }

    public final m b() {
        m mVar = this.A;
        n nVar = this.D;
        if (mVar == nVar.F) {
            throw new NoSuchElementException();
        }
        if (nVar.E != this.C) {
            throw new ConcurrentModificationException();
        }
        this.A = mVar.D;
        this.B = mVar;
        return mVar;
    }

    @Override
    public final boolean hasNext() {
        return this.A != this.D.F;
    }

    @Override
    public Object next() {
        switch (this.E) {
            case 1:
                return b().F;
            default:
                return a();
        }
    }

    @Override
    public final void remove() {
        m mVar = this.B;
        if (mVar == null) {
            throw new IllegalStateException();
        }
        n nVar = this.D;
        nVar.d(mVar, true);
        this.B = null;
        this.C = nVar.E;
    }
}
