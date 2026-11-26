package fh;

public final class c2 extends l0 {
    public static final c2 I = new c2();
    public final transient Object D;
    public final transient Object[] E;
    public final transient int F;
    public final transient int G;
    public final transient c2 H;

    public c2() {
        this.D = null;
        this.E = new Object[0];
        this.F = 0;
        this.G = 0;
        this.H = this;
    }

    public c2(int i10, Object[] objArr) {
        this.E = objArr;
        this.G = i10;
        this.F = 0;
        int iL = i10 >= 2 ? e1.l(i10) : 0;
        Object objI = i2.i(objArr, i10, iL, 0);
        if (objI instanceof Object[]) {
            throw ((v0) ((Object[]) objI)[2]).a();
        }
        this.D = objI;
        Object objI2 = i2.i(objArr, i10, iL, 1);
        if (objI2 instanceof Object[]) {
            throw ((v0) ((Object[]) objI2)[2]).a();
        }
        this.H = new c2(objI2, objArr, i10, this);
    }

    public c2(Object obj, Object[] objArr, int i10, c2 c2Var) {
        this.D = obj;
        this.E = objArr;
        this.F = 1;
        this.G = i10;
        this.H = c2Var;
    }

    @Override
    public final f2 c() {
        return new f2(this, this.E, this.F, this.G);
    }

    @Override
    public final g2 d() {
        return new g2(this, new h2(this.E, this.F, this.G));
    }

    @Override
    public final Object get(Object obj) {
        Object objJ = i2.j(this.D, this.E, this.G, this.F, obj);
        if (objJ == null) {
            return null;
        }
        return objJ;
    }

    @Override
    public final int size() {
        return this.G;
    }
}
