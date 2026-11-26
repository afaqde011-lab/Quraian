package x20;

import h00.x;
import m10.l0;

public final class q implements u00.a {
    public final int A;
    public final r B;

    public q(r rVar, int i) {
        this.A = i;
        this.B = rVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                c30.i iVar = this.B.b;
                return va.a.S(new l0[]{q20.k.i(iVar), q20.k.j(iVar)});
            default:
                r rVar = this.B;
                return rVar.c ? va.a.T(q20.k.h(rVar.b)) : x.A;
        }
    }
}
