package ct;

import g1.v5;
import h0.z1;
import l1.r1;

public abstract class h0 {
    public static final float a = 14;
    public static final float b = (float) 1.5d;

    public static final void a(b2.r rVar, l1.j jVar, int i, int i2) {
        int i3;
        l1.g0 g0Var = (l1.g0) jVar;
        g0Var.e0(-961102621);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (g0Var.g(rVar) ? 4 : 2) | i;
        }
        if (g0Var.S(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                rVar = b2.o.A;
            }
            v5.a(z1.m(rVar, a), i2.t.b(0.5f, dl.a.k), b, 0L, 1, 0.0f, g0Var, 384, 40);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new bs.h(rVar, i, i2, 3);
        }
    }
}
