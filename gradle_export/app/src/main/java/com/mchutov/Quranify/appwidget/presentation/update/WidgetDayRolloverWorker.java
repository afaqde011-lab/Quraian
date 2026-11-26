package com.mchutov.quranify.appwidget.presentation.update;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import g00.i;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ri.t1;
import sn.e;
import sn.f;
import sn.g;
import sn.l;
import t50.a;
import za.t;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/appwidget/presentation/update/WidgetDayRolloverWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WidgetDayRolloverWorker extends CoroutineWorker implements a {
    public final Object h;
    public final Object i;

    public WidgetDayRolloverWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        i iVar = i.A;
        this.h = rd.a.I(iVar, new g(this, 0));
        this.i = rd.a.I(iVar, new g(this, 1));
    }

    public final Object e(c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.C = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, (m00.c) cVar);
            }
        } else {
            fVar = new f(this, (m00.c) cVar);
        }
        Object obj = fVar.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar.C;
        if (i2 == 0) {
            t1.O(obj);
            sn.c cVar2 = (sn.c) this.h.getValue();
            fVar.C = 1;
            if (cVar2.c(l.C, fVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        ((e) this.i.getValue()).a();
        return t.a();
    }
}
