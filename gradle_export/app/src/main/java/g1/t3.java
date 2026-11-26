package g1;

public final class t3 implements u00.n {
    public final int A;
    public final Object B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public t3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, int i11) {
        this.A = i11;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
        this.B = obj5;
        this.C = i10;
    }

    public t3(String str, String str2, b2.r rVar, String str3, u00.a aVar, int i10, int i11) {
        this.A = 2;
        this.D = str;
        this.E = str2;
        this.F = rVar;
        this.G = str3;
        this.B = aVar;
        this.C = i11;
    }

    public t3(v1.c cVar, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.A = 4;
        this.B = cVar;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
        this.G = obj4;
        this.C = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                u3.a((q0) this.D, (x4) this.E, (f6) this.F, (l8) this.G, (v1.c) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                h0.c.c((b2.r) this.D, (h0.e) this.E, (h0.h) this.F, (h0.k0) this.G, (v1.c) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                hy.a.a((String) this.D, (String) this.E, (b2.r) this.F, (String) this.G, (u00.a) this.B, (l1.j) obj, l1.q.K(1), this.C);
                break;
            case 3:
                ((Integer) obj2).intValue();
                ro.f.e((lo.l) this.D, (u00.a) this.E, (u00.a) this.F, (u00.a) this.G, (ro.d) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            case 4:
                ((Integer) obj2).intValue();
                ((v1.c) this.B).e(this.D, this.E, this.F, this.G, (l1.j) obj, l1.q.K(this.C) | 1);
                break;
            default:
                ((Integer) obj2).intValue();
                x.c.c((x.n1) this.D, (x.m1) this.E, this.F, this.G, (x.y) this.B, (l1.j) obj, l1.q.K(this.C | 1));
                break;
        }
        return g00.b0.a;
    }
}
