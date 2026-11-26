package fh;

import java.util.Objects;

public final class h2 extends t0 {
    public final transient Object[] C;
    public final transient int D;
    public final transient int E;

    public h2(Object[] objArr, int i10, int i11) {
        this.C = objArr;
        this.D = i10;
        this.E = i11;
    }

    @Override
    public final Object get(int i10) {
        ta.c0.u(i10, this.E);
        Object obj = this.C[(i10 * 2) + this.D];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final int size() {
        return this.E;
    }
}
