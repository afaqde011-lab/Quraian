package com.mchutov.quranify.push.data.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import eo.p;
import g00.i;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import retrofit2.HttpException;
import ri.t1;
import rw.b;
import t50.a;
import za.q;
import za.r;
import za.t;
import za.u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/push/data/worker/PushTokenSyncWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PushTokenSyncWorker extends CoroutineWorker implements a {
    public final Object h;

    public PushTokenSyncWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        this.h = rd.a.I(i.A, new p(this, 18));
    }

    public final Object e(c cVar) {
        b bVar;
        int i;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i2 = bVar.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.C = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (m00.c) cVar);
            }
        } else {
            bVar = new b(this, (m00.c) cVar);
        }
        Object obj = bVar.A;
        l00.a aVar = l00.a.A;
        int i3 = bVar.C;
        try {
            if (i3 == 0) {
                t1.O(obj);
                nw.b bVar2 = (nw.b) this.h.getValue();
                bVar.C = 1;
                if (bVar2.b(bVar) == aVar) {
                    return aVar;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
            return t.a();
        } catch (Exception e) {
            HttpException httpException = e instanceof HttpException ? (HttpException) e : null;
            return ((httpException == null || (i = httpException.A) == 408 || i == 429 || i >= 500) && ((u) this).c.c < 5) ? new r() : new q();
        }
    }
}
