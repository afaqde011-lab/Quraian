package k30;

import java.util.Iterator;

public final class p extends a {
    public final e30.g A;
    public final int B;

    public p(int i, e30.g gVar) {
        this.A = gVar;
        this.B = i;
    }

    @Override
    public final int a() {
        return 1;
    }

    @Override
    public final void c(int i, e30.g gVar) {
        throw new IllegalStateException();
    }

    @Override
    public final Object get(int i) {
        if (i == this.B) {
            return this.A;
        }
        return null;
    }

    @Override
    public final Iterator iterator() {
        return new n30.h(this, 2);
    }
}
