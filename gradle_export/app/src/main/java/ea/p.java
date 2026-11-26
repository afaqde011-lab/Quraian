package ea;

import ri.t1;

public final class p extends m00.i implements u00.k {
    public final r A;
    public final String B;
    public final u00.k C;

    public p(r rVar, String str, u00.k kVar, k00.c cVar) {
        super(1, cVar);
        this.A = rVar;
        this.B = str;
        this.C = kVar;
    }

    public final k00.c create(k00.c cVar) {
        return new p(this.A, this.B, this.C, cVar);
    }

    public final Object invoke(Object obj) {
        return create((k00.c) obj).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        ma.c cVarK0 = this.A.f5225b.k0(this.B);
        try {
            Object objInvoke = this.C.invoke(cVarK0);
            ca.v.s(cVarK0, null);
            return objInvoke;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ca.v.s(cVarK0, th2);
                throw th3;
            }
        }
    }
}
