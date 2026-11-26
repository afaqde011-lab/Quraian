package r;

import java.util.HashMap;

public final class a extends f {
    public final HashMap E = new HashMap();

    @Override
    public final c a(Object obj) {
        return (c) this.E.get(obj);
    }

    @Override
    public final Object b(Object obj) {
        Object objB = super.b(obj);
        this.E.remove(obj);
        return objB;
    }
}
