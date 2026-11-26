package bh;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.RemoteException;
import com.google.android.play.core.review.internal.zzu;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class l {

    public static final HashMap f2506n = new HashMap();

    public final Context f2507a;

    public final f f2508b;

    public boolean f2513g;

    public final Intent f2514h;
    public k l;
    public e m;

    public final ArrayList f2510d = new ArrayList();

    public final HashSet f2511e = new HashSet();

    public final Object f2512f = new Object();

    public final h f2516j = new h(this, 0);

    public final AtomicInteger f2517k = new AtomicInteger(0);

    public final String f2509c = "com.google.android.finsky.inappreviewservice.InAppReviewService";

    public final WeakReference f2515i = new WeakReference(null);

    public l(Context context, f fVar, Intent intent) {
        this.f2507a = context;
        this.f2508b = fVar;
        this.f2514h = intent;
    }

    public static void b(l lVar, ah.f fVar) {
        e eVar = lVar.m;
        f fVar2 = lVar.f2508b;
        ArrayList<g> arrayList = lVar.f2510d;
        if (eVar != null || lVar.f2513g) {
            if (!lVar.f2513g) {
                fVar.run();
                return;
            } else {
                fVar2.g("Waiting to bind to the service.", new Object[0]);
                arrayList.add(fVar);
                return;
            }
        }
        fVar2.g("Initiate binding to the service.", new Object[0]);
        arrayList.add(fVar);
        k kVar = new k(lVar, 0);
        lVar.l = kVar;
        lVar.f2513g = true;
        if (lVar.f2507a.bindService(lVar.f2514h, kVar, 1)) {
            return;
        }
        fVar2.g("Failed to bind to the service.", new Object[0]);
        lVar.f2513g = false;
        for (g gVar : arrayList) {
            zzu zzuVar = new zzu();
            xf.g gVar2 = gVar.A;
            if (gVar2 != null) {
                gVar2.c(zzuVar);
            }
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f2506n;
        synchronized (map) {
            try {
                if (!map.containsKey(this.f2509c)) {
                    HandlerThread handlerThread = new HandlerThread(this.f2509c, 10);
                    handlerThread.start();
                    map.put(this.f2509c, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(this.f2509c);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.f2511e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((xf.g) it.next()).c(new RemoteException(String.valueOf(this.f2509c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
