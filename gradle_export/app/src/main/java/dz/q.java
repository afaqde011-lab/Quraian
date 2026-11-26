package dz;

import a1.f2;
import a40.c0;
import a40.m0;
import g00.b0;
import java.util.List;
import ri.t1;

public final class q extends m00.i implements u00.p {
    public int A;
    public List B;
    public List C;
    public List D;
    public final s E;

    public q(s sVar, k00.c cVar) {
        super(4, cVar);
        this.E = sVar;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        q qVar = new q(this.E, (k00.c) obj4);
        qVar.B = (List) obj;
        qVar.C = (List) obj2;
        qVar.D = (List) obj3;
        return qVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        List list = this.B;
        List list2 = this.C;
        List list3 = this.D;
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            this.B = null;
            this.C = null;
            this.D = null;
            this.A = 1;
            obj = c0.J(new f2(list2, list3, list, (k00.c) null, 5), m0.a, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        g00.k kVar = (g00.k) obj;
        return n.a((n) this.E.c.d.getValue(), ze.d.E((List) kVar.A), ze.d.E((List) kVar.B), null, 4);
    }
}
