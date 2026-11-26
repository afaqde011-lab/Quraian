package mb;

public final class z extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 1;
    public final b2.r B;
    public final u00.k C;
    public final b2.d D;
    public final u00.k E;
    public final v1.c F;
    public final int G;
    public final int H;
    public final Object I;
    public final Object J;

    public z(Object obj, b2.r rVar, u00.k kVar, b2.d dVar, String str, u00.k kVar2, v1.c cVar, int i10, int i11) {
        super(2);
        this.I = obj;
        this.B = rVar;
        this.C = kVar;
        this.D = dVar;
        this.J = str;
        this.E = kVar2;
        this.F = cVar;
        this.G = i10;
        this.H = i11;
    }

    public z(m mVar, b2.r rVar, u00.k kVar, u00.k kVar2, b2.d dVar, z2.p pVar, v1.c cVar, int i10, int i11) {
        super(2);
        this.I = mVar;
        this.B = rVar;
        this.C = kVar;
        this.E = kVar2;
        this.D = dVar;
        this.J = pVar;
        this.F = cVar;
        this.G = i10;
        this.H = i11;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                m mVar = (m) this.I;
                z2.p pVar = (z2.p) this.J;
                l.e(mVar, this.B, this.C, this.E, this.D, pVar, this.F, (l1.j) obj, l1.q.K(this.G | 1), l1.q.K(this.H));
                break;
            default:
                ((Number) obj2).intValue();
                String str = (String) this.J;
                w.m.a(this.I, this.B, this.C, this.D, str, this.E, this.F, (l1.j) obj, l1.q.K(this.G | 1), this.H);
                break;
        }
        return g00.b0.a;
    }
}
