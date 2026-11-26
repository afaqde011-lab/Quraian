package kz;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;
import v0.i;

public final class h implements n {
    public final int A;
    public final r B;
    public final v1.c C;
    public final int D;

    public h(r rVar, v1.c cVar, int i11, int i12) {
        this.A = i12;
        this.B = rVar;
        this.C = cVar;
        this.D = i11;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i11) {
            case 0:
                a.g(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 1:
                v0.g.c(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 2:
                v0.g.d(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 3:
                i.d(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            case 4:
                v0.g.b(this.B, this.C, jVar, q.K(this.D | 1));
                break;
            default:
                v0.g.a(this.B, this.C, jVar, q.K(this.D | 1));
                break;
        }
        return b0.f7770a;
    }
}
