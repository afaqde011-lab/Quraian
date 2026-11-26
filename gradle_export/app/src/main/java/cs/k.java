package cs;

import a40.z;
import g00.b0;
import l1.y0;

public final class k extends m00.i implements u00.n {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public y0 G;
    public int H;
    public final m I;
    public final y0 J;

    public k(m mVar, y0 y0Var, k00.c cVar) {
        super(2, cVar);
        this.I = mVar;
        this.J = y0Var;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new k(this.I, this.J, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((z) obj, (k00.c) obj2)).invokeSuspend(b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        throw new UnsupportedOperationException("Method not decompiled: cs.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
