package oj;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

public abstract class z {

    public static final long f12128a = TimeUnit.MINUTES.toMillis(1);

    public static final Object f12129b = new Object();

    public static wf.a f12130c;

    public static void a(Context context) {
        if (f12130c == null) {
            wf.a aVar = new wf.a(context);
            f12130c = aVar;
            synchronized (aVar.f16070a) {
                aVar.f16076g = true;
            }
        }
    }

    public static void b(Intent intent) {
        synchronized (f12129b) {
            try {
                if (f12130c != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    f12130c.c();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static ComponentName c(Context context, Intent intent) {
        synchronized (f12129b) {
            try {
                a(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    f12130c.a(f12128a);
                }
                return componentNameStartService;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
