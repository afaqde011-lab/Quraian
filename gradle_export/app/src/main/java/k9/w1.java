package k9;

import android.app.Notification;
import android.content.Intent;
import android.media.session.MediaSession;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.internal.measurement.b5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public final class w1 implements Handler.Callback {
    public final h1 A;
    public final qd.j0 B;
    public final n4.p C;
    public final Handler D;
    public final androidx.media3.common.q1 E;
    public final Intent F;
    public final HashMap G;
    public oe.o H;
    public int I;
    public gi.c J;
    public boolean K;
    public boolean L;
    public boolean M;
    public final long N;
    public final int O;

    public w1(h1 h1Var, oe.o oVar, qd.j0 j0Var) {
        this.A = h1Var;
        this.H = oVar;
        this.B = j0Var;
        this.C = new n4.p(h1Var);
        Looper mainLooper = Looper.getMainLooper();
        String str = e7.i0.f5136a;
        this.D = new Handler(mainLooper, this);
        this.E = new androidx.media3.common.q1(this, 3);
        this.F = new Intent(h1Var, h1Var.getClass());
        this.G = new HashMap();
        this.K = false;
        this.M = true;
        this.N = 600000L;
        this.O = 3;
    }

    public final void a() {
        this.M = false;
        Handler handler = this.D;
        if (handler.hasMessages(1)) {
            handler.removeMessages(1);
            h1 h1Var = this.A;
            ArrayList arrayListC = h1Var.c();
            for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                h1Var.g((g1) arrayListC.get(i10));
            }
        }
    }

    public final u b(g1 g1Var) {
        u1 u1Var = (u1) this.G.get(g1Var);
        if (u1Var == null) {
            return null;
        }
        v vVar = u1Var.f9527a;
        if (!vVar.isDone()) {
            return null;
        }
        try {
            return (u) b5.u(vVar);
        } catch (ExecutionException e3) {
            throw new IllegalStateException(e3);
        }
    }

    public final boolean c() {
        boolean z10;
        ArrayList arrayListC = this.A.c();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayListC.size()) {
                z10 = false;
                break;
            }
            u uVarB = b((g1) arrayListC.get(i10));
            if (uVarB != null && uVarB.getPlayWhenReady() && (uVarB.getPlaybackState() == 3 || uVarB.getPlaybackState() == 2)) {
                z10 = true;
                break;
            }
            i10++;
        }
        boolean z11 = this.M;
        long j9 = this.N;
        boolean z12 = z11 && j9 > 0;
        boolean z13 = this.L;
        Handler handler = this.D;
        if (z13 && !z10 && z12) {
            handler.sendEmptyMessageDelayed(1, j9);
        } else if (z10) {
            handler.removeMessages(1);
        }
        this.L = z10;
        return z10 || handler.hasMessages(1);
    }

    public final boolean d(g1 g1Var) {
        u uVarB = b(g1Var);
        if (uVarB != null && !uVarB.getCurrentTimeline().isEmpty()) {
            u1 u1Var = (u1) this.G.get(g1Var);
            u1Var.getClass();
            if (uVarB.getPlaybackState() != 1) {
                u1Var.f9528b = false;
                u1Var.f9529c = true;
                return true;
            }
            int i10 = this.O;
            if (i10 == 1) {
                return !u1Var.f9528b;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    throw new IllegalStateException();
                }
                if (!u1Var.f9528b && u1Var.f9529c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void e(g1 g1Var, gi.c cVar, boolean z10) {
        MediaSession.Token token = ((l9.c0) g1Var.f9307a.f9420h.f9467j.B).f10128c.B;
        Notification notification = (Notification) cVar.B;
        notification.extras.putParcelable("android.mediaSession", token);
        this.J = cVar;
        h1 h1Var = this.A;
        if (!z10) {
            this.C.a(1001, notification);
            h1Var.stopForeground(2);
            this.K = false;
            return;
        }
        h1Var.startForegroundService(this.F);
        String str = e7.i0.f5136a;
        try {
            h1Var.startForeground(1001, notification, 2);
            this.K = true;
        } catch (RuntimeException e3) {
            e7.a.d("Util", "The service must be declared with a foregroundServiceType that includes mediaPlayback");
            throw e3;
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            return false;
        }
        h1 h1Var = this.A;
        ArrayList arrayListC = h1Var.c();
        for (int i10 = 0; i10 < arrayListC.size(); i10++) {
            h1Var.g((g1) arrayListC.get(i10));
        }
        return true;
    }
}
