package b1;

import d0.t1;

public final class g0 extends m00.i implements u00.o {
    public int A;
    public t1 B;
    public long C;
    public final f0.i D;
    public final e0 E;

    public g0(f0.i iVar, e0 e0Var, k00.c cVar) {
        super(3, cVar);
        this.D = iVar;
        this.E = e0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j9 = ((h2.b) obj2).f6544a;
        g0 g0Var = new g0(this.D, this.E, (k00.c) obj3);
        g0Var.B = (t1) obj;
        g0Var.C = j9;
        return g0Var.invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        int i10 = this.A;
        if (i10 == 0) {
            ri.t1.O(obj);
            t1 t1Var = this.B;
            long j9 = this.C;
            f0.i iVar = this.D;
            if (iVar != null) {
                f0 f0Var = new f0(t1Var, this.E, j9, iVar, (k00.c) null);
                this.A = 1;
                if (a40.c0.k(f0Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ri.t1.O(obj);
        }
        return g00.b0.a;
    }
}
