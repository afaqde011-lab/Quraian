package jr;

import g00.b0;
import k00.c;
import m00.i;
import mr.d;
import mr.f;
import ri.t1;
import u00.p;

public final class a extends i implements p {
    public int A;
    public final b B;

    public a(b bVar, c cVar) {
        super(4, cVar);
        this.B = bVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj2).intValue();
        int iIntValue = ((Number) obj3).intValue();
        a aVar = new a(this.B, (c) obj4);
        aVar.A = iIntValue;
        return aVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        l00.a aVar = l00.a.A;
        t1.O(obj);
        int i2 = i * 60;
        long jE = this.B.a.e();
        return jE >= ((long) i2) ? new d(i2) : new f(jE, i2);
    }
}
