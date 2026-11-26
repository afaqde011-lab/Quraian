package tp;

import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class c implements n {
    public final int A;
    public final u00.a B;
    public final u00.a C;
    public final u00.a D;

    public c(u00.a aVar, u00.a aVar2, u00.a aVar3, int i, int i2) {
        this.A = i2;
        this.B = aVar;
        this.C = aVar2;
        this.D = aVar3;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                h.a(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                h.b(this.B, this.C, this.D, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
