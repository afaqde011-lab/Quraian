package g1;

public final class l7 implements u00.n {
    public final int A = 0;
    public final b2.r B;
    public final Object C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public l7(b2.r rVar, r3.w wVar, u00.k kVar, b8 b8Var, int i10, q0.i1 i1Var, q0.h1 h1Var, a7 a7Var, int i11) {
        this.B = rVar;
        this.E = wVar;
        this.C = kVar;
        this.F = b8Var;
        this.D = i10;
        this.G = i1Var;
        this.H = h1Var;
        this.I = a7Var;
    }

    public l7(lo.b bVar, to.a aVar, b2.r rVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, u00.a aVar5, int i10, int i11) {
        this.E = bVar;
        this.C = aVar;
        this.B = rVar;
        this.F = aVar2;
        this.G = aVar3;
        this.H = aVar4;
        this.I = aVar5;
        this.D = i11;
    }

    public l7(q9.g gVar, t9.d dVar, b2.r rVar, b2.d dVar2, u00.k kVar, u00.k kVar2, u00.n nVar, int i10) {
        this.E = gVar;
        this.F = dVar;
        this.B = rVar;
        this.G = dVar2;
        this.C = kVar;
        this.H = kVar2;
        this.I = nVar;
        this.D = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(24577);
                z7.m(this.B, (r3.w) this.E, (u00.k) this.C, (b8) this.F, this.D, (q0.i1) this.G, (q0.h1) this.H, (a7) this.I, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                p30.f.P((q9.g) this.E, (t9.d) this.F, this.B, (b2.d) this.G, (u00.k) this.C, (u00.k) this.H, (u00.n) this.I, (l1.j) obj, l1.q.K(this.D | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                to.b.a((lo.b) this.E, (to.a) this.C, this.B, (u00.a) this.F, (u00.a) this.G, (u00.a) this.H, (u00.a) this.I, (l1.j) obj, iK2, this.D);
                break;
        }
        return g00.b0.a;
    }
}
