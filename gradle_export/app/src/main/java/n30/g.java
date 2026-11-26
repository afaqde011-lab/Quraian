package n30;

import g00.s;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.m;
import o2.f0;
import o2.h0;
import s1.n;

public final class g implements Iterator, v00.a {
    public final int A = 1;
    public final Iterator B;

    public g(f0 f0Var) {
        this.B = f0Var.J.iterator();
    }

    public g(s1.e eVar) {
        s1.l[] lVarArr = new s1.l[8];
        for (int i = 0; i < 8; i++) {
            lVarArr[i] = new n(this);
        }
        this.B = new s1.f(eVar, lVarArr);
    }

    public g(w30.d builder) {
        m.e(builder, "builder");
        s1.l[] lVarArr = new s1.l[8];
        for (int i = 0; i < 8; i++) {
            lVarArr[i] = new w30.m(this);
        }
        this.B = new w30.e(builder, lVarArr);
    }

    public g(Object[] array) {
        m.e(array, "array");
        this.B = m.i(array);
    }

    @Override
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return ((s) this.B).hasNext();
            case 1:
                return this.B.hasNext();
            case 2:
                return ((s1.d) this.B).C;
            default:
                return ((s1.d) ((w30.e) this.B)).C;
        }
    }

    @Override
    public final Object next() {
        switch (this.A) {
            case 0:
                return ((s) this.B).next();
            case 1:
                return (h0) this.B.next();
            case 2:
                return (Map.Entry) this.B.next();
            default:
                return (Map.Entry) ((w30.e) this.B).next();
        }
    }

    @Override
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                this.B.remove();
                return;
            default:
                ((w30.e) this.B).remove();
                return;
        }
    }
}
