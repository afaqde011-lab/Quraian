package com.mchutov.p000quranify.audiostories.data.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import eo.p;
import eo.r;
import g00.i;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ri.t1;
import t50.a;
import vn.b0;
import za.t;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/audiostories/data/worker/AudioStoryProgressWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AudioStoryProgressWorker extends CoroutineWorker implements a {

    public final Object f5270h;

    public AudioStoryProgressWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        this.f5270h = rd.a.I(i.A, new p(this, 1));
    }

    @Override
    public final Object e(c cVar) {
        r rVar;
        Object objS;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i11 = rVar.C;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                rVar.C = i11 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, (m00.c) cVar);
            }
        } else {
            rVar = new r(this, (m00.c) cVar);
        }
        Object objG = rVar.A;
        l00.a aVar = l00.a.A;
        int i12 = rVar.C;
        try {
            if (i12 == 0) {
                t1.O(objG);
                b0 b0Var = (b0) this.f5270h.getValue();
                rVar.C = 1;
                objG = b0Var.g(rVar);
                if (objG == aVar) {
                    return aVar;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(objG);
            }
            objS = (Boolean) objG;
            objS.getClass();
        } catch (Throwable th2) {
            objS = t1.s(th2);
        }
        Object obj = Boolean.FALSE;
        if (objS instanceof g00.m) {
            objS = obj;
        }
        if (!((Boolean) objS).booleanValue() && this.f24171c.f2067c < 8) {
            return new za.r();
        }
        return t.a();
    }
}
