package cv;

import g00.b0;
import g00.k;
import k00.c;
import m00.i;
import ri.t1;
import u00.p;

public final class b extends i implements p {
    public a A;
    public boolean B;

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        ((Number) obj3).intValue();
        b bVar = new b(4, (c) obj4);
        bVar.A = (a) obj;
        bVar.B = zBooleanValue;
        return bVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        a aVar = this.A;
        boolean z = this.B;
        l00.a aVar2 = l00.a.A;
        t1.O(obj);
        return new k(aVar, Boolean.valueOf(z));
    }
}
