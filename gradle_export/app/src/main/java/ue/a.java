package ue;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.internal.d0;
import com.google.android.gms.common.internal.n0;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import xe.b;

public final class a {

    public static final Object f15251b = new Object();

    public static volatile a f15252c;

    public final ConcurrentHashMap f15253a = new ConcurrentHashMap();

    public static a b() {
        if (f15252c == null) {
            synchronized (f15251b) {
                try {
                    if (f15252c == null) {
                        f15252c = new a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        a aVar = f15252c;
        d0.h(aVar);
        return aVar;
    }

    public final boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return d(context, context.getClass().getName(), intent, serviceConnection, i10, null);
    }

    public final void c(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof n0)) {
            ConcurrentHashMap concurrentHashMap = this.f15253a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((b.a(context).a(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof n0) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i10, executor, serviceConnection) : context.bindService(intent, serviceConnection, i10);
        }
        ConcurrentHashMap concurrentHashMap = this.f15253a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = executor != null ? context.bindService(intent, i10, executor, serviceConnection) : context.bindService(intent, serviceConnection, i10);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th2) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th2;
        }
    }
}
