package s7;

import android.net.Uri;
import fh.d2;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;

public final class i1 extends a {

    public final g7.j f13689h;

    public final g7.e f13690i;

    public final androidx.media3.common.t f13691j;
    public final tf.w l;

    public final e1 f13693n;

    public final androidx.media3.common.q0 f13694o;

    public g7.s f13695p;

    public final long f13692k = -9223372036854775807L;
    public final boolean m = true;

    public i1(androidx.media3.common.p0 p0Var, a1.u0 u0Var, tf.w wVar) {
        androidx.media3.common.j0 j0Var;
        androidx.media3.common.l0 l0Var;
        this.f13690i = u0Var;
        this.l = wVar;
        boolean z10 = true;
        androidx.media3.common.e0 e0Var = new androidx.media3.common.e0();
        androidx.media3.common.h0 h0Var = new androidx.media3.common.h0();
        List list = Collections.EMPTY_LIST;
        d2 d2Var = d2.E;
        androidx.media3.common.j0 j0Var2 = new androidx.media3.common.j0();
        androidx.media3.common.m0 m0Var = androidx.media3.common.m0.f1344d;
        Uri uri = Uri.EMPTY;
        String string = p0Var.f1377a.toString();
        string.getClass();
        fh.t0 t0VarO = fh.t0.o(fh.t0.s(p0Var));
        if (((Uri) h0Var.f1223e) != null && ((UUID) h0Var.f1222d) == null) {
            z10 = false;
        }
        ta.c0.A(z10);
        if (uri != null) {
            androidx.media3.common.i0 i0Var = ((UUID) h0Var.f1222d) != null ? new androidx.media3.common.i0(h0Var) : null;
            j0Var = j0Var2;
            l0Var = new androidx.media3.common.l0(uri, null, i0Var, null, list, null, t0VarO, -9223372036854775807L);
        } else {
            j0Var = j0Var2;
            l0Var = null;
        }
        androidx.media3.common.q0 q0Var = new androidx.media3.common.q0(string, new androidx.media3.common.g0(e0Var), l0Var, new androidx.media3.common.k0(j0Var), androidx.media3.common.t0.K, m0Var);
        this.f13694o = q0Var;
        androidx.media3.common.s sVar = new androidx.media3.common.s();
        String str = p0Var.f1378b;
        sVar.m = androidx.media3.common.x0.n(str == null ? "text/x-unknown" : str);
        sVar.f1494d = p0Var.f1379c;
        sVar.f1495e = p0Var.f1380d;
        sVar.f1496f = p0Var.f1381e;
        sVar.f1492b = p0Var.f1382f;
        String str2 = p0Var.f1383g;
        sVar.f1491a = str2 != null ? str2 : null;
        this.f13691j = new androidx.media3.common.t(sVar);
        Map map = Collections.EMPTY_MAP;
        Uri uri2 = p0Var.f1377a;
        ta.c0.w(uri2, "The uri must be set.");
        this.f13689h = new g7.j(uri2, 1, null, map, 0L, -1L, null, 1);
        this.f13693n = new e1(-9223372036854775807L, true, false, q0Var);
    }

    @Override
    public final y b(a0 a0Var, a1.i iVar, long j9) {
        return new h1(this.f13689h, this.f13690i, this.f13695p, this.f13691j, this.f13692k, this.l, new c50.h((CopyOnWriteArrayList) this.f13639c.D, 0, a0Var), this.m, null);
    }

    @Override
    public final androidx.media3.common.q0 h() {
        return this.f13694o;
    }

    @Override
    public final void j() {
    }

    @Override
    public final void l(g7.s sVar) {
        this.f13695p = sVar;
        m(this.f13693n);
    }

    @Override
    public final void n(y yVar) {
        ((h1) yVar).I.c(null);
    }

    @Override
    public final void p() {
    }
}
