package tq;

import g00.b0;
import java.util.Iterator;
import java.util.List;
import ri.t1;

public final class g implements d40.j {
    public final d40.j A;
    public final long B;

    public g(d40.j jVar, long j) {
        this.A = jVar;
        this.B = j;
    }

    @Override
    public final Object emit(Object obj, k00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.B;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.B = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj2 = fVar.A;
        l00.a aVar = l00.a.A;
        int i2 = fVar.B;
        if (i2 == 0) {
            t1.O(obj2);
            List list = (List) obj;
            boolean z = false;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((zq.a) it.next()).a == this.B) {
                        z = true;
                        break;
                    }
                }
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            fVar.B = 1;
            if (this.A.emit(boolValueOf, fVar) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj2);
        }
        return b0.a;
    }
}
