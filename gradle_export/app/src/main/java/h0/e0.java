package h0;

public final class e0 implements u00.n {
    public final int A = 0;
    public final int B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public e0(b2.r rVar, e eVar, h hVar, b2.h hVar2, int i10, int i11, v1.c cVar, int i12) {
        this.D = rVar;
        this.E = eVar;
        this.F = hVar;
        this.G = hVar2;
        this.B = i10;
        this.C = i11;
        this.H = cVar;
    }

    public e0(oo.z0 z0Var, u00.k kVar, w.u1 u1Var, w.d0 d0Var, oo.k0 k0Var, int i10, int i11) {
        this.D = z0Var;
        this.E = kVar;
        this.F = u1Var;
        this.G = d0Var;
        this.H = k0Var;
        this.B = i10;
        this.C = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1573303);
                c.b((b2.r) this.D, (e) this.E, (h) this.F, (b2.h) this.G, this.B, this.C, (v1.c) this.H, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).intValue();
                oo.o0.r((oo.z0) this.D, (u00.k) this.E, (w.u1) this.F, (w.d0) this.G, (oo.k0) this.H, this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
        }
        return g00.b0.a;
    }
}
