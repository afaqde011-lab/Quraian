package fh;

import java.util.AbstractMap;
import java.util.Objects;

public final class e2 extends t0 {
    public final f2 C;

    public e2(f2 f2Var) {
        this.C = f2Var;
    }

    @Override
    public final Object get(int i10) {
        f2 f2Var = this.C;
        ta.c0.u(i10, f2Var.G);
        Object[] objArr = f2Var.E;
        int i11 = i10 * 2;
        int i12 = f2Var.F;
        Object obj = objArr[i11 + i12];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i11 + (i12 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override
    public final boolean i() {
        return true;
    }

    @Override
    public final int size() {
        return this.C.G;
    }
}
