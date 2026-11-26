package q3;

import java.util.ArrayList;
import java.util.List;

public final class t {

    public final List f12750a;

    public t(q... qVarArr) {
        for (q qVar : qVarArr) {
            String strB = qVar.b();
            int i10 = 0;
            for (q qVar2 : qVarArr) {
                if (kotlin.jvm.internal.m.a(qVar2.b(), strB)) {
                    i10++;
                }
            }
            if (i10 != 1) {
                StringBuilder sbN = g4.c.n("'", strB, "' must be unique. Actual [");
                ArrayList arrayList = new ArrayList();
                for (q qVar3 : qVarArr) {
                    if (kotlin.jvm.internal.m.a(qVar3.b(), strB)) {
                        arrayList.add(qVar3);
                    }
                }
                sbN.append(arrayList);
                sbN.append(']');
                s3.a.a(sbN.toString());
            }
        }
        this.f12750a = h00.n.V0(qVarArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            return kotlin.jvm.internal.m.a(this.f12750a, ((t) obj).f12750a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12750a.hashCode();
    }
}
