package j0;

import a40.c0;
import com.google.android.gms.internal.measurement.b5;
import d0.q1;
import l1.g0;
import s10.w0;

public abstract class x {

    public static final n f7839a = new n(null, 0, false, 0.0f, new w(), 0.0f, false, c0.c(k00.j.A), b5.d(), y3.b.b(0, 0, 0, 0, 15), h00.x.A, 0, 0, 0, q1.A, 0, 0);

    public static final v a(int i10, l1.j jVar, int i11) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        Object[] objArr = new Object[0];
        w0 w0Var = v.f7816y;
        boolean zE = ((g0) jVar).e(i10) | ((g0) jVar).e(0);
        g0 g0Var = (g0) jVar;
        Object objN = g0Var.N();
        if (zE || objN == l1.i.f9868a) {
            objN = new eu.v(i10, 2);
            g0Var.n0(objN);
        }
        return (v) y1.k.f(objArr, w0Var, (u00.a) objN, jVar, 0);
    }
}
