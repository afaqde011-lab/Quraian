package xn;

import ca.t;
import com.google.android.gms.internal.measurement.x5;
import g00.b0;
import java.util.ArrayList;
import kotlin.jvm.internal.m;
import ks.j;
import vn.p;

public final class c {
    public final t a;
    public final hb.b b = new hb.b(17);

    public c(t tVar) {
        this.a = tVar;
    }

    public final Object a(ArrayList arrayList, p pVar) {
        StringBuilder sbQ = x5.q("DELETE FROM audio_story_event_queue WHERE event_id IN (");
        ze.d.h(arrayList.size(), sbQ);
        sbQ.append(")");
        String string = sbQ.toString();
        m.d(string, "toString(...)");
        Object objN = rd.a.N(this.a, false, true, new j(1, string, arrayList), pVar);
        return objN == l00.a.A ? objN : b0.a;
    }
}
