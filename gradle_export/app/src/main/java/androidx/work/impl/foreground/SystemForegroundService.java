package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.z;
import com.google.android.gms.internal.play_billing.r0;
import gb.b;
import java.util.UUID;
import za.v;

public class SystemForegroundService extends z {
    public static final String E = v.f("SystemFgService");
    public boolean B;
    public b C;
    public NotificationManager D;

    public final void a() {
        this.D = (NotificationManager) getApplicationContext().getSystemService("notification");
        b bVar = new b(getApplicationContext());
        this.C = bVar;
        if (bVar.I != null) {
            v.d().b(b.J, "A callback already exists.");
        } else {
            bVar.I = this;
        }
    }

    @Override
    public final void onCreate() {
        super.onCreate();
        a();
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        this.C.c();
    }

    @Override
    public final int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        boolean z10 = this.B;
        String str = E;
        if (z10) {
            v.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.C.c();
            a();
            this.B = false;
        }
        if (intent == null) {
            return 3;
        }
        b bVar = this.C;
        bVar.getClass();
        String str2 = b.J;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            v.d().e(str2, "Started foreground service " + intent);
            String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
            bVar.B.f8258a.execute(new r0(6, bVar, stringExtra, false));
            bVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            bVar.b(intent);
            return 3;
        }
        if ("ACTION_CANCEL_WORK".equals(action)) {
            v.d().e(str2, "Stopping foreground work for " + intent);
            String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
            if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                return 3;
            }
            bVar.A.o(UUID.fromString(stringExtra2));
            return 3;
        }
        if (!"ACTION_STOP_FOREGROUND".equals(action)) {
            return 3;
        }
        v.d().e(str2, "Stopping foreground service");
        SystemForegroundService systemForegroundService = bVar.I;
        if (systemForegroundService == null) {
            return 3;
        }
        systemForegroundService.B = true;
        v.d().a(str, "Shutting down.");
        systemForegroundService.stopForeground(true);
        systemForegroundService.stopSelf(i11);
        return 3;
    }

    @Override
    public final void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.C.f(i10, 2048);
    }

    public final void onTimeout(int i10, int i11) {
        this.C.f(i10, i11);
    }
}
