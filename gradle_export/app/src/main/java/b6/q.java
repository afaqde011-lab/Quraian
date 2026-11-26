package b6;

import g00.b0;

public final class q implements u00.n {
    public final int A = 1;
    public final int B;
    public final String C;
    public final int D;
    public final int E;
    public final Object F;
    public final Object G;
    public final Object H;

    public q(int i10, String str, u00.a aVar, b2.r rVar, u00.n nVar, int i11, int i12) {
        this.B = i10;
        this.C = str;
        this.F = aVar;
        this.G = rVar;
        this.H = nVar;
        this.D = i11;
        this.E = i12;
    }

    public q(t tVar, String str, m mVar, int i10, e eVar, int i11, int i12) {
        this.F = tVar;
        this.C = str;
        this.G = mVar;
        this.B = i10;
        this.H = eVar;
        this.D = i11;
        this.E = i12;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                w50.c.d((t) this.F, this.C, (m) this.G, this.B, (e) this.H, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                kz.a.h(this.B, this.C, (u00.a) this.F, (b2.r) this.G, (u00.n) this.H, (l1.j) obj, l1.q.K(this.D | 1), this.E);
                break;
        }
        return b0.a;
    }
}
