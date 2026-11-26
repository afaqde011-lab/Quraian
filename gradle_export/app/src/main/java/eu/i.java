package eu;

import bv.o1;
import d00.x0;
import gv.o0;
import gv.v1;

public final class i implements u00.n {
    public final int A = 0;
    public final u00.k B;
    public final long C;
    public final boolean D;
    public final b2.r E;
    public final Object F;
    public final Object G;
    public final Object H;
    public final Object I;

    public i(long j, bu.b bVar, bu.b bVar2, bu.b bVar3, boolean z, u00.k kVar, u00.a aVar, b2.r rVar, int i) {
        this.C = j;
        this.F = bVar;
        this.G = bVar2;
        this.H = bVar3;
        this.D = z;
        this.B = kVar;
        this.I = aVar;
        this.E = rVar;
    }

    public i(o1 o1Var, u00.k kVar, kk.c cVar, x0 x0Var, long j, o0 o0Var, boolean z, b2.r rVar, int i) {
        this.F = o1Var;
        this.B = kVar;
        this.G = cVar;
        this.H = x0Var;
        this.C = j;
        this.I = o0Var;
        this.D = z;
        this.E = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(7);
                a.e(this.C, (bu.b) this.F, (bu.b) this.G, (bu.b) this.H, this.D, this.B, (u00.a) this.I, this.E, (l1.j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(12779521);
                v1.a((o1) this.F, this.B, (kk.c) this.G, (x0) this.H, this.C, (o0) this.I, this.D, this.E, (l1.j) obj, iK2);
                break;
        }
        return g00.b0.a;
    }
}
