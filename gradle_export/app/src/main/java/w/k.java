package w;

public final class k extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 0;
    public final x.n1 B;
    public final u00.k C;
    public final b2.r D;
    public final v1.c E;
    public final int F;
    public final Object G;
    public final Object H;

    public k(x.n1 n1Var, b2.r rVar, u00.k kVar, b2.d dVar, u00.k kVar2, v1.c cVar, int i10) {
        super(2);
        this.B = n1Var;
        this.D = rVar;
        this.C = kVar;
        this.H = dVar;
        this.G = kVar2;
        this.E = cVar;
        this.F = i10;
    }

    public k(x.n1 n1Var, u00.k kVar, b2.r rVar, x0 x0Var, y0 y0Var, v1.c cVar, int i10) {
        super(2);
        this.B = n1Var;
        this.C = kVar;
        this.D = rVar;
        this.G = x0Var;
        this.H = y0Var;
        this.E = cVar;
        this.F = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                b2.d dVar = (b2.d) this.H;
                u00.k kVar = (u00.k) this.G;
                m.b(this.B, this.D, this.C, dVar, kVar, this.E, (l1.j) obj, l1.q.K(this.F | 1));
                break;
            default:
                ((Number) obj2).intValue();
                x0 x0Var = (x0) this.G;
                y0 y0Var = (y0) this.H;
                c0.e(this.B, this.C, this.D, x0Var, y0Var, this.E, (l1.j) obj, l1.q.K(this.F | 1));
                break;
        }
        return g00.b0.a;
    }
}
