package qx;

import a40.z;
import g00.b0;
import ri.t1;

public final class p extends m00.i implements u00.n {
    public final int A;
    public final t B;

    public p(t tVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = tVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new p(this.B, cVar, 0);
            default:
                return new p(this.B, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                p pVar = (p) create(zVar, cVar);
                b0 b0Var = b0.a;
                pVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                p pVar2 = (p) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                pVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        t tVar = this.B;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                pm.b bVar = tVar.c;
                tVar.i(o.a((o) bVar.d.getValue(), null, ((o) bVar.d.getValue()).d, "", false, false, 0.0f, 0.0f, false, null, 7727));
                tVar.l();
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (((o) tVar.c.d.getValue()).b()) {
                    tVar.i(o.a((o) tVar.c.d.getValue(), null, null, null, true, false, 0.0f, 0.0f, false, null, 8063));
                    tVar.l();
                }
                break;
        }
        return b0Var;
    }
}
