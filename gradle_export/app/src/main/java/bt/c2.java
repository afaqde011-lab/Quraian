package bt;

public final class c2 implements d40.i {
    public final int A;
    public final t1 B;
    public final j2 C;

    public c2(t1 t1Var, j2 j2Var, int i) {
        this.A = i;
        this.B = t1Var;
        this.C = j2Var;
    }

    @Override
    public final Object collect(d40.j jVar, k00.c cVar) {
        switch (this.A) {
            case 0:
                Object objCollect = this.B.collect(new b1.g(jVar, this.C, 1), cVar);
                return objCollect == l00.a.A ? objCollect : g00.b0.a;
            default:
                Object objCollect2 = this.B.collect(new m1(jVar, this.C, 8), cVar);
                return objCollect2 == l00.a.A ? objCollect2 : g00.b0.a;
        }
    }
}
