package mf;

import c7.i;
import java.util.Objects;

public final class f extends e {
    public static final f E = new f(0, new Object[0]);
    public final transient Object[] C;
    public final transient int D;

    public f(int i10, Object[] objArr) {
        this.C = objArr;
        this.D = i10;
    }

    @Override
    public final Object[] a() {
        return this.C;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final int c() {
        return this.D;
    }

    @Override
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.C;
        int i10 = this.D;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final Object get(int i10) {
        i.b0(i10, this.D);
        Object obj = this.C[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return this.D;
    }
}
