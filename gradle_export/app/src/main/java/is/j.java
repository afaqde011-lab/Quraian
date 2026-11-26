package is;

import bt.y1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import ri.t1;

public final class j {
    public final js.c a;

    public j(js.c cVar, fs.c cVar2) {
        this.a = cVar;
    }

    public final Object a(String str, m00.c cVar) {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i = gVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.C = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objN = gVar.A;
        l00.a aVar = l00.a.A;
        int i2 = gVar.C;
        if (i2 == 0) {
            t1.O(objN);
            gVar.C = 1;
            objN = rd.a.N(this.a.a.a, true, false, new hb.u(str, 12), gVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        gs.c cVar2 = (gs.c) objN;
        if (cVar2 != null) {
            return fs.c.X(cVar2);
        }
        return null;
    }

    public final Serializable b(long j, m00.c cVar) {
        h hVar;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i = hVar.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.C = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, cVar);
            }
        } else {
            hVar = new h(this, cVar);
        }
        Object objN = hVar.A;
        l00.a aVar = l00.a.A;
        int i2 = hVar.C;
        if (i2 == 0) {
            t1.O(objN);
            hVar.C = 1;
            objN = rd.a.N(this.a.a.a, true, false, new gj.h(j, 2), hVar);
            if (objN == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
        }
        Iterable iterable = (Iterable) objN;
        ArrayList arrayList = new ArrayList(h00.r.q0(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(fs.c.X((gs.c) it.next()));
        }
        return arrayList;
    }

    public final y1 c() {
        return new y1(rd.a.o(this.a.a.a, false, new String[]{"listening_hour_stat_data"}, new hx.t(29)), this, 8);
    }
}
