package z1;

public final class i extends m00.h implements u00.n {
    public long[] B;
    public int C;
    public int D;
    public int E;
    public Object F;
    public final j G;

    public i(j jVar, k00.c cVar) {
        super(2, cVar);
        this.G = jVar;
    }

    public final k00.c create(Object obj, k00.c cVar) {
        i iVar = new i(this.G, cVar);
        iVar.F = obj;
        return iVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((q30.k) obj, (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        throw new UnsupportedOperationException("Method not decompiled: z1.i.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
