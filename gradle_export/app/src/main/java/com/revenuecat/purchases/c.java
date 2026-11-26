package com.revenuecat.purchases;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.util.Log;
import i7.z;
import j7.f;
import j7.i;
import j7.j;
import k7.t;
import k9.a2;
import k9.g1;
import k9.s1;
import k9.w1;
import k9.z3;
import ri.j2;
import ta.c0;
import u00.k;

public final class c implements Runnable {
    public final int A;
    public final boolean B;
    public final Object C;
    public final Object D;
    public final Object E;

    public c(PostPendingTransactionsHelper postPendingTransactionsHelper, String str, boolean z, k kVar) {
        this.A = 0;
        this.C = postPendingTransactionsHelper;
        this.D = str;
        this.B = z;
        this.E = kVar;
    }

    public c(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.A = i;
        this.C = obj;
        this.D = obj2;
        this.E = obj3;
        this.B = z;
    }

    public c(Object obj, boolean z, Object obj2, Object obj3, int i) {
        this.A = i;
        this.C = obj;
        this.B = z;
        this.D = obj2;
        this.E = obj3;
    }

    @Override
    public final void run() {
        switch (this.A) {
            case 0:
                PostPendingTransactionsHelper.syncPendingPurchaseQueue$lambda$2((PostPendingTransactionsHelper) this.C, (String) this.D, this.B, (k) this.E);
                return;
            case 1:
                Context context = (Context) this.C;
                boolean z = this.B;
                z zVar = (z) this.D;
                j jVar = (j) this.E;
                MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
                i iVar = mediaMetricsManager == null ? null : new i(context, mediaMetricsManager.createPlaybackSession());
                if (iVar == null) {
                    e7.a.m("ExoPlayerImpl", "MediaMetricsService unavailable.");
                    return;
                }
                if (z) {
                    f fVar = zVar.s;
                    fVar.getClass();
                    fVar.F.a(iVar);
                }
                LogSessionId sessionId = iVar.d.getSessionId();
                synchronized (jVar) {
                    hf.c cVar = jVar.b;
                    cVar.getClass();
                    c0.A(((LogSessionId) cVar.B).equals(LogSessionId.LOG_SESSION_ID_NONE));
                    cVar.B = sessionId;
                }
                return;
            case 2:
                ((w1) this.C).e((g1) this.D, (gi.c) this.E, this.B);
                return;
            case 3:
                s1 s1Var = (s1) this.C;
                boolean z2 = this.B;
                a2 a2Var = (a2) this.D;
                Runnable runnable = (Runnable) this.E;
                if (z2) {
                    s1Var.d(a2Var, new t(new z3("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY)));
                }
                runnable.run();
                s1Var.g.f.y(a2Var);
                return;
            default:
                ui.b bVar = (ui.b) this.C;
                j2 j2Var = (j2) this.D;
                qi.c cVar2 = (qi.c) this.E;
                boolean z3 = this.B;
                bVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "disk worker: log non-fatal event to persistence", null);
                }
                ((ui.a) bVar.C).d(j2Var, cVar2.a, z3);
                return;
        }
    }
}
