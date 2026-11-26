package tk;

import a40.c0;
import com.mchutov.core.analytics.domain.model.QuranifyAnalyticsProperty;
import d0.i2;
import h00.d0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.m;
import s10.w0;

public final class b implements d {
    public final uk.a a;

    public b(uk.a aVar) {
        this.a = aVar;
    }

    public final void a(QuranifyAnalyticsProperty quranifyAnalyticsProperty) {
        LinkedHashMap linkedHashMapB0;
        for (sk.a aVar : this.a.a) {
            aVar.getClass();
            Object value = quranifyAnalyticsProperty.getValue();
            if (quranifyAnalyticsProperty instanceof QuranifyAnalyticsProperty.UserId) {
                rc.c cVar = aVar.a;
                c0.y(cVar.c, cVar.d, null, new i2(cVar, value instanceof String ? (String) value : null, (k00.c) null, 25), 2);
            }
            w0 w0Var = new w0(1);
            if (value == null) {
                aVar.b.remove(quranifyAnalyticsProperty.getName());
                String property = quranifyAnalyticsProperty.getName();
                m.e(property, "property");
                w0Var.v(gd.c.C, property, "-");
            } else {
                aVar.b.put(quranifyAnalyticsProperty.getName(), value);
                for (Map.Entry entry : aVar.b.entrySet()) {
                    String property2 = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    m.e(property2, "property");
                    m.e(value2, "value");
                    w0Var.v(gd.c.B, property2, value2);
                }
            }
            rc.c cVar2 = aVar.a;
            cVar2.getClass();
            gd.b bVar = new gd.b();
            synchronized (w0Var) {
                linkedHashMapB0 = d0.b0((LinkedHashMap) w0Var.C);
                for (Map.Entry entry2 : linkedHashMapB0.entrySet()) {
                    String str = (String) entry2.getKey();
                    Object value3 = entry2.getValue();
                    if (value3 instanceof Map) {
                        linkedHashMapB0.put(str, d0.b0((Map) value3));
                    }
                }
            }
            ((gd.a) bVar).O = linkedHashMapB0;
            cVar2.h(bVar);
        }
    }
}
