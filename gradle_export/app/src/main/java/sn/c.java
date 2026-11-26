package sn;

import a40.c0;
import a40.m0;
import a40.z;
import android.app.Application;
import android.appwidget.AppWidgetManager;
import d40.l1;
import d6.a1;
import g00.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.m;
import ri.t1;

public final class c {
    public final Application a;
    public final z b;
    public final j40.c c;

    public c(Application application) {
        f40.c cVarC = c0.c(rd.a.P(c0.e(), m0.a));
        this.a = application;
        this.b = cVarC;
        this.c = j40.d.a();
    }

    public final void a(l target) {
        m.e(target, "target");
        k00.c cVar = null;
        ta.c0.M(this.b, (k00.i) null, new l1(2, cVar, 7), (u00.k) null, new rm.c(this, target, cVar, 8), 27);
    }

    public final java.lang.Object b(sn.d r20, d6.a1 r21, android.appwidget.AppWidgetManager r22, m00.c r23) {
        throw new UnsupportedOperationException("Method not decompiled: sn.c.b(sn.d, d6.a1, android.appwidget.AppWidgetManager, m00.c):java.lang.Object");
    }

    public final Object c(l target, m00.c cVar) {
        b bVar;
        j40.a aVarI;
        j40.a aVar;
        int i;
        Iterable iterable;
        Iterator it;
        a1 a1Var;
        int i2;
        int i3;
        AppWidgetManager appWidgetManager;
        int i4;
        d dVar;
        Application application = this.a;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i5 = bVar.K;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.K = i5 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, cVar);
            }
        } else {
            bVar = new b(this, cVar);
        }
        Object obj = bVar.I;
        Object obj2 = l00.a.A;
        int i6 = bVar.K;
        try {
            if (i6 == 0) {
                t1.O(obj);
                bVar.A = target;
                j40.c cVar2 = this.c;
                bVar.B = cVar2;
                bVar.F = 0;
                bVar.K = 1;
                if (cVar2.l(bVar) != obj2) {
                    aVar = cVar2;
                    i = 0;
                }
                return obj2;
            }
            if (i6 == 1) {
                int i7 = bVar.F;
                j40.a aVar2 = bVar.B;
                l lVar = bVar.A;
                t1.O(obj);
                i = i7;
                aVar = aVar2;
                target = lVar;
            } else {
                if (i6 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i8 = bVar.H;
                int i9 = bVar.G;
                i3 = bVar.F;
                it = bVar.E;
                appWidgetManager = bVar.D;
                a1Var = bVar.C;
                aVar = bVar.B;
                t1.O(obj);
                i4 = i8;
                i2 = i9;
            }
            while (it.hasNext()) {
                dVar = (d) it.next();
                m.b(appWidgetManager);
                bVar.A = null;
                bVar.B = aVar;
                bVar.C = a1Var;
                bVar.D = appWidgetManager;
                bVar.E = it;
                bVar.F = i3;
                bVar.G = i2;
                bVar.H = i4;
                bVar.K = 2;
                if (b(dVar, a1Var, appWidgetManager, bVar) == obj2) {
                    return obj2;
                }
            }
            aVar.i(null);
            return b0.a;
            a1 a1Var2 = new a1(application);
            AppWidgetManager appWidgetManager2 = AppWidgetManager.getInstance(application);
            List list = j.a;
            m.e(target, "target");
            int iOrdinal = target.ordinal();
            if (iOrdinal == 0) {
                iterable = j.a;
            } else if (iOrdinal == 1) {
                iterable = j.b;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iterable = j.c;
            }
            it = iterable.iterator();
            a1Var = a1Var2;
            i2 = 0;
            i3 = i;
            appWidgetManager = appWidgetManager2;
            i4 = 0;
            while (it.hasNext()) {
                dVar = (d) it.next();
                m.b(appWidgetManager);
                bVar.A = null;
                bVar.B = aVar;
                bVar.C = a1Var;
                bVar.D = appWidgetManager;
                bVar.E = it;
                bVar.F = i3;
                bVar.G = i2;
                bVar.H = i4;
                bVar.K = 2;
                if (b(dVar, a1Var, appWidgetManager, bVar) == obj2) {
                    return obj2;
                }
            }
            aVar.i(null);
            return b0.a;
        } catch (Throwable th) {
            aVarI.i(null);
            throw th;
        }
    }
}
