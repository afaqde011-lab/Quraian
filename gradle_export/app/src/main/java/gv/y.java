package gv;

import java.time.LocalDate;

public final class y implements u00.n {
    public final int A;
    public final boolean B;
    public final int C;
    public final int D;
    public final Object E;
    public final Object F;
    public final Object G;

    public y(b2.r rVar, b2.d dVar, boolean z, v1.c cVar, int i, int i2) {
        this.A = 1;
        this.E = rVar;
        this.F = dVar;
        this.B = z;
        this.G = cVar;
        this.C = i;
        this.D = i2;
    }

    public y(Object obj, u00.k kVar, Object obj2, boolean z, int i, int i2, int i3) {
        this.A = i3;
        this.E = obj;
        this.F = kVar;
        this.G = obj2;
        this.B = z;
        this.C = i;
        this.D = i2;
    }

    public y(String str, u00.k kVar, b2.r rVar, boolean z, int i, int i2, int i3) {
        this.A = 3;
        this.E = str;
        this.F = kVar;
        this.G = rVar;
        this.B = z;
        this.C = i;
        this.D = i3;
    }

    public y(u00.a aVar, u00.a aVar2, b2.r rVar, boolean z, int i, int i2) {
        this.A = 7;
        this.G = aVar;
        this.E = aVar2;
        this.F = rVar;
        this.B = z;
        this.C = i;
        this.D = i2;
    }

    public y(yu.a aVar, boolean z, iv.m mVar, b2.r rVar, int i, int i2) {
        this.A = 2;
        this.E = aVar;
        this.B = z;
        this.F = mVar;
        this.G = rVar;
        this.C = i;
        this.D = i2;
    }

    public y(boolean z, u00.n nVar, u00.a aVar, b2.r rVar, int i, int i2, int i3) {
        this.A = 4;
        this.B = z;
        this.E = nVar;
        this.G = aVar;
        this.F = rVar;
        this.C = i;
        this.D = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                p.p((bv.o1) this.E, (u00.k) this.F, (u00.a) this.G, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            case 1:
                ((Integer) obj2).getClass();
                h0.c.a((b2.r) this.E, (b2.d) this.F, this.B, (v1.c) this.G, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            case 2:
                ((Integer) obj2).getClass();
                iv.a.a((yu.a) this.E, this.B, (iv.m) this.F, (b2.r) this.G, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(3073);
                ix.a.g((String) this.E, (u00.k) this.F, (b2.r) this.G, this.B, this.C, (l1.j) obj, iK, this.D);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                f50.c.k(this.B, (u00.n) this.E, (u00.a) this.G, (b2.r) this.F, this.C, this.D, (l1.j) obj, iK2);
                break;
            case 5:
                ((Integer) obj2).getClass();
                pp.c.b((LocalDate) this.E, (u00.k) this.F, (b2.r) this.G, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            case 6:
                ((Integer) obj2).getClass();
                pp.h.c((ep.f) this.E, (u00.k) this.F, (b2.r) this.G, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.b((u00.a) this.G, (u00.a) this.E, (b2.r) this.F, this.B, (l1.j) obj, l1.q.K(this.C | 1), this.D);
                break;
        }
        return g00.b0.a;
    }
}
