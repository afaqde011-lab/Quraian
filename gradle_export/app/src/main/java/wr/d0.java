package wr;

import ur.h1;

public final class d0 implements u00.n {
    public final int A;
    public final h1 B;
    public final u00.k C;
    public final b2.r D;
    public final int E;

    public d0(h1 h1Var, u00.k kVar, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = h1Var;
        this.C = kVar;
        this.D = rVar;
        this.E = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                k.I(this.B, this.C, this.D, jVar, l1.q.K(this.E | 1));
                break;
            default:
                k.W(this.B, this.C, this.D, jVar, l1.q.K(this.E | 1));
                break;
        }
        return g00.b0.a;
    }
}
