package jx;

import a40.z;
import g00.b0;
import ri.t1;

public final class t extends m00.i implements u00.n {
    public final int A;
    public final x B;

    public t(x xVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new t(this.B, cVar, 0);
            default:
                return new t(this.B, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                t tVar = (t) create(zVar, cVar);
                b0 b0Var = b0.a;
                tVar.invokeSuspend(b0Var);
                return b0Var;
            default:
                t tVar2 = (t) create(zVar, cVar);
                b0 b0Var2 = b0.a;
                tVar2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        x xVar = this.B;
        b0 b0Var = b0.a;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                pm.b bVar = xVar.c;
                xVar.i(s.a((s) bVar.d.getValue(), null, ((s) bVar.d.getValue()).d, "", false, false, 0.0f, 0.0f, false, null, 3855));
                xVar.l();
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (((s) xVar.c.d.getValue()).b()) {
                    xVar.i(s.a((s) xVar.c.d.getValue(), null, null, null, true, false, 0.0f, 0.0f, false, null, 4031));
                    xVar.l();
                }
                break;
        }
        return b0Var;
    }
}
