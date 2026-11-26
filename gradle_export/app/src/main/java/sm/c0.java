package sm;

import l1.e1;
import ri.t1;

public final class c0 extends m00.i implements u00.n {
    public final int A = 0;
    public int B;
    public final e1 C;

    public c0(int i, e1 e1Var, k00.c cVar) {
        super(2, cVar);
        this.B = i;
        this.C = e1Var;
    }

    public c0(e1 e1Var, k00.c cVar) {
        super(2, cVar);
        this.C = e1Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.A) {
            case 0:
                return new c0(this.B, this.C, cVar);
            default:
                return new c0(this.C, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        a40.z zVar = (a40.z) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.A) {
            case 0:
                c0 c0Var = (c0) create(zVar, cVar);
                g00.b0 b0Var = g00.b0.a;
                c0Var.invokeSuspend(b0Var);
                return b0Var;
            default:
                return ((c0) create(zVar, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        int i = this.A;
        g00.b0 b0Var = g00.b0.a;
        e1 e1Var = this.C;
        switch (i) {
            case 0:
                l00.a aVar = l00.a.A;
                t1.O(obj);
                float f = d0.a;
                int iF = w00.a.F(e1Var.h());
                int i2 = this.B;
                if (iF != i2) {
                    e1Var.i(i2);
                }
                return b0Var;
            default:
                l00.a aVar2 = l00.a.A;
                int i3 = this.B;
                if (i3 == 0) {
                    t1.O(obj);
                    this.B = 1;
                    if (a40.c0.l(150L, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t1.O(obj);
                }
                float f2 = d0.a;
                e1Var.i(w00.a.F(e1Var.h()));
                return b0Var;
        }
    }
}
