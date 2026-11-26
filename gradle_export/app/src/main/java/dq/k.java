package dq;

import bt.m1;
import d40.z0;
import g00.b0;

public final class k implements d40.i {
    public final int A;
    public final z0 B;

    public k(z0 z0Var, int i) {
        this.A = i;
        this.B = z0Var;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) {
        switch (this.A) {
            case 0:
                Object objCollect = this.B.A.collect(new m1(jVar, 17), cVar);
                return objCollect == l00.a.A ? objCollect : b0.a;
            case 1:
                Object objCollect2 = this.B.A.collect(new no.b(jVar, 1), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : b0.a;
            case 2:
                Object objCollect3 = this.B.A.collect(new no.b(jVar, 2), cVar);
                return objCollect3 == l00.a.A ? objCollect3 : b0.a;
            case 3:
                Object objCollect4 = this.B.A.collect(new no.b(jVar, 3), cVar);
                return objCollect4 == l00.a.A ? objCollect4 : b0.a;
            case 4:
                Object objCollect5 = this.B.A.collect(new no.b(jVar, 4), cVar);
                return objCollect5 == l00.a.A ? objCollect5 : b0.a;
            default:
                Object objCollect6 = this.B.A.collect(new no.b(jVar, 10), cVar);
                return objCollect6 == l00.a.A ? objCollect6 : b0.a;
        }
    }
}
