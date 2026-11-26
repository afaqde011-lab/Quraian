package androidx.media3.exoplayer.dash;

import androidx.media3.common.q;
import androidx.media3.common.q0;
import c50.h;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import g7.e;
import h1.l;
import java.util.List;
import k9.x0;
import l7.i;
import rc.d;
import s7.a;
import s7.z;
import tf.w;

public final class DashMediaSource$Factory implements z {

    public final h f1693a;

    public final e f1694b;

    public final x0 f1695c;

    public final d f1696d;

    public final w f1697e;

    public final long f1698f;

    public final long f1699g;

    public DashMediaSource$Factory(e eVar) {
        h hVar = new h(eVar);
        this.f1693a = hVar;
        this.f1694b = eVar;
        this.f1695c = new x0(13, (byte) 0);
        this.f1697e = new w(17);
        this.f1698f = NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS;
        this.f1699g = 5000000L;
        this.f1696d = new d(1);
        ((q) hVar.D).B = true;
    }

    @Override
    public final a a(q0 q0Var) {
        q0Var.f1414b.getClass();
        m7.e eVar = new m7.e();
        List list = q0Var.f1414b.f1332e;
        return new i(q0Var, this.f1694b, !list.isEmpty() ? new l(eVar, list, false) : eVar, this.f1693a, this.f1696d, this.f1695c.s(q0Var), this.f1697e, this.f1698f, this.f1699g);
    }

    @Override
    public final void b(w wVar) {
        q qVar = (q) this.f1693a.D;
        qVar.getClass();
        qVar.C = wVar;
    }

    @Override
    public final void c() {
        ((q) this.f1693a.D).getClass();
    }

    @Override
    public final void d(boolean z10) {
        ((q) this.f1693a.D).B = z10;
    }
}
