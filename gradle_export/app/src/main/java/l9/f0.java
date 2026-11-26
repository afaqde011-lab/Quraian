package l9;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.database.SQLException;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.SparseIntArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import android.view.inputmethod.InputMethodManager;
import ba.o1;
import ba.p1;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.tasks.Task;
import com.mchutov.quranify.player.presentation.service.AudioPlayerService;
import fh.d2;
import fh.t0;
import j10.n0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m10.r0;
import m10.s0;
import o9.w0;

public class f0 implements xf.c, zd.b, eh.k, a30.e {
    public final int A;
    public Object B;
    public Object C;

    public f0(int i10) {
        this.A = i10;
        switch (i10) {
            case 15:
                pe.e eVar = pe.e.f12491d;
                this.B = new SparseIntArray();
                this.C = eVar;
                break;
            case 16:
                this.B = new w2.c(0);
                this.C = new w2.c(0);
                break;
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT_DURING_UPDATE:
                this.B = new ConcurrentHashMap();
                this.C = new AtomicInteger(0);
                break;
            case 24:
                this.B = new LinkedHashMap();
                this.C = new LinkedHashMap();
                break;
            case 29:
                this.B = new HashMap();
                break;
            default:
                this.B = new SparseIntArray();
                this.C = new SparseIntArray();
                break;
        }
    }

    public f0(int i10, Object obj, Object obj2, boolean z10) {
        this.A = i10;
        this.C = obj;
        this.B = obj2;
    }

    public f0(ab.g gVar, jb.b bVar) {
        this.A = 4;
        kotlin.jvm.internal.m.e(gVar, "processor");
        kotlin.jvm.internal.m.e(bVar, "workTaskExecutor");
        this.B = gVar;
        this.C = bVar;
    }

    public f0(ComponentName componentName, ComponentName componentName2, ComponentName componentName3, ComponentName componentName4) {
        this.A = 18;
        this.B = componentName2;
        this.C = componentName3;
    }

    public f0(Context context, cd.b bVar) {
        this.A = 9;
        kotlin.jvm.internal.m.e(context, "context");
        kotlin.jvm.internal.m.e(bVar, "logger");
        this.B = context;
        this.C = bVar;
        if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
            return;
        }
        bVar.c("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public f0(View view) {
        this.A = 1;
        this.B = view;
    }

    public f0(av.k kVar) {
        this.A = 19;
        this.B = new AtomicInteger(0);
        this.C = new AtomicBoolean(false);
    }

    public f0(p1 p1Var) {
        this.A = 8;
        this.B = p1Var;
        o1 o1Var = new o1();
        o1Var.f2372a = 0;
        this.C = o1Var;
    }

    public f0(AudioPlayerService audioPlayerService, String str, Bundle bundle) {
        ComponentName componentName;
        this.A = 0;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        int i10 = w0.f11890c;
        Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
        intent.setPackage(audioPlayerService.getPackageName());
        List<ResolveInfo> listQueryBroadcastReceivers = audioPlayerService.getPackageManager().queryBroadcastReceivers(intent, 0);
        PendingIntent broadcast = null;
        if (listQueryBroadcastReceivers.size() == 1) {
            ActivityInfo activityInfo = listQueryBroadcastReceivers.get(0).activityInfo;
            componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
        } else {
            if (listQueryBroadcastReceivers.size() > 1) {
                e7.a.m("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
            }
            componentName = null;
        }
        if (componentName == null) {
            e7.a.h("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        if (componentName != null) {
            Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
            intent2.setComponent(componentName);
            broadcast = PendingIntent.getBroadcast(audioPlayerService, 0, intent2, 33554432);
        }
        c0 c0Var = new c0(audioPlayerService, str, bundle);
        this.B = c0Var;
        Looper looperMyLooper = Looper.myLooper();
        r(new z(), new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper));
        c0Var.f10126a.setMediaButtonReceiver(broadcast);
        this.C = new h7.b((Context) audioPlayerService, c0Var.f10128c);
    }

    public f0(e4.e eVar) {
        this.A = 22;
        this.C = eVar;
    }

    public f0(d2 d2Var, int[] iArr) {
        this.A = 26;
        this.B = t0.o(d2Var);
        this.C = iArr;
    }

    public f0(j10.z zVar, oj.q qVar) {
        this.A = 2;
        kotlin.jvm.internal.m.e(zVar, "module");
        kotlin.jvm.internal.m.e(qVar, "notFoundClasses");
        this.B = zVar;
        this.C = qVar;
    }

    public f0(Object obj) {
        this.A = 14;
        this.C = obj;
        this.B = new ArrayList();
    }

    public f0(Object obj, Object obj2, int i10) {
        this.A = i10;
        this.B = obj;
        this.C = obj2;
    }

    public static void d(SQLException sQLException) {
        String message = sQLException.getMessage();
        if (message == null) {
            throw sQLException;
        }
        if (!r30.k.A0(message, "unique", true) && !r30.k.A0(message, "2067", false) && !r30.k.A0(message, "1555", false)) {
            throw sQLException;
        }
    }

    public static e30.h0 e(List list) {
        return list.isEmpty() ? e30.h0.C : new e30.h0(list);
    }

    public static void h(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = f0.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static int l(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            i12++;
            if (i12 == i11) {
                i13++;
                i12 = 0;
            } else if (i12 > i11) {
                i13++;
                i12 = 1;
            }
        }
        return i12 + 1 > i11 ? i13 + 1 : i13;
    }

    public void a(Object obj, String str) {
        int length = str.length();
        String strValueOf = String.valueOf(obj);
        ((ArrayList) this.B).add(w.c.l(new StringBuilder(length + 1 + strValueOf.length()), str, "=", strValueOf));
    }

    @Override
    public Object apply(Object obj) {
        return ((eh.k) ((qj.c) this.B).B).apply(obj);
    }

    public a30.d b(n20.b bVar) {
        kotlin.jvm.internal.m.e(bVar, "classId");
        hf.c cVar = (hf.c) this.B;
        g20.e eVar = (g20.e) this.C;
        eVar.c().c.getClass();
        o10.c cVarW = a10.h0.w(cVar, bVar, k20.f.g);
        if (cVarW == null) {
            return null;
        }
        p10.d.a(cVarW.a).equals(bVar);
        return eVar.g(cVarW);
    }

    public boolean c() {
        synchronized (this) {
            if (((AtomicBoolean) this.C).get()) {
                return false;
            }
            ((AtomicInteger) this.B).incrementAndGet();
            return true;
        }
    }

    public k10.c f(i20.h hVar, k20.g gVar) {
        Map mapY;
        kotlin.jvm.internal.m.e(hVar, "proto");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        j10.e eVarF = j10.w.f((j10.z) this.B, z3.z(gVar, hVar.C), (oj.q) this.C);
        if (hVar.D.size() == 0 || g30.l.f(eVarF)) {
            mapY = h00.y.A;
        } else {
            int i10 = q20.d.a;
            if (q20.d.l(eVarF, j10.f.E)) {
                Collection collectionI = eVarF.i();
                kotlin.jvm.internal.m.d(collectionI, "getConstructors(...)");
                m10.t tVar = (m10.i) h00.q.e1(collectionI);
                if (tVar != null) {
                    List listO = tVar.O();
                    kotlin.jvm.internal.m.d(listO, "getValueParameters(...)");
                    int iP = h00.d0.P(h00.r.q0(listO, 10));
                    if (iP < 16) {
                        iP = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
                    for (Object obj : listO) {
                        linkedHashMap.put(((r0) obj).getName(), obj);
                    }
                    List<i20.f> list = hVar.D;
                    kotlin.jvm.internal.m.d(list, "getArgumentList(...)");
                    ArrayList arrayList = new ArrayList();
                    for (i20.f fVar : list) {
                        kotlin.jvm.internal.m.b(fVar);
                        s0 s0Var = (r0) linkedHashMap.get(z3.A(gVar, fVar.C));
                        s20.j kVar = null;
                        if (s0Var != null) {
                            n20.e eVarA = z3.A(gVar, fVar.C);
                            e30.w type = s0Var.getType();
                            kotlin.jvm.internal.m.d(type, "getType(...)");
                            i20.e eVar = fVar.D;
                            kotlin.jvm.internal.m.d(eVar, "getValue(...)");
                            s20.j jVarQ = q(type, eVar, gVar);
                            kVar = g(jVarQ, type, eVar) ? jVarQ : null;
                            if (kVar == null) {
                                String str = "Unexpected argument value: actual type " + eVar.C + " != expected type " + type;
                                kotlin.jvm.internal.m.e(str, "message");
                                kVar = new s20.j(str);
                            }
                            kVar = new g00.k(eVarA, kVar);
                        }
                        if (kVar != null) {
                            arrayList.add(kVar);
                        }
                    }
                    mapY = h00.d0.Y(arrayList);
                } else {
                    mapY = h00.y.A;
                }
            } else {
                mapY = h00.y.A;
            }
        }
        return new k10.c(eVarF.n(), mapY, n0.n);
    }

    public boolean g(s20.g gVar, e30.w wVar, i20.e eVar) {
        s20.g gVar2;
        i20.e eVar2;
        j10.z zVar = (j10.z) this.B;
        i20.d dVar = eVar.C;
        int i10 = dVar == null ? -1 : a30.b.a[dVar.ordinal()];
        if (i10 == 10) {
            j10.e eVarG = wVar.m0().g();
            j10.e eVar3 = eVarG instanceof j10.e ? eVarG : null;
            if (eVar3 == null) {
                return true;
            }
            n20.e eVar4 = g10.i.e;
            return g10.i.b(eVar3, g10.o.Q);
        }
        if (i10 != 13) {
            return kotlin.jvm.internal.m.a(gVar.a(zVar), wVar);
        }
        if (gVar instanceof s20.b) {
            Object obj = ((s20.g) ((s20.b) gVar)).a;
            if (((List) obj).size() == eVar.K.size()) {
                e30.w wVarG = zVar.d().g(wVar);
                if (wVarG == null) {
                    return false;
                }
                Collection collectionL = va.a.L((Collection) obj);
                if ((collectionL instanceof Collection) && collectionL.isEmpty()) {
                    return true;
                }
                z00.d it = collectionL.iterator();
                do {
                    z00.d dVar2 = it;
                    if (!dVar2.C) {
                        return true;
                    }
                    int iNextInt = dVar2.nextInt();
                    gVar2 = (s20.g) ((List) obj).get(iNextInt);
                    eVar2 = (i20.e) eVar.K.get(iNextInt);
                    kotlin.jvm.internal.m.d(eVar2, "getArrayElement(...)");
                } while (g(gVar2, wVarG, eVar2));
                return false;
            }
        }
        throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
    }

    public Object get() {
        sg.f fVar = new sg.f();
        hb.f fVar2 = new hb.f();
        Object obj = ((f00.a) this.B).get();
        f00.a aVar = (f00.a) this.C;
        return new ee.h(fVar, fVar2, ee.a.f5357f, (ee.j) obj, aVar);
    }

    public View i(int i10, int i11, int i12, int i13) {
        o1 o1Var = (o1) this.C;
        p1 p1Var = (p1) this.B;
        int iJ = p1Var.j();
        int iR = p1Var.r();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        while (i10 != i11) {
            View viewW = p1Var.w(i10);
            int iG = p1Var.g(viewW);
            int iX = p1Var.x(viewW);
            o1Var.f2373b = iJ;
            o1Var.f2374c = iR;
            o1Var.f2375d = iG;
            o1Var.f2376e = iX;
            if (i12 != 0) {
                o1Var.f2372a = i12;
                if (o1Var.a()) {
                    return viewW;
                }
            }
            if (i13 != 0) {
                o1Var.f2372a = i13;
                if (o1Var.a()) {
                    view = viewW;
                }
            }
            i10 += i14;
        }
        return view;
    }

    public int j(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.B;
        kotlin.jvm.internal.m.e(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.C).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return andIncrement;
    }

    public synchronized Map k() {
        try {
            if (((Map) this.C) == null) {
                this.C = Collections.unmodifiableMap(new HashMap((HashMap) this.B));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.C;
    }

    public void m() {
        ((SparseIntArray) this.B).clear();
    }

    public boolean n(View view) {
        o1 o1Var = (o1) this.C;
        p1 p1Var = (p1) this.B;
        int iJ = p1Var.j();
        int iR = p1Var.r();
        int iG = p1Var.g(view);
        int iX = p1Var.x(view);
        o1Var.f2373b = iJ;
        o1Var.f2374c = iR;
        o1Var.f2375d = iG;
        o1Var.f2376e = iX;
        o1Var.f2372a = 24579;
        return o1Var.a();
    }

    public AutofillId o(long j9) {
        return ((ContentCaptureSession) this.B).newAutofillId(((View) this.C).getAutofillId(), j9);
    }

    @Override
    public void onComplete(Task task) {
        switch (this.A) {
            case 10:
                bh.l lVar = (bh.l) this.B;
                xf.g gVar = (xf.g) this.C;
                synchronized (lVar.f2512f) {
                    lVar.f2511e.remove(gVar);
                    break;
                }
                return;
            default:
                dh.c cVar = (dh.c) this.B;
                xf.g gVar2 = (xf.g) this.C;
                synchronized (cVar.f4882f) {
                    cVar.f4881e.remove(gVar2);
                    break;
                }
                return;
        }
    }

    public InputMethodManager p() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.C;
        if (inputMethodManager != null) {
            return inputMethodManager;
        }
        Object systemService = ((View) this.B).getContext().getSystemService("input_method");
        kotlin.jvm.internal.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager2 = (InputMethodManager) systemService;
        this.C = inputMethodManager2;
        return inputMethodManager2;
    }

    public s20.g q(e30.w wVar, i20.e eVar, k20.g gVar) {
        kotlin.jvm.internal.m.e(eVar, "value");
        kotlin.jvm.internal.m.e(gVar, "nameResolver");
        boolean zBooleanValue = k20.e.P.g(eVar.M).booleanValue();
        i20.d dVar = eVar.C;
        switch (dVar == null ? -1 : a30.b.a[dVar.ordinal()]) {
            case 1:
                byte b7 = (byte) eVar.D;
                return zBooleanValue ? new s20.z(b7) : new s20.d(b7);
            case 2:
                return new s20.e(Character.valueOf((char) eVar.D));
            case 3:
                short s6 = (short) eVar.D;
                return zBooleanValue ? new s20.z(s6) : new s20.w(s6);
            case 4:
                int i10 = (int) eVar.D;
                return zBooleanValue ? new s20.z(i10) : new s20.k(i10);
            case 5:
                long j9 = eVar.D;
                return zBooleanValue ? new s20.z(j9) : new s20.u(j9);
            case 6:
                return new s20.c(eVar.E);
            case 7:
                return new s20.c(eVar.F);
            case 8:
                return new s20.c(Boolean.valueOf(eVar.D != 0));
            case 9:
                return new s20.x(gVar.getString(eVar.G));
            case 10:
                return new s20.t(z3.z(gVar, eVar.H), eVar.L);
            case 11:
                return new s20.i(z3.z(gVar, eVar.H), z3.A(gVar, eVar.I));
            case 12:
                i20.h hVar = eVar.J;
                kotlin.jvm.internal.m.d(hVar, "getAnnotation(...)");
                return new s20.a(f(hVar, gVar));
            case 13:
                List<i20.e> list = eVar.K;
                kotlin.jvm.internal.m.d(list, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                for (i20.e eVar2 : list) {
                    e30.a0 a0VarE = ((j10.z) this.B).d().e();
                    kotlin.jvm.internal.m.b(eVar2);
                    arrayList.add(q(a0VarE, eVar2, gVar));
                }
                return new s20.y(arrayList, wVar);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + eVar.C + " (expected " + wVar + ')').toString());
        }
    }

    public void r(n nVar, Handler handler) {
        c0 c0Var = (c0) this.B;
        synchronized (c0Var.f10129d) {
            c0Var.l = nVar;
            c0Var.f10126a.setCallback((a0) nVar.f10172b, handler);
            synchronized (nVar.f10171a) {
                try {
                    nVar.f10173c = new WeakReference(c0Var);
                    androidx.mediarouter.app.d dVar = (androidx.mediarouter.app.d) nVar.f10174d;
                    if (dVar != null) {
                        dVar.removeCallbacksAndMessages(null);
                    }
                    nVar.f10174d = new androidx.mediarouter.app.d(nVar, handler.getLooper(), 5);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void s(j0 j0Var) {
        c0 c0Var = (c0) this.B;
        c0Var.f10132g = j0Var;
        synchronized (c0Var.f10129d) {
            for (int iBeginBroadcast = c0Var.f10131f.beginBroadcast() - 1; iBeginBroadcast >= 0; iBeginBroadcast--) {
                try {
                    ((b) c0Var.f10131f.getBroadcastItem(iBeginBroadcast)).z1(j0Var);
                } catch (RemoteException | SecurityException e3) {
                    e7.a.e("MediaSessionCompat", "Dead object in setPlaybackState.", e3);
                }
            }
            c0Var.f10131f.finishBroadcast();
        }
        MediaSession mediaSession = c0Var.f10126a;
        if (j0Var.L == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(j0Var.A, j0Var.B, j0Var.D, j0Var.H);
            builder.setBufferedPosition(j0Var.C);
            builder.setActions(j0Var.E);
            builder.setErrorMessage(j0Var.G);
            for (i0 i0Var : j0Var.I) {
                PlaybackState.CustomAction customActionBuild = i0Var.E;
                if (customActionBuild == null) {
                    PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(i0Var.A, i0Var.B, i0Var.C);
                    builder2.setExtras(i0Var.D);
                    customActionBuild = builder2.build();
                }
                if (customActionBuild != null) {
                    builder.addCustomAction(customActionBuild);
                }
            }
            builder.setActiveQueueItemId(j0Var.J);
            builder.setExtras(j0Var.K);
            j0Var.L = builder.build();
        }
        mediaSession.setPlaybackState(j0Var.L);
    }

    public void t() {
    }

    public String toString() {
        switch (this.A) {
            case 14:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.C.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.B;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            case com.google.android.gms.common.api.k.RECONNECTION_TIMED_OUT:
                String string = "[ ";
                if (((e4.g) this.B) != null) {
                    for (int i11 = 0; i11 < 9; i11++) {
                        StringBuilder sbQ = x5.q(string);
                        sbQ.append(((e4.g) this.B).H[i11]);
                        sbQ.append(" ");
                        string = sbQ.toString();
                    }
                }
                return string + "] " + ((e4.g) this.B);
            default:
                return super.toString();
        }
    }

    public void u(ab.m mVar, int i10) {
        kotlin.jvm.internal.m.e(mVar, "workSpecId");
        jb.b bVar = (jb.b) this.C;
        bVar.f8258a.execute(new ib.j((ab.g) this.B, mVar, false, i10));
    }

    public void v() {
        synchronized (this) {
            ((AtomicInteger) this.B).decrementAndGet();
            if (((AtomicInteger) this.B).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    public int w(Context context, com.google.android.gms.common.api.g gVar) {
        int i10;
        com.google.android.gms.common.internal.d0.h(context);
        com.google.android.gms.common.internal.d0.h(gVar);
        int iB = 0;
        if (!gVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = gVar.getMinApkVersion();
        SparseIntArray sparseIntArray = (SparseIntArray) this.B;
        synchronized (sparseIntArray) {
            i10 = sparseIntArray.get(minApkVersion, -1);
        }
        if (i10 != -1) {
            return i10;
        }
        SparseIntArray sparseIntArray2 = (SparseIntArray) this.B;
        synchronized (sparseIntArray2) {
            int i11 = 0;
            while (true) {
                try {
                    if (i11 >= sparseIntArray2.size()) {
                        iB = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray2.keyAt(i11);
                    if (iKeyAt > minApkVersion && sparseIntArray2.get(iKeyAt) == 0) {
                        break;
                    }
                    i11++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (iB == -1) {
                iB = ((pe.e) this.C).b(context, minApkVersion);
            }
            sparseIntArray2.put(minApkVersion, iB);
        }
        return iB;
    }
}
