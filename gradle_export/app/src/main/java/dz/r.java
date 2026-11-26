package dz;

import g00.b0;
import ri.t1;

public final class r extends m00.i implements u00.n {
    public final int A;
    public Object B;
    public final s C;

    public r(s sVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = sVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                r rVar = new r(this.C, cVar, 0);
                rVar.B = obj;
                return rVar;
            default:
                r rVar2 = new r(this.C, cVar, 1);
                rVar2.B = obj;
                return rVar2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.A) {
            case 0:
                r rVar = (r) create((n) obj, (k00.c) obj2);
                b0 b0Var = b0.a;
                rVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                r rVar2 = (r) create((u30.b) obj, (k00.c) obj2);
                b0 b0Var2 = b0.a;
                rVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        s sVar = this.C;
        Object obj2 = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                sVar.i((n) obj2);
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                sVar.i(n.a((n) sVar.c.d.getValue(), null, null, (u30.b) obj2, 3));
                break;
        }
        return b0Var;
    }
}
