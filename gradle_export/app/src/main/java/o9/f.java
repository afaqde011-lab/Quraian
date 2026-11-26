package o9;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaRouter2;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import androidx.media3.common.q1;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.framework.media.NotificationOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.internal.measurement.x5;
import i7.m1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k9.x0;

public final class f {
    public static final int G = 0;
    public n A;
    public n B;
    public int C;
    public x0 D;
    public android.support.v4.media.session.t E;
    public final a F;

    public final t0 f11780c;

    public b0 f11781d;

    public r f11782e;

    public y f11783f;

    public z f11784g;

    public final Context f11785h;

    public final com.google.android.material.datepicker.n f11790o;

    public final a f11791p;

    public final boolean f11792q;

    public final boolean f11793r;

    public l f11794s;

    public final h0 f11795t;

    public final m1 f11796u;

    public e0 f11797v;

    public b0 f11798w;

    public b0 f11799x;

    public b0 f11800y;

    public p f11801z;

    public final b f11778a = new b(this);

    public final HashMap f11779b = new HashMap();

    public final ArrayList f11786i = new ArrayList();

    public final ArrayList f11787j = new ArrayList();

    public final HashMap f11788k = new HashMap();
    public final HashMap l = new HashMap();
    public final ArrayList m = new ArrayList();

    public final ArrayList f11789n = new ArrayList();

    static {
        Log.isLoggable("AxMediaRouter", 3);
    }

    public f(Context context) {
        com.google.android.material.datepicker.n nVar = new com.google.android.material.datepicker.n(3);
        nVar.D = 0;
        nVar.E = 3;
        this.f11790o = nVar;
        this.f11791p = new a(this);
        this.F = new a(this);
        this.f11785h = context;
        this.f11792q = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = MediaTransferReceiver.f1840a;
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        boolean z10 = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
        this.f11793r = z10;
        int i11 = w0.f11890c;
        Intent intent2 = new Intent(context, (Class<?>) w0.class);
        intent2.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
        this.f11794s = z10 ? new l(context, new hf.c(this, 29)) : null;
        h0 h0Var = new h0(context, this);
        this.f11795t = h0Var;
        this.f11796u = new m1(new m9.f(this, 5));
        a(h0Var, true);
        t tVar = this.f11794s;
        if (tVar != null) {
            a(tVar, true);
        }
        t0 t0Var = new t0(context, this);
        this.f11780c = t0Var;
        if (t0Var.f11873g) {
            return;
        }
        t0Var.f11873g = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        Context context2 = t0Var.f11867a;
        androidx.mediarouter.app.g gVar = t0Var.f11874h;
        Handler handler = t0Var.f11869c;
        context2.registerReceiver(gVar, intentFilter, null, handler);
        handler.post(t0Var.f11875i);
    }

    public final void a(t tVar, boolean z10) {
        if (d(tVar) == null) {
            a0 a0Var = new a0(tVar, z10);
            this.m.add(a0Var);
            this.f11778a.b(513, a0Var);
            p(a0Var, tVar.G);
            c0.b();
            tVar.D = this.f11791p;
            tVar.g(this.A);
        }
    }

    public final String b(a0 a0Var, String str) {
        String strFlattenToShortString = ((ComponentName) a0Var.f11732d.B).flattenToShortString();
        boolean z10 = a0Var.f11731c;
        String strM = z10 ? str : x5.m(strFlattenToShortString, ":", str);
        HashMap map = this.l;
        if (!z10) {
            ArrayList arrayList = this.f11787j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((b0) arrayList.get(i10)).f11739c.equals(strM)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("AxMediaRouter", a1.b.q("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strM + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((b0) arrayList.get(i12)).f11739c.equals(str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 < 0) {
                        map.put(new y4.b(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        map.put(new y4.b(strFlattenToShortString, str), strM);
        return strM;
    }

    public final b0 c() {
        for (b0 b0Var : this.f11787j) {
            if (b0Var != this.f11798w && b0Var.c() == this.f11795t && b0Var.m("android.media.intent.category.LIVE_AUDIO") && !b0Var.m("android.media.intent.category.LIVE_VIDEO") && b0Var.f()) {
                return b0Var;
            }
        }
        return this.f11798w;
    }

    public final a0 d(t tVar) {
        for (a0 a0Var : this.m) {
            if (a0Var.f11729a == tVar) {
                return a0Var;
            }
        }
        return null;
    }

    public final ArrayList e() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f11788k.values().iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        return arrayList;
    }

    public final void f() {
        Iterator it = this.f11788k.values().iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
    }

    public final r g(b0 b0Var) {
        r rVar;
        if (b0Var == this.f11781d && (rVar = this.f11782e) != null) {
            return rVar;
        }
        if ((b0Var instanceof x) && ((x) b0Var).n()) {
            f();
            return null;
        }
        r rVar2 = (r) this.f11779b.get(b0Var.f11739c);
        if (rVar2 != null) {
            return rVar2;
        }
        Iterator it = this.f11788k.values().iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        return rVar2;
    }

    public final b0 h() {
        b0 b0Var = this.f11781d;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean i() {
        if (!this.f11793r) {
            return false;
        }
        e0 e0Var = this.f11797v;
        return e0Var == null || e0Var.f11773a;
    }

    public final void j() {
        r rVarC;
        if (this.f11781d.e()) {
            List<b0> listUnmodifiableList = Collections.unmodifiableList(this.f11781d.f11756v);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((b0) it.next()).f11739c);
            }
            HashMap map = this.f11779b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    r rVar = (r) entry.getValue();
                    rVar.h(0);
                    rVar.d();
                    it2.remove();
                }
            }
            for (b0 b0Var : listUnmodifiableList) {
                if (!map.containsKey(b0Var.f11739c) && (rVarC = b0Var.c().c(b0Var.f11738b, this.f11781d.f11738b)) != null) {
                    rVarC.e();
                    map.put(b0Var.f11739c, rVarC);
                }
            }
        }
    }

    public final void k(f fVar, b0 b0Var, r rVar, int i10, boolean z10, b0 b0Var2, Collection collection) {
        y yVar;
        z zVar = this.f11784g;
        if (zVar != null) {
            zVar.a();
            this.f11784g = null;
        }
        z zVar2 = new z(fVar, b0Var, rVar, i10, z10, b0Var2, collection);
        this.f11784g = zVar2;
        if (zVar2.f11894b != 3 || (yVar = this.f11783f) == null) {
            zVar2.b();
            return;
        }
        b0 b0Var3 = this.f11781d;
        Logger logger = com.google.android.gms.internal.cast.s0.f3542c;
        b0 b0Var4 = zVar2.f11897e;
        logger.d("Prepare transfer from Route(%s) to Route(%s)", b0Var3, b0Var4);
        d4.k kVarA = a10.h0.A(new a1.i((com.google.android.gms.internal.cast.s0) yVar, b0Var3, b0Var4, 7));
        z zVar3 = this.f11784g;
        f fVar2 = (f) zVar3.f11900h.get();
        if (fVar2 == null || fVar2.f11784g != zVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            zVar3.a();
        } else {
            if (zVar3.f11901i != null) {
                throw new IllegalStateException("future is already set");
            }
            zVar3.f11901i = kVarA;
            m9.f fVar3 = new m9.f(zVar3, 7);
            b bVar = fVar2.f11778a;
            Objects.requireNonNull(bVar);
            kVarA.B.a(fVar3, new q1(bVar, 4));
        }
    }

    public final void l(o9.b0 r5, int r6, boolean r7) {
        throw new UnsupportedOperationException("Method not decompiled: o9.f.l(o9.b0, int, boolean):void");
    }

    public final void m(b0 b0Var, int i10, boolean z10) {
        b20.z zVar;
        String str;
        if (this.f11781d == b0Var) {
            return;
        }
        boolean z11 = b0Var == this.f11798w;
        if (this.f11799x != null && z11) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            StringBuilder sb2 = new StringBuilder("- Stacktrace: [");
            int i11 = 3;
            while (i11 < stackTrace.length) {
                StackTraceElement stackTraceElement = stackTrace[i11];
                sb2.append(stackTraceElement.getClassName());
                sb2.append(".");
                sb2.append(stackTraceElement.getMethodName());
                sb2.append(":");
                sb2.append(stackTraceElement.getLineNumber());
                i11++;
                if (i11 < stackTrace.length) {
                    sb2.append(", ");
                }
            }
            sb2.append("]");
            b0 b0Var2 = this.f11781d;
            if (b0Var2 != null) {
                Locale locale = Locale.US;
                String str2 = b0Var2.f11740d;
                c0.b();
                str = str2 + "(BT=" + (c0.c().f11799x == b0Var2) + ", syncMediaRoute1Provider=" + z10 + ")";
            } else {
                str = null;
            }
            StringBuilder sbN = g4.c.n("Changing selection(", str, ") to default while BT is available: pkgName=");
            sbN.append(this.f11785h.getPackageName());
            sbN.append((Object) sb2);
            Log.w("AxMediaRouter", sbN.toString());
        }
        if (this.f11800y != null) {
            this.f11800y = null;
            p pVar = this.f11801z;
            if (pVar != null) {
                pVar.h(3);
                this.f11801z.d();
                this.f11801z = null;
            }
        }
        if (i() && (zVar = b0Var.f11737a.f11733e) != null && zVar.c) {
            t tVarC = b0Var.c();
            String str3 = b0Var.f11738b;
            Bundle bundle = new Bundle();
            bundle.putString("clientPackageName", this.f11785h.getPackageName());
            p pVarA = tVarC.a(str3, new s(bundle));
            if (pVarA != null) {
                Executor mainExecutor = this.f11785h.getMainExecutor();
                a aVar = this.F;
                synchronized (pVarA.f11842a) {
                    try {
                        if (mainExecutor == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (aVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        pVarA.f11843b = mainExecutor;
                        pVarA.f11844c = aVar;
                        ArrayList arrayList = pVarA.f11846e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            m mVar = pVarA.f11845d;
                            ArrayList arrayList2 = pVarA.f11846e;
                            pVarA.f11845d = null;
                            pVarA.f11846e = null;
                            pVarA.f11843b.execute(new ab.k((Object) pVarA, (Object) aVar, (Object) mVar, (Object) arrayList2, 15));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f11800y = b0Var;
                this.f11801z = pVarA;
                pVarA.e();
                return;
            }
            Log.w("AxMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + b0Var);
        }
        t tVarC2 = b0Var.c();
        String str4 = b0Var.f11738b;
        Bundle bundle2 = new Bundle();
        bundle2.putString("clientPackageName", this.f11785h.getPackageName());
        r rVarD = tVarC2.d(str4, new s(bundle2));
        if (rVarD != null) {
            rVarD.e();
        }
        if (this.f11781d != null) {
            k(this, b0Var, rVarD, i10, z10, null, null);
            return;
        }
        this.f11781d = b0Var;
        this.f11782e = rVarD;
        b bVar = this.f11778a;
        bVar.getClass();
        Message messageObtainMessage = bVar.obtainMessage(262, new e(null, b0Var, z10));
        messageObtainMessage.arg1 = i10;
        messageObtainMessage.sendToTarget();
    }

    public final void n() {
        db.g gVar;
        ArrayList arrayList;
        db.g gVar2 = new db.g(5, (byte) 0);
        m1 m1Var = this.f11796u;
        long j9 = 0;
        m1Var.A = 0L;
        int i10 = 0;
        m1Var.C = false;
        m1Var.B = SystemClock.elapsedRealtime();
        ((Handler) m1Var.D).removeCallbacks((m9.f) m1Var.E);
        ArrayList arrayList2 = this.f11786i;
        int size = arrayList2.size();
        int i11 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.f11792q;
            if (size < 0) {
                db.g gVar3 = gVar2;
                long j10 = j9;
                m1 m1Var2 = this.f11796u;
                if (m1Var2.C) {
                    long j11 = m1Var2.A;
                    if (j11 > j10) {
                        ((Handler) m1Var2.D).postDelayed((m9.f) m1Var2.E, j11);
                    }
                }
                boolean z12 = m1Var2.C;
                this.C = i11;
                u uVarI = z10 ? gVar3.i() : u.f11876c;
                u uVarI2 = gVar3.i();
                if (i()) {
                    n nVar = this.B;
                    if (nVar != null) {
                        nVar.a();
                        if (!nVar.f11827b.equals(uVarI2) || this.B.b() != z12) {
                            if (uVarI2.d() || z12) {
                                this.B = new n(uVarI2, z12);
                            } else if (this.B != null) {
                                this.B = null;
                            }
                            this.f11794s.g(this.B);
                        }
                    } else if (uVarI2.d()) {
                        this.B = new n(uVarI2, z12);
                        this.f11794s.g(this.B);
                    } else {
                        this.B = new n(uVarI2, z12);
                        this.f11794s.g(this.B);
                    }
                }
                n nVar2 = this.A;
                if (nVar2 != null) {
                    nVar2.a();
                    if (nVar2.f11827b.equals(uVarI) && this.A.b() == z12) {
                        return;
                    }
                }
                if (!uVarI.d() || z12) {
                    this.A = new n(uVarI, z12);
                } else if (this.A == null) {
                    return;
                } else {
                    this.A = null;
                }
                if (z10 && !z12 && z11) {
                    Log.i("AxMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                Iterator it = this.m.iterator();
                while (it.hasNext()) {
                    t tVar = ((a0) it.next()).f11729a;
                    if (tVar != this.f11794s) {
                        tVar.g(this.A);
                    }
                }
                return;
            }
            c0 c0Var = (c0) ((WeakReference) arrayList2.get(size)).get();
            if (c0Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList3 = c0Var.f11759b;
                int size2 = arrayList3.size();
                i11 += size2;
                int i12 = i10;
                while (i12 < size2) {
                    w wVar = (w) arrayList3.get(i12);
                    u uVar = wVar.f11885c;
                    if (uVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList<String> arrayListC = uVar.c();
                    if (!arrayListC.isEmpty()) {
                        for (String str : arrayListC) {
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            long j12 = j9;
                            if (gVar2.B == null) {
                                gVar2.B = new ArrayList();
                            }
                            if (!gVar2.B.contains(str)) {
                                gVar2.B.add(str);
                            }
                            j9 = j12;
                        }
                    }
                    long j13 = j9;
                    int i13 = (wVar.f11886d & 1) != 0 ? 1 : i10;
                    long j14 = wVar.f11887e;
                    m1 m1Var3 = this.f11796u;
                    if (i13 == 0) {
                        m1Var3.getClass();
                        gVar = gVar2;
                        arrayList = arrayList2;
                    } else {
                        gVar = gVar2;
                        arrayList = arrayList2;
                        long j15 = m1Var3.B;
                        if (j15 - j14 < NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) {
                            m1Var3.A = Math.max(m1Var3.A, (j14 + NotificationOptions.SKIP_STEP_THIRTY_SECONDS_IN_MS) - j15);
                            m1Var3.C = true;
                        }
                    }
                    if (i13 != 0) {
                        z10 = true;
                    }
                    int i14 = wVar.f11886d;
                    if ((i14 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z10 = true;
                    }
                    i12++;
                    j9 = j13;
                    gVar2 = gVar;
                    arrayList2 = arrayList;
                    i10 = 0;
                }
            }
            j9 = j9;
            gVar2 = gVar2;
            arrayList2 = arrayList2;
            i10 = 0;
        }
    }

    public final void o() {
        MediaRouter2.RoutingController routingController;
        b0 b0Var = this.f11781d;
        if (b0Var == null) {
            x0 x0Var = this.D;
            if (x0Var != null) {
                x0Var.m();
                return;
            }
            return;
        }
        int i10 = b0Var.f11750p;
        com.google.android.material.datepicker.n nVar = this.f11790o;
        nVar.B = i10;
        nVar.C = b0Var.f11751q;
        nVar.D = (!b0Var.e() || c0.g()) ? b0Var.f11749o : 0;
        nVar.E = this.f11781d.m;
        String id2 = null;
        if (i() && this.f11781d.c() == this.f11794s) {
            r rVar = this.f11782e;
            int i11 = l.T;
            if ((rVar instanceof h) && (routingController = ((h) rVar).f11806g) != null) {
                id2 = routingController.getId();
            }
            nVar.F = id2;
        } else {
            nVar.F = null;
        }
        Iterator it = this.f11789n.iterator();
        if (it.hasNext()) {
            throw a1.b.j(it);
        }
        x0 x0Var2 = this.D;
        if (x0Var2 != null) {
            b0 b0Var2 = this.f11781d;
            b0 b0Var3 = this.f11798w;
            if (b0Var3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (b0Var2 == b0Var3 || b0Var2 == this.f11799x) {
                x0Var2.m();
                return;
            }
            int i12 = nVar.D == 1 ? 2 : 0;
            int i13 = nVar.C;
            int i14 = nVar.B;
            String str = (String) nVar.F;
            android.support.v4.media.session.t tVar = (android.support.v4.media.session.t) x0Var2.B;
            if (tVar != null) {
                d dVar = (d) x0Var2.C;
                if (dVar != null && i12 == 0 && i13 == 0) {
                    dVar.f11762c = i14;
                    if (((l9.l0) dVar.f11764e) == null) {
                        dVar.f11764e = new l9.l0(dVar, dVar.f11760a, dVar.f11761b, dVar.f11762c, (String) dVar.f11763d, 1);
                    }
                    z6.c.a((l9.l0) dVar.f11764e, i14);
                    return;
                }
                d dVar2 = new d(x0Var2, i12, i13, i14, str);
                x0Var2.C = dVar2;
                MediaSession mediaSession = tVar.f515a.f505a;
                if (((l9.l0) dVar2.f11764e) == null) {
                    dVar2.f11764e = new l9.l0(dVar2, i12, i13, dVar2.f11762c, str, 1);
                }
                mediaSession.setPlaybackToRemote((l9.l0) dVar2.f11764e);
            }
        }
    }

    public final void p(a0 a0Var, b20.z zVar) {
        boolean z10;
        String str;
        int i10;
        Iterator it;
        boolean z11;
        b20.z zVar2 = a0Var.f11733e;
        ArrayList arrayList = a0Var.f11730b;
        if (zVar2 != zVar) {
            a0Var.f11733e = zVar;
            ArrayList arrayList2 = this.f11787j;
            b bVar = this.f11778a;
            if (zVar != null) {
                List list = zVar.b;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        m mVar = (m) list.get(i11);
                        if (mVar != null && mVar.e()) {
                            i11++;
                        } else if (zVar != this.f11795t.G) {
                            z10 = false;
                            if (zVar != null) {
                                str = "Ignoring invalid provider descriptor: " + zVar;
                            } else {
                                str = "Ignoring null provider descriptor from " + ((ComponentName) a0Var.f11732d.B);
                            }
                            Log.w("AxMediaRouter", str);
                            i10 = 0;
                        }
                    }
                    ArrayList<y4.b> arrayList3 = new ArrayList();
                    ArrayList<y4.b> arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    int i12 = 0;
                    boolean z12 = false;
                    while (it2.hasNext()) {
                        m mVar2 = (m) it2.next();
                        if (mVar2 == null || !mVar2.e()) {
                            it = it2;
                            z11 = z12;
                            Log.w("AxMediaRouter", "Ignoring invalid route descriptor: " + mVar2);
                        } else {
                            String strD = mVar2.d();
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    i13 = -1;
                                    break;
                                } else if (((b0) arrayList.get(i13)).f11738b.equals(strD)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            if (i13 < 0) {
                                it = it2;
                                z11 = z12;
                                b0 b0Var = new b0(a0Var, strD, b(a0Var, strD), mVar2.f11825a.getBoolean("isSystemRoute", false));
                                int i14 = i12 + 1;
                                arrayList.add(i12, b0Var);
                                arrayList2.add(b0Var);
                                if (mVar2.c().isEmpty()) {
                                    b0Var.i(mVar2);
                                    bVar.b(257, b0Var);
                                } else {
                                    arrayList3.add(new y4.b(b0Var, mVar2));
                                }
                                i12 = i14;
                            } else {
                                it = it2;
                                z11 = z12;
                                if (i13 < i12) {
                                    Log.w("AxMediaRouter", "Ignoring route descriptor with duplicate id: " + mVar2);
                                } else {
                                    b0 b0Var2 = (b0) arrayList.get(i13);
                                    int i15 = i12 + 1;
                                    Collections.swap(arrayList, i13, i12);
                                    if (!mVar2.c().isEmpty()) {
                                        arrayList4.add(new y4.b(b0Var2, mVar2));
                                    } else if (q(b0Var2, mVar2) != 0 && b0Var2 == this.f11781d) {
                                        i12 = i15;
                                        z11 = true;
                                    }
                                    i12 = i15;
                                }
                            }
                        }
                        it2 = it;
                        z12 = z11;
                    }
                    boolean z13 = z12;
                    for (y4.b bVar2 : arrayList3) {
                        b0 b0Var3 = (b0) bVar2.f16603a;
                        b0Var3.i((m) bVar2.f16604b);
                        bVar.b(257, b0Var3);
                    }
                    boolean z14 = z13;
                    for (y4.b bVar3 : arrayList4) {
                        b0 b0Var4 = (b0) bVar3.f16603a;
                        if (q(b0Var4, (m) bVar3.f16604b) != 0 && b0Var4 == this.f11781d) {
                            z14 = true;
                        }
                    }
                    z10 = z14;
                    i10 = i12;
                }
            } else {
                z10 = false;
                if (zVar != null) {
                    str = "Ignoring invalid provider descriptor: " + zVar;
                } else {
                    str = "Ignoring null provider descriptor from " + ((ComponentName) a0Var.f11732d.B);
                }
                Log.w("AxMediaRouter", str);
                i10 = 0;
            }
            for (int size3 = arrayList.size() - 1; size3 >= i10; size3--) {
                b0 b0Var5 = (b0) arrayList.get(size3);
                b0Var5.i(null);
                arrayList2.remove(b0Var5);
            }
            r(z10);
            for (int size4 = arrayList.size() - 1; size4 >= i10; size4--) {
                bVar.b(258, (b0) arrayList.remove(size4));
            }
            bVar.b(515, a0Var);
        }
    }

    public final int q(b0 b0Var, m mVar) {
        int i10 = b0Var.i(mVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f11778a;
            if (i11 != 0) {
                bVar.b(259, b0Var);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, b0Var);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, b0Var);
            }
        }
        return i10;
    }

    public final void r(boolean z10) {
        b0 b0Var = this.f11798w;
        if (b0Var != null && !b0Var.f()) {
            Log.i("AxMediaRouter", "Clearing the default route because it is no longer selectable: " + this.f11798w);
            this.f11798w = null;
        }
        b0 b0Var2 = this.f11798w;
        h0 h0Var = this.f11795t;
        ArrayList<b0> arrayList = this.f11787j;
        if (b0Var2 == null) {
            for (b0 b0Var3 : arrayList) {
                if (b0Var3.c() == h0Var && b0Var3.f11738b.equals("DEFAULT_ROUTE") && b0Var3.f()) {
                    this.f11798w = b0Var3;
                    Log.i("AxMediaRouter", "Found default route: " + this.f11798w);
                    break;
                }
            }
        }
        b0 b0Var4 = this.f11799x;
        if (b0Var4 != null && !b0Var4.f()) {
            Log.i("AxMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f11799x);
            this.f11799x = null;
        }
        if (this.f11799x == null) {
            for (b0 b0Var5 : arrayList) {
                if (b0Var5.c() == h0Var && b0Var5.m("android.media.intent.category.LIVE_AUDIO") && !b0Var5.m("android.media.intent.category.LIVE_VIDEO") && b0Var5.f()) {
                    this.f11799x = b0Var5;
                    Log.i("AxMediaRouter", "Found bluetooth route: " + this.f11799x);
                    break;
                }
            }
        }
        b0 b0Var6 = this.f11781d;
        if (b0Var6 == null || !b0Var6.f11743g) {
            Log.i("AxMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.f11781d);
            m(c(), 0, true);
            return;
        }
        if (z10) {
            j();
            o();
        }
    }
}
