package is;

import bt.y1;
import ri.t1;

public final class f {
    public final js.b a;

    public f(js.b bVar, fs.b bVar2) {
        this.a = bVar;
    }

    public final Object a(String str, m00.c cVar) {
        d dVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i = dVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                dVar.C = i - Integer.MIN_VALUE;
            } else {
                dVar = new d(this, cVar);
            }
        } else {
            dVar = new d(this, cVar);
        }
        Object objN = dVar.A;
        l00.a aVar = l00.a.A;
        int i2 = dVar.C;
        if (i2 == 0) {
            t1.O(objN);
            dVar.C = 1;
            objN = rd.a.N(this.a.a.a, true, false, new hb.u(str, 11), dVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        gs.b bVar = (gs.b) objN;
        if (bVar != null) {
            return new rs.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f);
        }
        return null;
    }

    public final y1 b() {
        return new y1(rd.a.o(this.a.a.a, false, new String[]{"listening_day_surah_stat_data"}, new hx.t(27)), this, 7);
    }
}
