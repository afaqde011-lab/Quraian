package j1;

import d40.n1;
import g00.b0;
import l1.g0;
import lo.u;
import lo.y;
import lo.z;

public final class j implements u00.n {
    public final int A = 2;
    public final boolean B;
    public final u00.a C;
    public final Object D;
    public final Object E;
    public final Object F;
    public final g00.e G;
    public final Object H;

    public j(u uVar, n1 n1Var, boolean z10, u00.k kVar, u00.k kVar2, u00.a aVar, h0.n1 n1Var2, int i10) {
        this.D = uVar;
        this.E = n1Var;
        this.B = z10;
        this.F = kVar;
        this.G = kVar2;
        this.C = aVar;
        this.H = n1Var2;
    }

    public j(z zVar, n1 n1Var, boolean z10, u00.k kVar, u00.k kVar2, u00.a aVar, h0.n1 n1Var2) {
        this.D = zVar;
        this.E = n1Var;
        this.B = z10;
        this.F = kVar;
        this.G = kVar2;
        this.C = aVar;
        this.H = n1Var2;
    }

    public j(boolean z10, u00.a aVar, b2.r rVar, r rVar2, b2.d dVar, u00.o oVar, v1.c cVar, int i10) {
        this.B = z10;
        this.C = aVar;
        this.D = rVar;
        this.E = rVar2;
        this.F = dVar;
        this.G = oVar;
        this.H = cVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                k.b(this.B, this.C, (b2.r) this.D, (r) this.E, (b2.d) this.F, this.G, (v1.c) this.H, (l1.j) obj, l1.q.K(1769857));
                break;
            case 1:
                y yVar = (z) this.D;
                n1 n1Var = (n1) this.E;
                u00.k kVar = (u00.k) this.F;
                u00.k kVar2 = this.G;
                h0.n1 n1Var2 = (h0.n1) this.H;
                l1.j jVar = (l1.j) obj;
                int iIntValue = ((Integer) obj2).intValue();
                g0 g0Var = (g0) jVar;
                if (g0Var.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    po.m.d(yVar.a, n1Var, this.B, kVar, kVar2, this.C, n1Var2, jVar, 0);
                } else {
                    g0Var.V();
                }
                return b0.a;
            default:
                ((Integer) obj2).getClass();
                po.m.d((u) this.D, (n1) this.E, this.B, (u00.k) this.F, this.G, this.C, (h0.n1) this.H, (l1.j) obj, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
