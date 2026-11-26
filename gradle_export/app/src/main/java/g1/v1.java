package g1;

public final class v1 implements u00.n {
    public final int A = 0;
    public final boolean B;
    public final b2.r C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public v1(b3 b3Var, b2.r rVar, r1 r1Var, h1 h1Var, v1.c cVar, u00.n nVar, boolean z10, g2.t tVar, int i10) {
        this.D = b3Var;
        this.C = rVar;
        this.E = r1Var;
        this.F = h1Var;
        this.G = cVar;
        this.H = nVar;
        this.B = z10;
        this.I = tVar;
    }

    public v1(String str, u30.b bVar, u00.k kVar, boolean z10, u30.b bVar2, b2.r rVar, o2.f fVar, u00.a aVar, int i10) {
        this.D = str;
        this.E = bVar;
        this.F = kVar;
        this.B = z10;
        this.G = bVar2;
        this.C = rVar;
        this.H = fVar;
        this.I = aVar;
    }

    public v1(m2.b bVar, String str, String str2, String str3, u00.a aVar, boolean z10, u00.k kVar, b2.r rVar, int i10) {
        this.D = bVar;
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = aVar;
        this.B = z10;
        this.I = kVar;
        this.C = rVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(12607489);
                a3.b((b3) this.D, this.C, (r1) this.E, (h1) this.F, (v1.c) this.G, (u00.n) this.H, this.B, (g2.t) this.I, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1572873);
                rl.d.a((m2.b) this.D, (String) this.E, (String) this.F, (String) this.G, (u00.a) this.H, this.B, (u00.k) this.I, this.C, (l1.j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(65);
                wr.k.K((String) this.D, (u30.b) this.E, (u00.k) this.F, this.B, (u30.b) this.G, this.C, (o2.f) this.H, (u00.a) this.I, (l1.j) obj, iK3);
                break;
        }
        return g00.b0.a;
    }
}
