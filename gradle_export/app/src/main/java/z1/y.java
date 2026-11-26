package z1;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

public final class y implements Iterator, v00.a {
    public final s A;
    public final Iterator B;
    public int C;
    public Map.Entry D;
    public Map.Entry E;
    public final int F;

    public y(s sVar, Iterator it, int i10) {
        this.F = i10;
        this.A = sVar;
        this.B = it;
        this.C = sVar.h().f17052d;
        a();
    }

    public final void a() {
        this.D = this.E;
        Iterator it = this.B;
        this.E = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    @Override
    public final boolean hasNext() {
        return this.E != null;
    }

    @Override
    public final Object next() {
        switch (this.F) {
            case 0:
                a();
                if (this.D != null) {
                    return new x(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.E;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = this.E;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }

    @Override
    public final void remove() {
        s sVar = this.A;
        if (sVar.h().f17052d != this.C) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = this.D;
        if (entry == null) {
            throw new IllegalStateException();
        }
        sVar.remove(entry.getKey());
        this.D = null;
        this.C = sVar.h().f17052d;
    }
}
