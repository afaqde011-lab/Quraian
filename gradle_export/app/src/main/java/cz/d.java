package cz;

import g00.b0;
import l1.q;

public final class d implements u00.n {
    public final int A;
    public final String B;
    public final String C;

    public d(int i, int i2, String str, String str2) {
        this.A = i2;
        this.B = str;
        this.C = str2;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        l1.j jVar = (l1.j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.c(this.B, this.C, jVar, q.K(1));
                break;
            default:
                mx.a.c(this.B, this.C, jVar, q.K(1));
                break;
        }
        return b0.a;
    }
}
