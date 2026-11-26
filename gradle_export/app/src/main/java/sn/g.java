package sn;

import com.google.android.gms.internal.measurement.x5;
import com.mchutov.quranify.appwidget.presentation.update.WidgetDayRolloverWorker;
import kotlin.jvm.internal.a0;

public final class g implements u00.a {
    public final int A;
    public final WidgetDayRolloverWorker B;

    public g(WidgetDayRolloverWorker widgetDayRolloverWorker, int i) {
        this.A = i;
        this.B = widgetDayRolloverWorker;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                return x5.i(a0.a, c.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
            default:
                return x5.i(a0.a, e.class, t50.a.c().c.d, (b60.a) null, (a60.a) null);
        }
    }
}
