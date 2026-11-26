package gv;

public final class u implements u00.n {
    public final int A = 2;
    public final boolean B;
    public final boolean C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public u(int i, int i2, String str, String str2, boolean z, boolean z2, u00.a aVar, b2.r rVar, int i3) {
        this.D = i;
        this.E = i2;
        this.F = str;
        this.G = str2;
        this.B = z;
        this.C = z2;
        this.H = aVar;
        this.I = rVar;
    }

    public u(bv.o1 o1Var, u00.k kVar, kk.c cVar, b2.r rVar, boolean z, boolean z2, int i, int i2) {
        this.F = o1Var;
        this.G = kVar;
        this.H = cVar;
        this.I = rVar;
        this.B = z;
        this.C = z2;
        this.D = i;
        this.E = i2;
    }

    public u(boolean z, u00.a aVar, u00.a aVar2, jk.a aVar3, b2.r rVar, boolean z2, int i, int i2) {
        this.B = z;
        this.F = aVar;
        this.G = aVar2;
        this.H = aVar3;
        this.I = rVar;
        this.C = z2;
        this.D = i;
        this.E = i2;
    }

    public u(boolean z, u00.a aVar, u00.a aVar2, u00.a aVar3, boolean z2, u00.a aVar4, int i, int i2) {
        this.B = z;
        this.F = aVar;
        this.G = aVar2;
        this.H = aVar3;
        this.C = z2;
        this.I = aVar4;
        this.D = i;
        this.E = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                v.a((bv.o1) this.F, (u00.k) this.G, (kk.c) this.H, (b2.r) this.I, this.B, this.C, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            case 1:
                ((Integer) obj2).getClass();
                p.q(this.B, (u00.a) this.F, (u00.a) this.G, (u00.a) this.H, this.C, (u00.a) this.I, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(196609);
                st.g.a(this.D, this.E, (String) this.F, (String) this.G, this.B, this.C, (u00.a) this.H, (b2.r) this.I, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.t.a(this.B, (u00.a) this.F, (u00.a) this.G, (jk.a) this.H, (b2.r) this.I, this.C, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
        }
        return g00.b0.a;
    }
}
