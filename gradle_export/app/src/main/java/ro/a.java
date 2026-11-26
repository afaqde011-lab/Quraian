package ro;

import g00.b0;
import l1.j;
import l1.q;
import lo.k;
import u00.n;

public final class a implements n {
    public final int A;
    public final k B;
    public final boolean C;
    public final u00.a D;

    public a(k kVar, boolean z, u00.a aVar, int i, int i2) {
        this.A = i2;
        this.B = kVar;
        this.C = z;
        this.D = aVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                f.f(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                f.a(this.B, this.C, this.D, jVar, q.K(49));
                break;
        }
        return b0.a;
    }
}
