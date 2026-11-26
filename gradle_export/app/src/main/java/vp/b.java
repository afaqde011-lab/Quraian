package vp;

import a40.z;
import g00.b0;
import ri.t1;

public final class b extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x C;

    public b(x xVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = xVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new b(this.C, cVar, 0);
            default:
                return new b(this.C, cVar, 1);
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
        return ((b) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                x xVar = this.C;
                if (i != 0) {
                    if (i == 1) {
                        t1.O(obj);
                    } else if (i == 2) {
                        t1.O(obj);
                        ((g00.n) obj).getClass();
                        this.B = 3;
                        if (xVar.e(this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t1.O(obj);
                        ((g00.n) obj).getClass();
                    }
                    return b0.a;
                }
                t1.O(obj);
                this.B = 1;
                if (x.a(xVar, this) == aVar) {
                    return aVar;
                }
                this.B = 2;
                if (xVar.f(this) == aVar) {
                    return aVar;
                }
                this.B = 3;
                if (xVar.e(this) == aVar) {
                    return aVar;
                }
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                bt.t1 t1Var = new bt.t1(this.C.b, 12);
                this.B = 1;
                Object objS = d40.o.s(t1Var, this);
                return objS == aVar2 ? aVar2 : objS;
        }
    }
}
