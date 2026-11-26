package mu;

import as.p0;
import l1.g0;
import l1.r1;

public abstract class n {
    public static final float a = 8;

    public static final void a(b2.r rVar, int i, int i2, l1.j jVar, int i3) {
        g0 g0Var = (g0) jVar;
        g0Var.e0(1373093224);
        int i4 = (g0Var.e(i) ? 4 : 2) | i3 | (g0Var.e(i2) ? 32 : 16) | (g0Var.g(rVar) ? 256 : 128);
        if (g0Var.S(i4 & 1, (i4 & 147) != 146)) {
            float f = i2 >= 1 ? i2 : 1;
            h0.c.a(rVar, (b2.d) null, false, v1.d.d(101112658, new p0(ab.a0.x(i, 0.25f, f) / f, 10), g0Var), g0Var, ((i4 >> 6) & 14) | 3072, 6);
        } else {
            g0Var.V();
        }
        r1 r1VarT = g0Var.t();
        if (r1VarT != null) {
            r1VarT.d = new androidx.media3.cast.f(rVar, i, i2, i3, 3);
        }
    }
}
