package ab;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkerStoppedException;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public final class g implements gb.a {
    public static final String l = za.v.f("Processor");

    public final Context f369b;

    public final za.b f370c;

    public final jb.b f371d;

    public final WorkDatabase f372e;

    public final HashMap f374g = new HashMap();

    public final HashMap f373f = new HashMap();

    public final HashSet f376i = new HashSet();

    public final ArrayList f377j = new ArrayList();

    public PowerManager.WakeLock f368a = null;

    public final Object f378k = new Object();

    public final HashMap f375h = new HashMap();

    public g(Context context, za.b bVar, jb.b bVar2, WorkDatabase workDatabase) {
        this.f369b = context;
        this.f370c = bVar;
        this.f371d = bVar2;
        this.f372e = workDatabase;
    }

    public static boolean d(String str, l0 l0Var, int i10) {
        String str2 = l;
        if (l0Var == null) {
            za.v.d().a(str2, "WorkerWrapper could not be found for " + str);
            return false;
        }
        l0Var.m.t(new WorkerStoppedException(i10));
        za.v.d().a(str2, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(b bVar) {
        synchronized (this.f378k) {
            this.f377j.add(bVar);
        }
    }

    public final l0 b(String str) {
        l0 l0Var = (l0) this.f373f.remove(str);
        boolean z10 = l0Var != null;
        if (!z10) {
            l0Var = (l0) this.f374g.remove(str);
        }
        this.f375h.remove(str);
        if (z10) {
            synchronized (this.f378k) {
                try {
                    if (this.f373f.isEmpty()) {
                        Context context = this.f369b;
                        String str2 = gb.b.J;
                        Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                        intent.setAction("ACTION_STOP_FOREGROUND");
                        try {
                            this.f369b.startService(intent);
                        } catch (Throwable th2) {
                            za.v.d().c(l, "Unable to stop foreground service", th2);
                        }
                        PowerManager.WakeLock wakeLock = this.f368a;
                        if (wakeLock != null) {
                            wakeLock.release();
                            this.f368a = null;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return l0Var;
    }

    public final l0 c(String str) {
        l0 l0Var = (l0) this.f373f.get(str);
        return l0Var == null ? (l0) this.f374g.get(str) : l0Var;
    }
}
