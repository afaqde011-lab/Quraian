package gv;

import l1.p2;

public final class a2 implements u00.n {
    public final int A = 0;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final Object G;

    public a2(bv.o1 o1Var, u00.k kVar, kk.c cVar, d00.x0 x0Var, p2 p2Var, l1.y0 y0Var) {
        this.C = o1Var;
        this.B = kVar;
        this.D = cVar;
        this.E = x0Var;
        this.F = p2Var;
        this.G = y0Var;
    }

    public a2(cy.e eVar, p0.e eVar2, u00.k kVar, u00.k kVar2, u00.n nVar, b2.r rVar, int i) {
        this.C = eVar;
        this.D = eVar2;
        this.B = kVar;
        this.E = kVar2;
        this.F = nVar;
        this.G = rVar;
    }

    public a2(qr.b bVar, String str, String str2, u00.a aVar, b2.r rVar, u00.a aVar2, int i) {
        this.C = bVar;
        this.B = str;
        this.D = str2;
        this.E = aVar;
        this.F = rVar;
        this.G = aVar2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                bv.o1 o1Var = (bv.o1) this.C;
                u00.k kVar = (u00.k) this.B;
                kk.c cVar = (kk.c) this.D;
                d00.x0 x0Var = (d00.x0) this.E;
                p2 p2Var = (p2) this.F;
                l1.y0 y0Var = (l1.y0) this.G;
                l1.g0 g0Var = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                l1.g0 g0Var2 = g0Var;
                if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    long j = ((i2.t) p2Var.getValue()).a;
                    Object objN = g0Var2.N();
                    if (objN == l1.i.a) {
                        objN = new e(y0Var, 7);
                        g0Var2.n0(objN);
                    }
                    p.g(o1Var, kVar, cVar, x0Var, j, null, z2.d0.o(b2.o.A, (u00.k) objN), g0Var, 1572864);
                } else {
                    g0Var2.V();
                }
                return g00.b0.a;
            case 1:
                ((Integer) obj2).getClass();
                hy.g.a((cy.e) this.C, (p0.e) this.D, (u00.k) this.B, (u00.k) this.E, (u00.n) this.F, (b2.r) this.G, (l1.j) obj, l1.q.K(9));
                break;
            default:
                ((Integer) obj2).getClass();
                wr.k.k((qr.b) this.C, (String) this.B, (String) this.D, (u00.a) this.E, (b2.r) this.F, (u00.a) this.G, (l1.j) obj, l1.q.K(1));
                break;
        }
        return g00.b0.a;
    }
}
