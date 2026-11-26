package tm;

import bt.a2;
import d40.j;
import g00.b0;

public final class d implements d40.i {
    public final a2 A;
    public final e B;
    public final float C;

    public d(a2 a2Var, e eVar, float f) {
        this.A = a2Var;
        this.B = eVar;
        this.C = f;
    }

    @Override
    public final Object collect(j jVar, k00.c cVar) throws Throwable {
        Object objCollect = this.A.collect(new iv.f(jVar, this.B, this.C), cVar);
        return objCollect == l00.a.A ? objCollect : b0.a;
    }
}
