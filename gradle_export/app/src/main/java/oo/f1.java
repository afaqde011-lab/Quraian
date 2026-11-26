package oo;

public final class f1 extends m00.i implements u00.n {
    public int A;
    public Object B;
    public int C;
    public final g1 D;
    public final String E;
    public final ho.g F;

    public f1(g1 g1Var, String str, ho.g gVar, k00.c cVar) {
        super(2, cVar);
        this.D = g1Var;
        this.E = str;
        this.F = gVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        return new f1(this.D, this.E, this.F, cVar);
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((f1) create((a40.z) obj, (k00.c) obj2)).invokeSuspend(g00.b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r37) {
        throw new UnsupportedOperationException("Method not decompiled: oo.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
