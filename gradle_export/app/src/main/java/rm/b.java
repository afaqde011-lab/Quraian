package rm;

import g00.b0;
import m00.i;
import ri.t1;
import u00.k;

public final class b extends i implements k {
    public final int A;

    public b(int i, k00.c cVar, int i2) {
        super(i, cVar);
        this.A = i2;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b(1, cVar, 0);
            default:
                return new b(1, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                b bVar = (b) create(cVar);
                b0 b0Var = b0.a;
                bVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                b bVar2 = (b) create(cVar);
                b0 b0Var2 = b0.a;
                bVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                break;
        }
        return b0Var;
    }
}
