package o10;

import a10.h0;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.view.MenuItem;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import c3.z;
import com.google.android.gms.internal.cast.r0;
import com.google.android.gms.internal.measurement.f4;
import com.google.android.gms.internal.measurement.g1;
import com.google.android.gms.internal.measurement.j1;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revenuecat.purchases.blockstore.BlockstoreHelper;
import g00.b0;
import h00.d0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeoutException;
import k.j0;
import k7.t;
import k9.s;
import kotlin.jvm.internal.m;
import o.j;
import o.l;
import o20.y;
import oi.n;
import q3.e0;
import r30.k;
import rb.i;
import tf.a1;
import tf.d4;
import tf.h;
import tf.h1;
import tf.q0;
import tf.s1;
import tf.w;
import tf.y3;
import u.q;
import v2.u;
import w.b1;
import w.e2;
import wb.o;
import wb.p;
import x.a0;

public final class b implements xf.f, j, ma.b, OkioSerializer, xf.e, xf.d, xf.b, d4, u7.d, s, a0 {
    public final int A;
    public final Object B;

    public b(int i) {
        this.A = i;
        switch (i) {
            case 11:
                this.B = new sg.f();
                break;
            case 13:
                this.B = new ConcurrentHashMap(16);
                break;
            case BlockstoreHelper.BLOCKSTORE_MAX_ENTRIES:
                this.B = new CountDownLatch(1);
                break;
            case 17:
                this.B = new EnumMap(s1.class);
                break;
            case 23:
                this.B = new w(20);
                break;
            case 27:
                this.B = new q((Object) null);
                break;
            case 29:
                this.B = new CopyOnWriteArrayList();
                break;
            default:
                this.B = new Stack();
                break;
        }
    }

    public b(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    public b(EnumMap enumMap) {
        this.A = 17;
        EnumMap enumMap2 = new EnumMap(s1.class);
        this.B = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public b(lb.j jVar, o oVar) {
        this.A = 25;
        this.B = jVar;
    }

    public b(na.c openHelper) {
        this.A = 9;
        m.e(openHelper, "openHelper");
        this.B = openHelper;
    }

    public b(y3.c cVar) {
        this.A = 28;
        float f = e2.a;
        gg.e eVar = new gg.e();
        eVar.A = f;
        float fC = cVar.c();
        float f2 = b1.a;
        eVar.B = fC * 386.0878f * 160.0f * 0.84f;
        this.B = eVar;
    }

    public static p t(i iVar, wb.i iVar2, ub.b bVar, ub.c cVar) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(iVar2.a.getResources(), cVar.a);
        nb.e eVar = nb.e.A;
        Map map = cVar.b;
        Object obj = map.get("coil#disk_cache_key");
        String str = obj instanceof String ? (String) obj : null;
        Object obj2 = map.get("coil#is_sampled");
        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        boolean z = false;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Bitmap.Config[] configArr = bc.d.a;
        if (iVar != null && iVar.g) {
            z = true;
        }
        return new p(bitmapDrawable, iVar2, eVar, bVar, str, zBooleanValue, z);
    }

    public void A(int i, String str, List list, boolean z, boolean z2) {
        b50.b bVar;
        a1 a1Var = (a1) this.B;
        int i2 = i - 1;
        if (i2 == 0) {
            q0 q0Var = ((h1) ((f5.c) a1Var).B).F;
            h1.g(q0Var);
            bVar = q0Var.N;
        } else if (i2 != 1) {
            if (i2 == 3) {
                q0 q0Var2 = ((h1) ((f5.c) a1Var).B).F;
                h1.g(q0Var2);
                bVar = q0Var2.O;
            } else if (i2 != 4) {
                q0 q0Var3 = ((h1) ((f5.c) a1Var).B).F;
                h1.g(q0Var3);
                bVar = q0Var3.M;
            } else if (z) {
                q0 q0Var4 = ((h1) ((f5.c) a1Var).B).F;
                h1.g(q0Var4);
                bVar = q0Var4.K;
            } else if (z2) {
                q0 q0Var5 = ((h1) ((f5.c) a1Var).B).F;
                h1.g(q0Var5);
                bVar = q0Var5.J;
            } else {
                q0 q0Var6 = ((h1) ((f5.c) a1Var).B).F;
                h1.g(q0Var6);
                bVar = q0Var6.L;
            }
        } else if (z) {
            q0 q0Var7 = ((h1) ((f5.c) a1Var).B).F;
            h1.g(q0Var7);
            bVar = q0Var7.H;
        } else if (z2) {
            q0 q0Var8 = ((h1) ((f5.c) a1Var).B).F;
            h1.g(q0Var8);
            bVar = q0Var8.G;
        } else {
            q0 q0Var9 = ((h1) ((f5.c) a1Var).B).F;
            h1.g(q0Var9);
            bVar = q0Var9.I;
        }
        int size = list.size();
        if (size == 1) {
            bVar.c(list.get(0), str);
            return;
        }
        if (size == 2) {
            bVar.d(str, list.get(0), list.get(1));
        } else if (size != 3) {
            bVar.b(str);
        } else {
            bVar.e(str, list.get(0), list.get(1), list.get(2));
        }
    }

    public void B(s1 s1Var, int i) {
        h hVar;
        if (i == -30) {
            hVar = h.H;
        } else if (i == -20) {
            hVar = h.G;
        } else if (i == -10) {
            hVar = h.E;
        } else if (i != 0) {
            hVar = i != 30 ? h.B : h.F;
        } else {
            hVar = h.G;
        }
        ((EnumMap) this.B).put(s1Var, hVar);
    }

    public void C(s1 s1Var, h hVar) {
        ((EnumMap) this.B).put(s1Var, hVar);
    }

    public float a() {
        return 0.0f;
    }

    public void b(String str, String str2, Bundle bundle) {
        y3 y3Var = (y3) this.B;
        if (!TextUtils.isEmpty(str)) {
            y3Var.C().e1(new r0(13, this, str, str2, bundle, false));
            return;
        }
        h1 h1Var = y3Var.L;
        if (h1Var != null) {
            q0 q0Var = h1Var.F;
            h1.g(q0Var);
            q0Var.G.c(str2, "AppId not known when logging event");
        }
    }

    public float c(float f, long j) {
        long j2 = j / 1000000;
        w.a1 a1VarB = ((gg.e) this.B).b(f);
        long j3 = a1VarB.c;
        return (((Math.signum(a1VarB.a) * w.e.a(j3 > 0 ? j2 / j3 : 1.0f).b) * a1VarB.b) / j3) * 1000.0f;
    }

    public float e(float f, float f2, long j) {
        long j2 = j / 1000000;
        w.a1 a1VarB = ((gg.e) this.B).b(f2);
        long j3 = a1VarB.c;
        return (Math.signum(a1VarB.a) * a1VarB.b * w.e.a(j3 > 0 ? j2 / j3 : 1.0f).a) + f;
    }

    public void f() {
        ((CountDownLatch) this.B).countDown();
    }

    public ma.a g(String fileName) {
        m.e(fileName, "fileName");
        na.c cVar = (na.c) this.B;
        String databaseName = cVar.getDatabaseName();
        if (databaseName == null) {
            if (!fileName.equals(":memory:")) {
                throw new IllegalArgumentException(a1.b.p("This driver is configured to open an in-memory database but a file-based named '", fileName, "' was requested.").toString());
            }
        } else if (!databaseName.equals(fileName) && !k.b1('/', databaseName, databaseName).equals(k.b1('/', fileName, fileName))) {
            throw new IllegalArgumentException(("This driver is configured to open a database named '" + cVar.getDatabaseName() + "' but '" + fileName + "' was requested.").toString());
        }
        return new pa.a(cVar.L());
    }

    public Object getDefaultValue() {
        return ((Serializer) this.B).getDefaultValue();
    }

    public long h(float f) {
        return ((long) (Math.exp(((gg.e) this.B).d(f) / (((double) b1.a) - 1.0d)) * 1000.0d)) * 1000000;
    }

    public float j(float f, float f2) {
        gg.e eVar = (gg.e) this.B;
        double d = eVar.d(f2);
        double d2 = b1.a;
        return (Math.signum(f2) * ((float) (Math.exp((d2 / (d2 - 1.0d)) * d) * ((double) (eVar.A * eVar.B))))) + f;
    }

    public Task k(Object obj) {
        wi.a aVar = (wi.a) obj;
        h7.b bVar = (h7.b) this.B;
        if (aVar == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.d((Object) null);
        }
        n nVar = (n) bVar.B;
        n.a(nVar);
        nVar.m.A((String) null, nVar.e.a);
        nVar.q.d((Object) null);
        return Tasks.d((Object) null);
    }

    public ob.g l() {
        ob.c cVarL;
        c7.c cVar = (c7.c) this.B;
        ob.e eVar = (ob.e) cVar.D;
        synchronized (eVar) {
            cVar.d(true);
            cVarL = eVar.l(((ob.b) cVar.B).a);
        }
        if (cVarL != null) {
            return new ob.g(cVarL);
        }
        return null;
    }

    public void m(o20.e eVar) {
        if (!eVar.i()) {
            if (!(eVar instanceof y)) {
                String strValueOf = String.valueOf(eVar.getClass());
                throw new IllegalArgumentException(x5.n(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
            }
            y yVar = (y) eVar;
            m(yVar.C);
            m(yVar.D);
            return;
        }
        int size = eVar.size();
        int[] iArr = y.H;
        int iBinarySearch = Arrays.binarySearch(iArr, size);
        if (iBinarySearch < 0) {
            iBinarySearch = (-(iBinarySearch + 1)) - 1;
        }
        int i = iArr[iBinarySearch + 1];
        Stack stack = (Stack) this.B;
        if (stack.isEmpty() || ((o20.e) stack.peek()).size() >= i) {
            stack.push(eVar);
            return;
        }
        int i2 = iArr[iBinarySearch];
        o20.e yVar2 = (o20.e) stack.pop();
        while (!stack.isEmpty() && ((o20.e) stack.peek()).size() < i2) {
            yVar2 = new y((o20.e) stack.pop(), yVar2);
        }
        y yVar3 = new y(yVar2, eVar);
        while (!stack.isEmpty()) {
            int[] iArr2 = y.H;
            int iBinarySearch2 = Arrays.binarySearch(iArr2, yVar3.B);
            if (iBinarySearch2 < 0) {
                iBinarySearch2 = (-(iBinarySearch2 + 1)) - 1;
            }
            if (((o20.e) stack.peek()).size() >= iArr2[iBinarySearch2 + 1]) {
                break;
            } else {
                yVar3 = new y((o20.e) stack.pop(), yVar3);
            }
        }
        stack.push(yVar3);
    }

    public boolean n(l lVar, MenuItem menuItem) {
        boolean zOnMenuItemSelected;
        switch (this.A) {
            case 6:
                o9.q qVar = ((ActionMenuView) this.B).d0;
                if (qVar == null) {
                    return false;
                }
                Toolbar toolbar = (Toolbar) qVar.B;
                if (toolbar.j0.a(menuItem)) {
                    zOnMenuItemSelected = true;
                } else {
                    j0 j0Var = toolbar.l0;
                    zOnMenuItemSelected = j0Var != null ? j0Var.a.b.onMenuItemSelected(0, menuItem) : false;
                }
                return zOnMenuItemSelected;
            default:
                return false;
        }
    }

    public void onFailure(Exception exc) {
        ((CountDownLatch) this.B).countDown();
    }

    public void onSuccess(Object obj) {
        ((CountDownLatch) this.B).countDown();
    }

    public Object p(n40.e descriptor, r40.k kVar) {
        m.e(descriptor, "descriptor");
        Map map = (Map) ((ConcurrentHashMap) this.B).get(descriptor);
        Object obj = map != null ? map.get(kVar) : null;
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public boolean q() {
        return true;
    }

    public ub.c r(wb.i iVar, ub.b bVar, xb.g gVar, xb.f fVar) {
        ub.c cVarA;
        ub.c cVar;
        double d;
        ub.c cVar2;
        if (iVar.p.A) {
            ub.d dVar = (ub.d) ((lb.j) this.B).c.getValue();
            if (dVar != null) {
                cVarA = dVar.a.a(bVar);
                if (cVarA == null) {
                    cVarA = dVar.b.a(bVar);
                }
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                Bitmap bitmap = cVarA.a;
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                boolean zEquals = false;
                if (config != Bitmap.Config.HARDWARE || iVar.m) {
                    Object obj = cVarA.b.get("coil#is_sampled");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    if (!m.a(gVar, xb.g.c)) {
                        String str = (String) bVar.B.get("coil#transformation_size");
                        if (str != null) {
                            zEquals = str.equals(gVar.toString());
                            cVar = cVarA;
                            cVar2 = null;
                        } else {
                            int width = bitmap.getWidth();
                            int height = bitmap.getHeight();
                            xb.a aVar = gVar.a;
                            int i = aVar instanceof xb.a ? aVar.a : Integer.MAX_VALUE;
                            xb.a aVar2 = gVar.b;
                            int i2 = aVar2 instanceof xb.a ? aVar2.a : Integer.MAX_VALUE;
                            double dO = h0.o(width, height, i, i2, fVar);
                            boolean zA = bc.c.a(iVar);
                            if (zA) {
                                double d2 = dO > 1.0d ? 1.0d : dO;
                                cVar = cVarA;
                                cVar2 = null;
                                d = 1.0d;
                                if (Math.abs(((double) i) - (((double) width) * d2)) > 1.0d && Math.abs(((double) i2) - (d2 * ((double) height))) > 1.0d) {
                                    if ((dO != d || zA) && (dO <= d || !zBooleanValue)) {
                                    }
                                }
                            } else {
                                cVar = cVarA;
                                d = 1.0d;
                                cVar2 = null;
                                if ((i != Integer.MIN_VALUE && i != Integer.MAX_VALUE && Math.abs(i - width) > 1) || (i2 != Integer.MIN_VALUE && i2 != Integer.MAX_VALUE && Math.abs(i2 - height) > 1)) {
                                    if (dO != d) {
                                    }
                                }
                            }
                            zEquals = true;
                        }
                    } else if (zBooleanValue) {
                        cVar = cVarA;
                        cVar2 = null;
                    } else {
                        cVar = cVarA;
                        cVar2 = null;
                        zEquals = true;
                    }
                } else {
                    cVar = cVarA;
                    cVar2 = null;
                }
                return zEquals ? cVar : cVar2;
            }
        }
        return null;
    }

    public Object readFrom(k50.k kVar, k00.c cVar) {
        return ((Serializer) this.B).readFrom(kVar.l0(), cVar);
    }

    public ub.b s(wb.i iVar, Object obj, wb.l lVar, lb.c cVar) {
        String strA;
        Map map;
        ub.b bVar = iVar.d;
        List list = iVar.h;
        if (bVar != null) {
            return bVar;
        }
        List list2 = ((lb.j) this.B).g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                strA = null;
                break;
            }
            g00.k kVar = (g00.k) list2.get(i);
            sb.b bVar2 = (sb.b) kVar.A;
            if (((Class) kVar.B).isAssignableFrom(obj.getClass())) {
                m.c(bVar2, "null cannot be cast to non-null type coil.key.Keyer<kotlin.Any>");
                strA = bVar2.a(obj, lVar);
                if (strA != null) {
                    break;
                }
            }
            i++;
        }
        if (strA == null) {
            return null;
        }
        Map map2 = iVar.z.A;
        if (map2.isEmpty()) {
            map = h00.y.A;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map2.entrySet()) {
                String str = ((wb.m) entry.getValue()).b;
                if (str != null) {
                    linkedHashMap.put(entry.getKey(), str);
                }
            }
            map = linkedHashMap;
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new ub.b(strA);
        }
        LinkedHashMap linkedHashMapB0 = d0.b0(map);
        if (!list.isEmpty()) {
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                linkedHashMapB0.put(g4.c.f(i2, "coil#transformation_"), ((zb.c) list.get(i2)).b());
            }
            linkedHashMapB0.put("coil#transformation_size", lVar.d.toString());
        }
        return new ub.b(strA, linkedHashMapB0);
    }

    public String toString() {
        switch (this.A) {
            case 17:
                StringBuilder sb = new StringBuilder("1");
                for (s1 s1Var : s1.values()) {
                    h hVar = (h) ((EnumMap) this.B).get(s1Var);
                    if (hVar == null) {
                        hVar = h.B;
                    }
                    sb.append(hVar.A);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public void u(a30.k kVar, Thread thread, Throwable th) {
        Task taskI;
        n nVar = (n) this.B;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            bi.b.J();
            long jCurrentTimeMillis = System.currentTimeMillis();
            pi.b bVar = nVar.e.a;
            oi.l lVar = new oi.l(nVar, jCurrentTimeMillis, th, thread, kVar);
            synchronized (bVar.B) {
                taskI = bVar.C.i(bVar.A, new t(lVar, 18));
                bVar.C = taskI;
            }
            try {
                oi.y.a(taskI);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public f4 v(e0 e0Var, z zVar) {
        long j;
        boolean z;
        long jG;
        q qVar = (q) this.B;
        List list = (List) e0Var.B;
        q qVar2 = new q(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            u uVar = (u) list.get(i);
            long j2 = uVar.a;
            v2.t tVar = (v2.t) qVar.b(j2);
            if (tVar == null) {
                j = uVar.b;
                jG = uVar.d;
                z = false;
            } else {
                long j3 = tVar.a;
                j = j3;
                z = tVar.c;
                jG = zVar.G(tVar.b);
            }
            long j4 = uVar.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            qVar2.e(new v2.s(j4, uVar.b, uVar.d, uVar.e, uVar.f, j, jG, z, uVar.g, uVar.i, uVar.j, uVar.k, uVar.l, uVar.m), j4);
            boolean z2 = uVar.e;
            if (z2) {
                qVar.e(new v2.t(uVar.b, uVar.c, z2), j2);
            } else {
                qVar.f(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new f4(qVar2, e0Var, 8);
    }

    public void w(l lVar) {
        switch (this.A) {
            case 6:
                j jVar = ((ActionMenuView) this.B).V;
                if (jVar != null) {
                    jVar.w(lVar);
                }
                break;
            default:
                Toolbar toolbar = (Toolbar) this.B;
                p.j jVar2 = toolbar.A.T;
                if (jVar2 == null || !jVar2.k()) {
                    Iterator it = toolbar.j0.b.iterator();
                    while (it.hasNext()) {
                        ((z4.n) it.next()).a.t(lVar);
                    }
                }
                hf.c cVar = toolbar.r0;
                if (cVar != null) {
                    cVar.w(lVar);
                }
                break;
        }
    }

    public Object writeTo(Object obj, k50.j jVar, k00.c cVar) {
        Object objWriteTo = ((Serializer) this.B).writeTo(obj, jVar.i0(), cVar);
        return objWriteTo == l00.a.A ? objWriteTo : b0.a;
    }

    public void x(gi.b bVar) {
        j1 j1Var = (j1) this.B;
        ArrayList arrayList = j1Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            g1 g1Var = new g1(bVar);
            arrayList.add(new Pair(bVar, g1Var));
            if (j1Var.f != null) {
                try {
                    j1Var.f.registerOnMeasurementEventListener(g1Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            j1Var.c(new v0(j1Var, g1Var, 4));
        }
    }

    public void y(k9.u uVar) {
        if (((uu.w) this.B).v.get() || ((uu.w) this.B).w.get()) {
            return;
        }
        if (((uu.w) this.B).r == null || ((uu.w) this.B).r == uVar) {
            ((uu.w) this.B).r = null;
            ((uu.w) this.B).x();
        }
    }
}
