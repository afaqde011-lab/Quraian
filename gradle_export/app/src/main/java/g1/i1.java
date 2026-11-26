package g1;

public final class i1 implements u00.n {
    public final int A = 0;
    public final long B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public i1(l1 l1Var, Long l, int i10, r1 r1Var, b2.r rVar, long j9, int i11) {
        this.D = l1Var;
        this.E = l;
        this.C = i10;
        this.F = r1Var;
        this.G = rVar;
        this.B = j9;
    }

    public i1(String str, String str2, b2.r rVar, long j9, String str3, int i10, int i11) {
        this.D = str;
        this.E = str2;
        this.G = rVar;
        this.B = j9;
        this.F = str3;
        this.C = i11;
    }

    public i1(u00.a aVar, long j9, u4 u4Var, x.b bVar, v1.c cVar, int i10) {
        this.D = aVar;
        this.B = j9;
        this.E = u4Var;
        this.F = bVar;
        this.G = cVar;
        this.C = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(199681);
                ((l1) this.D).a((Long) this.E, this.C, (r1) this.F, (b2.r) this.G, this.B, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                x5.g((u00.a) this.D, this.B, (u4) this.E, (x.b) this.F, (v1.c) this.G, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                kz.a.f((String) this.D, (String) this.E, (b2.r) this.G, this.B, (String) this.F, (l1.j) obj, iK2, this.C);
                break;
        }
        return g00.b0.a;
    }
}
