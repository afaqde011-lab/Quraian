package q30;

import java.util.Iterator;

public final class r implements j {
    public final j a;
    public final u00.k b;

    public r(j jVar, u00.k transformer) {
        kotlin.jvm.internal.m.e(transformer, "transformer");
        this.a = jVar;
        this.b = transformer;
    }

    @Override
    public final Iterator iterator() {
        return new q(this);
    }
}
