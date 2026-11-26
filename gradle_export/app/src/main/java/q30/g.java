package q30;

import java.util.Iterator;

public final class g implements j {
    public final j a;
    public final u00.k b;
    public final u00.k c;

    public g(j jVar, u00.k transformer, u00.k kVar) {
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.a = jVar;
        this.b = transformer;
        this.c = kVar;
    }

    @Override
    public final Iterator iterator() {
        return new e(this);
    }
}
