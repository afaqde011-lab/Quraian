package b20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class o implements u00.a {
    public final int A;
    public final p B;

    public o(p pVar, int i) {
        this.A = i;
        this.B = pVar;
    }

    @Override
    public final Object invoke() {
        switch (this.A) {
            case 0:
                p pVar = this.B;
                g20.f fVar = ((a20.b) pVar.I.B).l;
                String packageFqName = pVar.F.a.a;
                fVar.getClass();
                kotlin.jvm.internal.m.e(packageFqName, "packageFqName");
                return h00.d0.Y(new ArrayList());
            case 1:
                this.B.H.getClass();
                return new ArrayList(h00.r.q0(h00.x.A, 10));
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) ze.d.A(this.B.J, p.N[0])).entrySet()) {
                    String str = (String) entry.getKey();
                    o10.c cVar = (o10.c) entry.getValue();
                    v20.b bVarC = v20.b.c(str);
                    d50.g gVar = cVar.b;
                    h20.a aVar = (h20.a) gVar.c;
                    int iOrdinal = aVar.ordinal();
                    if (iOrdinal == 2) {
                        map.put(bVarC, bVarC);
                    } else if (iOrdinal == 5) {
                        String str2 = (String) gVar.h;
                        if (aVar != h20.a.MULTIFILE_CLASS_PART) {
                            str2 = null;
                        }
                        if (str2 != null) {
                            map.put(bVarC, v20.b.c(str2));
                        }
                    }
                }
                return map;
        }
    }
}
