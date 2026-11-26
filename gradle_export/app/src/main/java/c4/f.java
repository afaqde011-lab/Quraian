package c4;

import qd.s0;

public final class f extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final b2.r B;
    public final u00.n C;
    public final int D;

    public f(b2.r rVar, u00.n nVar, int i10, int i11) {
        super(2);
        this.A = i11;
        this.B = rVar;
        this.C = nVar;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Number) obj2).intValue();
        switch (i10) {
            case 0:
                s0.M(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                z2.d0.b(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
