package j1;

import g00.b0;
import g1.x5;
import l1.g0;
import w.c0;

public final class g implements u00.o {
    public final boolean A;
    public final long B;
    public final r C;

    public g(boolean z10, long j9, r rVar) {
        this.A = z10;
        this.B = j9;
        this.C = rVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        l1.j jVar = (l1.j) obj2;
        int iIntValue = ((Number) obj3).intValue();
        g0 g0Var = (g0) jVar;
        if (g0Var.S(iIntValue & 1, (iIntValue & 17) != 16)) {
            c0.f(Boolean.valueOf(this.A), null, x5.p(k1.q.C, jVar), null, v1.d.d(-2064098104, new f(this.B, this.C), jVar), jVar, 24576, 10);
        } else {
            g0Var.V();
        }
        return b0.a;
    }
}
