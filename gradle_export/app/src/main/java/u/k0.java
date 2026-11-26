package u;

public final class k0 extends m00.h implements u00.n {
    public q30.h B;
    public l0 C;
    public long[] D;
    public int E;
    public int F;
    public int G;
    public int H;
    public long I;
    public int J;
    public Object K;
    public final l0 L;
    public final q30.h M;

    public k0(l0 l0Var, q30.h hVar, k00.c cVar) {
        super(2, cVar);
        this.L = l0Var;
        this.M = hVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        k0 k0Var = new k0(this.L, this.M, cVar);
        k0Var.K = obj;
        return k0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: u.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
