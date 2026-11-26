package k0;

import a40.c0;
import com.google.android.gms.internal.measurement.b5;
import d0.q1;
import l1.g0;
import s10.w0;

public abstract class a0 {

    public static final p f8456a;

    static {
        z zVar = new z();
        q1 q1Var = q1.A;
        f8456a = new p(null, 0, false, 0.0f, zVar, 0.0f, false, c0.c(k00.j.A), b5.d(), 0, new hx.t(21), new hx.t(22), h00.x.A, 0, 0, 0, q1Var, 0, 0);
    }

    public static final y a(int i10, l1.j jVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        w0 w0Var = y.f8542w;
        boolean zE = ((g0) jVar).e(i10) | ((g0) jVar).e(0);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zE || objN == l1.i.f9868a) {
            objN = new eu.v(i10, 3);
            g0Var.n0(objN);
        }
        return (y) y1.k.f(objArr, w0Var, (u00.a) objN, jVar, 0);
    }
}
