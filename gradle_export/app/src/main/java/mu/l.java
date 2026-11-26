package mu;

import g00.b0;
import ri.t1;
import x.q1;

public final class l extends m00.i implements u00.n {
    public final int A;
    public int B;
    public final x.b C;
    public final q1 D;

    public l(x.b bVar, q1 q1Var, k00.c cVar, int i) {
        super(2, cVar);
        this.A = i;
        this.C = bVar;
        this.D = q1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new l(this.C, this.D, cVar, 0);
            default:
                return new l(this.C, this.D, cVar, 1);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                break;
        }
        return ((l) create(zVar, cVar)).invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        switch (this.A) {
            case 0:
                l00.a aVar = l00.a.A;
                int i = this.B;
                if (i == 0) {
                    t1.O(obj);
                    Float f = new Float(1.0f);
                    this.B = 1;
                    if (x.b.c(this.C, f, this.D, (u00.k) null, this, 12) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
            default:
                l00.a aVar2 = l00.a.A;
                int i2 = this.B;
                if (i2 == 0) {
                    t1.O(obj);
                    Float f2 = new Float(0.0f);
                    this.B = 1;
                    if (x.b.c(this.C, f2, this.D, (u00.k) null, this, 12) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                return b0.a;
        }
    }
}
