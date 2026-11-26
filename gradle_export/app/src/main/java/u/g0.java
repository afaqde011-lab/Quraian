package u;

import ri.t1;

public final class g0 extends m00.h implements u00.n {
    public q30.h B;
    public h0 C;
    public long[] D;
    public int E;
    public int F;
    public Object G;
    public final h0 H;
    public final q30.h I;

    public g0(h0 h0Var, q30.h hVar, k00.c cVar) {
        super(2, cVar);
        this.H = h0Var;
        this.I = hVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        g0 g0Var = new g0(this.H, this.I, cVar);
        g0Var.G = obj;
        return g0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        q30.k kVar;
        h0 h0Var;
        long[] jArr;
        int i10;
        q30.h hVar;
        l00.a aVar = l00.a.A;
        int i11 = this.F;
        if (i11 == 0) {
            t1.O(obj);
            kVar = (q30.k) this.G;
            h0Var = this.H;
            f0 f0Var = h0Var.B;
            jArr = f0Var.f14848c;
            i10 = f0Var.f14850e;
            hVar = this.I;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.E;
            jArr = this.D;
            h0Var = this.C;
            hVar = this.B;
            kVar = (q30.k) this.G;
            t1.O(obj);
        }
        if (i10 == Integer.MAX_VALUE) {
            return g00.b0.a;
        }
        int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
        hVar.B = i10;
        Object obj2 = h0Var.B.f14847b[i10];
        this.G = kVar;
        this.B = hVar;
        this.C = h0Var;
        this.D = jArr;
        this.E = i12;
        this.F = 1;
        kVar.c(obj2, this);
        return aVar;
    }
}
