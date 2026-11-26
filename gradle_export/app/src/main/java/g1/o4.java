package g1;

public final class o4 extends m00.i implements u00.o {
    public float A;
    public final u00.k B;

    public o4(u00.k kVar, k00.c cVar) {
        super(3, cVar);
        this.B = kVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        o4 o4Var = new o4(this.B, (k00.c) obj3);
        o4Var.A = fFloatValue;
        g00.b0 b0Var = g00.b0.a;
        o4Var.invokeSuspend(b0Var);
        return b0Var;
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        this.B.invoke(new Float(this.A));
        return g00.b0.a;
    }
}
