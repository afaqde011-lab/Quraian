package bs;

import ab.a0;
import b2.r;
import ct.h0;
import eq.k;
import g00.b0;
import h0.o;
import l1.q;
import u00.n;

public final class h implements n {
    public final int A;
    public final int B;
    public final r C;

    public h(int i, r rVar, int i2, int i3) {
        this.A = i3;
        this.B = i;
        this.C = rVar;
    }

    public h(r rVar, int i, int i2) {
        this.A = i2;
        this.C = rVar;
        this.B = i;
    }

    public h(r rVar, int i, int i2, int i3) {
        this.A = i3;
        this.C = rVar;
        this.B = i2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        l1.j jVar = (l1.j) obj;
        Integer num = (Integer) obj2;
        switch (this.A) {
            case 0:
                num.getClass();
                a.a(this.C, jVar, q.K(this.B | 1));
                break;
            case 1:
                num.getClass();
                ct.i.a(this.C, jVar, this.B, q.K(1));
                break;
            case 2:
                num.getClass();
                a0.j(this.C, jVar, this.B, q.K(49));
                break;
            case 3:
                num.getClass();
                h0.a(this.C, jVar, q.K(1), this.B);
                break;
            case 4:
                num.getClass();
                k.a(this.C, jVar, this.B, q.K(49));
                break;
            case 5:
                num.intValue();
                o.a(this.C, jVar, q.K(this.B | 1));
                break;
            default:
                num.getClass();
                q0.c.b(this.C, jVar, q.K(1), this.B);
                break;
        }
        return b0.a;
    }
}
