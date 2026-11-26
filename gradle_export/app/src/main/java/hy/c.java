package hy;

import b2.r;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class c implements n {
    public final int A;
    public final String B;
    public final u00.a C;
    public final r D;

    public c(String str, u00.a aVar, r rVar, int i, int i2) {
        this.A = i2;
        this.B = str;
        this.C = aVar;
        this.D = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                g.b(this.B, this.C, this.D, jVar, q.K(1));
                break;
            default:
                yy.a.c(this.B, this.C, this.D, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
