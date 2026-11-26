package zk;

import d0.f3;
import g00.b0;
import m00.h;
import ri.t1;
import u00.n;
import v2.i0;
import v2.l;

public final class d extends h implements n {
    public int B;
    public Object C;

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        d dVar = new d(2, cVar);
        dVar.C = obj;
        return dVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((i0) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        i0 i0Var = (i0) this.C;
        l00.a aVar = l00.a.A;
        int i = this.B;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
            return obj;
        }
        t1.O(obj);
        l lVar = l.A;
        this.C = null;
        this.B = 1;
        Object objA = f3.a(i0Var, false, lVar, this);
        return objA == aVar ? aVar : objA;
    }
}
