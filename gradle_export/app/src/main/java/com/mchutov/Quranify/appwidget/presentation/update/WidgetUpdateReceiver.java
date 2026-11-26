package com.mchutov.quranify.appwidget.presentation.update;

import a1.r1;
import a10.d;
import a40.m0;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import d40.l1;
import k00.i;
import kotlin.Metadata;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.m;
import ri.t1;
import s50.a;
import sn.c;
import sn.e;
import ta.c0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/update/WidgetUpdateReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetUpdateReceiver extends BroadcastReceiver {
    @Override
    public final void onReceive(Context context, Intent intent) {
        Object objS;
        Object objS2;
        m.e(context, "context");
        m.e(intent, "intent");
        a aVar = u50.a.b;
        if (aVar == null) {
            objS = null;
        } else {
            try {
                e60.a aVar2 = aVar.c.d;
                d dVarB = a0.a.b(e.class);
                aVar2.getClass();
                objS = aVar2.f(dVarB, null, null);
            } catch (Throwable th) {
                objS = t1.s(th);
            }
            if (objS instanceof g00.m) {
                objS = null;
            }
        }
        e eVar = (e) objS;
        if (eVar != null) {
            eVar.a();
        }
        a aVar3 = u50.a.b;
        if (aVar3 == null) {
            objS2 = null;
        } else {
            try {
                e60.a aVar4 = aVar3.c.d;
                d dVarB2 = a0.a.b(c.class);
                aVar4.getClass();
                objS2 = aVar4.f(dVarB2, null, null);
            } catch (Throwable th2) {
                objS2 = t1.s(th2);
            }
            if (objS2 instanceof g00.m) {
                objS2 = null;
            }
        }
        c cVar = (c) objS2;
        if (cVar == null) {
            return;
        }
        c0.M(a40.c0.c(rd.a.P(a40.c0.e(), m0.a)), (i) null, new l1(2, null, 10), new r1(goAsync(), (k00.c) null, 9), new l6.d(cVar, (k00.c) null, 15), 19);
    }
}
