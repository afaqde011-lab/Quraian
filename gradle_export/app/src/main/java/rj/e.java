package rj;

import android.app.Application;
import android.content.Context;
import bi.g;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import ii.f;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import q3.e0;
import s10.w0;
import sj.h;
import sj.l;
import sj.m;

public final class e implements uj.a {

    public static final Random f13597j = new Random();

    public static final HashMap f13598k = new HashMap();

    public final Context f13600b;

    public final ScheduledExecutorService f13601c;

    public final g f13602d;

    public final jj.d f13603e;

    public final ci.b f13604f;

    public final ij.b f13605g;

    public final String f13606h;

    public final HashMap f13599a = new HashMap();

    public final HashMap f13607i = new HashMap();

    public e(Context context, ScheduledExecutorService scheduledExecutorService, g gVar, jj.d dVar, ci.b bVar, ij.b bVar2) {
        this.f13600b = context;
        this.f13601c = scheduledExecutorService;
        this.f13602d = gVar;
        this.f13603e = dVar;
        this.f13604f = bVar;
        this.f13605g = bVar2;
        gVar.a();
        this.f13606h = gVar.f2533c.f2542b;
        AtomicReference atomicReference = d.f13596a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = d.f13596a;
        if (atomicReference2.get() == null) {
            d dVar2 = new d();
            if (atomicReference2.compareAndSet(null, dVar2)) {
                com.google.android.gms.common.api.internal.c.b(application);
                com.google.android.gms.common.api.internal.c.E.a(dVar2);
            }
        }
        Tasks.b(scheduledExecutorService, new cc.b(this, 2));
    }

    public final synchronized b a() throws Throwable {
        try {
            try {
                sj.c cVarC = c("fetch");
                sj.c cVarC2 = c("activate");
                sj.c cVarC3 = c("defaults");
                try {
                    try {
                        l lVar = new l(this.f13600b.getSharedPreferences("frc_" + this.f13606h + "_firebase_settings", 0));
                        h hVar = new h(this.f13601c, cVarC2, cVarC3);
                        g gVar = this.f13602d;
                        ij.b bVar = this.f13605g;
                        gVar.a();
                        e0 e0Var = gVar.f2532b.equals("[DEFAULT]") ? new e0(bVar) : null;
                        if (e0Var != null) {
                            c cVar = new c(e0Var);
                            synchronized (hVar.f14276a) {
                                hVar.f14276a.add(cVar);
                            }
                        }
                        e0 e0Var2 = new e0(11, false);
                        e0Var2.B = cVarC2;
                        e0Var2.C = cVarC3;
                        ScheduledExecutorService scheduledExecutorService = this.f13601c;
                        p10.a aVar = new p10.a();
                        aVar.D = Collections.newSetFromMap(new ConcurrentHashMap());
                        aVar.A = cVarC2;
                        aVar.B = e0Var2;
                        aVar.C = scheduledExecutorService;
                        return b(this.f13602d, this.f13603e, this.f13604f, this.f13601c, cVarC, cVarC2, cVarC3, d(cVarC, lVar), hVar, lVar, aVar);
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            throw th;
        }
    }

    public final synchronized b b(g gVar, jj.d dVar, ci.b bVar, Executor executor, sj.c cVar, sj.c cVar2, sj.c cVar3, sj.g gVar2, h hVar, l lVar, p10.a aVar) {
        if (!this.f13599a.containsKey("firebase")) {
            gVar.a();
            ci.b bVar2 = gVar.f2532b.equals("[DEFAULT]") ? bVar : null;
            Context context = this.f13600b;
            synchronized (this) {
                b bVar3 = new b(bVar2, executor, cVar, cVar2, cVar3, gVar2, hVar, lVar, new w0(gVar, dVar, gVar2, cVar2, context, lVar, this.f13601c), aVar);
                cVar2.b();
                cVar3.b();
                cVar.b();
                this.f13599a.put("firebase", bVar3);
                f13598k.put("firebase", bVar3);
            }
        }
        return (b) this.f13599a.get("firebase");
    }

    public final sj.c c(String str) {
        m mVar;
        sj.c cVar;
        String strQ = a1.b.q("frc_", this.f13606h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f13601c;
        Context context = this.f13600b;
        HashMap map = m.f14307c;
        synchronized (m.class) {
            try {
                HashMap map2 = m.f14307c;
                if (!map2.containsKey(strQ)) {
                    map2.put(strQ, new m(context, strQ));
                }
                mVar = (m) map2.get(strQ);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        HashMap map3 = sj.c.f14242d;
        synchronized (sj.c.class) {
            try {
                String str2 = mVar.f14309b;
                HashMap map4 = sj.c.f14242d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new sj.c(scheduledExecutorService, mVar));
                }
                cVar = (sj.c) map4.get(str2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return cVar;
    }

    public final synchronized sj.g d(sj.c cVar, l lVar) {
        jj.d dVar;
        ij.b fVar;
        ScheduledExecutorService scheduledExecutorService;
        Random random;
        String str;
        g gVar;
        try {
            dVar = this.f13603e;
            g gVar2 = this.f13602d;
            gVar2.a();
            fVar = gVar2.f2532b.equals("[DEFAULT]") ? this.f13605g : new f(7);
            scheduledExecutorService = this.f13601c;
            random = f13597j;
            g gVar3 = this.f13602d;
            gVar3.a();
            str = gVar3.f2533c.f2541a;
            gVar = this.f13602d;
            gVar.a();
        } catch (Throwable th2) {
            throw th2;
        }
        return new sj.g(dVar, fVar, scheduledExecutorService, random, cVar, new ConfigFetchHttpClient(this.f13600b, gVar.f2533c.f2542b, str, lVar.f14303a.getLong("fetch_timeout_in_seconds", 60L), lVar.f14303a.getLong("fetch_timeout_in_seconds", 60L)), lVar, this.f13607i);
    }
}
