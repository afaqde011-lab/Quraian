package androidx.work.impl.background.systemalarm;

import ab.y;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import za.v;

public class RescheduleReceiver extends BroadcastReceiver {

    public static final String f1914a = v.f("RescheduleReceiver");

    @Override
    public final void onReceive(Context context, Intent intent) {
        v.d().a(f1914a, "Received intent " + intent);
        try {
            y yVarL0 = y.l0(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (y.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = yVarL0.f426i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    yVarL0.f426i = pendingResultGoAsync;
                    if (yVarL0.f425h) {
                        pendingResultGoAsync.finish();
                        yVarL0.f426i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e3) {
            v.d().c(f1914a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e3);
        }
    }
}
