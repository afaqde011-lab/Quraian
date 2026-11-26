package r40;

import g00.b0;
import qd.j0;
import ri.t1;

public final class r extends m00.h implements u00.o {
    public int B;
    public g00.b C;
    public final j0 D;

    public r(j0 j0Var, k00.c cVar) {
        super(3, cVar);
        this.D = j0Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        r rVar = new r(this.D, (k00.c) obj3);
        rVar.C = (g00.b) obj;
        return rVar.invokeSuspend(b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        j0 j0Var = this.D;
        a20.g gVar = (a20.g) j0Var.C;
        l00.a aVar = l00.a.A;
        int i = this.B;
        if (i == 0) {
            t1.O(obj);
            g00.b bVar = this.C;
            byte bF = gVar.F();
            if (bF == 1) {
                return j0Var.o(true);
            }
            if (bF == 0) {
                return j0Var.o(false);
            }
            if (bF != 6) {
                if (bF == 8) {
                    return j0Var.m();
                }
                a20.g.u(gVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.B = 1;
            obj = j0.c(j0Var, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t1.O(obj);
        }
        return (q40.l) obj;
    }
}
