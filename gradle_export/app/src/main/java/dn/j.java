package dn;

import b6.u;
import g00.b0;
import l1.g0;
import u00.n;

public final class j implements n {
    public final boolean A;
    public final float B;

    public j(float f, boolean z) {
        this.A = z;
        this.B = f;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        g0 g0Var = (l1.j) obj;
        int iIntValue = ((Integer) obj2).intValue();
        g0 g0Var2 = g0Var;
        if (g0Var2.S(iIntValue & 1, (iIntValue & 3) != 2)) {
            w50.c.d(new b6.a(this.A ? 2131231429 : 2131231428), null, ze.d.R(this.B), 0, new b6.e(new u(d.a)), g0Var, 32816, 8);
        } else {
            g0Var2.V();
        }
        return b0.a;
    }
}
