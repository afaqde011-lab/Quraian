package oo;

public final class m0 implements u00.n {
    public final int A = 0;
    public final z0 B;
    public final u00.k C;
    public final boolean D;
    public final b2.r E;

    public m0(z0 z0Var, u00.k kVar, b2.r rVar, boolean z, int i) {
        this.B = z0Var;
        this.C = kVar;
        this.E = rVar;
        this.D = z;
    }

    public m0(z0 z0Var, u00.k kVar, boolean z, b2.r rVar, int i) {
        this.B = z0Var;
        this.C = kVar;
        this.D = z;
        this.E = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                o0.c(l1.q.K(385), this.E, (l1.j) obj, this.B, this.C, this.D);
                break;
            default:
                ((Integer) obj2).getClass();
                o0.m(l1.q.K(1), this.E, (l1.j) obj, this.B, this.C, this.D);
                break;
        }
        return g00.b0.a;
    }
}
