package oj;

import ab.i0;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import k9.b3;
import k9.l0;

public final class h {

    public static final Object f12091c = new Object();

    public static c0 f12092d;

    public final Object f12093a;

    public final Object f12094b;

    public h(Context context) {
        this.f12093a = context;
        this.f12094b = new f5.d(0);
    }

    public h(ExecutorService executorService) {
        this.f12094b = new u.e(0);
        this.f12093a = executorService;
    }

    public static Task a(Context context, Intent intent, boolean z10) {
        c0 c0Var;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f12091c) {
            try {
                if (f12092d == null) {
                    f12092d = new c0(context);
                }
                c0Var = f12092d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10) {
            return c0Var.b(intent).h(new f5.d(0), new b3(27));
        }
        if (q.F().K(context)) {
            synchronized (z.f12129b) {
                try {
                    z.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        z.f12130c.a(z.f12128a);
                    }
                    c0Var.b(intent).b(new k7.t(intent, 14));
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            c0Var.b(intent);
        }
        return Tasks.d(-1);
    }

    public Task b(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = (Context) this.f12093a;
        f5.d dVar = (f5.d) this.f12094b;
        boolean z10 = context.getApplicationInfo().targetSdkVersion >= 26;
        boolean z11 = (intent.getFlags() & 268435456) != 0;
        return (!z10 || z11) ? Tasks.b(dVar, new i0(context, intent, 3)).i(dVar, new l0(3, context, intent, z11)) : a(context, intent, z11);
    }
}
