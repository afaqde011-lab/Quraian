package mb;

public final class a extends kotlin.jvm.internal.n implements u00.n {
    public final int A;
    public final b2.r B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;
    public final Object H;

    public a(Object obj, b2.r rVar, Object obj2, Object obj3, Object obj4, int i10, int i11, int i12) {
        super(2);
        this.A = i12;
        this.E = obj;
        this.B = rVar;
        this.F = obj2;
        this.G = obj3;
        this.H = obj4;
        this.C = i10;
        this.D = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                m mVar = (m) this.E;
                u00.k kVar = (u00.k) this.F;
                b2.d dVar = (b2.d) this.G;
                z2.p pVar = (z2.p) this.H;
                l.a(mVar, this.B, kVar, dVar, pVar, (l1.j) obj, l1.q.K(this.C | 1), l1.q.K(this.D));
                break;
            default:
                ((Number) obj2).intValue();
                x.y yVar = (x.y) this.F;
                String str = (String) this.G;
                v1.c cVar = (v1.c) this.H;
                w.c0.f(this.E, this.B, yVar, str, cVar, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
        }
        return g00.b0.a;
    }
}
