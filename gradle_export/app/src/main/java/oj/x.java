package oj;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

public final class x extends BroadcastReceiver {

    public y f12126a;

    public final y f12127b;

    public x(y yVar, y yVar2) {
        this.f12127b = yVar;
        this.f12126a = yVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f12127b.A.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            y yVar = this.f12126a;
            if (yVar == null) {
                return;
            }
            if (yVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                y yVar2 = this.f12126a;
                yVar2.D.f12123f.schedule(yVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f12126a = null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
