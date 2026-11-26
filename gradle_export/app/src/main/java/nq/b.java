package nq;

import g00.b0;
import m00.c;
import ri.t1;

public final class b {
    public final aq.a a;

    public b(aq.a aVar) {
        this.a = aVar;
    }

    public final Object a(c cVar) throws Throwable {
        a aVar;
        Object objEmit;
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
        Object obj = aVar.A;
        l00.a aVar2 = l00.a.A;
        int i2 = aVar.C;
        b0 b0Var = b0.a;
        aq.a aVar3 = this.a;
        if (i2 == 0) {
            t1.O(obj);
            aVar.C = 1;
            if (aq.a.b(aVar3, false, aVar) != aVar2) {
            }
            return aVar2;
        }
        if (i2 == 1) {
            t1.O(obj);
        } else {
            if (i2 == 2) {
                t1.O(obj);
                aVar.C = 3;
                if (((bq.a) aVar3).c(false, aVar) != aVar2) {
                    aVar.C = 4;
                    objEmit = ((bq.a) aVar3).e.emit(null, aVar);
                    if (objEmit != aVar2) {
                        objEmit = b0Var;
                    }
                    if (objEmit != aVar2) {
                    }
                }
                return aVar2;
            }
            if (i2 == 3) {
                t1.O(obj);
                aVar.C = 4;
                objEmit = ((bq.a) aVar3).e.emit(null, aVar);
                if (objEmit != aVar2) {
                    objEmit = b0Var;
                }
                if (objEmit != aVar2) {
                    return aVar2;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t1.O(obj);
            }
        }
        return b0Var;
        aq.a.a(aVar3, false, 6);
        aVar.C = 2;
        if (((bq.a) aVar3).e(false, aVar) != aVar2) {
            aVar.C = 3;
            if (((bq.a) aVar3).c(false, aVar) != aVar2) {
                aVar.C = 4;
                objEmit = ((bq.a) aVar3).e.emit(null, aVar);
                if (objEmit != aVar2) {
                    objEmit = b0Var;
                }
                if (objEmit != aVar2) {
                    return b0Var;
                }
            }
        }
        return aVar2;
    }
}
