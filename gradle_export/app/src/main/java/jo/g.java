package jo;

import g00.b0;

public final class g implements d40.i {
    public final int A;
    public final d40.i B;
    public final String C;

    public g(d40.i iVar, String str, int i) {
        this.A = i;
        this.B = iVar;
        this.C = str;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) {
        switch (this.A) {
            case 0:
                Object objCollect = this.B.collect(new f(jVar, this.C, 0), cVar);
                return objCollect == l00.a.A ? objCollect : b0.a;
            case 1:
                Object objCollect2 = this.B.collect(new f(jVar, this.C, 1), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : b0.a;
            default:
                Object objCollect3 = this.B.collect(new f(jVar, this.C, 2), cVar);
                return objCollect3 == l00.a.A ? objCollect3 : b0.a;
        }
    }
}
