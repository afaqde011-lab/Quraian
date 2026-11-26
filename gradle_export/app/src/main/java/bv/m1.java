package bv;

public final class m1 extends m00.h implements u00.n {
    public final int B;
    public int C;
    public Object D;
    public final u00.k E;

    public m1(int i, k00.c cVar, u00.k kVar) {
        super(2, cVar);
        this.B = i;
        this.E = kVar;
    }

    @Override
    public final k00.c create(Object obj, k00.c cVar) {
        switch (this.B) {
            case 0:
                m1 m1Var = new m1(0, cVar, this.E);
                m1Var.D = obj;
                return m1Var;
            default:
                m1 m1Var2 = new m1(1, cVar, this.E);
                m1Var2.D = obj;
                return m1Var2;
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        v2.i0 i0Var = (v2.i0) obj;
        k00.c cVar = (k00.c) obj2;
        switch (this.B) {
            case 0:
                ((m1) create(i0Var, cVar)).invokeSuspend(g00.b0.a);
                return l00.a.A;
            default:
                return ((m1) create(i0Var, cVar)).invokeSuspend(g00.b0.a);
        }
    }

    @Override
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        throw new UnsupportedOperationException("Method not decompiled: bv.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
