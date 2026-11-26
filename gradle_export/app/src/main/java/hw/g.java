package hw;

import a1.c0;
import a40.z;
import bt.y1;
import d40.o;
import d40.p1;
import d40.u0;
import g00.b0;
import ri.t1;
import tq.k;
import u00.n;

public final class g extends m00.i implements n {
    public final int A;
    public int B;
    public final j C;

    public g(j jVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = jVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new g(this.C, cVar, 0);
            case 1:
                return new g(this.C, cVar, 1);
            case 2:
                return new g(this.C, cVar, 2);
            case 3:
                return new g(this.C, cVar, 3);
            default:
                return new g(this.C, cVar, 4);
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
            case 3:
                break;
        }
        return ((g) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    xv.c cVar = this.C.d;
                    this.B = 1;
                    if (cVar.a(false, this) == aVar) {
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
                j jVar = this.C;
                k kVar = jVar.e;
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    u0 u0Var = new u0(kVar.c(), kVar.c, new h(3, null, 0));
                    i iVar = new i(jVar, null, 0);
                    this.B = 1;
                    if (o.i(u0Var, iVar, this) == aVar2) {
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
                    j jVar2 = this.C;
                    p1 p1Var = jVar2.f.c;
                    i iVar2 = new i(jVar2, null, 1);
                    this.B = 1;
                    if (o.i(p1Var, iVar2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            case 3:
                l00.a aVar4 = l00.a.A;
                int i4 = this.B;
                if (i4 == 0) {
                    t1.O(obj);
                    j jVar3 = this.C;
                    y1 y1Var = jVar3.d.c.c;
                    c0 c0Var = new c0(jVar3, (k00.c) null, 23);
                    this.B = 1;
                    if (o.i(y1Var, c0Var, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar5 = l00.a.A;
                int i5 = this.B;
                if (i5 == 0) {
                    t1.O(obj);
                    j jVar4 = this.C;
                    jVar4.i(f.a((f) jVar4.c.d.getValue(), null, true, false, false, 27));
                    xv.c cVar2 = jVar4.d;
                    this.B = 1;
                    if (cVar2.a(true, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
