package k9;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.util.List;

public final class y0 implements IBinder.DeathRecipient {

    public final android.support.v4.media.session.e f9546a = new android.support.v4.media.session.e(this);

    public android.support.v4.media.session.f f9547b;

    public l9.u f9548c;

    public final Handler f9549d;

    public final z0 f9550e;

    public y0(z0 z0Var, Looper looper) {
        this.f9550e = z0Var;
        this.f9549d = new Handler(looper, new e7.l(this, 3));
    }

    public final void a(boolean z10) {
        u uVar = this.f9550e.f9558b;
        uVar.getClass();
        ta.c0.A(Looper.myLooper() == uVar.f9523f.getLooper());
        s sVar = uVar.f9522e;
        new Bundle().putBoolean("androidx.media3.session.ARGUMENT_CAPTIONING_ENABLED", z10);
        sVar.d(new z3("androidx.media3.session.SESSION_COMMAND_ON_CAPTIONING_ENABLED_CHANGED", Bundle.EMPTY));
    }

    public final void b(l9.j0 j0Var) {
        z0 z0Var = this.f9550e;
        ba.v0 v0Var = z0Var.f9568n;
        z0Var.f9568n = new ba.v0((ba.n1) v0Var.f2440d, z0.h(j0Var), (l9.y) v0Var.f2442f, (List) v0Var.f2437a, (CharSequence) v0Var.f2443g, v0Var.f2438b, v0Var.f2439c, (Bundle) v0Var.f2444h);
        e();
    }

    @Override
    public final void binderDied() {
        c(8, null);
    }

    public final void c(int i10, Object obj) {
        android.support.v4.media.session.f fVar = this.f9547b;
        if (fVar != null) {
            fVar.obtainMessage(i10, obj).sendToTarget();
        }
    }

    public final void d(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper(), 1);
            this.f9547b = fVar;
            fVar.f493b = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.f9547b;
            if (fVar2 != null) {
                fVar2.f493b = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f9547b = null;
            }
        }
    }

    public final void e() {
        Handler handler = this.f9549d;
        if (handler.hasMessages(1)) {
            return;
        }
        handler.sendEmptyMessageDelayed(1, this.f9550e.f9564h);
    }
}
