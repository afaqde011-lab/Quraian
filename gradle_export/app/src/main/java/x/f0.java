package x;

public final class f0 extends m00.i implements u00.n {
    public float A;

    public final k00.c create(Object obj, k00.c cVar) {
        f0 f0Var = new f0(2, cVar);
        f0Var.A = ((Number) obj).floatValue();
        return f0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        return create(Float.valueOf(((Number) obj).floatValue()), (k00.c) obj2).invokeSuspend(g00.b0.a);
    }

    public final Object invokeSuspend(Object obj) {
        l00.a aVar = l00.a.A;
        ri.t1.O(obj);
        return Boolean.valueOf(this.A > 0.0f);
    }
}
