package jq;

import d40.o;
import d40.p1;
import g00.b0;
import m00.i;
import ri.t1;
import u00.k;

public final class c extends i implements k {
    public final int A;
    public int B;
    public final e C;
    public final String D;

    public c(e eVar, String str, k00.c cVar, int i) {
        super(1, cVar);
        this.A = i;
        this.C = eVar;
        this.D = str;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c(this.C, this.D, cVar, 0);
            case 1:
                return new c(this.C, this.D, cVar, 1);
            default:
                return new c(this.C, this.D, cVar, 2);
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
        }
        return ((c) create(cVar)).invokeSuspend(b0.a);
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
                    obj = cVar.c.a(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                for (Object obj2 : (Iterable) obj) {
                    if (((dw.a) obj2).b.equalsIgnoreCase(this.D)) {
                        return obj2;
                    }
                }
                return null;
            case 1:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    p1 p1Var = this.C.b.g;
                    this.B = 1;
                    obj = o.s(p1Var, this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                for (Object obj3 : (Iterable) obj) {
                    if (((bx.d) obj3).c.equalsIgnoreCase(this.D)) {
                        return obj3;
                    }
                }
                return null;
            default:
                l00.a aVar3 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    e40.i iVarA = this.C.d.a();
                    this.B = 1;
                    obj = o.s(iVarA, this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                for (Object obj4 : (Iterable) obj) {
                    if (((ho.a) obj4).b.equalsIgnoreCase(this.D)) {
                        return obj4;
                    }
                }
                return null;
        }
    }
}
