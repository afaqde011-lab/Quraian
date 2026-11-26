package uq;

import g00.b0;
import g1.s1;
import gj.h;
import h00.r;
import h00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m00.c;
import mu.q;
import ri.t1;

public final class b {
    public final vq.a a;

    public b(vq.a aVar, rq.b bVar) {
        this.a = aVar;
    }

    public final Object a(zq.a aVar, c cVar) {
        a aVar2;
        ?? arrayList;
        zq.a aVar3 = aVar;
        if (cVar instanceof a) {
            aVar2 = (a) cVar;
            int i = aVar2.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar2.D = i - Integer.MIN_VALUE;
            } else {
                aVar2 = new a(this, cVar);
            }
        } else {
            aVar2 = new a(this, cVar);
        }
        Object objN = aVar2.B;
        l00.a aVar4 = l00.a.A;
        int i2 = aVar2.D;
        vq.a aVar5 = this.a;
        b0 b0Var = b0.a;
        if (i2 == 0) {
            t1.O(objN);
            int i3 = aVar3.b;
            aVar2.A = aVar3;
            aVar2.D = 1;
            objN = rd.a.N(aVar5.a, true, false, new s1(i3, 15), aVar2);
            if (objN != aVar4) {
            }
            return aVar4;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                t1.O(objN);
                return b0Var;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objN);
            return b0Var;
        }
        aVar3 = aVar2.A;
        t1.O(objN);
        List list = (List) objN;
        if (list != null) {
            arrayList = new ArrayList(r.q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new Long(((sq.a) it.next()).a));
            }
        } else {
            arrayList = 0;
        }
        if (arrayList == 0) {
            arrayList = x.A;
        }
        if (arrayList.contains(new Long(aVar3.a))) {
            long j = aVar3.a;
            aVar2.A = null;
            aVar2.D = 2;
            Object objN2 = rd.a.N(aVar5.a, false, true, new h(j, 10), aVar2);
            if (objN2 != l00.a.A) {
                objN2 = b0Var;
            }
            if (objN2 == aVar4) {
                return aVar4;
            }
            return b0Var;
        }
        sq.a aVar6 = new sq.a(aVar3.a, aVar3.b, aVar3.c, aVar3.d, System.currentTimeMillis());
        aVar2.A = null;
        aVar2.D = 3;
        Object objN3 = rd.a.N(aVar5.a, false, true, new q(aVar5, aVar6, 16), aVar2);
        if (objN3 != l00.a.A) {
            objN3 = b0Var;
        }
        if (objN3 == aVar4) {
            return aVar4;
        }
        return b0Var;
    }
}
