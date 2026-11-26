package oo;

import ri.t1;

public final class v0 extends m00.i implements u00.n {
    public final int A;
    public final z0 B;
    public final u00.k C;

    public v0(z0 z0Var, u00.k kVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.B = z0Var;
        this.C = kVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new v0(this.B, this.C, cVar, 0);
            default:
                return new v0(this.B, this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                v0 v0Var = (v0) create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                v0Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                v0 v0Var2 = (v0) create(zVar, cVar);
                g00.b0 b0Var2 = g00.b0.a;
                v0Var2.invokeSuspend(b0Var2);
                return b0Var2;
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        p pVar = p.a;
        u00.k kVar = this.C;
        z0 z0Var = this.B;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                if (z0Var.v) {
                    kVar.invoke(pVar);
                }
                break;
            default:
                l00.a aVar2 = l00.a.A;
                t1.O(obj);
                if (z0Var.v) {
                    kVar.invoke(pVar);
                }
                break;
        }
        return b0Var;
    }
}
