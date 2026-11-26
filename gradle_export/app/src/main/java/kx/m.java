package kx;

import a40.z;
import g00.b0;
import ri.t1;

public final class m extends m00.i implements u00.n {
    public final int A;
    public final u00.k B;

    public m(int i, k00.c cVar, u00.k kVar) {
        super(2, cVar);
        this.A = i;
        this.B = kVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m(0, cVar, this.B);
            default:
                return new m(1, cVar, this.B);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                m mVar = (m) create(zVar, cVar);
                b0 b0Var = b0.a;
                mVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                m mVar2 = (m) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                mVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        u00.k kVar = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                kVar.invoke(new jx.h());
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                kVar.invoke(new qx.h());
                break;
        }
        return b0Var;
    }
}
