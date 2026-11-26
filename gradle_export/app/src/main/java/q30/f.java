package q30;

import java.util.Iterator;

public final class f implements j {
    public final j a;
    public final boolean b;
    public final u00.k c;

    public f(j jVar, boolean z, u00.k kVar) {
        this.a = jVar;
        this.b = z;
        this.c = kVar;
    }

    @Override
    public final Iterator iterator() {
        return new e(this);
    }
}
