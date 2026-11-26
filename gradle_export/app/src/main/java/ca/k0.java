package ca;

public final class k0 extends m00.i implements u00.n {
    public j[] A;
    public l0 B;
    public b0 C;
    public int D;
    public int E;
    public int F;
    public int G;
    public final j[] H;
    public final l0 I;
    public final b0 J;

    public k0(j[] jVarArr, l0 l0Var, b0 b0Var, k00.c cVar) {
        super(2, cVar);
        this.H = jVarArr;
        this.I = l0Var;
        this.J = b0Var;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        return new k0(this.H, this.I, this.J, cVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((ea.m) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        throw new UnsupportedOperationException("Method not decompiled: ca.k0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
