package oj;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class c0 implements ServiceConnection {
    public final Context A;
    public final Intent B;
    public final ScheduledThreadPoolExecutor C;
    public final ArrayDeque D;
    public a0 E;
    public boolean F;

    public c0(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new qd.c0("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.D = new ArrayDeque();
        this.F = false;
        Context applicationContext = context.getApplicationContext();
        this.A = applicationContext;
        this.B = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.C = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.D.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                a0 a0Var = this.E;
                if (a0Var == null || !a0Var.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.E.a((b0) this.D.poll());
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized xf.n b(Intent intent) {
        b0 b0Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            b0Var = new b0(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.C;
            b0Var.f12087b.f16565a.c(scheduledThreadPoolExecutor, new k7.t(scheduledThreadPoolExecutor.schedule(new m9.f(b0Var, 9), 20L, TimeUnit.SECONDS), 16));
            this.D.add(b0Var);
            a();
        } catch (Throwable th2) {
            throw th2;
        }
        return b0Var.f12087b.f16565a;
    }

    public final void c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb2 = new StringBuilder("binder is dead. start connection? ");
            sb2.append(!this.F);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.F) {
            return;
        }
        this.F = true;
        try {
            if (ue.a.b().a(this.A, this.B, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.D;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((b0) arrayDeque.poll()).f12087b.d(null);
                }
            }
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e3);
        }
        this.F = false;
    }

    @Override
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.F = false;
            if (iBinder instanceof a0) {
                this.E = (a0) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.D;
            while (!arrayDeque.isEmpty()) {
                ((b0) arrayDeque.poll()).f12087b.d(null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        a();
    }
}
