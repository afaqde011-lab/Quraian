package fh;

import java.util.Objects;

public final class d2 extends t0 {
    public static final d2 E = new d2(0, new Object[0]);
    public final transient Object[] C;
    public final transient int D;

    public d2(int i10, Object[] objArr) {
        this.C = objArr;
        this.D = i10;
    }

    @Override
    public final int b(int i10, Object[] objArr) {
        Object[] objArr2 = this.C;
        int i11 = this.D;
        System.arraycopy(objArr2, 0, objArr, i10, i11);
        return i10 + i11;
    }

    @Override
    public final Object[] c() {
        return this.C;
    }

    @Override
    public final int e() {
        return this.D;
    }

    @Override
    public final Object get(int i10) {
        ta.c0.u(i10, this.D);
        Object obj = this.C[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int h() {
        return 0;
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final int size() {
        return this.D;
    }
}
