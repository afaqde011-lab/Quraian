package es;

import b2.r;
import ca.v;
import g00.b0;
import l1.j;
import l1.q;
import u00.n;

public final class e implements n {
    public final int A = 1;
    public final String B;
    public final r C;
    public final boolean D;

    public e(String str, r rVar, boolean z, int i) {
        this.B = str;
        this.C = rVar;
        this.D = z;
    }

    public e(String str, boolean z, r rVar, int i) {
        this.B = str;
        this.D = z;
        this.C = rVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        int i = this.A;
        j jVar = (j) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v.k(q.K(1), this.C, this.B, jVar, this.D);
                break;
            default:
                rx.a.c(q.K(1), this.C, this.B, jVar, this.D);
                break;
        }
        return b0.a;
    }
}
