package ty;

import a1.o1;
import ab.a0;
import ab.y;
import android.content.Context;
import android.content.SharedPreferences;
import ca.z;
import com.mchutov.quranify.settings.presentation.notification.NotificationWorker;
import f50.c;
import hb.p;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.m;
import qd.s0;
import ri.t1;
import za.d0;
import za.e0;
import za.i;
import za.j0;
import za.k;
import za.v;

public final class a {
    public final t1 a;
    public final ly.a b;

    public a(Context context, ly.a aVar) {
        this.a = y.l0(context);
        this.b = aVar;
    }

    public final void a(boolean z) {
        ly.a aVar = this.b;
        if (z) {
            SharedPreferences.Editor editorEdit = aVar.a.edit();
            editorEdit.remove("daily_notification_time");
            editorEdit.apply();
        } else {
            SharedPreferences.Editor editorEdit2 = aVar.a.edit();
            editorEdit2.remove("weekly_notification_time");
            editorEdit2.apply();
        }
        boolean zContains = aVar.a.contains("daily_notification_time");
        boolean zContains2 = aVar.a.contains("weekly_notification_time");
        if (zContains || zContains2) {
            return;
        }
        this.a.n("daily_push_notification_work");
    }

    public final void b(int i, int i2, boolean z) {
        ly.a aVar = this.b;
        if (z) {
            String date = c.x(i, i2);
            aVar.getClass();
            m.e(date, "date");
            SharedPreferences.Editor editorEdit = aVar.a.edit();
            editorEdit.putString("daily_notification_time", date);
            editorEdit.apply();
        } else {
            String date2 = c.x(i, i2);
            aVar.getClass();
            m.e(date2, "date");
            SharedPreferences.Editor editorEdit2 = aVar.a.edit();
            editorEdit2.putString("weekly_notification_time", date2);
            editorEdit2.apply();
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if (calendar.getTimeInMillis() <= jCurrentTimeMillis) {
            calendar.add(6, 1);
        }
        long timeInMillis = calendar.getTimeInMillis() - jCurrentTimeMillis;
        TimeUnit repeatIntervalTimeUnit = TimeUnit.DAYS;
        m.e(repeatIntervalTimeUnit, "repeatIntervalTimeUnit");
        d0 d0Var = new d0(NotificationWorker.class);
        p pVar = ((j0) d0Var).c;
        long millis = repeatIntervalTimeUnit.toMillis(1L);
        pVar.getClass();
        String str = p.z;
        if (millis < 900000) {
            v.d().g(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        long j = millis < 900000 ? 900000L : millis;
        long j2 = millis < 900000 ? 900000L : millis;
        if (j < 900000) {
            v.d().g(str, "Interval duration lesser than minimum allowed value; Changed to 900000");
        }
        pVar.h = j >= 900000 ? j : 900000L;
        if (j2 < 300000) {
            v.d().g(str, "Flex duration lesser than minimum allowed value; Changed to 300000");
        }
        if (j2 > pVar.h) {
            v.d().g(str, "Flex duration greater than interval duration; Changed to " + j);
        }
        pVar.i = a0.A(j2, 300000L, pVar.h);
        e0 e0VarB = d0Var.g(timeInMillis, TimeUnit.MILLISECONDS).a("daily_push_notification_work").b();
        k[] kVarArr = k.A;
        y yVar = this.a;
        yVar.getClass();
        i iVar = yVar.b.m;
        String strConcat = "enqueueUniquePeriodic_".concat("daily_push_notification_work");
        z zVar = yVar.d.a;
        m.d(zVar, "getSerialTaskExecutor(...)");
        s0.k0(iVar, strConcat, zVar, new o1(yVar, e0VarB, 4));
    }
}
