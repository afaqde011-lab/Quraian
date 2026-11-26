package com.mchutov.p000quranify.main.data.source.remote;

import ab.y;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b60.b;
import com.mchutov.Quranify.R;
import g00.i;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import n4.j;
import p30.h;
import t50.a;
import wt.d;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/main/data/source/remote/DownloadWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DownloadWorker extends CoroutineWorker implements a {

    public final Object f5281h;

    public final Object f5282i;

    public final Object f5283j;

    public DownloadWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        i iVar = i.A;
        this.f5281h = rd.a.I(iVar, new d(this, 0));
        this.f5282i = rd.a.I(iVar, new d(this, 1));
        this.f5283j = rd.a.I(iVar, new h(this, new b("WORK_MANAGER_OK_HTTP_CLIENT"), 2));
    }

    public static final java.lang.Object i(com.mchutov.p000quranify.main.data.source.remote.DownloadWorker r49, int r50, long r51, int r53, java.lang.Integer r54, java.lang.String r55, m00.c r56) {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.p000quranify.main.data.source.remote.DownloadWorker.i(com.mchutov.quranify.main.data.source.remote.DownloadWorker, int, long, int, java.lang.Integer, java.lang.String, m00.c):java.lang.Object");
    }

    @Override
    public final java.lang.Object e(k00.c r19) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: com.mchutov.p000quranify.main.data.source.remote.DownloadWorker.e(k00.c):java.lang.Object");
    }

    public final za.m j(float f3, int i11, long j9) {
        Context context = this.f24170b;
        String string = context.getString(R.string.notification_title);
        m.d(string, "getString(...)");
        String string2 = context.getString(R.string.notification_cancel_button);
        m.d(string2, "getString(...)");
        y yVarL0 = y.l0(context);
        UUID uuid = this.f24171c.f2065a;
        m.d(uuid, "getId(...)");
        PendingIntent pendingIntentK0 = yVarL0.k0(uuid);
        j jVar = new j(context, "download_channel");
        jVar.f15041e = j.c(string);
        jVar.f15060z.tickerText = j.c(string);
        jVar.f15060z.icon = R.drawable.app_icon;
        jVar.d(2, true);
        jVar.f15049o = 100;
        jVar.f15050p = (int) f3;
        jVar.a(android.R.drawable.ic_delete, pendingIntentK0, string2);
        Notification notificationB = jVar.b();
        m.d(notificationB, "build(...)");
        return new za.m((i11 * 1000) + ((int) j9), notificationB, 1);
    }
}
