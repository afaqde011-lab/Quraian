package androidx.mediarouter.app;

import a1.u0;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.PlaybackStateCompat;

public final class s implements IBinder.DeathRecipient {

    public final android.support.v4.media.session.e f1803a = new android.support.v4.media.session.e(this);

    public android.support.v4.media.session.f f1804b;

    public android.support.v4.media.session.g f1805c;

    public final int f1806d;

    public final k.d0 f1807e;

    public s(k.d0 d0Var, int i10) {
        this.f1806d = i10;
        this.f1807e = d0Var;
    }

    public final void a(MediaMetadataCompat mediaMetadataCompat) {
        switch (this.f1806d) {
            case 0:
                v vVar = (v) this.f1807e;
                vVar.f1832w0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                vVar.p();
                vVar.o(false);
                break;
            default:
                q0 q0Var = (q0) this.f1807e;
                q0Var.f1779m0 = mediaMetadataCompat == null ? null : mediaMetadataCompat.a();
                q0Var.f();
                q0Var.j();
                break;
        }
    }

    public void b(PlaybackStateCompat playbackStateCompat) {
        switch (this.f1806d) {
            case 0:
                v vVar = (v) this.f1807e;
                vVar.f1831v0 = playbackStateCompat;
                vVar.o(false);
                break;
        }
    }

    @Override
    public final void binderDied() {
        e(8, null, null);
    }

    public final void c(PlaybackStateCompat playbackStateCompat) {
    }

    public final void d() {
        switch (this.f1806d) {
            case 0:
                v vVar = (v) this.f1807e;
                u0 u0Var = vVar.f1829t0;
                if (u0Var != null) {
                    u0Var.W(vVar.f1830u0);
                    vVar.f1829t0 = null;
                }
                break;
            default:
                q0 q0Var = (q0) this.f1807e;
                u0 u0Var2 = q0Var.f1777k0;
                if (u0Var2 != null) {
                    u0Var2.W(q0Var.f1778l0);
                    q0Var.f1777k0 = null;
                }
                break;
        }
    }

    public final void e(int i10, Object obj, Bundle bundle) {
        android.support.v4.media.session.f fVar = this.f1804b;
        if (fVar != null) {
            Message messageObtainMessage = fVar.obtainMessage(i10, obj);
            messageObtainMessage.setData(bundle);
            messageObtainMessage.sendToTarget();
        }
    }

    public final void f(Handler handler) {
        if (handler != null) {
            android.support.v4.media.session.f fVar = new android.support.v4.media.session.f(this, handler.getLooper(), 0);
            this.f1804b = fVar;
            fVar.f493b = true;
        } else {
            android.support.v4.media.session.f fVar2 = this.f1804b;
            if (fVar2 != null) {
                fVar2.f493b = false;
                fVar2.removeCallbacksAndMessages(null);
                this.f1804b = null;
            }
        }
    }
}
