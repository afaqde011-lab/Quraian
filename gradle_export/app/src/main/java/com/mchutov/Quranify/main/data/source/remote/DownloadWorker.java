package com.mchutov.quranify.main.data.source.remote;

import ab.y;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b60.b;
import g00.i;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import n4.j;
import p30.h;
import t50.a;
import wt.d;
import za.u;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/main/data/source/remote/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadWorker extends CoroutineWorker implements a {
    public final Object h;
    public final Object i;
    public final Object j;

    public DownloadWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        i iVar = i.A;
        this.h = rd.a.I(iVar, new d(this, 0));
        this.i = rd.a.I(iVar, new d(this, 1));
        this.j = rd.a.I(iVar, new h(this, new b("WORK_MANAGER_OK_HTTP_CLIENT"), 2));
    }

    public static final java.lang.Object i(com.mchutov.quranify.main.data.source.remote.DownloadWorker r49, int r50, long r51, int r53, java.lang.Integer r54, java.lang.String r55, m00.c r56) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.main.data.source.remote.DownloadWorker.i(com.mchutov.quranify.main.data.source.remote.DownloadWorker, int, long, int, java.lang.Integer, java.lang.String, m00.c):java.lang.Object");
    }

    public final java.lang.Object e(k00.c r19) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.quranify.main.data.source.remote.DownloadWorker.e(k00.c):java.lang.Object");
    }

    public final za.m j(float f, int i, long j) {
        Context context = ((u) this).b;
        String string = context.getString(2131886922);
        m.d(string, "getString(...)");
        String string2 = context.getString(2131886920);
        m.d(string2, "getString(...)");
        y yVarL0 = y.l0(context);
        UUID uuid = ((u) this).c.a;
        m.d(uuid, "getId(...)");
        PendingIntent pendingIntentK0 = yVarL0.k0(uuid);
        j jVar = new j(context, "download_channel");
        jVar.e = j.c(string);
        jVar.z.tickerText = j.c(string);
        jVar.z.icon = 2131230842;
        jVar.d(2, true);
        jVar.o = 100;
        jVar.p = (int) f;
        jVar.a(R.drawable.ic_delete, pendingIntentK0, string2);
        Notification notificationB = jVar.b();
        m.d(notificationB, "build(...)");
        return new za.m((i * 1000) + ((int) j), notificationB, 1);
    }
}
