package rv;

import a40.z;
import g00.b0;
import ri.t1;

public final class n extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final p C;

    public n(p pVar, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = pVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new n(this.C, cVar, 0);
            default:
                return new n(this.C, cVar, 1);
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
        return ((n) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) throws Throwable {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                    return obj;
                }
                t1.O(obj);
                xw.k kVar = (xw.k) this.C.a;
                this.B = 1;
                Object objC = kVar.c(this);
                return objC == aVar ? aVar : objC;
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
                xw.k kVar2 = (xw.k) this.C.a;
                this.B = 1;
                Object objB = kVar2.b(this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
