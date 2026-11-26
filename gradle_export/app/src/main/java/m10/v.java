package m10;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class v implements u00.a {
    public final int A;
    public final w B;

    public v(w wVar, int i) {
        this.A = i;
        this.B = wVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                w wVar = this.B;
                a0 a0Var = wVar.D;
                a0Var.X0();
                return j10.w.i((l) a0Var.L.getValue(), wVar.E);
            case 1:
                w wVar2 = this.B;
                a0 a0Var2 = wVar2.D;
                a0Var2.X0();
                return Boolean.valueOf(j10.w.h((l) a0Var2.L.getValue(), wVar2.E));
            default:
                w wVar3 = this.B;
                d30.i iVar = wVar3.G;
                a10.w[] wVarArr = w.I;
                boolean zBooleanValue = ((Boolean) ze.d.A(iVar, wVarArr[1])).booleanValue();
                n20.c cVar = wVar3.E;
                a0 a0Var3 = wVar3.D;
                if (zBooleanValue) {
                    return x20.m.b;
                }
                List list = (List) ze.d.A(wVar3.F, wVarArr[0]);
                ArrayList arrayList = new ArrayList(h00.r.q0(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((j10.e0) it.next()).N());
                }
                return f50.c.r("package view scope for " + cVar + " in " + a0Var3.getName(), h00.q.Z0(new m0(a0Var3, cVar), arrayList));
        }
    }
}
