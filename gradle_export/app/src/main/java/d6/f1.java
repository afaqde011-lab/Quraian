package d6;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;

public abstract class f1 extends AppWidgetProvider {

    public final h40.e f4628a = a40.m0.a;

    public final java.lang.Object a(a40.z r7, android.content.Context r8, int[] r9, m00.c r10) {
        throw new UnsupportedOperationException("Method not decompiled: d6.f1.a(a40.z, android.content.Context, int[], m00.c):java.lang.Object");
    }

    public final Object b(a40.z zVar, Context context, int i10, String str, m00.i iVar) {
        f(zVar, context);
        p0 p0VarE = e();
        p0VarE.getClass();
        Object objB = p0VarE.b(context, new h(i10), null, new n0(str, null, 1), iVar);
        l00.a aVar = l00.a.A;
        g00.b0 b0Var = g00.b0.a;
        if (objB != aVar) {
            objB = b0Var;
        }
        return objB == aVar ? objB : b0Var;
    }

    public final Object c(a40.z zVar, Context context, int i10, Bundle bundle, m00.i iVar) {
        Object objB;
        f(zVar, context);
        p0 p0VarE = e();
        boolean z10 = p0VarE.c() instanceof e2;
        g00.b0 b0Var = g00.b0.a;
        if (z10 || (p0VarE.c() instanceof d2) || (objB = p0VarE.b(context, new h(i10), bundle, new n0(bundle, null, 0), iVar)) != l00.a.A) {
            objB = b0Var;
        }
        return objB == l00.a.A ? objB : b0Var;
    }

    public final Object d(a40.z zVar, Context context, int[] iArr, m00.i iVar) {
        Object objQ;
        f(zVar, context);
        ArrayList arrayList = new ArrayList(iArr.length);
        int length = iArr.length;
        int i10 = 0;
        while (i10 < length) {
            f1 f1Var = this;
            arrayList.add(a40.c0.g(zVar, (b40.c) null, new as.y0(f1Var, context, iArr[i10], (k00.c) null, 1), 3));
            i10++;
            this = f1Var;
        }
        if (arrayList.isEmpty()) {
            objQ = h00.x.A;
        } else {
            a40.m1[] m1VarArr = (a40.f0[]) arrayList.toArray(new a40.f0[0]);
            a40.e eVar = new a40.e(m1VarArr);
            a40.k kVar = new a40.k(1, qd.s0.j0(iVar));
            kVar.r();
            int length2 = m1VarArr.length;
            a40.c[] cVarArr = new a40.c[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                a40.m1 m1Var = m1VarArr[i11];
                m1Var.start();
                a40.c cVar = new a40.c(eVar, kVar);
                cVar.F = a40.c0.u(m1Var, true, cVar);
                cVarArr[i11] = cVar;
            }
            a40.d dVar = new a40.d(cVarArr);
            for (int i12 = 0; i12 < length2; i12++) {
                a40.c cVar2 = cVarArr[i12];
                cVar2.getClass();
                a40.c.H.set(cVar2, dVar);
            }
            if (kVar.x()) {
                dVar.b();
            } else {
                kVar.v(dVar);
            }
            objQ = kVar.q();
            l00.a aVar = l00.a.A;
        }
        return objQ == l00.a.A ? objQ : g00.b0.a;
    }

    public abstract p0 e();

    public final void f(a40.z zVar, Context context) {
        a40.c0.y(zVar, (k00.i) null, (a40.a0) null, new d0.i2(context, this, (k00.c) null, 8), 3);
    }

    @Override
    public final void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int i10, Bundle bundle) {
        if (w.o(context, new a1.q0(this, i10, bundle, 2))) {
            return;
        }
        w.k(this, this.f4628a, new d1(this, context, i10, bundle, null, 0));
    }

    @Override
    public final void onDeleted(Context context, int[] iArr) {
        if (w.o(context, new b1(this, iArr, 0))) {
            return;
        }
        w.k(this, this.f4628a, new e1(this, context, iArr, null, 0));
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        f1 f1Var;
        Context context2;
        AppWidgetManager appWidgetManager;
        String packageName;
        String canonicalName;
        ComponentName componentName;
        int[] appWidgetIds;
        try {
            String action = intent.getAction();
            if (action == null) {
                f1Var = this;
                context2 = context;
            } else {
                int iHashCode = action.hashCode();
                if (iHashCode == -19011148) {
                    f1Var = this;
                    context2 = context;
                    if (!action.equals("android.intent.action.LOCALE_CHANGED")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = f1Var.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        kotlin.jvm.internal.m.b(appWidgetIds);
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    f1Var.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 649033583) {
                    f1Var = this;
                    context2 = context;
                    if (!action.equals("androidx.glance.appwidget.action.DEBUG_UPDATE")) {
                    }
                    appWidgetManager = AppWidgetManager.getInstance(context2);
                    packageName = context2.getPackageName();
                    canonicalName = f1Var.getClass().getCanonicalName();
                    if (canonicalName != null) {
                        throw new IllegalStateException("no canonical name");
                    }
                    componentName = new ComponentName(packageName, canonicalName);
                    if (intent.hasExtra("appWidgetIds")) {
                        appWidgetIds = intent.getIntArrayExtra("appWidgetIds");
                        kotlin.jvm.internal.m.b(appWidgetIds);
                    } else {
                        appWidgetIds = appWidgetManager.getAppWidgetIds(componentName);
                    }
                    f1Var.onUpdate(context2, appWidgetManager, appWidgetIds);
                    return;
                }
                if (iHashCode == 1989767543 && action.equals("ACTION_TRIGGER_LAMBDA")) {
                    String stringExtra = intent.getStringExtra("EXTRA_ACTION_KEY");
                    if (stringExtra == null) {
                        throw new IllegalStateException("Intent is missing ActionKey extra");
                    }
                    int intExtra = intent.getIntExtra("EXTRA_APPWIDGET_ID", -1);
                    if (intExtra == -1) {
                        throw new IllegalStateException("Intent is missing AppWidgetId extra");
                    }
                    if (w.o(context, new a1.q0(this, intExtra, stringExtra))) {
                        return;
                    }
                    w.k(this, this.f4628a, new d1(this, context, intExtra, stringExtra, null, 1));
                    return;
                }
                f1Var = this;
                context2 = context;
            }
            super.onReceive(context2, intent);
        } catch (CancellationException unused) {
        } catch (Throwable th2) {
            Log.e("GlanceAppWidget", "Error in Glance App Widget", th2);
        }
    }

    @Override
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        if (w.o(context, new b1(this, iArr, 1))) {
            return;
        }
        w.k(this, this.f4628a, new e1(this, context, iArr, null, 1));
    }
}
