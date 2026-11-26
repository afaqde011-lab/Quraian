package nf;

import java.util.Objects;

public final class z extends o {
    public static final z E = new z(0, new Object[0]);
    public final transient Object[] C;
    public final transient int D;

    public z(int i10, Object[] objArr) {
        this.C = objArr;
        this.D = i10;
    }

    @Override
    public final int a(Object[] objArr) {
        Object[] objArr2 = this.C;
        int i10 = this.D;
        System.arraycopy(objArr2, 0, objArr, 0, i10);
        return i10;
    }

    @Override
    public final int b() {
        return this.D;
    }

    @Override
    public final int c() {
        return 0;
    }

    @Override
    public final Object get(int i10) {
        b.e(i10, this.D);
        Object obj = this.C[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final Object[] h() {
        return this.C;
    }

    @Override
    public final int size() {
        return this.D;
    }
}
