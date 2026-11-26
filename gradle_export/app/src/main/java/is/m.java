package is;

import ri.t1;

public final class m {
    public final js.d a;

    public m(js.d dVar, fs.d dVar2) {
        this.a = dVar;
    }

    public final Object a(String str, m00.c cVar) {
        k kVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i = kVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                kVar.C = i - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object objN = kVar.A;
        l00.a aVar = l00.a.A;
        int i2 = kVar.C;
        if (i2 == 0) {
            t1.O(objN);
            kVar.C = 1;
            objN = rd.a.N(this.a.a.a, true, false, new hb.u(str, 13), kVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        gs.d dVar = (gs.d) objN;
        if (dVar != null) {
            return new rs.d(dVar.a, dVar.b, dVar.c, dVar.d, dVar.e, dVar.f, dVar.g);
        }
        return null;
    }
}
