package j3;

import c3.d2;
import c3.y2;
import h00.d0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class q {

    public static final AtomicInteger f7964a = new AtomicInteger(0);

    public static final void a(d2 d2Var, o oVar) {
        y2 y2Var = d2Var.f2646c;
        int iP = d0.P(h00.r.q0(oVar, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = oVar.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(((z) entry.getKey()).f8005a, entry.getValue());
        }
        y2Var.c(linkedHashMap, "properties");
    }

    public static final b2.r b(b2.r rVar, u00.k kVar) {
        return rVar.V(new c(kVar));
    }

    public static final b2.r c(b2.r rVar, boolean z10, u00.k kVar) {
        return rVar.V(new b(z10, kVar));
    }
}
