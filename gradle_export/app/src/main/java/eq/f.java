package eq;

import a40.z;
import g00.b0;
import l1.f1;
import l1.y0;
import ri.t1;
import u00.n;

public final class f extends m00.i implements n {
    public final int A;
    public final cq.i B;
    public final y0 C;

    public f(cq.i iVar, y0 y0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = iVar;
        this.C = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new f(this.B, this.C, cVar, 0);
            default:
                return new f(this.B, this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                f fVar = (f) create(zVar, cVar);
                b0 b0Var = b0.a;
                fVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                f fVar2 = (f) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                fVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        b0 b0Var = b0.a;
        cq.i iVar = this.B;
        f1 f1Var = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                f1Var.i(g.b(iVar));
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                f1Var.i(m.b(iVar));
                break;
        }
        return b0Var;
    }
}
