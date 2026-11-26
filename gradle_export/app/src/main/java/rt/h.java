package rt;

import h00.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.m;
import ot.o;

public final class h {
    public final mt.a a;

    public h(mt.a aVar) {
        this.a = aVar;
    }

    public static o a(String str, List list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (m.a(((o) obj).b, str)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((o) next).h);
        o oVar = (o) next;
        return oVar == null ? (o) q.N0(arrayList) : oVar;
    }

    public final String b(String appliedId, List options) {
        Object next;
        String str;
        o oVarA;
        String str2;
        String str3;
        m.e(appliedId, "appliedId");
        m.e(options, "options");
        if (!options.isEmpty()) {
            if (appliedId.length() > 0 && !options.isEmpty()) {
                Iterator it = options.iterator();
                while (it.hasNext()) {
                    if (m.a(((o) it.next()).a, appliedId)) {
                    }
                }
            }
            String strA = this.a.a();
            o oVarA2 = a(strA, options);
            if (oVarA2 != null && (str3 = oVarA2.a) != null) {
                return str3;
            }
            if (!strA.equals("en") && (oVarA = a("en", options)) != null && (str2 = oVarA.a) != null) {
                return str2;
            }
            Iterator it2 = options.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!((o) next).h);
            o oVar = (o) next;
            return (oVar == null || (str = oVar.a) == null) ? ((o) q.L0(options)).a : str;
        }
        return appliedId;
    }
}
