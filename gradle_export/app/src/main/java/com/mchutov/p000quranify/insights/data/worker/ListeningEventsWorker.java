package com.mchutov.p000quranify.insights.data.worker;

import a40.c0;
import a40.m0;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import eo.p;
import g00.i;
import h40.d;
import h40.e;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ri.t1;
import t50.a;
import za.r;
import za.t;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/insights/data/worker/ListeningEventsWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ListeningEventsWorker extends CoroutineWorker implements a {

    public final Object f5280h;

    public ListeningEventsWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        this.f5280h = rd.a.I(i.A, new p(this, 16));
    }

    @Override
    public final Object e(c cVar) {
        ps.a aVar;
        Object objS;
        if (cVar instanceof ps.a) {
            aVar = (ps.a) cVar;
            int i11 = aVar.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.C = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new ps.a(this, (m00.c) cVar);
            }
        } else {
            aVar = new ps.a(this, (m00.c) cVar);
        }
        Object objJ = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i12 = aVar.C;
        try {
            if (i12 == 0) {
                t1.O(objJ);
                ns.c cVar2 = (ns.c) this.f5280h.getValue();
                aVar.C = 1;
                cVar2.getClass();
                e eVar = m0.f281a;
                objJ = c0.J(new d6.e(cVar2, (c) null, 6), d.C, aVar);
                if (objJ == aVar2) {
                    return aVar2;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objJ);
            }
            objS = (Boolean) objJ;
            objS.getClass();
        } catch (Throwable th2) {
            objS = t1.s(th2);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof g00.m) {
            objS = obj;
        }
        if (!((Boolean) objS).booleanValue() && this.f24171c.f2067c < 8) {
            return new r();
        }
        return t.a();
    }
}
