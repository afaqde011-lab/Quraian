package g1;

public final class t2 implements u00.n {
    public final u00.a A;
    public final b2.r B;
    public final boolean C;
    public final o2.f D;
    public final String E;

    public t2(u00.a aVar, b2.r rVar, boolean z10, o2.f fVar, String str) {
        this.A = aVar;
        this.B = rVar;
        this.C = z10;
        this.D = fVar;
        this.E = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        int iIntValue = ((Number) obj2).intValue();
        l1.g0 g0Var = (l1.g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            x5.d(this.A, this.B, this.C, null, null, v1.d.d(-1301085432, new w(this.D, this.E, 3), jVar), jVar, 1572864, 56);
        } else {
            g0Var.V();
        }
        return g00.b0.a;
    }
}
