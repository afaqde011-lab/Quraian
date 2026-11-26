package bv;

public final class p2 extends m00.i implements u00.o {
    public boolean A;
    public float B;

    @Override
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        float fFloatValue = ((Number) obj2).floatValue();
        p2 p2Var = new p2(3, (k00.c) obj3);
        p2Var.A = zBooleanValue;
        p2Var.B = fFloatValue;
        return p2Var.invokeSuspend(g00.b0.a);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        boolean z = this.A;
        float f = this.B;
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return new dv.b(f, z);
    }
}
