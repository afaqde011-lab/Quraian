package rx;

import g00.b0;
import k0.y;
import l1.j;
import l1.q;
import qx.o;
import u00.k;
import u00.n;

public final class f implements n {
    public final int A = 1;
    public final o B;
    public final kk.c C;
    public final y D;
    public final k E;
    public final int F;

    public f(o oVar, kk.c cVar, y yVar, k kVar, int i) {
        this.B = oVar;
        this.C = cVar;
        this.D = yVar;
        this.E = kVar;
        this.F = i;
    }

    public f(o oVar, k kVar, y yVar, kk.c cVar, int i) {
        this.B = oVar;
        this.E = kVar;
        this.D = yVar;
        this.C = cVar;
        this.F = i;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                a.d(q.K(this.F | 1), this.D, this.C, (j) obj, this.B, this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                a.k(q.K(this.F | 1), this.D, this.C, (j) obj, this.B, this.E);
                break;
        }
        return b0.a;
    }
}
