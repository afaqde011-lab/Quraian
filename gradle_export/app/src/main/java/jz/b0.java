package jz;

import bv.i2;
import d40.t0;
import d40.z0;
import ri.t1;

public final class b0 extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final d0 C;

    public b0(d0 d0Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = d0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b0(this.C, cVar, 0);
            case 1:
                return new b0(this.C, cVar, 1);
            default:
                return new b0(this.C, cVar, 2);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((b0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    d0 d0Var = this.C;
                    z0 z0Var = new z0(d0Var.f.c);
                    i2 i2Var = new i2(d0Var, null);
                    this.B = 1;
                    if (d40.o.i(z0Var, i2Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    d0 d0Var2 = this.C;
                    vp.x xVar = d0Var2.d;
                    t0 t0VarL = d40.o.l(xVar.c, xVar.e, new z0(d0Var2.f.c), new hx.b0(4, null, 1));
                    x xVar2 = new x(d0Var2, null, 1);
                    this.B = 1;
                    if (d40.o.i(t0VarL, xVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    wo.b0 b0Var = this.C.e;
                    ep.q qVar = ep.q.PURCHASE;
                    this.B = 1;
                    if (b0Var.n(qVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return g00.b0.a;
        }
    }
}
