package bi;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.cast.Cast;
import com.google.android.gms.common.internal.d0;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import f50.k;
import ii.l;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import l9.f0;

public final class g {

    public static final Object f2530k = new Object();
    public static final u.e l = new u.e(0);

    public final Context f2531a;

    public final String f2532b;

    public final i f2533c;

    public final ii.g f2534d;

    public final l f2537g;

    public final ij.b f2538h;

    public final AtomicBoolean f2535e = new AtomicBoolean(false);

    public final AtomicBoolean f2536f = new AtomicBoolean();

    public final CopyOnWriteArrayList f2539i = new CopyOnWriteArrayList();

    public final CopyOnWriteArrayList f2540j = new CopyOnWriteArrayList();

    public g(Context context, String str, i iVar) {
        ?? arrayList;
        int i10 = 0;
        this.f2531a = context;
        d0.e(str);
        this.f2532b = str;
        this.f2533c = iVar;
        a aVar = FirebaseInitProvider.A;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), Cast.MAX_NAMESPACE_LENGTH);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new ii.d((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ji.l lVar = ji.l.A;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new ii.d(new FirebaseCommonRegistrar(), i11));
        arrayList3.add(new ii.d(new ExecutorsRegistrar(), i11));
        arrayList4.add(ii.b.c(context, Context.class, new Class[0]));
        arrayList4.add(ii.b.c(this, g.class, new Class[0]));
        arrayList4.add(ii.b.c(iVar, i.class, new Class[0]));
        sg.f fVar = new sg.f();
        if (k.s(context) && FirebaseInitProvider.B.get()) {
            arrayList4.add(ii.b.c(aVar, a.class, new Class[0]));
        }
        ii.g gVar = new ii.g(arrayList3, arrayList4, fVar);
        this.f2534d = gVar;
        Trace.endSection();
        this.f2537g = new l(new c(this, context, i10));
        this.f2538h = gVar.d(gj.d.class);
        d dVar = new d(this);
        a();
        if (this.f2535e.get()) {
            com.google.android.gms.common.api.internal.c.E.A.get();
        }
        this.f2539i.add(dVar);
        Trace.endSection();
    }

    public static g c() {
        g gVar;
        synchronized (f2530k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    StringBuilder sb2 = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (ve.c.f15626g == null) {
                        ve.c.f15626g = Application.getProcessName();
                    }
                    sb2.append(ve.c.f15626g);
                    sb2.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb2.toString());
                }
                ((gj.d) gVar.f2538h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(Context context) {
        synchronized (f2530k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return c();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, iVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g g(Context context, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f2527a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f2527a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                if (atomicReference2.compareAndSet(null, eVar)) {
                    com.google.android.gms.common.api.internal.c.b(application);
                    com.google.android.gms.common.api.internal.c.E.a(eVar);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f2530k) {
            u.e eVar2 = l;
            d0.j("FirebaseApp name [DEFAULT] already exists!", !eVar2.containsKey("[DEFAULT]"));
            d0.i(context, "Application context cannot be null.");
            gVar = new g(context, "[DEFAULT]", iVar);
            eVar2.put("[DEFAULT]", gVar);
        }
        gVar.e();
        return gVar;
    }

    public final void a() {
        d0.j("FirebaseApp was deleted", !this.f2536f.get());
    }

    public final Object b(Class cls) {
        a();
        return this.f2534d.a(cls);
    }

    public final String d() {
        StringBuilder sb2 = new StringBuilder();
        a();
        sb2.append(ve.c.c(this.f2532b.getBytes(Charset.defaultCharset())));
        sb2.append("+");
        a();
        sb2.append(ve.c.c(this.f2533c.f2542b.getBytes(Charset.defaultCharset())));
        return sb2.toString();
    }

    public final void e() {
        HashMap map;
        if (k.s(this.f2531a)) {
            StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
            a();
            sb2.append(this.f2532b);
            Log.i("FirebaseApp", sb2.toString());
            ii.g gVar = this.f2534d;
            a();
            boolean zEquals = "[DEFAULT]".equals(this.f2532b);
            if (gVar.f7692f.compareAndSet(null, Boolean.valueOf(zEquals))) {
                synchronized (gVar) {
                    map = new HashMap(gVar.f7687a);
                }
                gVar.h(map, zEquals);
            }
            ((gj.d) this.f2538h.get()).b();
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
        a();
        sb3.append(this.f2532b);
        Log.i("FirebaseApp", sb3.toString());
        Context context = this.f2531a;
        AtomicReference atomicReference = f.f2528b;
        if (atomicReference.get() == null) {
            f fVar = new f(context);
            if (atomicReference.compareAndSet(null, fVar)) {
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f2532b.equals(gVar.f2532b);
    }

    public final boolean h() {
        boolean z10;
        a();
        nj.a aVar = (nj.a) this.f2537g.get();
        synchronized (aVar) {
            z10 = aVar.f11368a;
        }
        return z10;
    }

    public final int hashCode() {
        return this.f2532b.hashCode();
    }

    public final String toString() {
        f0 f0Var = new f0(this);
        f0Var.a(this.f2532b, "name");
        f0Var.a(this.f2533c, "options");
        return f0Var.toString();
    }
}
