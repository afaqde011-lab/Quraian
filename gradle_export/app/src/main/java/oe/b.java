package oe;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import k9.x0;
import u.s0;

public final class b {

    public static int f11938h;

    public static PendingIntent f11939i;

    public static final Pattern f11940j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    public final Context f11942b;

    public final bg.b f11943c;

    public final ScheduledThreadPoolExecutor f11944d;

    public Messenger f11946f;

    public g f11947g;

    public final s0 f11941a = new s0(0);

    public final Messenger f11945e = new Messenger(new e(this, Looper.getMainLooper()));

    public b(Context context) {
        this.f11942b = context;
        this.f11943c = new bg.b(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f11944d = scheduledThreadPoolExecutor;
    }

    public final xf.n a(Bundle bundle) {
        String string;
        synchronized (b.class) {
            int i10 = f11938h;
            f11938h = i10 + 1;
            string = Integer.toString(i10);
        }
        xf.g gVar = new xf.g();
        synchronized (this.f11941a) {
            this.f11941a.put(string, gVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f11943c.x() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.f11942b;
        synchronized (b.class) {
            try {
                if (f11939i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    f11939i = PendingIntent.getBroadcast(context, 0, intent2, 33554432);
                }
                intent.putExtra("app", f11939i);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        intent.putExtra("kid", "|ID|" + string + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f11945e);
        if (this.f11946f != null || this.f11947g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f11946f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    Messenger messenger2 = this.f11947g.A;
                    messenger2.getClass();
                    messenger2.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f11943c.x() == 2) {
                    this.f11942b.sendBroadcast(intent);
                } else {
                    this.f11942b.startService(intent);
                }
            }
        } else if (this.f11943c.x() == 2) {
            this.f11942b.sendBroadcast(intent);
        } else {
            this.f11942b.startService(intent);
        }
        gVar.f16565a.c(h.C, new x0(this, string, this.f11944d.schedule((Runnable) new a50.d(gVar, 13), 30L, TimeUnit.SECONDS), 21));
        return gVar.f16565a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.f11941a) {
            try {
                xf.g gVar = (xf.g) this.f11941a.remove(str);
                if (gVar != null) {
                    gVar.b(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
