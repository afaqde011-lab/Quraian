package ct;

import bv.o1;
import gv.n1;

public final class n implements u00.n {
    public final int A;
    public final Object B;
    public final long C;
    public final Object D;
    public final Object E;
    public final b2.r F;

    public n(o1 o1Var, u00.k kVar, kk.c cVar, long j, b2.r rVar, int i) {
        this.A = 2;
        this.B = o1Var;
        this.D = kVar;
        this.E = cVar;
        this.C = j;
        this.F = rVar;
    }

    public n(o2.f fVar, long j, String str, String str2, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = fVar;
        this.C = j;
        this.D = str;
        this.E = str2;
        this.F = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = l1.q.K(1);
                ab.a0.g((o2.f) this.B, this.C, (String) this.D, (String) this.E, this.F, (l1.j) obj, iK);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iK2 = l1.q.K(1);
                wr.k.Z((o2.f) this.B, this.C, (String) this.D, (String) this.E, this.F, (l1.j) obj, iK2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK3 = l1.q.K(1);
                n1.a((o1) this.B, (u00.k) this.D, (kk.c) this.E, this.C, this.F, (l1.j) obj, iK3);
                break;
        }
        return g00.b0.a;
    }
}
