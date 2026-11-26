package d40;

import ri.t1;

public final class c extends e {
    public final m00.i E;

    public c(u00.n nVar, k00.i iVar, int i, c40.a aVar) {
        super(nVar, iVar, i, aVar);
        this.E = (m00.i) nVar;
    }

    @Override
    public final Object d(c40.t tVar, k00.c cVar) {
        b bVar;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i = bVar.D;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.D = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, (m00.c) cVar);
            }
        } else {
            bVar = new b(this, (m00.c) cVar);
        }
        Object obj = bVar.B;
        Object obj2 = l00.a.A;
        int i2 = bVar.D;
        if (i2 == 0) {
            t1.O(obj);
            bVar.A = tVar;
            bVar.D = 1;
            if (super.d(tVar, bVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tVar = bVar.A;
            t1.O(obj);
        }
        if (((c40.s) tVar).D.y()) {
            return g00.b0.a;
        }
        throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
    }

    @Override
    public final e40.d e(k00.i iVar, int i, c40.a aVar) {
        return new c(this.E, iVar, i, aVar);
    }
}
