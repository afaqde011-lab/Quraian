package k9;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.b5;
import java.util.HashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class u2 implements Runnable {
    public final int A;
    public final h1 B;
    public final g1 C;

    public u2(h1 h1Var, g1 g1Var, int i10) {
        this.A = i10;
        this.B = h1Var;
        this.C = g1Var;
    }

    @Override
    public final void run() {
        g1 g1Var;
        switch (this.A) {
            case 0:
                h1 h1Var = this.B;
                w1 w1VarB = h1Var.b(null);
                h1 h1Var2 = w1VarB.A;
                HashMap map = w1VarB.G;
                g1 g1Var2 = this.C;
                if (map.containsKey(g1Var2)) {
                    g1Var = g1Var2;
                } else {
                    v1 v1Var = new v1(w1VarB, h1Var2, g1Var2);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    f4 f4Var = g1Var2.f9307a.f9422j;
                    f4Var.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    e7.i0.r();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    v vVar = new v(mainLooper);
                    e7.i0.M(new Handler(mainLooper), new r(vVar, new u(h1Var2, f4Var, bundle3, v1Var, mainLooper, vVar, f4Var.f9293a.e() ? new h1.l(new g7.g(new c7.g(h1Var2))) : null), 0));
                    map.put(g1Var2, new u1(vVar));
                    g1Var = g1Var2;
                    vVar.a(new ab.k(w1VarB, vVar, v1Var, g1Var, 8), w1VarB.E);
                }
                g1Var.f9307a.f9433w = new gi.c(h1Var, 16);
                break;
            default:
                HashMap map2 = this.B.b(null).G;
                g1 g1Var3 = this.C;
                u1 u1Var = (u1) map2.remove(g1Var3);
                if (u1Var != null) {
                    v vVar2 = u1Var.f9527a;
                    if (!vVar2.cancel(false)) {
                        try {
                            ((u) b5.u(vVar2)).release();
                        } catch (CancellationException | ExecutionException e3) {
                            e7.a.n("MediaController", "MediaController future failed (so we couldn't release it)", e3);
                        }
                    }
                }
                g1Var3.f9307a.f9433w = null;
                break;
        }
    }
}
