package zy;

import a40.c0;
import a40.z;
import g00.b0;
import ri.t1;

public final class o extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final p C;

    public o(p pVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = pVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new o(this.C, cVar, 0);
            default:
                return new o(this.C, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        z zVar = (z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
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
                p pVar = this.C;
                if (i == 0) {
                    t1.O(obj);
                    wo.b0 b0Var = pVar.d;
                    this.B = 1;
                    obj = b0Var.o(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                l lVar = (l) pVar.c.d.getValue();
                Integer num = new Integer(((ep.j) obj).b);
                if (num.intValue() <= 0) {
                    num = null;
                }
                pVar.i(l.a(lVar, "", num != null ? num.intValue() : 30, 0, false, false, false, false, null, 235));
                pVar.m();
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (c0.l(700L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                this.C.l();
                return b0.a;
        }
    }
}
