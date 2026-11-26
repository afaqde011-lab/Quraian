package is;

import bt.p1;
import bt.t1;
import bt.y1;

public final class w0 implements d40.i {
    public final int A;
    public final int B;
    public final d40.i C;

    public w0(d40.i iVar, int i, int i2) {
        this.A = i2;
        this.C = iVar;
        this.B = i;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) throws Throwable {
        switch (this.A) {
            case 0:
                Object objCollect = ((t1) this.C).collect(new p1(jVar, this.B, 1), cVar);
                return objCollect == l00.a.A ? objCollect : g00.b0.a;
            default:
                Object objCollect2 = ((y1) this.C).collect(new p1(jVar, this.B, 2), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : g00.b0.a;
        }
    }
}
