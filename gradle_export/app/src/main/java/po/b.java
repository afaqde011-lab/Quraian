package po;

import b2.r;
import g00.b0;
import l1.q;

public final class b implements u00.n {
    public final int A;
    public final jk.a B;
    public final u00.a C;
    public final r D;

    public b(jk.a aVar, u00.a aVar2, r rVar, int i11, int i12) {
        this.A = i12;
        this.B = aVar;
        this.C = aVar2;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                n.h(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                c7.i.a(this.B, this.C, this.D, jVar, q.K(1));
                break;
        }
        return b0.f7770a;
    }
}
