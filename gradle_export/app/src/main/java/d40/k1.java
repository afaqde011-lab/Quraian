package d40;

public final class k1 extends m00.i implements u00.o {
    public int A;
    public j B;
    public int C;
    public final m1 D;

    public k1(m1 m1Var, k00.c cVar) {
        super(3, cVar);
        this.D = m1Var;
    }

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        k1 k1Var = new k1(this.D, (k00.c) obj3);
        k1Var.B = (j) obj;
        k1Var.C = iIntValue;
        return k1Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        throw new UnsupportedOperationException("Method not decompiled: d40.k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
