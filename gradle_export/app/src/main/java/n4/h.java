package n4;

import android.app.Notification;
import android.graphics.Bitmap;
import androidx.core.graphics.drawable.IconCompat;
import k9.x0;

public final class h extends f5.c {
    public IconCompat C;
    public IconCompat D;
    public boolean E;

    @Override
    public final void A0(x0 x0Var) {
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle((Notification.Builder) x0Var.B).setBigContentTitle(null);
        IconCompat iconCompat = this.C;
        if (iconCompat != null) {
            g.a(bigContentTitle, iconCompat.c());
        }
        if (this.E) {
            IconCompat iconCompat2 = this.D;
            if (iconCompat2 == null) {
                bigContentTitle.bigLargeIcon((Bitmap) null);
            } else {
                bigContentTitle.bigLargeIcon(iconCompat2.c());
            }
        }
        g.c(bigContentTitle, false);
        g.b(bigContentTitle, null);
    }

    @Override
    public final String I0() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
