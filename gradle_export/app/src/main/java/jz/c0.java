package jz;

import ri.t1;

public final class c0 extends m00.i implements u00.k {
    public final boolean A;
    public final d0 B;

    public c0(boolean z, d0 d0Var, k00.c cVar) {
        super(1, cVar);
        this.A = z;
        this.B = d0Var;
    }

    @Override
    public final k00.c create(k00.c cVar) {
        return new c0(this.A, this.B, cVar);
    }

    @Override
    public final Object invoke(Object obj) {
        c0 c0Var = (c0) create((k00.c) obj);
        g00.b0 b0Var = g00.b0.a;
        c0Var.invokeSuspend(b0Var);
        return b0Var;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        t1.O(obj);
        if (this.A) {
            d0 d0Var = this.B;
            d0Var.q(z.a((z) d0Var.c.d.getValue(), null, null, null, false, false, 1048575));
        }
        return g00.b0.a;
    }
}
