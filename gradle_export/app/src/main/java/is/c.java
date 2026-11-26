package is;

import bt.y1;
import ri.t1;

public final class c {
    public final js.a a;

    public c(js.a aVar, fs.a aVar2) {
        this.a = aVar;
    }

    public final Object a(String str, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i = aVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.C = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objN = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        if (i2 == 0) {
            t1.O(objN);
            aVar.C = 1;
            objN = rd.a.N(this.a.a.a, true, false, new hb.u(str, 10), aVar);
            if (objN == aVar2) {
                return aVar2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        gs.a aVar3 = (gs.a) objN;
        if (aVar3 != null) {
            return new rs.a(aVar3.a, aVar3.b, aVar3.c, aVar3.d, aVar3.e);
        }
        return null;
    }

    public final y1 b() {
        return new y1(rd.a.o(this.a.a.a, false, new String[]{"listening_day_reciter_stat_data"}, new hx.t(25)), this, 6);
    }
}
