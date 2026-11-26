package nx;

import l1.z0;

public final class h0 extends m00.i implements u00.n {
    public int A;
    public z2.a0 B;
    public int C;
    public final i0 D;
    public final j0.v E;
    public final u00.k F;
    public final z0 G;
    public final z0 H;

    public h0(i0 i0Var, j0.v vVar, u00.k kVar, z0 z0Var, z0 z0Var2, k00.c cVar) {
        super(2, cVar);
        this.D = i0Var;
        this.E = vVar;
        this.F = kVar;
        this.G = z0Var;
        this.H = z0Var2;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new h0(this.D, this.E, this.F, this.G, this.H, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((h0) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        throw new UnsupportedOperationException("Method not decompiled: nx.h0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
