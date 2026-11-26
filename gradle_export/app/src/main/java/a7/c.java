package a7;

import android.app.Notification;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat$Token;
import k9.g1;
import k9.x0;
import l9.c0;

public final class c extends f5.c {
    public final int C = 0;
    public int[] D;
    public Object E;

    public c() {
        super(8, false);
    }

    public c(g1 g1Var) {
        super(8, false);
        this.E = g1Var;
    }

    @Override
    public final void A0(x0 x0Var) {
        switch (this.C) {
            case 0:
                Notification.Builder builder = (Notification.Builder) x0Var.B;
                if (Build.VERSION.SDK_INT < 34) {
                    a.d(builder, a.b(a.a(), this.D, (MediaSessionCompat$Token) this.E));
                } else {
                    a.d(builder, a.b(b.a(a.a(), null, 0, null, Boolean.FALSE), this.D, (MediaSessionCompat$Token) this.E));
                }
                break;
            default:
                Notification.Builder builder2 = (Notification.Builder) x0Var.B;
                Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
                g1 g1Var = (g1) this.E;
                Notification.MediaStyle mediaSession = mediaStyle.setMediaSession(((c0) g1Var.f9307a.f9420h.f9467j.B).f10128c.B);
                int[] iArr = this.D;
                if (iArr != null) {
                    mediaSession.setShowActionsInCompactView(iArr);
                }
                builder2.setStyle(mediaSession);
                Bundle bundle = new Bundle();
                bundle.putBundle("androidx.media3.session", g1Var.f9307a.f9422j.b());
                builder2.addExtras(bundle);
                break;
        }
    }
}
