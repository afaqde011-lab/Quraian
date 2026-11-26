package n4;

import android.app.Notification;
import k9.x0;

public final class i extends f5.c {
    public CharSequence C;

    @Override
    public final void A0(x0 x0Var) {
        new Notification.BigTextStyle((Notification.Builder) x0Var.B).setBigContentTitle(null).bigText(this.C);
    }

    @Override
    public final String I0() {
        return "androidx.core.app.NotificationCompat$BigTextStyle";
    }
}
