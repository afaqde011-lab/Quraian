package g1;

public final class m3 implements u00.n {
    public final int A = 2;
    public final b2.r B;
    public final boolean C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final g00.e I;

    public m3(int i10, int i11, b2.r rVar, b2.r rVar2, ip.a aVar, u00.a aVar2, v1.c cVar, boolean z10) {
        this.F = aVar2;
        this.B = rVar;
        this.G = rVar2;
        this.H = aVar;
        this.C = z10;
        this.I = cVar;
        this.D = i10;
        this.E = i11;
    }

    public m3(b2.r rVar, String str, u00.k kVar, jk.a aVar, boolean z10, u00.k kVar2, int i10, int i11) {
        this.B = rVar;
        this.F = str;
        this.G = kVar;
        this.H = aVar;
        this.C = z10;
        this.I = kVar2;
        this.D = i10;
        this.E = i11;
    }

    public m3(u00.a aVar, b2.r rVar, boolean z10, l3 l3Var, i2.t0 t0Var, v1.c cVar, int i10, int i11) {
        this.F = aVar;
        this.B = rVar;
        this.C = z10;
        this.G = l3Var;
        this.H = t0Var;
        this.I = cVar;
        this.D = i10;
        this.E = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                x5.d((u00.a) this.F, this.B, this.C, (l3) this.G, (i2.t0) this.H, this.I, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            case 1:
                ((Integer) obj2).getClass();
                kx.a.h(this.B, (String) this.F, (u00.k) this.G, (jk.a) this.H, this.C, this.I, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                up.f.a((u00.a) this.F, this.B, (b2.r) this.G, (ip.a) this.H, this.C, this.I, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
        }
        return g00.b0.a;
    }
}
