package jq;

import g00.b0;
import g00.n;
import jo.o;
import m00.i;
import ri.t1;
import u00.k;

public final class d extends i implements k {
    public final int A;
    public int B;
    public final e C;

    public d(e eVar, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.C = eVar;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new d(this.C, cVar, 0);
            case 1:
                return new d(this.C, cVar, 1);
            case 2:
                return new d(this.C, cVar, 2);
            default:
                return new d(this.C, cVar, 3);
        }
    }

    @Override
    public final Object invoke(Object obj) {
        k00.c cVar = (k00.c) obj;
        switch (this.A) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
        return ((d) create(cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    xv.c cVar = this.C.c;
                    this.B = 1;
                    if (cVar.a(true, this) == aVar) {
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
                    xw.k kVar = this.C.a;
                    this.B = 1;
                    if (kVar.b(this) == aVar2) {
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
                    xw.d dVar = this.C.b;
                    this.B = 1;
                    if (dVar.b(true, this) == aVar3) {
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
                    o oVar = this.C.e;
                    this.B = 1;
                    if (oVar.a(true, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    ((n) obj).getClass();
                }
                return b0.a;
        }
    }
}
