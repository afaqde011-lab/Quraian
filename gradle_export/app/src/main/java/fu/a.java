package fu;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.mchutov.quranify.main.presentation.screen.main.MainActivity;
import kotlin.jvm.internal.m;
import n4.b;
import n4.j;
import n4.p;
import u00.k;

public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public final void a(String str, int i, String title, String body, k kVar) {
        m.e(title, "title");
        m.e(body, "body");
        Context context = this.a;
        if (b.a(context, "android.permission.POST_NOTIFICATIONS") != 0) {
            return;
        }
        j jVar = new j(context, str);
        jVar.z.icon = 2131230842;
        jVar.e = j.c(title);
        jVar.f = j.c(body);
        jVar.j = 1;
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        intent.addFlags(67108864);
        intent.addFlags(536870912);
        intent.addFlags(268435456);
        PendingIntent activity = PendingIntent.getActivity(context, i, intent, 201326592);
        m.d(activity, "getActivity(...)");
        jVar.g = activity;
        jVar.d(16, true);
        kVar.invoke(jVar);
        Notification notificationB = jVar.b();
        m.d(notificationB, "build(...)");
        new p(context).a(i, notificationB);
    }
}
