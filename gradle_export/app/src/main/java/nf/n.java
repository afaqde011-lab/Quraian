package nf;

public final class n extends o {
    public final transient int C;
    public final transient int D;
    public final o E;

    public n(o oVar, int i10, int i11) {
        this.E = oVar;
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
    public final Object get(int i10) {
        b.e(i10, this.D);
        return this.E.get(i10 + this.C);
    }

    @Override
    public final Object[] h() {
        return this.E.h();
    }

    @Override
    public final o subList(int i10, int i11) {
        b.m(i10, i11, this.D);
        int i12 = this.C;
        return this.E.subList(i10 + i12, i11 + i12);
    }

    @Override
    public final int size() {
        return this.D;
    }
}
