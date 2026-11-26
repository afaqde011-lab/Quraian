package com.mchutov.quranify.settings.presentation.notification;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import eo.p;
import g00.i;
import k00.c;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import t50.a;
import za.r;
import za.t;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/mchutov/quranify/settings/presentation/notification/NotificationWorker;", "Landroidx/work/CoroutineWorker;", "Lt50/a;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationWorker extends CoroutineWorker implements a {
    public final Context h;
    public final Object i;

    public NotificationWorker(Context context, WorkerParameters params) {
        super(context, params);
        m.e(context, "context");
        m.e(params, "params");
        this.h = context;
        this.i = rd.a.I(i.A, new p(this, 19));
    }

    public final Object e(c cVar) {
        try {
            ((ky.a) this.i.getValue()).a(this.h);
            return t.a();
        } catch (Exception unused) {
            return new r();
        }
    }
}
