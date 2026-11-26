package f20;

import a1.u0;
import g1.l0;
import h00.a0;
import h00.b0;
import h00.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

public final class p {
    public final String a;
    public final ArrayList b = new ArrayList();
    public g00.k c = new g00.k("V", null);

    public p(u0 u0Var, String str, String str2) {
        this.a = str2;
    }

    public final void a(String type, e... eVarArr) {
        r rVar;
        kotlin.jvm.internal.m.e(type, "type");
        if (eVarArr.length == 0) {
            rVar = null;
        } else {
            h00.p pVar = new h00.p(new l0(eVarArr, 6), 1);
            int iP = d0.P(h00.r.q0(pVar, 10));
            if (iP < 16) {
                iP = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
            Iterator it = pVar.iterator();
            while (true) {
                b0 b0Var = (b0) it;
                if (!b0Var.B.hasNext()) {
                    break;
                }
                a0 a0Var = (a0) b0Var.next();
                linkedHashMap.put(Integer.valueOf(a0Var.a), (e) a0Var.b);
            }
            rVar = new r(linkedHashMap);
        }
        this.b.add(new g00.k(type, rVar));
    }

    public final void b(String type, e... eVarArr) {
        kotlin.jvm.internal.m.e(type, "type");
        h00.p pVar = new h00.p(new l0(eVarArr, 6), 1);
        int iP = d0.P(h00.r.q0(pVar, 10));
        if (iP < 16) {
            iP = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iP);
        Iterator it = pVar.iterator();
        while (true) {
            b0 b0Var = (b0) it;
            if (!b0Var.B.hasNext()) {
                this.c = new g00.k(type, new r(linkedHashMap));
                return;
            } else {
                a0 a0Var = (a0) b0Var.next();
                linkedHashMap.put(Integer.valueOf(a0Var.a), (e) a0Var.b);
            }
        }
    }

    public final void c(v20.c type) {
        kotlin.jvm.internal.m.e(type, "type");
        String strC = type.c();
        kotlin.jvm.internal.m.d(strC, "getDesc(...)");
        this.c = new g00.k(strC, null);
    }
}
