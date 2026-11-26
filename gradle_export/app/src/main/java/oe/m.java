package oe;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.internal.cast.a3;
import com.google.android.gms.internal.play_billing.r0;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public final class m implements ServiceConnection {
    public int A = 0;
    public final Messenger B;
    public h7.b C;
    public final ArrayDeque D;
    public final SparseArray E;
    public final o F;

    public m(o oVar) {
        this.F = oVar;
        a3 a3Var = new a3(Looper.getMainLooper(), new l(this, 0), 3);
        Looper.getMainLooper();
        this.B = new Messenger(a3Var);
        this.D = new ArrayDeque();
        this.E = new SparseArray();
    }

    public final synchronized void a(String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i10 = this.A;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.A = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.A = 4;
            ue.a.b().c((Context) this.F.B, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.D.iterator();
            while (it.hasNext()) {
                ((n) it.next()).b(zztVar);
            }
            this.D.clear();
            for (int i11 = 0; i11 < this.E.size(); i11++) {
                ((n) this.E.valueAt(i11)).b(zztVar);
            }
            this.E.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            if (this.A == 2 && this.D.isEmpty() && this.E.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.A = 3;
                ue.a.b().c((Context) this.F.B, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean d(n nVar) {
        int i10 = this.A;
        if (i10 != 0) {
            if (i10 == 1) {
                this.D.add(nVar);
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            this.D.add(nVar);
            ((ScheduledExecutorService) this.F.C).execute(new k(this, 0));
            return true;
        }
        this.D.add(nVar);
        if (this.A != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.A = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (ue.a.b().a((Context) this.F.B, intent, this, 1)) {
                ((ScheduledExecutorService) this.F.C).schedule(new k(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a("Unable to bind to service");
            }
        } catch (SecurityException e3) {
            b("Unable to bind to service", e3);
        }
        return true;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.F.C).execute(new r0(this, iBinder, 9));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.F.C).execute(new k(this, 2));
    }
}
