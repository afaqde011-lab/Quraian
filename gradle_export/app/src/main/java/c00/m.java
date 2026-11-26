package c00;

import g00.b0;
import ta.c0;

public final class m implements u00.n {
    public final int A;
    public final String B;
    public final b2.r C;

    public m(String str, b2.r rVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.b(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 1:
                fv.c.a(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 2:
                c0.h(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 3:
                iw.a.c(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 4:
                iz.d.k(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 5:
                kx.a.i(this.B, this.C, jVar, l1.q.K(1));
                break;
            case 6:
                kx.a.j(this.B, this.C, jVar, l1.q.K(385));
                break;
            case 7:
                ox.a.c(this.B, this.C, jVar, l1.q.K(1));
                break;
            default:
                wr.k.w(this.B, this.C, jVar, l1.q.K(1));
                break;
        }
        return b0.a;
    }
}
