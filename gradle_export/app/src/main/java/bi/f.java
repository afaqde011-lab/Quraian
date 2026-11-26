package bi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class f extends BroadcastReceiver {

    public static final AtomicReference f2528b = new AtomicReference();

    public final Context f2529a;

    public f(Context context) {
        this.f2529a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f2530k) {
            try {
                Iterator it = ((u.d) g.l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f2529a.unregisterReceiver(this);
    }
}
