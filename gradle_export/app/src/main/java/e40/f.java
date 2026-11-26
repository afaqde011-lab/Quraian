package e40;

import g00.b0;

public final class f extends e {
    public f(d40.i iVar, k00.i iVar2, int i, c40.a aVar, int i2) {
        super((i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? c40.a.A : aVar, iVar, (i2 & 2) != 0 ? k00.j.A : iVar2);
    }

    @Override
    public final d e(k00.i iVar, int i, c40.a aVar) {
        return new f(i, aVar, this.D, iVar);
    }

    @Override
    public final d40.i g() {
        return this.D;
    }

    @Override
    public final Object i(d40.j jVar, k00.c cVar) {
        Object objCollect = this.D.collect(jVar, cVar);
        return objCollect == l00.a.A ? objCollect : b0.a;
    }
}
