package bv;

import java.util.List;

public final class q2 extends m00.i implements u00.r {
    public int A;
    public List B;
    public zz.a C;
    public u30.b D;
    public u30.b E;

    public q2(k00.c cVar) {
        super(6, cVar);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        List list = this.B;
        zz.a aVar = this.C;
        u30.b bVar = this.D;
        u30.b bVar2 = this.E;
        l00.a aVar2 = l00.a.A;
        ri.t1.O(obj);
        return new dv.c(i, list, aVar, bVar, bVar2);
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int iIntValue = ((Number) obj).intValue();
        q2 q2Var = new q2((k00.c) obj6);
        q2Var.A = iIntValue;
        q2Var.B = (List) obj2;
        q2Var.C = (zz.a) obj3;
        q2Var.D = (u30.b) obj4;
        q2Var.E = (u30.b) obj5;
        return q2Var.invokeSuspend(g00.b0.a);
    }
}
