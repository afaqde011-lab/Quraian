package n4;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

public final class p {

    public static String f11100d;

    public static o f11103g;

    public final Context f11104a;

    public final NotificationManager f11105b;

    public static final Object f11099c = new Object();

    public static HashSet f11101e = new HashSet();

    public static final Object f11102f = new Object();

    public p(Context context) {
        this.f11104a = context;
        this.f11105b = (NotificationManager) context.getSystemService("notification");
    }

    public final void a(int i10, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.f11105b.notify(null, i10, notification);
            return;
        }
        l lVar = new l(this.f11104a.getPackageName(), i10, notification);
        synchronized (f11102f) {
            try {
                if (f11103g == null) {
                    f11103g = new o(this.f11104a.getApplicationContext());
                }
                f11103g.B.obtainMessage(0, lVar).sendToTarget();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f11105b.cancel(null, i10);
    }
}
