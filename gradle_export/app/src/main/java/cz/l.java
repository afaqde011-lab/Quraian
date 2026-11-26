package cz;

import a40.z;
import c3.p1;
import c3.t2;
import g00.b0;
import g1.m6;
import l1.p2;
import ta.c0;

public final class l implements u00.a {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;

    public l(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.A = i;
        this.B = z;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                z zVar = (z) this.C;
                m6 m6Var = (m6) this.D;
                u00.a aVar = (u00.a) this.E;
                if (!this.B) {
                    c0.M(zVar, (k00.i) null, (u00.n) null, (u00.k) null, new e(m6Var, aVar, null, 1), 31);
                }
                break;
            default:
                p1 p1Var = (t2) this.C;
                u00.k kVar = (u00.k) this.D;
                p2 p2Var = (p2) this.E;
                if (this.B && ((Boolean) p2Var.getValue()).booleanValue()) {
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    kVar.invoke(jp.i.a);
                }
                break;
        }
        return b0.a;
    }
}
