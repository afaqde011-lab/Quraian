package q30;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements j {
    public final AtomicReference a;

    public a(j jVar) {
        this.a = new AtomicReference(jVar);
    }

    @Override
    public final Iterator iterator() {
        j jVar = (j) this.a.getAndSet(null);
        if (jVar != null) {
            return jVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
