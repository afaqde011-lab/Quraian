package a2;

import java.util.List;
import l1.g0;
import p1.k0;

public final class e implements k0, k00.g {
    public static final gj.e B = new gj.e(1);
    public final g0 A;

    public e(g0 g0Var) {
        this.A = g0Var;
    }

    @Override
    public final List a0(Integer num) {
        return this.A.G();
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.h getKey() {
        return B;
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }

    @Override
    public final boolean u0() {
        return this.A.C;
    }
}
