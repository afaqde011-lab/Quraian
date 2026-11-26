package zy;

import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.k {
    public final int A;
    public final p B;

    public n(p pVar, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.B = pVar;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new n(this.B, cVar, 0);
            case 1:
                return new n(this.B, cVar, 1);
            default:
                return new n(this.B, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                n nVar = (n) create(cVar);
                b0 b0Var = b0.a;
                nVar.invokeSuspend(b0Var);
                return b0Var;
            case 1:
                n nVar2 = (n) create(cVar);
                b0 b0Var2 = b0.a;
                nVar2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                n nVar3 = (n) create(cVar);
                b0 b0Var3 = b0.a;
                nVar3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        p pVar = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                pVar.i(l.a((l) pVar.c.d.getValue(), null, 0, 0, false, false, false, false, null, 1919));
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                pVar.i(l.a((l) pVar.c.d.getValue(), "", 0, 0, false, false, false, false, null, 635));
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                pVar.j = false;
                pVar.i(l.a((l) pVar.c.d.getValue(), null, 0, 0, false, false, false, false, null, 1919));
                break;
        }
        return b0Var;
    }
}
