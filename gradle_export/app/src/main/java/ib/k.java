package ib;

import android.content.Context;
import android.os.PowerManager;
import za.v;

public abstract class k {
    static {
        kotlin.jvm.internal.m.d(v.f("WakeLocks"), "tagWithPrefix(...)");
    }

    public static final PowerManager.WakeLock a(Context context) {
        kotlin.jvm.internal.m.e(context, "context");
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String strConcat = "WorkManager: ".concat("ProcessorForegroundLck");
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (l.f7574a) {
        }
        kotlin.jvm.internal.m.b(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
