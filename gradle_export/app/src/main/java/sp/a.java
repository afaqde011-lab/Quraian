package sp;

import ca.v;
import g00.b0;
import g1.m6;
import l1.j;
import l1.q;
import u00.k;
import u00.n;

public final class a implements n {
    public final int A;
    public final boolean B;
    public final k C;
    public final u00.a D;
    public final m6 E;

    public a(boolean z, k kVar, u00.a aVar, m6 m6Var, int i, int i2) {
        this.A = i2;
        this.B = z;
        this.C = kVar;
        this.D = aVar;
        this.E = m6Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                ((Integer) obj2).getClass();
                int iK = q.K(1);
                v.a(this.B, this.C, this.D, this.E, (j) obj, iK);
                break;
            default:
                ((Integer) obj2).getClass();
                int iK2 = q.K(1);
                v.a(this.B, this.C, this.D, this.E, (j) obj, iK2);
                break;
        }
        return b0.a;
    }
}
