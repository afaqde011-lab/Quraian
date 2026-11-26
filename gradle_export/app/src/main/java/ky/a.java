package ky;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import java.time.DayOfWeek;
import java.time.LocalDate;
import kotlin.jvm.internal.m;
import ks.e;

public final class a {
    public final ly.a a;
    public final fu.a b;

    public a(ly.a aVar, fu.a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    public final void a(Context context) {
        m.e(context, "context");
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        m.d(dayOfWeek, "getDayOfWeek(...)");
        DayOfWeek dayOfWeek2 = DayOfWeek.FRIDAY;
        ly.a aVar = this.a;
        if (dayOfWeek2 == dayOfWeek && aVar.a.contains("weekly_notification_time")) {
            String string = context.getString(2131887357);
            m.d(string, "getString(...)");
            String string2 = context.getString(2131887356);
            m.d(string2, "getString(...)");
            b(context, string, string2);
            return;
        }
        if (aVar.a.contains("daily_notification_time")) {
            String string3 = context.getString(2131886371);
            m.d(string3, "getString(...)");
            String string4 = context.getString(2131886370);
            m.d(string4, "getString(...)");
            b(context, string3, string4);
        }
    }

    public final void b(Context context, String str, String str2) {
        NotificationChannel notificationChannel = new NotificationChannel("daily_channel", "Daily Notification", 4);
        notificationChannel.setDescription("Channel for daily notification");
        Object systemService = context.getSystemService("notification");
        m.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        this.b.a("daily_channel", 1, str, str2, new e(21));
    }
}
