package ut;

import g00.b0;

public final class j implements d40.i {
    public final int A;
    public final d40.i B;
    public final tt.a C;

    public j(d40.i iVar, tt.a aVar, int i) {
        this.A = i;
        this.B = iVar;
        this.C = aVar;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) {
        switch (this.A) {
            case 0:
                Object objCollect = this.B.collect(new i(jVar, this.C, 0), cVar);
                return objCollect == l00.a.A ? objCollect : b0.a;
            default:
                Object objCollect2 = this.B.collect(new i(jVar, this.C, 1), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : b0.a;
        }
    }
}
