package g1;

public final class c7 implements u00.n {
    public final int A = 0;
    public final int B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public c7(b2.r rVar, b8 b8Var, a7 a7Var, z2.w0 w0Var, i2.t0 t0Var, i2.t0 t0Var2, int i10) {
        this.C = rVar;
        this.D = b8Var;
        this.E = a7Var;
        this.F = w0Var;
        this.G = t0Var;
        this.H = t0Var2;
        this.B = i10;
    }

    public c7(String str, u30.b bVar, h0.n1 n1Var, h0.t0 t0Var, u00.k kVar, u00.a aVar, int i10, int i11) {
        this.C = str;
        this.D = bVar;
        this.E = n1Var;
        this.F = t0Var;
        this.G = kVar;
        this.H = aVar;
        this.B = i11;
    }

    public c7(v1.c cVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i10) {
        this.C = cVar;
        this.D = obj;
        this.E = bool;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
        this.B = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).intValue();
                z7.i((b2.r) this.C, (b8) this.D, (a7) this.E, (z2.w0) this.F, (i2.t0) this.G, (i2.t0) this.H, (l1.j) obj, l1.q.K(this.B | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ix.o.d((String) this.C, (u30.b) this.D, (h0.n1) this.E, (h0.t0) this.F, (u00.k) this.G, (u00.a) this.H, (l1.j) obj, l1.q.K(65), this.B);
                break;
            default:
                ((Integer) obj2).getClass();
                ((v1.c) this.C).a(this.D, (Boolean) this.E, this.F, this.G, this.H, (l1.j) obj, l1.q.K(this.B) | 1);
                break;
        }
        return g00.b0.a;
    }
}
