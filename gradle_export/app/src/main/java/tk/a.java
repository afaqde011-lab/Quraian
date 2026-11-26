package tk;

import com.mchutov.core.analytics.domain.model.TrackingEvent;
import kotlin.jvm.internal.m;

public final class a implements c {
    public final uk.a a;

    public a(uk.a aVar) {
        this.a = aVar;
    }

    public final void a(TrackingEvent event) {
        m.e(event, "event");
        for (sk.a aVar : this.a.a) {
            aVar.getClass();
            rc.c.i(aVar.a, event.getName(), event.getParams(), 4);
        }
    }
}
