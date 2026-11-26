package ox;

import b2.r;
import g00.b0;
import g2.t;
import l1.j;
import l1.q;
import u00.k;
import u00.n;

public final class c implements n {
    public final int A;
    public final Object B;
    public final boolean C;
    public final boolean D;
    public final u00.a E;
    public final u00.a F;
    public final g00.e G;
    public final Object H;
    public final r I;

    public c(bx.c cVar, boolean z, boolean z2, u00.a aVar, u00.a aVar2, u00.a aVar3, u00.a aVar4, r rVar, int i, int i2) {
        this.A = i2;
        this.B = cVar;
        this.C = z;
        this.D = z2;
        this.E = aVar;
        this.F = aVar2;
        this.G = aVar3;
        this.H = aVar4;
        this.I = rVar;
    }

    public c(String str, boolean z, k kVar, u00.a aVar, u00.a aVar2, r rVar, boolean z2, t tVar, int i) {
        this.A = 2;
        this.B = str;
        this.C = z;
        this.G = kVar;
        this.E = aVar;
        this.F = aVar2;
        this.I = rVar;
        this.D = z2;
        this.H = tVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(12582921);
                a.e((bx.c) this.B, this.C, this.D, this.E, this.F, (u00.a) this.G, (u00.a) this.H, this.I, (j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = q.K(9);
                a.h((bx.c) this.B, this.C, this.D, this.E, this.F, (u00.a) this.G, (u00.a) this.H, this.I, (j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK3 = q.K(12779521);
                qp.a.a((String) this.B, this.C, (k) this.G, this.E, this.F, this.I, this.D, (t) this.H, (j) obj, iK3);
                break;
        }
        return b0.a;
    }
}
