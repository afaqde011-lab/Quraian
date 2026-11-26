package g1;

public final class d7 implements u00.n {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;

    public d7(b2.r rVar, int i10, b8 b8Var, int i11, a7 a7Var, int i12) {
        this.A = 0;
        this.E = rVar;
        this.B = i10;
        this.F = b8Var;
        this.C = i11;
        this.G = a7Var;
        this.D = i12;
    }

    public d7(Object obj, Object obj2, Object obj3, int i10, int i11, int i12, int i13) {
        this.A = i13;
        this.E = obj;
        this.F = obj2;
        this.G = obj3;
        this.B = i10;
        this.C = i11;
        this.D = i12;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                z7.n((b2.r) this.E, this.B, (b8) this.F, this.C, (a7) this.G, (l1.j) obj, l1.q.K(this.D | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ze.d.e((String) this.E, (b6.m) this.F, (n6.e) this.G, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            default:
                ((Integer) obj2).getClass();
                ox.a.f((b2.r) this.E, (String) this.F, (u00.k) this.G, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
        }
        return g00.b0.a;
    }
}
