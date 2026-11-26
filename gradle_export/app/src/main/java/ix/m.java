package ix;

import a40.z;
import g00.b0;
import g2.t;
import ri.t1;

public final class m extends m00.i implements u00.n {
    public final int A;
    public final boolean B;
    public final t C;

    public m(boolean z, t tVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = z;
        this.C = tVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new m(this.B, this.C, cVar, 0);
            case 1:
                return new m(this.B, this.C, cVar, 1);
            default:
                return new m(this.B, this.C, cVar, 2);
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
            case 1:
                m mVar2 = (m) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                mVar2.invokeSuspend(b0Var2);
                return b0Var2;
            default:
                m mVar3 = (m) create(zVar, cVar);
                b0 b0Var3 = b0.a;
                mVar3.invokeSuspend(b0Var3);
                return b0Var3;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        t tVar = this.C;
        boolean z = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (z) {
                    t.a(tVar);
                }
                break;
            case 1:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (z) {
                    t.a(tVar);
                }
                break;
            default:
                l00.a aVar3 = l00.a.A;
                t1.O(obj);
                if (z) {
                    t.a(tVar);
                }
                break;
        }
        return b0Var;
    }
}
