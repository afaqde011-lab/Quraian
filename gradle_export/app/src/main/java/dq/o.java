package dq;

import a1.c0;
import a40.z;
import d40.p1;
import d40.u0;
import d40.y0;
import d40.z0;
import g00.b0;
import ri.t1;

public final class o extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final u C;

    public o(u uVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = uVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new o(this.C, cVar, 0);
            case 1:
                return new o(this.C, cVar, 1);
            case 2:
                return new o(this.C, cVar, 2);
            default:
                return new o(this.C, cVar, 3);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((o) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    u uVar = this.C;
                    p1 p1Var = ((bq.a) uVar.d).f;
                    n nVar = new n(uVar, null, 0);
                    this.B = 1;
                    if (d40.o.i(p1Var, nVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    u uVar2 = this.C;
                    p1 p1Var2 = uVar2.i.c;
                    n nVar2 = new n(uVar2, null, 1);
                    this.B = 1;
                    if (d40.o.i(p1Var2, nVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 2:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    u uVar3 = this.C;
                    xw.e eVar = uVar3.g;
                    u0 u0Var = new u0(new z0(eVar.e), new z0(eVar.f), new p(3, (k00.c) null));
                    c0 c0Var = new c0(uVar3, (k00.c) null, 12);
                    this.B = 1;
                    if (d40.o.i(u0Var, c0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    u uVar4 = this.C;
                    y0 y0Var = new y0(uVar4.g.h);
                    bt.y0 y0Var2 = new bt.y0(uVar4, null, 2);
                    this.B = 1;
                    if (d40.o.i(y0Var, y0Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
