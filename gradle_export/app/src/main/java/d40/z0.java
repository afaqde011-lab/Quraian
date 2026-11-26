package d40;

public final class z0 implements n1, i, e40.m {
    public final n1 A;

    public z0(x0 x0Var) {
        this.A = x0Var;
    }

    @Override
    public final i b(k00.i iVar, int i, c40.a aVar) {
        return (((i < 0 || i >= 2) && i != -2) || aVar != c40.a.B) ? o.w(this, iVar, i, aVar) : this;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) {
        return this.A.collect(jVar, cVar);
    }

    @Override
    public final Object getValue() {
        return this.A.getValue();
    }
}
