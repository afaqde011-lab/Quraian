package tq;

import androidx.datastore.core.DataStore;
import bt.y1;
import d40.o;
import g00.b0;
import h00.q;
import h00.x;
import java.util.List;
import ri.t1;

public final class k {
    public final uq.b a;
    public final DataStore b;
    public final y1 c;

    public k(uq.b bVar, rq.b bVar2, DataStore dataStore, rq.a aVar) {
        this.a = bVar;
        this.b = dataStore;
        this.c = new y1(dataStore.getData(), aVar, 20);
    }

    public final Object a(int i, m00.c cVar) {
        a aVar;
        if (cVar instanceof a) {
            aVar = (a) cVar;
            int i2 = aVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.D = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, cVar);
            }
        } else {
            aVar = new a(this, cVar);
        }
        Object objU = aVar.B;
        l00.a aVar2 = l00.a.A;
        int i3 = aVar.D;
        b0 b0Var = b0.a;
        if (i3 == 0) {
            t1.O(objU);
            aVar.A = i;
            aVar.D = 1;
            objU = o.u(this.c, aVar);
            if (objU != aVar2) {
            }
            return aVar2;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
            return b0Var;
        }
        i = aVar.A;
        t1.O(objU);
        List list = (List) objU;
        if (list != null) {
            b bVar = new b(q.o1(list), i, null, 0);
            aVar.A = i;
            aVar.D = 2;
            if (this.b.updateData(bVar, aVar) == aVar2) {
                return aVar2;
            }
        }
        return b0Var;
    }

    public final Object b(m00.c cVar) {
        c cVar2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i = cVar2.C;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar2.C = i - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objU = cVar2.A;
        l00.a aVar = l00.a.A;
        int i2 = cVar2.C;
        if (i2 == 0) {
            t1.O(objU);
            cVar2.C = 1;
            objU = o.u(this.c, cVar2);
            if (objU == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
        }
        List list = (List) objU;
        return list == null ? x.A : list;
    }

    public final y1 c() {
        return new y1(rd.a.o(this.a.a.a, false, new String[]{"favorites_data"}, new r9.e(20)), this, 19);
    }

    public final Object d(int i, m00.c cVar) {
        j jVar;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i2 = jVar.D;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.D = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(this, cVar);
            }
        } else {
            jVar = new j(this, cVar);
        }
        Object objU = jVar.B;
        l00.a aVar = l00.a.A;
        int i3 = jVar.D;
        b0 b0Var = b0.a;
        if (i3 == 0) {
            t1.O(objU);
            jVar.A = i;
            jVar.D = 1;
            objU = o.u(this.c, jVar);
            if (objU != aVar) {
            }
            return aVar;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(objU);
            return b0Var;
        }
        i = jVar.A;
        t1.O(objU);
        List list = (List) objU;
        if (list != null) {
            b bVar = new b(q.o1(list), i, null, 1);
            jVar.A = i;
            jVar.D = 2;
            if (this.b.updateData(bVar, jVar) == aVar) {
                return aVar;
            }
        }
        return b0Var;
    }

    public final Object e(zq.a aVar, m00.c cVar) {
        Object objA = this.a.a(aVar, cVar);
        return objA == l00.a.A ? objA : b0.a;
    }
}
