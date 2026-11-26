package g1;

public final class k7 implements u00.n {
    public final int A;
    public final h B;
    public final b2.r C;
    public final a7 D;
    public final boolean E;
    public final int F;

    public k7(b2.r rVar, h hVar, a7 a7Var, boolean z10, int i10) {
        this.A = 2;
        this.C = rVar;
        this.B = hVar;
        this.D = a7Var;
        this.E = z10;
        this.F = i10;
    }

    public k7(h hVar, b2.r rVar, a7 a7Var, boolean z10, int i10, int i11) {
        this.A = i11;
        this.B = hVar;
        this.C = rVar;
        this.D = a7Var;
        this.E = z10;
        this.F = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                z7.r(l1.q.K(this.F | 1), this.C, this.B, this.D, (l1.j) obj, this.E);
                break;
            case 1:
                ((Integer) obj2).getClass();
                z7.h(l1.q.K(this.F | 1), this.C, this.B, this.D, (l1.j) obj, this.E);
                break;
            default:
                ((Integer) obj2).intValue();
                z7.c(l1.q.K(this.F | 1), this.C, this.B, this.D, (l1.j) obj, this.E);
                break;
        }
        return g00.b0.a;
    }
}
