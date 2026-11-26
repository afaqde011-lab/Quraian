package rt;

import g00.b0;
import ri.t1;
import u00.r;

public final class d extends m00.i implements r {
    public ot.d A;
    public boolean B;
    public String C;
    public Integer D;
    public boolean E;

    public d(k00.c cVar) {
        super(6, cVar);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ot.d dVar = this.A;
        boolean z = this.B;
        String str = this.C;
        Integer num = this.D;
        boolean z2 = this.E;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        return new i(dVar, z, str, num, z2);
    }

    @Override
    public final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj5).booleanValue();
        d dVar = new d((k00.c) obj6);
        dVar.A = (ot.d) obj;
        dVar.B = zBooleanValue;
        dVar.C = (String) obj3;
        dVar.D = (Integer) obj4;
        dVar.E = zBooleanValue2;
        return dVar.invokeSuspend(b0.a);
    }
}
