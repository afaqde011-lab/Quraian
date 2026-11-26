package com.mchutov.quranify.reciters.data.notification;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import fu.a;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import ri.t1;
import za.g;
import za.t;
import za.u;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/mchutov/quranify/reciters/data/notification/ReciterEventNotificationWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ReciterEventNotificationWorker extends CoroutineWorker {
    public final Context h;
    public final a i;

    public ReciterEventNotificationWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        this.h = context;
        this.i = new a(context);
    }

    public final Object e(c cVar) {
        WorkerParameters workerParameters = ((u) this).c;
        g gVar = workerParameters.b;
        g gVar2 = workerParameters.b;
        String strC = gVar.c("reciter_event_notification_title");
        if (strC == null) {
            strC = "";
        }
        String strC2 = gVar2.c("reciter_event_notification_body");
        String str = strC2 != null ? strC2 : "";
        int iA = gVar2.a("reciter_event_notification_id", 1001);
        if (strC.length() == 0 && str.length() == 0) {
            return t.a();
        }
        try {
            i(strC, iA, str);
        } catch (Throwable th) {
            t1.s(th);
        }
        return t.a();
    }

    public final void i(String str, int i, String str2) {
        Context context = this.h;
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = new NotificationChannel("reciter_event_channel", context.getString(2131887161), 4);
        notificationChannel.setDescription(context.getString(2131887160));
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        this.i.a("reciter_event_channel", i, str, str2, new e6.c(15));
    }
}
