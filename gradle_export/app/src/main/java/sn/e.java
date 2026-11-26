package sn;

import ab.y;
import android.app.Application;
import com.mchutov.quranify.appwidget.presentation.update.WidgetDayRolloverWorker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.concurrent.TimeUnit;
import za.x;

public final class e {
    public final Application a;

    public e(Application application) {
        this.a = application;
    }

    public final void a() {
        y.l0(this.a).x("WIDGET_DAY_ROLLOVER_WORK", za.l.A, new x(WidgetDayRolloverWorker.class).g(LocalDate.now().plusDays(1L).atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli() - System.currentTimeMillis(), TimeUnit.MILLISECONDS).b());
    }
}
