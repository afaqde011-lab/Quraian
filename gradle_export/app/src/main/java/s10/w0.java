package s10;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.EditText;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.mchutov.quranify.player.domain.model.PlayerItem;
import java.io.File;
import java.io.FileWriter;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import sd.p1;
import z2.s1;
import z2.t1;

public class w0 implements ub.g, xf.f, x10.y, y1.j, dh.n, s1 {
    public final int A;
    public Object B;
    public Object C;

    public w0(int i) {
        this(new p1(27), new long[10], 23);
        this.A = i;
        switch (i) {
            case 7:
                this.B = new HashMap();
                this.C = new HashMap();
                break;
            case 11:
                break;
            case 22:
                List list = Collections.EMPTY_LIST;
                this.B = list;
                this.C = list;
                break;
            case 23:
                break;
            default:
                this.B = new LinkedHashSet();
                this.C = new LinkedHashMap();
                break;
        }
    }

    public w0(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.B = obj2;
        this.C = obj;
    }

    public w0(int i, ub.h hVar) {
        this.A = 9;
        this.B = hVar;
        this.C = new ea.h(i, this);
    }

    public w0(Context context) {
        this.A = 16;
        this.C = null;
        this.B = context;
    }

    public w0(View view) {
        this.A = 20;
        this.B = view;
    }

    public w0(Window window, wb.o oVar) {
        this.A = 21;
        WindowInsetsController insetsController = window.getInsetsController();
        this.A = 21;
        this.B = insetsController;
        this.C = window;
    }

    public w0(EditText editText) {
        this.A = 14;
        this.B = editText;
        x5.i iVar = new x5.i(editText);
        this.C = iVar;
        editText.addTextChangedListener(iVar);
        if (x5.a.b == null) {
            synchronized (x5.a.a) {
                try {
                    if (x5.a.b == null) {
                        x5.a aVar = new x5.a();
                        try {
                            x5.a.c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, x5.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        x5.a.b = aVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        editText.setEditableFactory(x5.a.b);
    }

    public w0(bi.g gVar, jj.d dVar, sj.g gVar2, sj.c cVar, Context context, sj.l lVar, ScheduledExecutorService scheduledExecutorService) {
        this.A = 2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.B = linkedHashSet;
        this.C = new sj.j(gVar, dVar, gVar2, cVar, context, linkedHashSet, lVar, scheduledExecutorService);
    }

    public w0(dh.o oVar, dh.m mVar, tf.w wVar) {
        this.A = 18;
        this.B = oVar;
        this.C = mVar;
    }

    public w0(Object obj, int i) {
        this.A = i;
        this.C = obj;
    }

    public w0(Object obj, Object obj2, int i) {
        this.A = i;
        this.B = obj;
        this.C = obj2;
    }

    public w0(String name) {
        this.A = 0;
        kotlin.jvm.internal.m.e(name, "name");
        this.B = name;
        this.C = new ArrayList(0);
        u10.l.a.getClass();
        List listA = u10.k.a();
        new ArrayList();
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((u10.l) it.next()).getClass();
        }
    }

    public w0(Map map) {
        this.A = 13;
        this.B = map;
        this.C = new d30.l("Java nullability annotation states").c(new v2.b0(this, 3));
    }

    public w0(kotlin.jvm.internal.p pVar, t10.h hVar) {
        this.A = 4;
        this.B = pVar;
        this.C = hVar;
        if (hVar.b != 1 || hVar.c != 1) {
            throw new IllegalArgumentException(oi.k.k("BooleanFlagDelegate can work only with boolean flags (bitWidth = 1 and value = 1), but ", hVar, " was passed").toString());
        }
    }

    public w0(q3.e0 e0Var) {
        this(23);
        this.A = 23;
        h(this, e0Var);
    }

    public w0(th.n nVar) {
        this.A = 7;
        this.B = new HashMap(nVar.a);
        this.C = new HashMap(nVar.b);
    }

    public static void h(w0 w0Var, q3.e0 e0Var) {
        p1 p1Var = (p1) w0Var.B;
        long[] jArr = (long[]) p1Var.B;
        p1 p1Var2 = (p1) e0Var.B;
        long[] jArr2 = (long[]) p1Var2.B;
        long[] jArr3 = (long[]) e0Var.C;
        zh.i.j(jArr, jArr2, jArr3);
        long[] jArr4 = (long[]) p1Var.C;
        long[] jArr5 = (long[]) p1Var2.C;
        long[] jArr6 = (long[]) p1Var2.D;
        zh.i.j(jArr4, jArr5, jArr6);
        zh.i.j((long[]) p1Var.D, jArr6, jArr3);
        zh.i.j((long[]) w0Var.C, (long[]) p1Var2.B, (long[]) p1Var2.C);
    }

    public ub.c a(ub.b bVar) {
        ub.e eVar = (ub.e) ((ea.h) this.C).c(bVar);
        if (eVar != null) {
            return new ub.c(eVar.a, eVar.b);
        }
        return null;
    }

    public t1 apply() {
        return ((z2.q0) this.B).f(this.C);
    }

    public boolean b(ak.a aVar) {
        return true;
    }

    public Object c(y1.b bVar, Object obj) {
        return ((u00.n) this.B).invoke(bVar, obj);
    }

    public void cancel() {
    }

    public void d(int i) {
        int i2;
        ea.h hVar = (ea.h) this.C;
        if (i >= 40) {
            hVar.h(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        synchronized (((u.s) hVar).c) {
            i2 = ((u.s) hVar).d;
        }
        hVar.h(i2 / 2);
    }

    public Object e() {
        return new yg.g(((dh.o) this.B).A, (dh.w) ((dh.m) this.C).e(), new tf.w(23));
    }

    public Object f(Object obj) {
        return ((u00.k) this.C).invoke(obj);
    }

    public boolean g() {
        return true;
    }

    public CctBackendFactory i(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.C) == null) {
            Context context = (Context) this.B;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.C = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.C = map;
        }
        String str4 = (String) ((Map) this.C).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e2) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
            return null;
        } catch (InstantiationException e3) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
            return null;
        } catch (NoSuchMethodException e4) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e4);
            return null;
        } catch (InvocationTargetException e5) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
            return null;
        }
    }

    public boolean j(a10.w property, Object obj) {
        kotlin.jvm.internal.m.e(property, "property");
        t10.h hVar = (t10.h) this.C;
        return ((((Number) ((kotlin.jvm.internal.p) this.B).get(obj)).intValue() >>> hVar.a) & ((1 << hVar.b) - 1)) == hVar.c;
    }

    public Task k(Object obj) throws Throwable {
        Throwable th;
        FileWriter fileWriter;
        switch (this.A) {
            case 12:
                a30.k kVar = (a30.k) this.C;
                JSONObject jSONObject = (JSONObject) ((pi.e) this.B).c.A.submit((Callable) new cc.b(this, 4)).get();
                FileWriter fileWriter2 = null;
                if (jSONObject != null) {
                    wi.a aVarB = ((wi.b) kVar.c).b(jSONObject);
                    o9.q qVar = (o9.q) kVar.e;
                    long j = aVarB.c;
                    qVar.getClass();
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
                    }
                    try {
                        jSONObject.put("expires_at", j);
                        fileWriter = new FileWriter((File) qVar.B);
                        try {
                            try {
                                fileWriter.write(jSONObject.toString());
                                fileWriter.flush();
                            } catch (Exception e) {
                                e = e;
                                Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileWriter2 = fileWriter;
                            oi.g.b(fileWriter2, "Failed to close settings writer.");
                            throw th;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        fileWriter = null;
                    } catch (Throwable th3) {
                        th = th3;
                        oi.g.b(fileWriter2, "Failed to close settings writer.");
                        throw th;
                    }
                    oi.g.b(fileWriter, "Failed to close settings writer.");
                    a30.k.f(jSONObject, "Loaded settings: ");
                    String str = ((wi.d) kVar.b).f;
                    SharedPreferences.Editor editorEdit = ((Context) kVar.a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                    editorEdit.putString("existing_instance_identifier", str);
                    editorEdit.apply();
                    ((AtomicReference) kVar.h).set(aVarB);
                    ((xf.g) ((AtomicReference) kVar.i).get()).d(aVarB);
                    break;
                }
                return Tasks.d((Object) null);
            default:
                return Tasks.d(new yg.j(((yg.b) this.B).b, ((yg.l) this.C).a, ((Long) obj).longValue()));
        }
    }

    public boolean l() {
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.B;
        Window window = (Window) this.C;
        if (window == null) {
            windowInsetsController.setSystemBarsAppearance(0, 0);
            if ((windowInsetsController.getSystemBarsAppearance() & 8) != 0) {
                return true;
            }
        } else if ((window.getDecorView().getSystemUiVisibility() & 8192) != 0) {
            return true;
        }
        return false;
    }

    public void m(ub.b bVar, Bitmap bitmap, Map map) {
        int i;
        int iX = a.a.x(bitmap);
        ea.h hVar = (ea.h) this.C;
        synchronized (((u.s) hVar).c) {
            i = ((u.s) hVar).a;
        }
        if (iX <= i) {
            ((ea.h) this.C).d(bVar, new ub.e(bitmap, map, iX));
        } else {
            ((ea.h) this.C).e(bVar);
            ((ub.h) this.B).i(bVar, bitmap, map, iX);
        }
    }

    public Object n(String str, m00.c cVar) {
        sv.u uVar;
        if (cVar instanceof sv.u) {
            uVar = (sv.u) cVar;
            int i = uVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                uVar.C = i - Integer.MIN_VALUE;
            } else {
                uVar = new sv.u(this, cVar);
            }
        } else {
            uVar = new sv.u(this, cVar);
        }
        Object objE = uVar.A;
        l00.a aVar = l00.a.A;
        int i2 = uVar.C;
        if (i2 == 0) {
            ri.t1.O(objE);
            Integer numY0 = r30.r.y0(r30.k.R0(str, "reciter/"));
            if (numY0 != null) {
                int iIntValue = numY0.intValue();
                rv.p pVar = (rv.p) this.B;
                uVar.C = 1;
                objE = pVar.e(iIntValue, uVar);
                if (objE == aVar) {
                    return aVar;
                }
            }
            return null;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ri.t1.O(objE);
        bx.c cVar2 = (bx.c) objE;
        if (cVar2 != null) {
            return kh.n.W((dh.o) this.C, cVar2, (String) null, (qv.a) null);
        }
        return null;
    }

    public Serializable o(m00.c cVar) {
        sv.v vVar;
        if (cVar instanceof sv.v) {
            vVar = (sv.v) cVar;
            int i = vVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                vVar.C = i - Integer.MIN_VALUE;
            } else {
                vVar = new sv.v(this, cVar);
            }
        } else {
            vVar = new sv.v(this, cVar);
        }
        Object objF = vVar.A;
        l00.a aVar = l00.a.A;
        int i2 = vVar.C;
        if (i2 == 0) {
            ri.t1.O(objF);
            rv.p pVar = (rv.p) this.B;
            vVar.C = 1;
            objF = pVar.f(vVar);
            if (objF == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(objF);
        }
        Iterable iterable = (Iterable) objF;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(kh.n.W((dh.o) this.C, (bx.c) it.next(), (String) null, (qv.a) null));
        }
        return arrayList;
    }

    public void p(v4.e eVar) {
        com.google.android.gms.common.api.internal.b0 b0Var = (com.google.android.gms.common.api.internal.b0) this.C;
        o9.q qVar = (o9.q) this.B;
        int i = eVar.b;
        if (i == 0) {
            b0Var.execute(new com.google.android.gms.internal.play_billing.r0(qVar, eVar.a, 23));
        } else {
            b0Var.execute(new com.google.android.gms.common.api.internal.y(qVar, i, 2));
        }
    }

    public void q(th.l lVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.B;
        th.m mVar = new th.m(lVar.a, uh.f.class);
        if (!map.containsKey(mVar)) {
            map.put(mVar, lVar);
            return;
        }
        th.l lVar2 = (th.l) map.get(mVar);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + mVar);
    }

    public void r(mh.l lVar) throws GeneralSecurityException {
        HashMap map = (HashMap) this.C;
        if (lVar == null) {
            throw new NullPointerException("wrapper must be non-null");
        }
        Class clsB = lVar.b();
        if (!map.containsKey(clsB)) {
            map.put(clsB, lVar);
            return;
        }
        mh.l lVar2 = (mh.l) map.get(clsB);
        if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
            return;
        }
        throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsB);
    }

    public void s(boolean z) {
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.B;
        Window window = (Window) this.C;
        if (window == null) {
            if (z) {
                windowInsetsController.setSystemBarsAppearance(16, 16);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 16);
                return;
            }
        }
        if (!z) {
            x(16);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    public void t(boolean z) {
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.B;
        Window window = (Window) this.C;
        if (window == null) {
            if (z) {
                windowInsetsController.setSystemBarsAppearance(8, 8);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, 8);
                return;
            }
        }
        if (!z) {
            x(8192);
        } else {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
        }
    }

    public String toString() {
        switch (this.A) {
            case 0:
                return (String) this.B;
            default:
                return super.toString();
        }
    }

    public void u() {
        Window window = (Window) this.C;
        if (window == null) {
            ((WindowInsetsController) this.B).setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        x(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    public synchronized void v(gd.c cVar, String str, Object obj) {
        if (str.length() == 0) {
            ed.a.b.c("Attempting to perform operation " + cVar.A + " with a null or empty string property, ignoring");
            return;
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.C;
        gd.c cVar2 = gd.c.B;
        if (linkedHashMap.containsKey("$clearAll")) {
            ed.a.b.c("This Identify already contains a $clearAll operation, ignoring operation %s");
            return;
        }
        if (((LinkedHashSet) this.B).contains(str)) {
            ed.a.b.c("Already used property " + str + " in previous operation, ignoring operation " + cVar.A);
            return;
        }
        if (!((LinkedHashMap) this.C).containsKey(cVar.A)) {
            ((LinkedHashMap) this.C).put(cVar.A, new LinkedHashMap());
        }
        Object obj2 = ((LinkedHashMap) this.C).get(cVar.A);
        kotlin.jvm.internal.m.c(obj2, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any>");
        kotlin.jvm.internal.d0.b(obj2).put(str, obj);
        ((LinkedHashSet) this.B).add(str);
    }

    public Serializable w(int i, m00.c cVar) {
        sv.w wVar;
        if (cVar instanceof sv.w) {
            wVar = (sv.w) cVar;
            int i2 = wVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wVar.D = i2 - Integer.MIN_VALUE;
            } else {
                wVar = new sv.w(this, cVar);
            }
        } else {
            wVar = new sv.w(this, cVar);
        }
        Object objC = wVar.B;
        l00.a aVar = l00.a.A;
        int i3 = wVar.D;
        if (i3 == 0) {
            ri.t1.O(objC);
            rv.p pVar = (rv.p) this.B;
            wVar.A = i;
            wVar.D = 1;
            objC = pVar.c(i, wVar);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = wVar.A;
            ri.t1.O(objC);
        }
        Iterable<PlayerItem> iterable = (Iterable) objC;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        for (PlayerItem playerItem : iterable) {
            arrayList.add(dh.o.m((dh.o) this.C, kh.o.Q(i, playerItem.getSurahNumber()), playerItem.getSurahTranscription(), playerItem.getReciterName()));
        }
        return arrayList;
    }

    public void x(int i) {
        View decorView = ((Window) this.C).getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
