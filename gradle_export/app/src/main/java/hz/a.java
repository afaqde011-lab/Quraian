package hz;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.k;
import u00.n;
import w50.c;

public final class a implements n {
    public final int A;
    public final u30.b B;
    public final k C;
    public final r D;

    public a(u30.b bVar, k kVar, r rVar, int i11, int i12) {
        this.A = i12;
        this.B = bVar;
        this.C = kVar;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                c.i(this.B, this.C, this.D, jVar, q.K(1));
                break;
            case 1:
                kh.n.d(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                bi.b.a(this.B, this.C, this.D, jVar, q.K(1));
                break;
        }
        return b0.f7770a;
    }
}
