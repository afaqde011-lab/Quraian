package tq;

import bt.y1;
import g00.b0;

public final class h implements d40.i {
    public final y1 A;
    public final long B;

    public h(y1 y1Var, long j) {
        this.A = y1Var;
        this.B = j;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) throws Throwable {
        Object objCollect = this.A.collect(new g(jVar, this.B), cVar);
        return objCollect == l00.a.A ? objCollect : b0.a;
    }
}
