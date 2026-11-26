package dh;

import com.google.android.gms.internal.measurement.z3;

public final class g extends h {
    public final transient int C;
    public final transient int D;
    public final h E;

    public g(h hVar, int i10, int i11) {
        this.E = hVar;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final int b() {
        return this.E.c() + this.C + this.D;
    }

    @Override
    public final int c() {
        return this.E.c() + this.C;
    }

    @Override
    public final Object[] e() {
        return this.E.e();
    }

    @Override
    public final Object get(int i10) {
        z3.n(i10, this.D);
        return this.E.get(i10 + this.C);
    }

    @Override
    public final h subList(int i10, int i11) {
        z3.p(i10, i11, this.D);
        int i12 = this.C;
        return this.E.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.D;
    }
}
