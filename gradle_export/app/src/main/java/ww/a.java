package ww;

import ab.y;
import android.content.Context;
import com.mchutov.quranify.reciters.data.notification.ReciterEventNotificationWorker;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kh.n;
import ri.t1;
import za.g;
import za.l;
import za.x;

public final class a {
    public final Context a;

    public a(Context context) {
        this.a = context;
    }

    public final void a() {
        Context context = this.a;
        try {
            y.l0(context).n("reciter_event_8h_notification");
            y.l0(context).n("reciter_event_1m_notification");
        } catch (Throwable th) {
            t1.s(th);
        }
    }

    public final void b(int i, long j, String str, String str2, String str3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("reciter_event_notification_id", Integer.valueOf(i));
        linkedHashMap.put("reciter_event_notification_title", str2);
        linkedHashMap.put("reciter_event_notification_body", str3);
        g gVar = new g(linkedHashMap);
        n.f0(gVar);
        y.l0(this.a).x(str, l.A, new x(ReciterEventNotificationWorker.class).g(j, TimeUnit.MILLISECONDS).h(gVar).a(str).b());
    }
}
