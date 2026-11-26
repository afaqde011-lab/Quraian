package e1;

import q0.r1;

public final class y implements u00.k {
    public final int A;
    public final r1 B;

    public y(r1 r1Var, int i10) {
        this.A = i10;
        this.B = r1Var;
    }

    public final Object invoke(Object obj) {
        switch (this.A) {
            case 0:
                v2.s sVar = (v2.s) obj;
                this.B.e(v2.r.h(sVar, false));
                sVar.a();
                break;
            case 1:
                v2.s sVar2 = (v2.s) obj;
                this.B.e(v2.r.h(sVar2, false));
                sVar2.a();
                break;
            default:
                this.B.d(((h2.b) obj).f6544a, v.f5009d);
                break;
        }
        return g00.b0.a;
    }
}
