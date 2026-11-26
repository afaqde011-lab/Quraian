package q0;

public final class l0 implements u00.n {
    public final int A;
    public final e1.v0 B;
    public final v1.c C;
    public final int D;

    public l0(e1.v0 v0Var, v1.c cVar, int i10, int i11) {
        this.A = i11;
        this.B = v0Var;
        this.C = cVar;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i10) {
            case 0:
                q.f(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                q.h(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
