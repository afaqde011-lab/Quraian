package b4;

import g00.b0;

public final class o extends kotlin.jvm.internal.n implements u00.n {
    public final int A = 1;
    public final b2.r B;
    public final int C;
    public final Object D;
    public final Object E;
    public final Object F;

    public o(b2.r rVar, mb.j jVar, b2.d dVar, z2.p pVar, int i10) {
        super(2);
        this.B = rVar;
        this.D = jVar;
        this.E = dVar;
        this.F = pVar;
        this.C = i10;
    }

    public o(u00.k kVar, b2.r rVar, u00.k kVar2, u00.k kVar3, int i10) {
        super(2);
        this.D = kVar;
        this.B = rVar;
        this.E = kVar2;
        this.F = kVar3;
        this.C = i10;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Number) obj2).intValue();
                u00.k kVar = (u00.k) this.D;
                u00.k kVar2 = (u00.k) this.E;
                u00.k kVar3 = (u00.k) this.F;
                l.b(kVar, this.B, kVar2, kVar3, (l1.j) obj, l1.q.K(this.C | 1));
                break;
            default:
                ((Number) obj2).intValue();
                mb.j jVar = (mb.j) this.D;
                b2.d dVar = (b2.d) this.E;
                z2.p pVar = (z2.p) this.F;
                mb.l.c(this.B, jVar, dVar, pVar, (l1.j) obj, l1.q.K(this.C | 1));
                break;
        }
        return b0.a;
    }
}
