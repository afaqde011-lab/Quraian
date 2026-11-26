package d6;

import android.app.Application;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a1 {

    public static DataStore f4616f;

    public final Context f4618a;

    public final AppWidgetManager f4619b;

    public final g00.p f4620c = rd.a.J(new a1.z(this, 20));

    public static final t0 f4614d = new t0();

    public static final rv.p f4615e = f50.k.z("GlanceAppWidgetManager-" + Application.getProcessName(), (ReplaceFileCorruptionHandler) null, (yi.a) null, 14);

    public static final t5.d f4617g = va.a.i0("list::Providers");

    public a1(Context context) {
        this.f4618a = context;
        this.f4619b = AppWidgetManager.getInstance(context);
    }

    public final Object a(m00.i iVar) {
        String packageName = this.f4618a.getPackageName();
        List<AppWidgetProviderInfo> installedProviders = this.f4619b.getInstalledProviders();
        ArrayList arrayList = new ArrayList();
        for (Object obj : installedProviders) {
            if (kotlin.jvm.internal.m.a(((AppWidgetProviderInfo) obj).provider.getPackageName(), packageName)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(h00.r.q0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((AppWidgetProviderInfo) it.next()).provider.getClassName());
        }
        Object objUpdateData = ((DataStore) this.f4620c.getValue()).updateData(new w0(h00.q.r1(arrayList2), null, 0), iVar);
        return objUpdateData == l00.a.A ? objUpdateData : g00.b0.a;
    }

    public final Serializable b(Class cls, m00.c cVar) {
        x0 x0Var;
        if (cVar instanceof x0) {
            x0Var = (x0) cVar;
            int i10 = x0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                x0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                x0Var = new x0(this, cVar);
            }
        } else {
            x0Var = new x0(this, cVar);
        }
        Object objC = x0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = x0Var.D;
        if (i11 == 0) {
            ri.t1.O(objC);
            x0Var.A = cls;
            x0Var.D = 1;
            objC = c(x0Var);
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = x0Var.A;
            ri.t1.O(objC);
        }
        u0 u0Var = (u0) objC;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no canonical provider name");
        }
        List list = (List) u0Var.f4701b.get(canonicalName);
        if (list == null) {
            return h00.x.A;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int[] appWidgetIds = this.f4619b.getAppWidgetIds((ComponentName) it.next());
            ArrayList arrayList2 = new ArrayList(appWidgetIds.length);
            for (int i12 : appWidgetIds) {
                arrayList2.add(new h(i12));
            }
            h00.v.u0(arrayList2, arrayList);
        }
        return arrayList;
    }

    public final Object c(m00.c cVar) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        y0 y0Var;
        a1 a1Var;
        t5.b bVar;
        a1 a1Var2;
        String packageName;
        Set<String> set;
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String str;
        Object arrayList2;
        ComponentName componentName;
        String str2;
        g00.k kVar;
        if (cVar instanceof y0) {
            y0Var = (y0) cVar;
            int i10 = y0Var.D;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                y0Var.D = i10 - Integer.MIN_VALUE;
            } else {
                y0Var = new y0(this, cVar);
            }
        } else {
            y0Var = new y0(this, cVar);
        }
        Object objS = y0Var.B;
        l00.a aVar = l00.a.A;
        int i11 = y0Var.D;
        g00.p pVar = this.f4620c;
        t0 t0Var = f4614d;
        t5.d dVar = f4617g;
        k00.c cVar2 = null;
        if (i11 == 0) {
            ri.t1.O(objS);
            d40.i data = ((DataStore) pVar.getValue()).getData();
            y0Var.A = this;
            y0Var.D = 1;
            objS = d40.o.s(data, y0Var);
            if (objS != aVar) {
                a1Var = this;
            }
            return aVar;
        }
        if (i11 == 1) {
            a1Var = y0Var.A;
            ri.t1.O(objS);
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a1Var2 = y0Var.A;
            ri.t1.O(objS);
        }
        bVar = (t5.b) objS;
        a1Var = a1Var2;
        packageName = a1Var.f4618a.getPackageName();
        set = (Set) bVar.c(dVar);
        if (set == null) {
            h00.y yVar = h00.y.A;
            return new u0(yVar, yVar);
        }
        arrayList = new ArrayList();
        for (String str3 : set) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) bVar.c(t0.a(t0Var, str3));
            if (str2 == null) {
                kVar = null;
            } else {
                kVar = new g00.k(componentName, str2);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Map mapY = h00.d0.Y(arrayList);
        Set<Map.Entry> setEntrySet = mapY.entrySet();
        linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new u0(mapY, linkedHashMap);
        if (((t5.b) objS).c(dVar) == null) {
            objS = null;
        }
        bVar = (t5.b) objS;
        if (bVar == null) {
            y0Var.A = a1Var;
            y0Var.D = 2;
            List<AppWidgetProviderInfo> installedProviders = this.f4619b.getInstalledProviders();
            ArrayList<AppWidgetProviderInfo> arrayList3 = new ArrayList();
            for (Object obj : installedProviders) {
                if (kotlin.jvm.internal.m.a(((AppWidgetProviderInfo) obj).provider.getPackageName(), this.f4618a.getPackageName())) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (AppWidgetProviderInfo appWidgetProviderInfo : arrayList3) {
                t0Var.getClass();
                Object objNewInstance = Class.forName(appWidgetProviderInfo.provider.getClassName()).getDeclaredConstructor(null).newInstance(null);
                f1 f1Var = objNewInstance instanceof f1 ? (f1) objNewInstance : null;
                if (f1Var != null) {
                    arrayList4.add(f1Var);
                }
            }
            objS = ((DataStore) pVar.getValue()).updateData(new v0(arrayList4, cVar2, 0), y0Var);
            if (objS != aVar) {
                a1Var2 = a1Var;
                bVar = (t5.b) objS;
                a1Var = a1Var2;
            }
            return aVar;
        }
        packageName = a1Var.f4618a.getPackageName();
        set = (Set) bVar.c(dVar);
        if (set == null) {
            h00.y yVar2 = h00.y.A;
            return new u0(yVar2, yVar2);
        }
        arrayList = new ArrayList();
        while (r0.hasNext()) {
            componentName = new ComponentName(packageName, str3);
            str2 = (String) bVar.c(t0.a(t0Var, str3));
            if (str2 == null) {
                kVar = null;
            } else {
                kVar = new g00.k(componentName, str2);
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        Map mapY2 = h00.d0.Y(arrayList);
        Set<Map.Entry> setEntrySet2 = mapY2.entrySet();
        linkedHashMap = new LinkedHashMap();
        while (r0.hasNext()) {
            str = (String) entry.getValue();
            arrayList2 = linkedHashMap.get(str);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(str, arrayList2);
            }
            ((List) arrayList2).add((ComponentName) entry.getKey());
        }
        return new u0(mapY2, linkedHashMap);
    }

    public final java.lang.Object d(a10.d r23, u.x r24, m00.c r25) {
        throw new UnsupportedOperationException("Method not decompiled: d6.a1.d(a10.d, u.x, m00.c):java.lang.Object");
    }

    public final Object e(f1 f1Var, p0 p0Var, d0.i2 i2Var) {
        f4614d.getClass();
        String canonicalName = f1Var.getClass().getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("no receiver name");
        }
        String canonicalName2 = p0Var.getClass().getCanonicalName();
        if (canonicalName2 == null) {
            throw new IllegalArgumentException("no provider name");
        }
        Object objUpdateData = ((DataStore) this.f4620c.getValue()).updateData(new a1.f2(canonicalName, canonicalName2, null, 3), i2Var);
        return objUpdateData == l00.a.A ? objUpdateData : g00.b0.a;
    }
}
