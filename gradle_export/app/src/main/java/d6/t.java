package d6;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

public final class t implements b0 {
    public final AtomicReference A;
    public final c40.t B;

    public t(AtomicReference atomicReference, c40.t tVar) {
        this.A = atomicReference;
        this.B = tVar;
    }

    @Override
    public final void Z(u00.n nVar, m00.c cVar) {
        s sVar;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i10 = sVar.C;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sVar.C = i10 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object obj = sVar.A;
        l00.a aVar = l00.a.A;
        int i11 = sVar.C;
        if (i11 == 0) {
            ri.t1.O(obj);
            sVar.C = 1;
            a40.k kVar = new a40.k(1, qd.s0.j0(sVar));
            kVar.r();
            c40.s sVar2 = this.B;
            kVar.u(new a20.d(sVar2, 8));
            a40.j jVar = (a40.j) this.A.getAndSet(kVar);
            if (jVar != null) {
                jVar.h((Throwable) null);
            }
            sVar2.j(nVar);
            if (kVar.q() == aVar) {
                return;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        throw new KotlinNothingValueException();
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
