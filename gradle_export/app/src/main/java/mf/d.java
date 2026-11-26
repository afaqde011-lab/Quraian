package mf;

import c7.i;

public final class d extends e {
    public final transient int C;
    public final transient int D;
    public final e E;

    public d(e eVar, int i10, int i11) {
        this.E = eVar;
        this.C = i10;
        this.D = i11;
    }

    @Override
    public final Object[] a() {
        return this.E.a();
    }

    @Override
    public final int b() {
        return this.E.b() + this.C;
    }

    @Override
    public final int c() {
        return this.E.b() + this.C + this.D;
    }

    @Override
    public final Object get(int i10) {
        i.b0(i10, this.D);
        return this.E.get(i10 + this.C);
    }

    @Override
    public final e subList(int i10, int i11) {
        i.c0(i10, i11, this.D);
        int i12 = this.C;
        return this.E.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.D;
    }
}
