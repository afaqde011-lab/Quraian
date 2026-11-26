package x30;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.m;

public final class f implements Iterator, v00.a {
    public Object A;
    public final d B;
    public Object C;
    public boolean D;
    public int E;
    public int F;

    public f(Object obj, d builder) {
        m.e(builder, "builder");
        this.A = obj;
        this.B = builder;
        this.C = z30.b.a;
        this.E = builder.D.E;
    }

    @Override
    public final a next() {
        d dVar = this.B;
        if (dVar.D.E != this.E) {
            throw new ConcurrentModificationException();
        }
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = this.A;
        this.C = obj;
        this.D = true;
        this.F++;
        V v = dVar.D.get(obj);
        if (v != 0) {
            a aVar = (a) v;
            this.A = aVar.c;
            return aVar;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.A + ") has changed after it was added to the persistent map.");
    }

    @Override
    public final boolean hasNext() {
        return this.F < this.B.e();
    }

    @Override
    public final void remove() {
        if (!this.D) {
            throw new IllegalStateException();
        }
        Object obj = this.C;
        d dVar = this.B;
        d0.b(dVar).remove(obj);
        this.C = null;
        this.D = false;
        this.E = dVar.D.E;
        this.F--;
    }
}
