package jo;

import g00.b0;
import ri.t1;

public final class c extends m00.i implements u00.o {
    public int A;
    public d40.j B;
    public Object C;
    public final d D;
    public final String E;

    public c(k00.c cVar, d dVar, String str) {
        super(3, cVar);
        this.D = dVar;
        this.E = str;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        c cVar = new c((k00.c) obj3, this.D, this.E);
        cVar.B = (d40.j) obj;
        cVar.C = obj2;
        return cVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i = this.A;
        if (i == 0) {
            t1.O(obj);
            d40.j jVar = this.B;
            d40.i iVarE = this.D.a.e(this.E, (String) this.C);
            this.B = null;
            this.C = null;
            this.A = 1;
            if (d40.o.q(jVar, iVarE, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return b0.a;
    }
}
