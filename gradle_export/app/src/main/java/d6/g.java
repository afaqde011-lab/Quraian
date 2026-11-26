package d6;

import java.util.concurrent.CancellationException;

public final class g implements b0 {
    public final d40.d1 A;

    public g(d40.d1 d1Var) {
        this.A = d1Var;
    }

    @Override
    public final void Z(u00.n nVar, m00.c cVar) {
        f fVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.C = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object obj = fVar.A;
        l00.a aVar = l00.a.A;
        int i11 = fVar.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            fVar.C = 1;
            if (this.A.emit(nVar, fVar) == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new CancellationException();
    }

    public final Object fold(Object obj, u00.n nVar) {
        return nVar.invoke(obj, this);
    }

    public final k00.g get(k00.h hVar) {
        return rd.a.C(this, hVar);
    }

    public final k00.i minusKey(k00.h hVar) {
        return rd.a.K(this, hVar);
    }

    public final k00.i plus(k00.i iVar) {
        return rd.a.P(this, iVar);
    }
}
