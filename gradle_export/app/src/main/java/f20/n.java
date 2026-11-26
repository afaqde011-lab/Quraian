package f20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class n {
    public final r a;
    public final List b;
    public final String c;
    public final n d;

    public n(r rVar, List parametersInfo, String str) {
        kotlin.jvm.internal.m.e(parametersInfo, "parametersInfo");
        this.a = rVar;
        this.b = parametersInfo;
        this.c = str;
        n nVar = null;
        if (str != null) {
            r rVarA = rVar != null ? rVar.a() : null;
            ArrayList arrayList = new ArrayList(h00.r.q0(parametersInfo, 10));
            Iterator it = parametersInfo.iterator();
            while (it.hasNext()) {
                r rVar2 = (r) it.next();
                arrayList.add(rVar2 != null ? rVar2.a() : null);
            }
            nVar = new n(rVarA, arrayList, null);
        }
        this.d = nVar;
    }
}
