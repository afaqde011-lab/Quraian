package x00;

import java.io.Serializable;

public final class c extends d implements Serializable {
    @Override
    public final int a(int i) {
        return d.B.a(i);
    }

    @Override
    public final int b() {
        return d.B.b();
    }

    @Override
    public final int c() {
        throw null;
    }

    @Override
    public final long d() {
        return d.B.d();
    }

    @Override
    public final long e(long j, long j2) {
        return d.B.e(j, j2);
    }

    public final float f() {
        return d.B.f().nextFloat();
    }
}
