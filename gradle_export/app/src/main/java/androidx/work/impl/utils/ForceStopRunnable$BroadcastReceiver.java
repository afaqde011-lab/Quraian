package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import ib.d;
import za.v;

public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    public static final String f1916a = v.f("ForceStopRunnable$Rcvr");

    @Override
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (v.d().f17403a <= 2) {
            Log.v(f1916a, "Rescheduling alarm that keeps track of force-stops.");
        }
        String str = d.E;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent2.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent2, 167772160);
        long jCurrentTimeMillis = System.currentTimeMillis() + d.F;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }
}
