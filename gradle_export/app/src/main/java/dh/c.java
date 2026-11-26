package dh;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import com.google.android.play.integrity.internal.af;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    public static final HashMap f4876o = new HashMap();

    public final Context f4877a;

    public final w f4878b;

    public boolean f4883g;

    public final Intent f4884h;

    public final tf.y f4885i;
    public bh.k m;

    public u f4888n;

    public final ArrayList f4880d = new ArrayList();

    public final HashSet f4881e = new HashSet();

    public final Object f4882f = new Object();

    public final bh.h f4887k = new bh.h(this, 1);
    public final AtomicInteger l = new AtomicInteger(0);

    public final String f4879c = "ExpressIntegrityService";

    public final WeakReference f4886j = new WeakReference(null);

    public c(Context context, w wVar, Intent intent, tf.y yVar) {
        this.f4877a = context;
        this.f4878b = wVar;
        this.f4884h = intent;
        this.f4885i = yVar;
    }

    public static void b(c cVar, yg.f fVar) {
        u uVar = cVar.f4888n;
        ArrayList arrayList = cVar.f4880d;
        w wVar = cVar.f4878b;
        if (uVar != null || cVar.f4883g) {
            if (!cVar.f4883g) {
                fVar.run();
                return;
            } else {
                wVar.b("Waiting to bind to the service.", new Object[0]);
                arrayList.add(fVar);
                return;
            }
        }
        wVar.b("Initiate binding to the service.", new Object[0]);
        arrayList.add(fVar);
        bh.k kVar = new bh.k(cVar);
        cVar.m = kVar;
        cVar.f4883g = true;
        if (cVar.f4877a.bindService(cVar.f4884h, kVar, 1)) {
            return;
        }
        wVar.b("Failed to bind to the service.", new Object[0]);
        cVar.f4883g = false;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a(new af());
        }
        arrayList.clear();
    }

    public final Handler a() {
        Handler handler;
        HashMap map = f4876o;
        synchronized (map) {
            try {
                String str = this.f4879c;
                if (!map.containsKey(str)) {
                    HandlerThread handlerThread = new HandlerThread(str, 10);
                    handlerThread.start();
                    map.put(str, new Handler(handlerThread.getLooper()));
                }
                handler = (Handler) map.get(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final void c(xf.g gVar) {
        synchronized (this.f4882f) {
            this.f4881e.remove(gVar);
        }
        a().post(new b(this));
    }
}
