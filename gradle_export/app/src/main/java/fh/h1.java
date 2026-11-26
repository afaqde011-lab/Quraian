package fh;

import java.util.Iterator;

public final class h1 extends r2 {
    public final eh.k B;

    public h1(Iterator it, eh.k kVar) {
        super(it);
        this.B = kVar;
    }

    @Override
    public final Object a(Object obj) {
        return this.B.apply(obj);
    }
}
