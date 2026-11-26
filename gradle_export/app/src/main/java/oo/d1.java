package oo;

import java.util.List;
import ri.t1;

public final class d1 extends m00.i implements u00.r {
    public ho.p A;
    public List B;
    public g00.k C;
    public boolean D;
    public boolean E;
    public final g1 F;

    public d1(g1 g1Var, k00.c cVar) {
        super(6, cVar);
        this.F = g1Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ho.p pVar = this.A;
        List list = this.B;
        g00.k kVar = this.C;
        boolean z = this.D;
        boolean z2 = this.E;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        List list2 = (List) kVar.A;
        List list3 = (List) kVar.B;
        ho.a aVar2 = pVar.a;
        Object obj2 = null;
        if (aVar2 != null) {
            for (Object obj3 : list) {
                if (((ho.a) obj3).a == aVar2.a) {
                    obj2 = obj3;
                    break;
                }
            }
            ho.a aVar3 = (ho.a) obj2;
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
            obj2 = aVar2;
        }
        g1 g1Var = this.F;
        g1Var.y = list2;
        g1Var.z = list3;
        g1Var.A = !z;
        g1Var.B = z2;
        return new g00.k(pVar, obj2);
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj4).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        d1 d1Var = new d1(this.F, (k00.c) obj6);
        d1Var.A = (ho.p) obj;
        d1Var.B = (List) obj2;
        d1Var.C = (g00.k) obj3;
        d1Var.D = zBooleanValue;
        d1Var.E = zBooleanValue2;
        return d1Var.invokeSuspend(g00.b0.a);
    }
}
