package po;

import g00.b0;
import h0.p1;
import l1.z0;
import lo.v;

public final class k implements u00.a {
    public final int A;
    public final u00.k B;
    public final v C;
    public final z0 D;
    public final z0 E;

    public k(int i, u00.k kVar, v vVar, z0 z0Var, z0 z0Var2) {
        this.A = i;
        this.B = kVar;
        this.C = vVar;
        this.D = z0Var;
        this.E = z0Var2;
    }

    @Override
    public final Object invoke() {
        o oVar = new o(this.A);
        p1 p1Var = m.a;
        this.D.setValue(oVar);
        this.E.setValue(Boolean.TRUE);
        this.B.invoke(Long.valueOf(this.C.a));
        return b0.a;
    }
}
