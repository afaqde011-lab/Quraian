package dh;

import com.google.android.gms.internal.measurement.z3;
import java.util.Objects;

public final class j extends h {
    public static final j D = new j(new Object[0]);
    public final transient Object[] C;

    public j(Object[] objArr) {
        this.C = objArr;
    }

    @Override
    public final int a(Object[] objArr) {
        System.arraycopy(this.C, 0, objArr, 0, 0);
        return 0;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final int c() {
        return 0;
    }

    @Override
    public final Object[] e() {
        return this.C;
    }

    @Override
    public final Object get(int i10) {
        z3.n(i10, 0);
        Object obj = this.C[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override
    public final int size() {
        return 0;
    }
}
