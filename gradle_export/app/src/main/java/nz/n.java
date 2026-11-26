package nz;

import ab.a0;
import android.content.SharedPreferences;
import com.mchutov.quranify.settings.presentation.screen.notification.NotificationEffect$CloseScreen;
import d40.p1;
import java.time.LocalTime;
import kotlin.NoWhenBranchMatchedException;

public final class n extends vm.a {
    public final ty.a d;
    public final ly.a e;

    public n(ty.a aVar, ly.a aVar2) {
        super(new m(false, true, 0, 0, false, false, null, null));
        this.d = aVar;
        this.e = aVar2;
        m mVar = (m) this.c.d.getValue();
        SharedPreferences sharedPreferences = aVar2.a;
        boolean zContains = sharedPreferences.contains("weekly_notification_time");
        i(m.a(mVar, false, false, 0, 0, sharedPreferences.contains("daily_notification_time"), zContains, sharedPreferences.getString("daily_notification_time", null), sharedPreferences.getString("weekly_notification_time", null), 15));
    }

    public final void j(h action) {
        kotlin.jvm.internal.m.e(action, "action");
        if (action instanceof b) {
            a0.A0(this, NotificationEffect$CloseScreen.INSTANCE);
            return;
        }
        boolean z = action instanceof c;
        ty.a aVar = this.d;
        pm.b bVar = this.c;
        if (z) {
            if (((c) action).a) {
                aVar.b(9, 0, true);
                i(m.a((m) bVar.d.getValue(), false, false, 0, 0, true, false, f50.c.x(9, 0), null, 174));
                return;
            } else {
                aVar.a(true);
                i(m.a((m) bVar.d.getValue(), false, false, 0, 0, false, false, null, null, 238));
                return;
            }
        }
        if (action instanceof g) {
            if (((g) action).a) {
                aVar.b(9, 0, false);
                i(m.a((m) bVar.d.getValue(), false, false, 0, 0, false, true, null, f50.c.x(9, 0), 94));
                return;
            } else {
                aVar.a(false);
                i(m.a((m) bVar.d.getValue(), false, false, 0, 0, false, false, null, null, 222));
                return;
            }
        }
        if (action instanceof e) {
            boolean z2 = ((e) action).a;
            ly.a aVar2 = this.e;
            String string = z2 ? aVar2.a.getString("daily_notification_time", null) : aVar2.a.getString("weekly_notification_time", null);
            if (string == null) {
                string = "09:00";
            }
            LocalTime localTime = LocalTime.parse(string);
            i(m.a((m) bVar.d.getValue(), true, z2, localTime.getHour(), localTime.getMinute(), false, false, null, null, 240));
            return;
        }
        if (!(action instanceof f)) {
            if (!(action instanceof d)) {
                throw new NoWhenBranchMatchedException();
            }
            i(m.a((m) bVar.d.getValue(), false, false, 0, 0, false, false, null, null, 254));
            return;
        }
        f fVar = (f) action;
        int i = fVar.a;
        int i2 = fVar.b;
        p1 p1Var = bVar.d;
        boolean z3 = ((m) p1Var.getValue()).b;
        aVar.b(i, i2, z3);
        if (z3) {
            i(m.a((m) p1Var.getValue(), false, false, 0, 0, false, false, f50.c.x(i, i2), null, 190));
        } else {
            i(m.a((m) p1Var.getValue(), false, false, 0, 0, false, false, null, f50.c.x(i, i2), 126));
        }
    }
}
