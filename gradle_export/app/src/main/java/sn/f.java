package sn;

import com.mchutov.quranify.appwidget.presentation.update.WidgetDayRolloverWorker;

public final class f extends m00.c {
    public Object A;
    public final WidgetDayRolloverWorker B;
    public int C;

    public f(WidgetDayRolloverWorker widgetDayRolloverWorker, m00.c cVar) {
        super(cVar);
        this.B = widgetDayRolloverWorker;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.e(this);
    }
}
