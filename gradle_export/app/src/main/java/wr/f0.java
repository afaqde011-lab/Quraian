package wr;

import ur.h1;

public final class f0 implements u00.n {
    public final int A;
    public final h1 B;
    public final u00.k C;
    public final int D;

    public f0(h1 h1Var, u00.k kVar, int i, int i2) {
        this.A = i2;
        this.B = h1Var;
        this.C = kVar;
        this.D = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                k.T(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
            default:
                k.V(this.B, this.C, jVar, l1.q.K(this.D | 1));
                break;
        }
        return g00.b0.a;
    }
}
